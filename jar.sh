#!/bin/bash -ex

rm -rf bin

javac -d bin -cp lib/gson-2.10.1.jar src/mjearlb/writer/ReadFromFile.java src/mjearlb/writer/WriteToFile.java

rm bin/writer.jar

jar cvf lib/writer.jar -C bin/ .
