package com.poleszak.computerconfigurator.commons.provider;

import com.poleszak.jwtauthspring.filter.model.UserAppDto;
import com.poleszak.jwtauthspring.service.UserDetailsProvider;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import static org.springframework.http.HttpMethod.GET;

@Service
public class UserDetailsProviderImpl implements UserDetailsProvider {

    private final RestTemplate restTemplate;

    public UserDetailsProviderImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public UserAppDto loadUserByUsername(String username, String jwtToken) throws UsernameNotFoundException {
        String userDetailsUrl = "http://localhost:8080/api/v1/user-details/{username}";

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Bearer " + jwtToken);
            HttpEntity<String> entity = new HttpEntity<>(headers);

            UserAppDto userAppDto = restTemplate.exchange(
                    userDetailsUrl,
                    GET,
                    entity,
                    UserAppDto.class,
                    username
            ).getBody();

            if (userAppDto == null) {
                throw new UsernameNotFoundException("User not found: " + username);
            }

            return userAppDto;
        } catch (HttpClientErrorException e) {
            if (e.getStatusCode() == HttpStatus.NOT_FOUND) {
                throw new UsernameNotFoundException("User not found: " + username);
            } else {
                throw new RuntimeException("Error calling user-management-service", e);
            }
        }
    }
}