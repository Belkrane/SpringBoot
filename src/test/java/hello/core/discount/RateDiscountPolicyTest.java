package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    @Test
    @DisplayName("VIP인 경우 10% 할인된다.")
    void vip_o(){
        Member member = new Member(1L, "memberA", Grade.VIP);

        DiscountPolicy discountPolicy = new RateDiscountPolicy();

        int discount = discountPolicy.discount(member, 10000);

        Assertions.assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아닌 경우 할인되지 않는다.")
    void vip_x(){
        Member member = new Member(2L, "memberB", Grade.BAISC);

        DiscountPolicy discountPolicy = new RateDiscountPolicy();

        int discount = discountPolicy.discount(member, 10000);

        Assertions.assertThat(discount).isEqualTo(0);
    }
}