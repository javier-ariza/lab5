package es.upm.dit.isst.lab5.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {    
@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
http.authorizeHttpRequests()
    .requestMatchers("/index").permitAll()
    .requestMatchers("/todos").permitAll()
    .requestMatchers("/").permitAll()
    .requestMatchers("/alumnos").hasAnyRole("ALUM")
    .requestMatchers("/profesores").hasAnyRole("PROF")
    .anyRequest().authenticated().and()
    .formLogin().permitAll().and()
    .logout().permitAll().and()
    .httpBasic();
return http.build();
}}