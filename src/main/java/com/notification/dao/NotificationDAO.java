package com.notification.dao;

import org.springframework.stereotype.Repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.notification.model.CoolantEventNotification;

@Repository
public interface NotificationDAO extends CosmosRepository<CoolantEventNotification, String> {

}
