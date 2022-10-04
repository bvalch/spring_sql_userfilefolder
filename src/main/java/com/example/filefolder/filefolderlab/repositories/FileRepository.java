package com.example.filefolder.filefolderlab.repositories;

import com.example.filefolder.filefolderlab.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File,Long> {
}
