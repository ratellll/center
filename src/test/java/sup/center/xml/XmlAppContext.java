package sup.center.xml;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;
import sup.center.member.MemberService;

import static org.assertj.core.api.Assertions.*;

public class XmlAppContext {


    @Test
    void xmlAppContext() {
        GenericXmlApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);

    }
}
