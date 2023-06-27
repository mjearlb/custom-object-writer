package mjearlb.driver;

import mjearlb.objects.TestObject;
import mjearlb.writer.WriteToFile;
import static mjearlb.writer.WriteToFile.writeToFile; 
import mjearlb.writer.ReadFromFile;
import static mjearlb.writer.ReadFromFile.readFromFile;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class ExampleDriver {

    static TestObject testObj1; 

    public static void main(String[] args) {
	testObj1 = new TestObject();
	System.out.println(testObj1);
	try {
	    writeToFile(testObj1, "test1", false);
	} catch (FileAlreadyExistsException e) {
	    System.out.println("File already exists!"); 
	} // try/catch

	try {
	    TestObject testObj2 = readFromFile("test1", TestObject.class);
	    System.out.println(testObj2);
	} catch (FileNotFoundException e) {
	    System.out.println("File does not exist!"); 
	} // try/catch
	
    } // main

} // ExampleDriver
