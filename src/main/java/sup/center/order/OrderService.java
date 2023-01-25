package sup.center.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemSize, int itemPrice);
}
