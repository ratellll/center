package sup.center.order;

import sup.center.member.Member;
import sup.center.member.MemberRepository;
import sup.center.discount.DiscountPolicy;


public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    private  final DiscountPolicy discountPolicy;


    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }





    @Override
    public Order createOrder(Long memberId, String itemName, int itemSize, int itemPrice) {

        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemSize, itemPrice, discountPrice);
    }

    //테스트용
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
