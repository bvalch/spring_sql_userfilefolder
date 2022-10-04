package com.example.filefolder.filefolderlab.repositories;

import com.example.filefolder.filefolderlab.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
