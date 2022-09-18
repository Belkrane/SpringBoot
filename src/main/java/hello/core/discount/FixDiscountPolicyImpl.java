package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicyImpl implements DiscountPolicy {
    private int fixDiscount = 1000;

    @Override
    public int discount(Member member, int itemPrice) {

        if(member.getGrade() == Grade.VIP){
            return fixDiscount;
        } else {
            return 0;
        }
    }
}
