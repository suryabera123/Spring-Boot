package hello.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private CustomAuthenticationProvider authProvider;

    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.authenticationProvider(authProvider);
    }


    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().authenticated()
                .and()
                .httpBasic();
    }





/* This is for inMemory authentication
    // Authentication : User --> Roles
    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.inMemoryAuthentication().withUser("user").password("secret")
                .roles("USER").and().withUser("admin").password("secret")
                .roles("USER", "ADMIN");
    }



    // Authorization : Role -> Access
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.httpBasic().and().authorizeRequests().antMatchers("/1")
                .hasRole("USER").antMatchers("/2").hasRole("ADMIN").and()
                .csrf().disable().headers().frameOptions().disable();
    }
*/


}
