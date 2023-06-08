package mjearlb.writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.IOException; 

public class ReadFromFile {

    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static <T> T readFromFile(String title, Class<T> objType) {
	String pathName = "resources/" + title + ".txt";
	try {
	    FileReader fr = new FileReader(pathName);
	    T obj = gson.fromJson(fr, objType);
	    fr.close(); 
	    return obj; 
	} catch (IOException e) {
	    System.err.println(e);
	    e.printStackTrace();
	    return null; 
	} // try/catch
    } // readFromFile
    
} // ReadFromFile
