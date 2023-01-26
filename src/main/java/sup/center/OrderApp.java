package sup.center;

import sup.center.Member.Grade;
import sup.center.Member.Member;
import sup.center.Member.MemberService;
import sup.center.Member.MemberServiceImpl;
import sup.center.order.Order;
import sup.center.order.OrderService;
import sup.center.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Long memberSize = 270L;
        Member member = new Member(memberId, "memberA", memberSize, Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA",10000, 270);
        System.out.println("order="+order);
    }
}
