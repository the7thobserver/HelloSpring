import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

/**
 * Created by leunj018 on 4/25/16.
 */

public class PropertyManager
{
    @Autowired
    private Environment env;

    public String provideAProperty()
    {
        return env.getProperty("A");
    }
}
