package sup.center.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import sup.center.Member.Grade;
import sup.center.Member.Member;
import sup.center.Member.MemberService;
import sup.center.Member.MemberServiceImpl;

public class OrderServiceTest {


    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", 275, Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 275, 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);


    }
}
