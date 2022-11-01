package com.shop.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter
@ToString
public class Item extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pro_id")
	private Long id;
	
	@NotBlank(message = "상품 이름은 필수 입력내용입니다.")
	private String itemNm;
	
	@NotNull(message = "가격은 필수 입력내용입니다.")
	private int price;
	
	@NotNull(message = "재고는 필수 입력내용입니다.")
	private int stockNumber;
	
	private String itemDetail;

	@Enumerated(EnumType.STRING)
	private ItemSellStatus itemSellStatus;
	
	//@Enumerated
	//private Status
	
	private int soldQty;
	
	private int reviewCount;
}
