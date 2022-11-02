package com.shop.entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter @Setter
public class OrderItem extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;  //하나의 상품은 여러 주문 상품으로 들어갈수있음 - 다대일 단방향 매핑

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;    //주문 상품 엔티티와 주문 엔티티를 다대일 단방향 매핑

    private int orderPrice; //주문가격

    private int count; //수량

}