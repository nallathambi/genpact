package com.genpact.library.genpact.library.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.genpact.library.genpact.library.management.model.LibraryEntity;

@Repository
public interface LibraryRepository extends JpaRepository<LibraryEntity,Long> {

}
