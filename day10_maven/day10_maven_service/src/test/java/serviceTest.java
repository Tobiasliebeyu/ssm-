import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class serviceTest {
    @Test
    public void show(){
        ClassPathXmlApplicationContext aContext = new ClassPathXmlApplicationContext("applicationContext-service.xml");
        ItemsService bean = aContext.getBean(ItemsService.class);
        Items byId = bean.findById(1);
        System.out.println(byId);
    }
}
