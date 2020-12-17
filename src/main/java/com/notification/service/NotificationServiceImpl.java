package com.notification.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notification.dao.EmissionNotificationDAO;
import com.notification.dao.NotificationDAO;
import com.notification.model.Notification;

@Service
public class NotificationServiceImpl implements NotificationService{

	@Autowired
	NotificationDAO notificationDAO;
	
	@Autowired
	EmissionNotificationDAO emissionNotificationDAO;
	
	@Override
	public List<?> getNotification(String vin) {
		
		List<Notification> notificationList = new ArrayList<>();
		notificationList.addAll(notificationDAO.findAllByVin(vin));
		notificationList.addAll(emissionNotificationDAO.findAllByVin(vin));
		return notificationList;
		
	}

}
