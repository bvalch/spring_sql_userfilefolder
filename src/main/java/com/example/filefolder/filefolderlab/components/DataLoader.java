package com.example.filefolder.filefolderlab.components;


import com.example.filefolder.filefolderlab.models.File;
import com.example.filefolder.filefolderlab.models.Folder;
import com.example.filefolder.filefolderlab.models.Person;
import com.example.filefolder.filefolderlab.repositories.FileRepository;
import com.example.filefolder.filefolderlab.repositories.FolderRepository;
import com.example.filefolder.filefolderlab.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test") //Run every time EXCEPT Tests
@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    PersonRepository personRepository;



    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        Person person = new Person("JOE");
        personRepository.save(person);
//        Person person2 = new Person("Doe");
//        personRepository.save(person2);

        Folder folder = new Folder("FOLDER",person);
        folderRepository.save(folder);
//        Folder folder2 = new Folder("Folder2,",person);
//        folderRepository.save(folder2);

        File file1=new File("FILE!","DDDDD",000000,folder);
        fileRepository.save(file1);
//        File file2=new File("file2","exe",77,folder);
//        fileRepository.save(file2);
//        File file3=new File("file3","exe",77,folder);
//        fileRepository.save(file3);
//        File file4=new File("file4","exe",77,folder2);
//        fileRepository.save(file4);

    }

}
