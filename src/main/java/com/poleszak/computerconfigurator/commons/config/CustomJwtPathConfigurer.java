package com.poleszak.computerconfigurator.commons.config;

import com.poleszak.jwtauthspring.config.JwtPathConfigurer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@ComponentScan(basePackages = "com.poleszak.jwtauthspring")
public class CustomJwtPathConfigurer implements JwtPathConfigurer {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests()
                .requestMatchers("/api/v1/cpu/**", "/api/v1/gpu/**", "/api/v1/motherboard/**", "/api/v1/psu/**", "/api/v1/ram/**", "/api/v1/storage/**")
                .permitAll()
                .anyRequest()
                .authenticated();
    }
}