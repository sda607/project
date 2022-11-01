package com.shop.entity;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;

@EntityListeners(value = {AuditingEntityListener.class})
@MappedSuperclass
@Getter
public class BaseEntity extends BaseTimeEntity {	//왜 BaseTimeEntity를 따로 만들었는지?

	@CreatedBy
	@Column(updatable = false)
	private String createdBy;
	
	@LastModifiedBy
	private String modifiedBy;
}
