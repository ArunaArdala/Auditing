package com.example.auditing.springboot2_jpa_auditing.audit;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class AuditorAwareImpl implements AuditorAware<String> {

	@Override
	public Optional<String> getCurrentAuditor() {
		return Optional.of("Vyshnavi");
	}

}

//A can analyze createdDate and lastModifiedDate using the current system time, but what about the createdBy and lastModifiedBy fields? How will JPA recognize what to store in them?
//To tell JPA about currently logged-in users, we will need to provide an implementation of AuditorAware and override the getCurrentAuditor() method. And inside getCurrentAuditor(), we will need to fetch a currently logged-in user.