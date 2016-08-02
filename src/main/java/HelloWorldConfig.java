import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by leunj018 on 4/25/16.
 */
@Configuration
@PropertySource(value = {"classpath:serverProperties.properties"})
public class HelloWorldConfig
{
    @Bean
    public PropertyManager provideProperties()
    {
        return new PropertyManager();
    }

    @Bean
    public HelloWorld provideHelloWorld()
    {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setA(provideProperties().provideAProperty());
        helloWorld.setMessage("Different!");
        return helloWorld;
    }
}
