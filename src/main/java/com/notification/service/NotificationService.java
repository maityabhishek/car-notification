package com.notification.service;

import org.springframework.stereotype.Service;

@Service
public interface NotificationService {
	String getNotification(String carNo);
}
