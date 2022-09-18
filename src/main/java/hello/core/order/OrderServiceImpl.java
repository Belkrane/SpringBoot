package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicyImpl;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemeberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {
    private final DiscountPolicy discountPolicy = new FixDiscountPolicyImpl();
    private final MemeberRepository memberRepository = new MemoryMemberRepository();


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);


        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
