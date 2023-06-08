#!/bin/bash -ex

./compile.sh

java -cp "bin:lib/gson-2.10.1.jar" mjearlb.driver.ExampleDriver
