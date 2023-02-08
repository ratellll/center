package sup.center;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sup.center.member.Grade;
import sup.center.member.Member;
import sup.center.member.MemberService;

public class MemberApp {
    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        //ApplicationContext를 스프링 컨테이너라고 한다.
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "memberA", 275,Grade.VIP);
        memberService.join(member);


        Member findMember = memberService.findMember(1L);
        System.out.println(member.getName());
        System.out.println(member.getGrade());
    }
}
