package sup.center;

import sup.center.Member.Member;
import sup.center.Member.MemberService;
import sup.center.Member.MemberServiceImpl;
import sup.center.Member.MemoryMemberRepository;
import sup.center.discount.FixDiscountPolicy;
import sup.center.order.OrderService;
import sup.center.order.OrderServiceImpl;

public class AppConfig {


    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());

        }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }


}
