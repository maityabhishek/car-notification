package com.notification.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notification.dao.NotificationDAO;

@Service
public class NotificationServiceImpl implements NotificationService{

	@Autowired
	NotificationDAO notificationDAO;
	
	@Override
	public String getNotification(String carNo) {
		
		return String.valueOf(notificationDAO.count());
		
	}

}
