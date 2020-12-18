package com.notification.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notification.dao.NotificationDAO;
import com.notification.model.Notification;

@Service
public class NotificationServiceImpl implements NotificationService {

	@Autowired
	NotificationDAO notificationDAO;

	@Override
	public List<?> getNotificationByVin(Integer vin) {
		List<Notification> notificationList = notificationDAO.findByVin(vin);
		if (notificationList == null || notificationList.isEmpty()) {
			notificationList = new ArrayList<Notification>();
		}
		return notificationList;

	}

}
