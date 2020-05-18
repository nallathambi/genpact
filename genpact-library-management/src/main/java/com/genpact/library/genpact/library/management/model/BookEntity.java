package com.genpact.library.genpact.library.management.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class BookEntity implements Serializable {
	
	private static final long serialVersionUID = 2970066045300599376L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id",unique = true, nullable = false)
	private Long id;
	
	@Column(name = "ISBN")
	private Long ISBN;
	
	/*@ManyToOne(cascade = CascadeType.ALL,fetch= FetchType.LAZY)
	@JoinColumn(name = "id",nullable=true,insertable=false,updatable=false)
	private LibraryEntity library;*/

	@Column(name = "title")
	private String title;

	@Column(name = "cover")
	private String cover;

	@Column(name = "publisher")
	private String publisher;

	@Column(name = "pages")
	private int pages;

	@Column(name = "available")
	private int available;

	/*@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", cover=" + cover + ", publisher=" + publisher + ", pages="
				+ pages + ", available=" + available + "]";
	}*/

	public BookEntity(Long iSBN, String title, String cover, String publisher, int pages, int available) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.cover = cover;
		this.publisher = publisher;
		this.pages = pages;
		this.available = available;
	}

	
	public Long getISBN() {
		return ISBN;
	}

	public void setISBN(Long iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public BookEntity() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/*public LibraryEntity getLibrary() {
		return library;
	}

	public void setLibrary(LibraryEntity library) {
		this.library = library;
	}
	*/

}
