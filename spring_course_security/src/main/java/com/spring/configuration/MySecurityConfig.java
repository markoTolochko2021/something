package com.spring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

import javax.sql.DataSource;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.jdbcAuthentication().dataSource(dataSource);


//        UserBuilder userBuilder = User.withDefaultPasswordEncoder();
//        auth.inMemoryAuthentication()
//                .withUser(userBuilder.username("mark")
//                        .password("tolochko")
//                        .roles("Employee"))
//                .withUser(userBuilder.username("jack")
//                        .password("daniels")
//                        .roles("IT"))
//                .withUser(userBuilder.username("jim")
//                        .password("bim")
//                        .roles("Manager", "HR"))
//                .withUser(userBuilder.username("john")
//                        .password("gone")
//                        .roles("HR"));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
      http.authorizeRequests()
              .antMatchers("/").hasAnyRole("Employee", "IT", "Manager", "HR")
              .antMatchers("/hr_info").hasRole("HR")
              .antMatchers("/manager_info").hasRole("Manaher")
              .and().formLogin().permitAll();
    }
}
