package pl.esportowapolska.core;

import com.github.pplociennik.auth.core.configuration.DefaultStaticSecurityConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import( DefaultStaticSecurityConfiguration.class )
public class CoreApplication {

    public static void main( String[] args ) {
        SpringApplication.run( CoreApplication.class, args );
    }

}
