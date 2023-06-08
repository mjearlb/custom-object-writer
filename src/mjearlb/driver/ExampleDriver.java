package mjearlb.driver;

import mjearlb.objects.TestObject;
import mjearlb.writer.WriteToFile;
import static mjearlb.writer.WriteToFile.writeToFile; 
import mjearlb.writer.ReadFromFile;
import static mjearlb.writer.ReadFromFile.readFromFile;

public class ExampleDriver {

    static TestObject testObj1; 

    public static void main(String[] args) {
	testObj1 = new TestObject();
	System.out.println(testObj1);
	writeToFile(testObj1, "test1");


	TestObject testObj2 = readFromFile("test1", TestObject.class);

	System.out.println(testObj2);
	
    } // main

} // ExampleDriver
