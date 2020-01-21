# Microservice-authorization-server

 
Deffine new AuthenticationManager Bean and change the name of it don't use authenticationManager it will conflict.

@Bean
    protected AuthenticationManager getAuthenticationManager() throws Exception {
        return super.authenticationManagerBean();
    }
    
  