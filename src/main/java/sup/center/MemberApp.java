package sup.center;

import sup.center.Member.Grade;
import sup.center.Member.Member;
import sup.center.Member.MemberService;
import sup.center.Member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", 275,Grade.VIP);
        memberService.join(member);


        Member findMember = memberService.findMember(1L);
        System.out.println(member.getName());
        System.out.println(member.getGrade());
    }
}
