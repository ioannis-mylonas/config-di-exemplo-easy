package teste.teste.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("release")
public class ReleaseConfiguration {

	@Bean
	public String testeString() {
		return "String Release";
	}
	
}
