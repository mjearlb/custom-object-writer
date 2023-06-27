package mjearlb.writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.io.File;

public class WriteToFile {

    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    /**
     * Given an object and a title, this method will convert the object
     * to JSON representation and write that JSON formatted String to a
     * .txt file named {@code title} in the /resources directory.
     *
     * @param obj the object being written to the file.
     * @param title the name of the file.
     * @param overWrite whether the user wants to overWrite an existing file
     * of the same name. 
     * @throws FileAlreadyExistsException when trying to overwrite an
     * existing file. 
     */
    public static <T> void writeToFile(T obj, String title, boolean overWrite) throws FileAlreadyExistsException {
	String pathName = "resources/" + title + ".txt";

	if (!overWrite && new File(pathName).exists()) {
	    throw new FileAlreadyExistsException(pathName);
	} // if

	try {
	    FileWriter fw = new FileWriter(pathName);
	    
	    String json = gson.toJson(obj);
	    fw.write(json);
	    fw.flush();
	    fw.close(); 
	} catch (IOException e) {
	    System.err.println(e);
	    e.printStackTrace(); 
	} // try/catch
    } // writeToFile
} // WriteToFile
