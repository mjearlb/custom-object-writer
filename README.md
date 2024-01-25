# custom-object-writer
Allows users to serialize custom objects to JSON and write them to .txt
files. These files can then be read and parsed. 

When calling writeToFile(object, name, overWrite), parameters are as follows:
	
-  object: the object you are saving to a .txt
	
-  name: the name of the file (do not include ".txt")
	
-  overWrite: true if you want to overwrite an existing
		   file of the same name, false if not

When calling readFromFile(title, objType), parameters are as follows: 

- title: the name of the file (do not include ".txt")

- objType: pass the object type as "Example.class"

Note: custom-object-writer will read/write to/from a /resources directory. It will fail
if this directory does not exist. 
