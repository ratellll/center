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
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();


        Long memberId = 1L;
        int memberSize = 275;
        Member member = new Member(memberId, "memberA", 275, Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA",10000, 270);
        System.out.println("order="+order);
    }
}
