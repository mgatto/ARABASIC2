# ArabicBASIC

A standalone interpreter for Arabic BASIC. The interpreter is written in Java and is currently available as a JAR file
for any platform on which Java can run.

The next release will include a native executable for MacOS. Native executables for additional platforms will be
supported as my build pipeline for Windows and Linux comes online.

# How to run it

## Download

A pre-built JAR file is available in the `release` directory of this repository. You may simply download it from there.
There are also sample ArabicBASIC scripts to run from the subdirectory, `release/samples`.

## Expectations

When you run an ArabicBASIC script in debug mode, you will see a series of notifications and then a print out of the
current symbol table. The symbol table will list all the variables processed and their values at the end of the script.
Variables are mutable in BASIC, and the sample scripts will demonstrate this.

This current release runs only in Latin-script mode for evaluation purposes only. The next release will likely run only
in Arabic-script mode

## Requirements to run

- Java 11 or higher must be installed on your system.
    - Instructions for OpenJDK are here: https://openjdk.java.net/install/
    - The `java` executable must be in your PATH.
    - You should know how to use the command line in a terminal application. A good introduction is
      here: https://tutorial.djangogirls.org/en/intro_to_command_line/

## Sample scripts

In the `release/samples` directory, you will find several sample scripts for convenience. These are numbered in order of
increasing complexity of language features. A comment appears on the first line of each sample script to convey which
language features it demonstrates.

## Running the scripts on the Command-line

In your favorite terminal, navigate to the where you saved the JAR file, and copy this command:

```
java -cp ArabicBASIC-1.0.0.jar com.lisantra.arabicbasic.App -d ./samples/test_01_assignment.bas 
```

The `-d` flag turns on debug mode. This flag is also available as `--debug`.

To see a list of all modes, run this command with the `-h` flag:

```
java -cp ArabicBASIC-1.0.0.jar com.lisantra.arabicbasic.App -h
```

# Building the interpreter from scratch

This project requires the Maven build tool.

## In the Terminal

Run `mvn package` from the repository root, and enjoy!

## In an IDE

Configure Maven from the interface provided by your IDE, and then run the "package" command from whichever GUI interface
provided to you by the IDE.