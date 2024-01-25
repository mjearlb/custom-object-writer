# custom-object-writer
Allows users to serialize custom objects to JSON and write them to .txt
files. These files can then be read and parsed. 

When calling writeToFile(object, name, overWrite), param's are as
follows:
	
-  object: the object you are saving to a .txt
	
-  name: the name of the file
	
-  overWrite: true if you want to overwrite an existing
		   file of the same name, false if not
