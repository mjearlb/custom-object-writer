#!/bin/bash -ex

rm -rf bin

javac -d bin src/mjearlb/objects/TestObject.java

javac -d bin -cp bin src/mjearlb/writer/WriteToFile.java

javac -d bin -cp bin src/mjearlb/writer/ReadFromFile.java

javac -d bin -cp bin src/mjearlb/driver/ExampleDriver.java
