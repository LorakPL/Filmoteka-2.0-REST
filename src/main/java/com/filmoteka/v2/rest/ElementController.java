package com.filmoteka.v2.rest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.filmoteka.v2.rest.ElementService.getAllElements;

@RequestMapping("/elements")
@RestController
public class ElementController {
    @RequestMapping(value="/{value}", method=RequestMethod.GET)
    public ResponseEntity<List<Element>> get(@PathVariable("value") String value) {
        List<Element> elementList = getAllElements(value);
        return new ResponseEntity<List<Element>>(elementList, new HttpHeaders(), HttpStatus.OK);
    }
}
