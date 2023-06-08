#!/bin/bash -ex

rm -rf bin

javac -d bin src/mjearlb/objects/TestObject.java

javac -d bin -cp "bin:lib/gson-2.10.1.jar" src/mjearlb/writer/WriteToFile.java

javac -d bin -cp "bin:lib/gson-2.10.1.jar" src/mjearlb/writer/ReadFromFile.java

javac -d bin -cp "bin:lib/gson-2.10.1.jar" src/mjearlb/driver/ExampleDriver.java
