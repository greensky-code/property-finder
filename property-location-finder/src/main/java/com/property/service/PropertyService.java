package com.property.service;

import com.property.model.Property;
import com.property.model.ResponseDto;

public interface PropertyService {

	public ResponseDto<Property> addUpdateProperty(Property property);
	public java.util.List<Property> getProperties();

}
