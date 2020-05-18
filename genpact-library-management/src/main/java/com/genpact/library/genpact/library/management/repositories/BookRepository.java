package com.genpact.library.genpact.library.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.genpact.library.genpact.library.management.model.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long>{

}
