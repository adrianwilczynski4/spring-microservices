package com.micro.books.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.sql.Timestamp;


@Configuration
@EnableWebSecurity
public class SecurityConfigurations  extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception{

        http
                .httpBasic().disable()
                .authorizeRequests()
                .anyRequest().authenticated()
                    .antMatchers(HttpMethod.GET,"/rates").permitAll()
                    .antMatchers(HttpMethod.GET,"/rates/all").permitAll()
                    .antMatchers(HttpMethod.GET,"/books/all").permitAll()
                    .antMatchers(HttpMethod.GET,"/books**").permitAll()
                .and()
                .csrf().disable();


    }


}
