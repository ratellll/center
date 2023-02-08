package sup.center.discount;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sup.center.member.Grade;
import sup.center.member.Member;

import static org.assertj.core.api.Assertions.*;

class RateDiscountPolicyTest {
    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();


    @Test
    @DisplayName("VIP는 10프로 할인이 적용되어야한다")
    void vip_0() {
        //given
        Member member = new Member(1L, "MemberVIP", 275, Grade.VIP);

        //when
        int discount = discountPolicy.discount(member, 10000);
        //then
        assertThat(discount).isEqualTo(1000);
    }




    @Test
    @DisplayName("VIP가아니면 할인 안댕!")
    void vip_x() {
        //given
        Member member = new Member(1L, "MemberVIP", 275, Grade.BASIC);

        //when
        int discount = discountPolicy.discount(member, 10000);
        //then
        assertThat(discount).isEqualTo(0);
    }
}