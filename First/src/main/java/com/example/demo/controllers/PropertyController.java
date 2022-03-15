package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Property;
import com.example.demo.services.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PatchMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;



@RestController
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping("/property")
    public List<Property> retriveAllProperties() {
        return propertyService.retriveAllProperties();
    }

    @PostMapping("/property")
    public ResponseEntity<Object> addProperty(@RequestBody Property property) {
        return propertyService.addProperty(property);
    }

    @GetMapping("/property/{id}")
    public Optional<Property> getPropertyById(@PathVariable Integer id) {
        return propertyService.getPropertyById(id);
    }

    @DeleteMapping("/property/{id}")
    public void deletePropertyById(@PathVariable Integer id) {
        propertyService.deletePropertyById(id);

    }
    @PatchMapping("/property")
    public ResponseEntity<Object> updateProperty(@RequestBody Property property) {
        return propertyService.updateProperty(property);
    }
}
