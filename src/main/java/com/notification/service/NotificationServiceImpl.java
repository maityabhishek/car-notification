package com.notification.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

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
		Set<String> eventNames = new HashSet<String>();
		List<Notification> finalNotificationList = new ArrayList<Notification>();
		List<Notification> notificationList = notificationDAO.findByVinOrderByEventdateDesc(vin);
		if (notificationList == null || notificationList.isEmpty()) {
			notificationList = new ArrayList<Notification>();
		}
		for(Notification notification: notificationList) {
			if(eventNames.add(notification.getEventname())) {
				finalNotificationList.add(notification);
			}
		}

		return finalNotificationList;

	}

}
