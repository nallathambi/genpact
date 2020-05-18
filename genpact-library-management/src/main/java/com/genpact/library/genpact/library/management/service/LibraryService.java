package com.genpact.library.genpact.library.management.service;

import java.util.List;

import com.genpact.library.genpact.library.management.model.BookEntity;
import com.genpact.library.genpact.library.management.model.LibraryEntity;

import javassist.NotFoundException;

public interface LibraryService {
	
	List<BookEntity> getAllBooks();
	
	BookEntity createOrUpdateBook(BookEntity entity) throws NotFoundException;
	
	LibraryEntity createOrUpdateLibrary(LibraryEntity entity) throws NotFoundException;

}
