package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);

        //AppConfig appConfig = new AppConfig();
        ApplicationContext ApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService = ApplicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = ApplicationContext.getBean("orderService", OrderService.class);

        memberService.join(member);

        Order order = orderService.createOrder(memberId, "ItemA", 10000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice() = " + order.calculatePrice());
        
    }
}
