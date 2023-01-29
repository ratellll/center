package sup.center.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sup.center.AppConfig;
import sup.center.Member.Grade;
import sup.center.Member.Member;
import sup.center.Member.MemberService;
import sup.center.Member.MemberServiceImpl;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }
    @Test
    void join() {
        //given
        Member member = new Member(1L,"member1",275,Grade.VIP);
        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
