package com.notification.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.notification.model.Notification;
import com.notification.service.NotificationService;

@RestController
@CrossOrigin(origins ="*")
public class NotificationController {
	
	@Autowired
	private NotificationService notificationService;

	/**
	 * This method retrieve analytics information
	 * 
	 * @param carno
	 * @param token
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET,path="/getnotification/{vin}", headers = "Accept=application/json")
	public ResponseEntity<?> getNotification(@PathVariable("vin")String vin)
	{
		List<?> ll = notificationService.getNotification(vin);
//		if(ll == null) {
//			ll = new ArrayList<Notification>();
//			ll.addAll(new Notification("vin", "eventname", "eventval", "eventtype", "eventdesc", "eventdate"));
//		}
		
		System.out.append("data : "+ll);
		return new ResponseEntity<>(ll,HttpStatus.OK);
	}
}
