# Java tutorial

## Intro to Java

- Programming language that is used everywhere (invented in 1995). Perhaps the most popular one.
- Named after the Java coffee (hence the logo), which itself is named after the Java island in Indonesia.
- Originally invented in 1995 by James Goslin at Sun Microsystems. That company was acquired by Oracle a couple of years ago.
- The latest version of Java is 8 (exact version: 1.8.0_60). Although not a whole lot has changed since Java 6.
	- There are different "editions" of Java: Standard Edition (SE), Enterprise Edition (EE), Mobile Edition (ME).
	- They all share the same syntax and basic tooling, but they have different software libraries. For example, Java EE has extras to build web-applications.
- Java is so popular that it has even inspired a bunch of derivatives; languages that are based on it or that use the Java JVM: Groovy, Scala, Jython, etc.
- "Write once, run everywhere" philosophy -> JVM, bytecode vs. compile+link and run for every platform
	- Means that you need to install the JVM first. JVM = Java Virtual Machine. JDK = Java Development Kit
	- This is fundamentally different from e.g. C/C++/Go/...
	- There is a difference between the JVM spec and the implementation. Hotspot vs. OpenJDK.
- OO is first citizen. You cannot do functional/procedural programming (You can to some extend using a workaround, but that's generally a very bad practice).


## Running code

To run from the commandline:


```bash
// first compile
javac com/example/refresher/Refresher
// now run
java com.example.refresher.Refresher
```

To generate JavaDocs from Eclipse, use: Project > Generate JavaDoc
