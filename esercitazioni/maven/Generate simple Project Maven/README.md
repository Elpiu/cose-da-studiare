## Generate a Simple Java Project

[Guida baeldung](https://www.baeldung.com/maven)
[Guida Multi project](https://mkyong.com/maven/maven-how-to-create-a-multi-module-project/)

## What you need

Maven installed if not go to [Install Maven](https://maven.apache.org/install.html)

In order to build a simple Java project. Let's run the following command from your directory:

```
mvn archetype:generate -DgroupId=com.baeldung -DartifactId=baeldung -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

Go into you directory in the example is "baeldung":

```
cd baeldung

```

Afther that

```
mvn compile
mvn test
mvn package
```

For run the main class add into the pom.xml, and specify the main class

```
<plugin>
  <groupId>org.codehaus.mojo</groupId>
  <artifactId>exec-maven-plugin</artifactId>
  <version>3.0.0</version>
  <configuration>
    <mainClass>com.baeldung.App</mainClass>
  </configuration>
</plugin>
```

to run the program

```
mvn exec:java
```
