package org.gfg.JBDL5_Security.config;

import org.gfg.JBDL5_Security.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    UserDetailsService userDetailsService;


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
     //   httpSecurity.csrf(csrf->csrf.disable());
        httpSecurity.authorizeHttpRequests(request->request.requestMatchers("/get/home","/get/csrf").permitAll().requestMatchers("/create/user").permitAll()
                .requestMatchers("/get/private").hasAnyRole("ADMIN", "NORMAL")
                .requestMatchers("/get/admin").hasRole("ADMIN"));
        //httpSecurity.httpBasic(Customizer.withDefaults());
       // httpSecurity.formLogin(Customizer.withDefaults());

        return httpSecurity.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    // In Memory user authentication
    /*@Bean
    public UserDetailsService userDetails(){
        UserDetails user1 = User.builder().username("robin").password(passwordEncoder().encode("123456")).roles("ADMIN").build();
        UserDetails user2 = User.builder().username("vishesh").password(passwordEncoder().encode("123456")).roles("NORMAL").build();
        return new InMemoryUserDetailsManager(user1,user2);
    }*/


  /*  @Bean
    public UserDetailsService userDetailsService(){
        return new CustomUserDetailsService();
    }*/

    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider(){
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
        daoAuthenticationProvider.setUserDetailsService(userDetailsService);
        return daoAuthenticationProvider;
    }


}
