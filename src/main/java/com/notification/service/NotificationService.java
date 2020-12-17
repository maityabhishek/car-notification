package com.notification.service;

import java.util.List;

import com.notification.model.CoolantEventNotification;

public interface NotificationService {
	public List<?> getNotification(String vin);
}
