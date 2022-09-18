package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

    /**
     * @return 할인가격
     */

    int discount(Member member, int itemPrice);

}
