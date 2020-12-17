package com.notification.model;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "coolanteventcontainer", ru = "400")
public class CoolantEventNotification extends Notification{
	
}
