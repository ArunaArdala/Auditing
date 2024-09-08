package com.example.auditing.springboot2_jpa_auditing.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.example.auditing.springboot2_jpa_auditing.audit.Auditable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class) // the Listener class used to register the auditingEntityListener
public class User extends Auditable<String> {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	@Column(name = "email_address", nullable = false)
	private String emailId;

}
