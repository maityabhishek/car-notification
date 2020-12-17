package com.notification.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.notification.model.EmissionEventNotfication;

@Repository
public interface EmissionNotificationDAO extends CosmosRepository<EmissionEventNotfication, String> {
	
	List<EmissionEventNotfication> findAllByVin(String vin);

}
