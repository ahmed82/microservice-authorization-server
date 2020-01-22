# Microservice-authorization-server

 
Deffine new AuthenticationManager Bean and change the name of it don't use authenticationManager it will conflict.

@Bean
    protected AuthenticationManager getAuthenticationManager() throws Exception {
        return super.authenticationManagerBean();
    }
    

rename data.sql to data.txt after the first run to avoid conflict insertion to the database.
  
  
 pass the userDetailsService to method AuthenticationManagerBuilder
 
## Activate lombok 
### use @Data on top of the class.

All together now: A shortcut for @ToString, @EqualsAndHashCode, @Getter on all fields, @Setter on all non-final fields, and @RequiredArgsConstructor!