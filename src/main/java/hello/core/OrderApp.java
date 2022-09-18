package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        MemberService memberService = new MemberServiceImpl();

        memberService.join(member);

        OrderService orderService = new OrderServiceImpl();
        
        Order order = orderService.createOrder(memberId, "ItemA", 10000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice() = " + order.calculatePrice());
        
    }
}
