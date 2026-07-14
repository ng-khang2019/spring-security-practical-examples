package com.springsecurity.project1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
////        http.authorizeHttpRequests(requests -> requests.anyRequest().permitAll());
//        http.authorizeHttpRequests(requests -> requests
//                .requestMatchers("/welcome").authenticated());
//        return http.build();
//    }
}
