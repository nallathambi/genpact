package com.genpact.library.genpact.library.management.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genpact.library.genpact.library.management.model.BookEntity;
import com.genpact.library.genpact.library.management.model.LibraryEntity;
import com.genpact.library.genpact.library.management.repositories.BookRepository;
import com.genpact.library.genpact.library.management.repositories.LibraryRepository;

import javassist.NotFoundException;

@Service
public class LibraryServiceImpl implements LibraryService{

	@Autowired
	BookRepository bookrepository;
	
	@Autowired
	LibraryRepository libraryRepository;
	
	@Override
	public List<BookEntity> getAllBooks()
    {
        List<BookEntity> employeeList = bookrepository.findAll();
         
        if(employeeList.size() > 0) {
            return employeeList;
        } else {
            return new ArrayList<BookEntity>();
        }
    }
     
	@Override
    public BookEntity createOrUpdateBook(BookEntity entity) throws NotFoundException 
    {
        Optional<BookEntity> book = bookrepository.findById(entity.getISBN());
         
        if(book.isPresent()) 
        {
        	BookEntity newEntity = getBook(entity, book);  
             
            newEntity = bookrepository.save(newEntity);
             
            return newEntity;
        } else {
            entity = bookrepository.save(entity);
             
            return entity;
        }
    }
	
	@Override
    public LibraryEntity createOrUpdateLibrary(LibraryEntity entity) throws NotFoundException 
    {
        Optional<LibraryEntity> library = libraryRepository.findById(entity.getID());
         
        if(library.isPresent()) 
        {
        	LibraryEntity newEntity = library.get();
        	newEntity.setAddress(entity.getAddress());
        	newEntity.setName(entity.getName());
        	//entity.getBooks().get(0).setId((long)9709876);
        	//newEntity.setBooks(entity.getBooks()); 
        	newEntity.setID(entity.getID());
            newEntity = libraryRepository.save(newEntity);
            return newEntity;
        } else {
            entity = libraryRepository.save(entity);             
            return entity;
        }
    }

	private BookEntity getBook(BookEntity entity, Optional<BookEntity> book) {
		BookEntity newEntity = book.get();
		newEntity.setAvailable(entity.getAvailable());
		newEntity.setCover(entity.getCover());
		newEntity.setISBN(entity.getISBN());
		newEntity.setPages(entity.getPages());
		newEntity.setPublisher(entity.getPublisher());
		newEntity.setTitle(entity.getTitle());
		return newEntity;
	} 
     
    
}
