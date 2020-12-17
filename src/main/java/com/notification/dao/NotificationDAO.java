package com.notification.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.notification.model.CoolantEventNotification;
import com.notification.model.Notification;

@Repository
public interface NotificationDAO extends CosmosRepository<CoolantEventNotification, String> {
	
	List<Notification> findAllByVin(String vin);

}
