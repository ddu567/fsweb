package com.shop.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

@EntityListeners(value = {AuditingEntityListener.class})
@MappedSuperclass
@Getter
public abstract class BaseEntity extends BaseTimeEntity {
    @CreatedBy
    @Column(updatable = false)
    private String CreatedBy;

    @LastModifiedBy
    private String modifiedBy;

    // BaseTimeEntity 상속 받고 있으므로 등록일, 수정이 ,등록자, 수정자를 모두 갖는 BaseEntity를 완성, 이를 상속받아 사용
}
