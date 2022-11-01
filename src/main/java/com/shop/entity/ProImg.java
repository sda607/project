package com.shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class ProImg {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pro_img_id")
	private Long id;
	
	private String imgName;
	
	private String oriImgName;
	
	private String imgUrl;
	
	private String repImgYn;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pro_id")
	private Item item;
}
