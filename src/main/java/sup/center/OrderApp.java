package sup.center;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sup.center.Member.Grade;
import sup.center.Member.Member;
import sup.center.Member.MemberService;
import sup.center.Member.MemberServiceImpl;
import sup.center.order.Order;
import sup.center.order.OrderService;
import sup.center.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
//        OrderService orderService = appConfig.orderService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);


        Long memberId = 1L;
        int memberSize = 275;
        Member member = new Member(memberId, "memberA", 275, Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA",270, 10000);
        System.out.println("order="+order);
    }
}
