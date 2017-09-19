package beans;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by yinhao on 17/9/19.
 */
@SuppressWarnings("deprecation")
public class BeanFactoryTest {

    @Test
    public void testSimpleLoad(){
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring/spring.xml"));
        MyTestBean myTestBean = (MyTestBean)beanFactory.getBean("myTestBean");
        Assert.assertEquals("testStr",myTestBean.getTestStr());
    }
}
