package sup.center.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sup.center.AppConfig;
import sup.center.member.Grade;
import sup.center.member.Member;
import sup.center.member.MemberService;

public class OrderServiceTest {


    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void beforEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", 275, Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 275, 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);


    }
}
