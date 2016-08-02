import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;

import java.util.Properties;

/**
 * Created by leunj018 on 4/18/16.
 */
public class HelloWorld {
    private String message, propertyA;

    public void setMessage(String message){
        this.message  = message;
    }

    public void setA(String a){
        propertyA = a;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
        System.out.println("PROPS " + propertyA);
    }
}