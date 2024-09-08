package com.example.auditing.springboot2_jpa_auditing.audit;

import static jakarta.persistence.TemporalType.TIMESTAMP;

import java.util.Date;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass //Later, we can use the Auditable class in other audited entities.
@EntityListeners(AuditingEntityListener.class) //the listener contains the callback methods(PrePersist, PreUpdate) which will persist or update when entity is persisted and updated
public abstract class Auditable<U> {

	@CreatedBy  //Declares a field as the one representing the principal that created the entity containing the field.
	protected U createdBy;
	
	@CreatedDate //Declares a field as the one representing the date the entity containing the field was created.
	@Temporal(TIMESTAMP)
	protected Date createdDate;
	
	@LastModifiedBy //Declares a field as the one representing the principal that created the entity containing the field.
	protected U lastModifiedBy;
	
	@LastModifiedDate //Declares a field as the one representing the principal that recently modified the entity containing the field.
	@Temporal(TIMESTAMP)
	protected Date lastModifiedDate;
	
}
