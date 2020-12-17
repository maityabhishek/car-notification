package com.notification.model;

import com.azure.spring.data.cosmos.core.mapping.Container;

@Container(containerName = "emissioneventcontainer", ru = "400")
public class EmissionEventNotfication extends Notification{

}
