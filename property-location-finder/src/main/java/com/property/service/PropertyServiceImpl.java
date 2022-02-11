package com.property.service;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.property.model.Property;
import com.property.model.ResponseDto;
import com.property.repository.PropertyRepository;

@Service
public class PropertyServiceImpl implements PropertyService {

	private PropertyRepository repo;

	public PropertyServiceImpl(PropertyRepository repo) {
		this.repo = repo;
	}

	public ResponseDto<Property> addUpdateProperty(Property property) {
		if(null == property.getId()) {
			property.setId(randomIdGenerator());
			Property prop = repo.save(property);
			return new ResponseDto<Property>(prop, HttpStatus.CREATED);
		} else {
			Property prop = repo.save(property);
			return new ResponseDto<Property>(prop, HttpStatus.OK);
		}

	}

	private String randomIdGenerator() {
		UUID uuid = UUID.randomUUID();
		String uuidAsString = uuid.toString();
		return uuidAsString;
	}

	public List<Property> getProperties() {
		return repo.findAll();
	}

}
