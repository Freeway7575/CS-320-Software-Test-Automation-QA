///////////////////////////////////////////////////////////////////////////////
//                   ASSIGNMENT INFORMATION
// File:             TaskTest.java
// Course ID:        CS-320-T4208
// Course Name:		 Software Test Automation & QA
// Author:           Eric Farkas
// Assignment:		 Project One
///////////////////////////////////////////////////////////////////////////////

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaskTest {
	
	private String id, name, description;
	private String tooLongId, tooLongName, tooLongDescription;
	
	@BeforeEach
	void setUp() {
		id = "0123456789";
		name = "The DEFAULT twenty!!";
		description = "The DEFAULT description.";
		tooLongId = "00112233445566778899";
		tooLongName = "This name is beyond 20 characters!";
		tooLongDescription =
        "This description is beyond 50 characters and is therefore invalid.";
	}
	
	@Test
	void getTaskIdTest() {
		Task task = new Task(id);
		Assertions.assertEquals(id, task.getTaskId());
	}
	
	@Test
	void getNameTest() {
		Task task = new Task(id, name);
		Assertions.assertEquals(name, task.getName());
	}
	
	@Test
	void getDescriptionTest() {
		Task task = new Task(id, name, description);
		Assertions.assertEquals(description, task.getDescription());
	}
	
	@Test
	void setNameTest() {
		Task task = new Task();
		task.setName(name);
		Assertions.assertEquals(name, task.getName());
	}
	
	@Test
	void setDescriptionTest() {
		Task task = new Task();
		task.setDescription(description);
		Assertions.assertEquals(description, task.getDescription());
	}
	
	@Test
	void TaskIdTooLongTest() {
		Assertions.assertThrows(IllegalArgumentException.class,
							() -> new Task(tooLongId));
	}
	
	@Test
	void setTooLongNameTest() {
		Task task = new Task();
		Assertions.assertThrows(IllegalArgumentException.class,
                            () -> task.setName(tooLongName));
	}
	
	@Test
	void setTooLongDescriptionTest() {
		Task task = new Task();
		Assertions.assertThrows(IllegalArgumentException.class,
                            () -> task.setDescription(tooLongDescription));
	}
	
	@Test
	void TaskIdNullTest() {
		Assertions.assertThrows(IllegalArgumentException.class,
                            () -> new Task(null));
	}
	
	@Test
	void TaskNameNullTest() {
		Task task = new Task();
		Assertions.assertThrows(IllegalArgumentException.class,
                            () -> task.setName(null));
	}
	
	@Test
	void TaskDescriptionNullTest() {
		Task task = new Task();
		Assertions.assertThrows(IllegalArgumentException.class,
                            () -> task.setDescription(null));
	}
}