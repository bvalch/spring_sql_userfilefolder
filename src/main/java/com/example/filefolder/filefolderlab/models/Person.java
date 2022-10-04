package com.example.filefolder.filefolderlab.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="person_name")
    private String name;
    @OneToMany(mappedBy = "person",fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"person"})
    private List<Folder> folders;

    public Person(String name) {
        this.name = name;
    }
    public Person(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }

    public void addFolder(Folder folder){
        this.folders.add(folder);
    }
}
