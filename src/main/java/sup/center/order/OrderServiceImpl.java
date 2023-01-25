package sup.center.order;

import sup.center.Member.Member;
import sup.center.Member.MemberRepository;
import sup.center.Member.MemoryMemberRepository;
import sup.center.discount.DiscountPolicy;
import sup.center.discount.FixDiscountPolicy;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();


    @Override
    public Order createOrder(Long memberId, String itemName, int itemSize, int itemPrice) {

        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemSize, itemPrice, discountPrice);
    }
}
