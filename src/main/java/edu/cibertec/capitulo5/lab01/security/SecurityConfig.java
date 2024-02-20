package edu.cibertec.capitulo5.lab01.security;


//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//import static org.springframework.boot.autoconfigure.security.servlet.PathRequest.toH2Console;

//@Configuration
public class SecurityConfig {

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//            .authorizeHttpRequests(matchers -> matchers
//                    .requestMatchers("/css/**", "/js/**", "/vendors/**", "/fonts/**").permitAll()
//                    .requestMatchers(toH2Console()).permitAll()
//                    .anyRequest().authenticated()
//            )
//            .csrf(csrf -> csrf
//                    .ignoringRequestMatchers(toH2Console())
//                    .disable())
//            .formLogin(form -> form
//                    .loginPage("/login")
//                    .defaultSuccessUrl("/empleados")
//                    .permitAll())
//            .logout(logout -> logout
//                    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//            );
//        return http.build();
//    }


}
