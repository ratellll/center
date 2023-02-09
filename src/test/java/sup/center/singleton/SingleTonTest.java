package sup.center.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sup.center.AppConfig;
import sup.center.member.MemberService;

public class SingleTonTest {


    //스프링 없는 순수한 DI컨테이너인 AC는 요철할때마다 객체를 새로 생성1
    @Test
    @DisplayName("스프링없는 순수한 DI 컨테이너")
    void pureContainer() {
        AppConfig appConfig = new AppConfig();
        //1.조회 호출할 때 마다 객체 생성
        MemberService memberService1 = appConfig.memberService();

        //2.조회: 호출 할 때 마다 객체 생성
        MemberService memberService2 = appConfig.memberService();

        //참조값이 다른것 확인
        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);

        //mS는 ms2랑다름
         Assertions.assertThat(memberService1).isNotSameAs(memberService2);
    }
}
