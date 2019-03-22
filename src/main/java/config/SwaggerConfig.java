package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.*;

@EnableSwagger2
@Configuration
public class SwaggerConfig extends WebMvcConfigurationSupport {
	
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.example"))              
          .paths(PathSelectors.regex("/rest.*"))                          
          .build() 
          .apiInfo(metaInfo());

	
	

}

	private ApiInfo metaInfo() {
		// TODO Auto-generated method stub
	@SuppressWarnings("deprecation")
	ApiInfo apisInfo= new ApiInfo("Spring Boot Swagger Document","Swagger Document For Rest Api's", "1.0", "Terms And Service","ayyappalokesh.garlapati7411@gmail.com","Apache Licencse 2.0", "https://www.apache.org/licenses/LICENSE-2.0"
			
				);
	return apisInfo;
	
	}
}
	

