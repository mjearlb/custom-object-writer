package mjearlb.writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException; 

public class WriteToFile {

    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static <T> void writeToFile(T obj, String title) {
	String pathName = "resources/" + title + ".txt";

	try {
	    FileWriter fw = new FileWriter(pathName);
	    
	    String json = gson.toJson(obj);
	    fw.write(json); 
	} catch (IOException e) {
	    System.err.println(e);
	    e.printStackTrace(); 
	} // try/catch
    } // writeToFile
} // WriteToFile
