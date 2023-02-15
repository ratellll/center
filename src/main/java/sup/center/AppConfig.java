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


    //@Bean memberService -> new MemoryMemberRepository
    //@Bean orderService-> memberRepository -> MemoryMemberRepository 또 호출



    //1.call AppConfig.memberService
    //2.call AppConfig.memberRepository
    //3.call AppConfig.memberRepository
    //4.call AppConfig.orderService
    //5.call AppConfig.memberRepository
    @Bean // 자동으로 컨테이너에 등록이됨
    public MemberService memberService(){
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
        }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(),discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy () {
        return new RateDiscountPolicy();
    }
}
