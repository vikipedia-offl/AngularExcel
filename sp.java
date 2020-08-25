public class ServletInitializer extends SpringBootServletInitializer implements WebApplicationInitializer {
   @Override   
   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
      return application.sources(BootUserMgmtApplication.class);   }
}
