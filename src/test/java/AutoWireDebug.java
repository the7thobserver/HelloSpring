import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Properties;

/**
 * Created by leunj018 on 4/25/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:Beans.xml"})
public class AutoWireDebug
{
    @Autowired
    @Qualifier("serverProperties")
    private Properties props;

    @Test
    public void checkConfig()
    {
        Assert.assertNotNull(props);
    }
}
