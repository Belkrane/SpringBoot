package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int discountRate = 10;

    @Override
    public int discount(Member member, int itemPrice) {
        if(member.getGrade() == Grade.VIP){
            return itemPrice * discountRate / 100;
        } else {
            return 0;
        }

    }
}
