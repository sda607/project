package com.shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter
@ToString
public class Review extends BaseEntity {

	@Id
	@Column(name = "review_num")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotBlank(message = "내용을 입력하세요.")
	private String reviewContent;
	
	@ManyToOne(fetch = FetchType.LAZY)	//cascade는 oneToMany에 적는 것. 
	@JoinColumn(name = "user_number")
	private Member member;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private Item item;
}
