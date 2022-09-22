package hello.core.xmltest;

import hello.core.order.OrderService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class xmlApplicationContextTest {
    @Test
    @DisplayName("xml ApplicationContext Test")
    void xmlApplicationContextTest(){
        ApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
        OrderService orderService = ac.getBean("orderService", OrderService.class);

        Assertions.assertThat(orderService).isInstanceOf(OrderService.class);
    }
}
