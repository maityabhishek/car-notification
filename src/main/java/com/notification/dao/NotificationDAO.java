package com.notification.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.notification.model.Notification;

@Repository
public interface NotificationDAO extends CosmosRepository<Notification, String> {
	
	List<Notification> findByVinOrderByEventdateDesc(Integer vin);

//	@Query(value = "select * from c where c.vin = @vin")
//    List<Notification> findByVin(@Param("vin") String vin);
}
