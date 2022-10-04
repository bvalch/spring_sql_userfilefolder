package com.example.filefolder.filefolderlab.controllers;


import com.example.filefolder.filefolderlab.models.Folder;
import com.example.filefolder.filefolderlab.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

@RestController
public class FolderController {

    @Autowired
    FolderRepository folderRepository;

    @GetMapping(value="/folders")
    public ResponseEntity<List<Folder>> getAllFolders(){
        return new ResponseEntity<>(folderRepository.findAll(), HttpStatus.OK);
    }
    @GetMapping(value="/folders/{id}")
    public ResponseEntity getFolderById(@PathVariable Long id){
        return new ResponseEntity(folderRepository.findById(id),HttpStatus.OK);
    }
    @PostMapping(value="/folders")
    public ResponseEntity<Folder> postFolder(@RequestBody Folder folder){
        folderRepository.save(folder);
        return new ResponseEntity<>(folder,HttpStatus.CREATED);
    }
}
