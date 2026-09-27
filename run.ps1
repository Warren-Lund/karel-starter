# run.ps1  ·  Windows
#
# Two commands. That is genuinely the whole file.
#
#   javac  turns your text file into something the computer can execute.
#   java   runs it.
#
# The ".;lib/karel.jar" part is Java's classpath: a list of places to look for code.
# The "." means "this folder" and lib/karel.jar is the robot library, one folder down.
# On macOS that semicolon is a colon instead. That is the only difference
# between this file and run.sh, and it is the single most common reason
# a Java command that worked on your friend's laptop fails on yours.

javac -cp lib/karel.jar MyKarel.java
java -cp ".;lib/karel.jar" MyKarel
