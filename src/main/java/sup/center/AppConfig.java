package sup.center;

import sup.center.Member.*;
import sup.center.discount.DiscountPolicy;
import sup.center.discount.FixDiscountPolicy;
import sup.center.discount.RateDiscountPolicy;
import sup.center.order.OrderService;
import sup.center.order.OrderServiceImpl;

public class AppConfig {


    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());

        }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(),discountPolicy());
    }


    public DiscountPolicy discountPolicy () {
        return new RateDiscountPolicy();
    }
}
