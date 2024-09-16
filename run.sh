#!/usr/bin/bash -ex

javac -d bin src/cs2720/assignment1/*.java
java -cp bin cs2720.assignment1.LinkedListDriver input.txt
