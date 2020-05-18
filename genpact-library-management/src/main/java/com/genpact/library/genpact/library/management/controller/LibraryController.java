package com.genpact.library.genpact.library.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.genpact.library.genpact.library.management.model.BookEntity;
import com.genpact.library.genpact.library.management.model.LibraryEntity;
import com.genpact.library.genpact.library.management.service.LibraryServiceImpl;

import javassist.NotFoundException;


@RestController
@RequestMapping("/library")
public class LibraryController {
	
	@Autowired
    LibraryServiceImpl service;
	
	@RequestMapping(value = "/create", method= RequestMethod.POST, produces = "application/json")
    public ResponseEntity<LibraryEntity> createOrUpdateLibraries(LibraryEntity employee)
                                                    throws NotFoundException {
		LibraryEntity updated = service.createOrUpdateLibrary(employee);
        return new ResponseEntity<LibraryEntity>(updated, new HttpHeaders(), HttpStatus.OK);
    }
 
	@RequestMapping(value = "/getBooks", method= RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<BookEntity>> getAllBooks() {
        List<BookEntity> list = service.getAllBooks(); 
        return new ResponseEntity<List<BookEntity>>(list, new HttpHeaders(), HttpStatus.OK);
    }
    
 
	@RequestMapping(value = "/createBook", method= RequestMethod.POST, produces = "application/json")
	public ResponseEntity<BookEntity> createOrUpdateBooks(BookEntity employee)
                                                    throws NotFoundException {
    	BookEntity updated = service.createOrUpdateBook(employee);
        return new ResponseEntity<BookEntity>(updated, new HttpHeaders(), HttpStatus.OK);
    } 
}
