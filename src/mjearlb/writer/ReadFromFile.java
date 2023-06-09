package mjearlb.writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class ReadFromFile {

    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    /**
     * Reads a .txt file with the name {@code title} from the /resources
     * directory. 
     *
     * @param title the name of the .txt file being read from.
     * @param objType the type of object being written.
     * @throws FileNotFoundException if the file cannot be found. 
     */
    public static <T> T readFromFile(String title, Class<T> objType) throws FileNotFoundException {
	String pathName = "resources/" + title + ".txt";
	FileReader fr = new FileReader(pathName);
	T obj = gson.fromJson(fr, objType);
	try {
	    fr.close();
	} catch (IOException e) {
	    return null; 
	} // try/catch
	return obj; 
    } // readFromFile
    
} // ReadFromFile
