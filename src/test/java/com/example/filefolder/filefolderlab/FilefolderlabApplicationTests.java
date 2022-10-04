package com.example.filefolder.filefolderlab;

import com.example.filefolder.filefolderlab.models.File;
import com.example.filefolder.filefolderlab.models.Folder;
import com.example.filefolder.filefolderlab.models.Person;
import com.example.filefolder.filefolderlab.repositories.FileRepository;
import com.example.filefolder.filefolderlab.repositories.FolderRepository;
import com.example.filefolder.filefolderlab.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ActiveProfiles("test") //Indicates it's a test profile so will not run DataLoader
@SpringBootTest
class FilefolderlabApplicationTests {

	@Autowired
	FileRepository fileRepository;
	@Autowired
	FolderRepository folderRepository;
	@Autowired
	PersonRepository personRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateandSaveFile(){
		Person person = new Person("Joe");
		personRepository.save(person);
		Folder folder = new Folder("Folder1",person);
		folderRepository.save(folder);
		File file = new File("File1","exe",77,folder);
		fileRepository.save(file);
	}

}
