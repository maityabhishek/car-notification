package com.notification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.notification.service.NotificationService;

@RestController
@CrossOrigin(origins = "*")
public class NotificationController {

	@Autowired
	private NotificationService notificationService;

	/**
	 * This method retrieve Notification by passing vin
	 * 
	 * @param vin
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, path = "/getnotificationbyvin/{vin}", headers = "Accept=application/json")
	public ResponseEntity<?> getNotificationByVin(@PathVariable("vin") Integer vin) {
		return new ResponseEntity<>(notificationService.getNotificationByVin(vin), HttpStatus.OK);
	}
}
