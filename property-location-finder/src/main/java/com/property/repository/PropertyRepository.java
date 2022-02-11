package com.property.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.property.model.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, String> {

}
