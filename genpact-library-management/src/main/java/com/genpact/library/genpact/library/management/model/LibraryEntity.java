package com.genpact.library.genpact.library.management.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Library")
public class LibraryEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id",unique = false)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;
	
	/*@OneToMany(cascade=CascadeType.ALL, mappedBy ="id" )    
	private List<BookEntity> books;*/
	
	/*@Override
	public String toString() {
		return "Library [id=" + libraryId + ", name=" + name + ", address=" + address + ", "
				+ "books=" + books 
				+ "]";
	}*/

	/*public LibraryEntity(Long id, String name, String address,List<BookEntity> books) {
		super();
		this.libraryId = id;
		this.name = name;
		this.address = address;
		this.books  = books;
	}*/
	
	public LibraryEntity() {}

	public Long getID() {
		return id;
	}

	public void setID(Long iD) {
		id = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	/*public List<BookEntity> getBooks() {
		return books;
	}

	public void setBooks(List<BookEntity> books) {
		this.books = books;
	}*/

		

}
