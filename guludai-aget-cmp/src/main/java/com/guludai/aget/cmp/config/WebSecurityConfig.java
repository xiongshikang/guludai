package com.guludai.aget.cmp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * ${DESCRIPTION}
 *
 * @author wanghaobin
 * @create 2017-06-02 12:02
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
  // @Value("${spring.profiles}")
  // private String env;

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.formLogin().loginPage("/login").defaultSuccessUrl("/admin/index").permitAll().and()
        .logout().logoutSuccessUrl("/login")
            .invalidateHttpSession(true) .and().authorizeRequests()
        .antMatchers("/**/*.css", "/img/**", "/api/**", "/**/*.js") 
        .permitAll().and().authorizeRequests().antMatchers("/**").authenticated();
    http.csrf().disable();
    http.headers().frameOptions().disable();
    http.httpBasic();
  }

  /*
   * @Autowired // 也可以在application.yml文件中配置登录账号密码：security.user.name/password public void
   * configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
   * auth.inMemoryAuthentication().withUser("whb").password("").roles("USER"); }
   */
}
