package com.property.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.property.model.Property;
import com.property.model.ResponseDto;
import com.property.service.PropertyService;;

@RestController
@RequestMapping(value="/v1/app")
public class PropertyController {
	
	@Autowired
	PropertyService service;

	@RequestMapping(value = "/addProperty", method = RequestMethod.POST)
	public ResponseEntity<ResponseDto<Property>> addProperty(@RequestBody Property property) throws IOException {
		ResponseDto<Property> response = service.addUpdateProperty(property);
		return ResponseEntity.ok(response);
	}
	
	@RequestMapping(value = "/updateProperty", method = RequestMethod.PUT)
	public ResponseEntity<ResponseDto<Property>> updateProperty(@RequestBody Property property) throws IOException {
		ResponseDto<Property> response = service.addUpdateProperty(property);
		return ResponseEntity.ok(response);
	}
}
