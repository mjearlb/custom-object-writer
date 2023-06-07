#!/bin/bash -ex

./compile.sh

java -cp bin mjearlb.driver.ExampleDriver
