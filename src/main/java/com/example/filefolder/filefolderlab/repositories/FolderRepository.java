package com.example.filefolder.filefolderlab.repositories;

import com.example.filefolder.filefolderlab.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder,Long> {
}
