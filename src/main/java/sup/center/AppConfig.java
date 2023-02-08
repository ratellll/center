package sup.center;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sup.center.member.*;
import sup.center.discount.DiscountPolicy;
import sup.center.discount.RateDiscountPolicy;
import sup.center.order.OrderService;
import sup.center.order.OrderServiceImpl;

@Configuration
public class AppConfig {


    @Bean // 자동으로 컨테이너에 등록이됨
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
        }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(),discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy () {
        return new RateDiscountPolicy();
    }
}
