##Generate a Multi module Project

Guide:

[Beldung](https://www.baeldung.com/maven-multi-module)
[Mkyoun multi pmodule Project](https://mkyong.com/maven/maven-how-to-create-a-multi-module-project/)

Create a parent project

```
mvn archetype:generate -DgroupId=com.baeldung -DartifactId=parent-project
```

We need to add to the pom.xml for declaring that the project will serve as a parent or an aggregator

```
<packaging>pom</packaging>
```

Now create our submodules

```
mvn archetype:generate -DgroupId=com.baeldung -DartifactId="name moduke"
```

and check if in the parent properties have the parent section

```
<parent>
  <artifactId>parent-project</artifactId>
  <groupId>com.baeldung</groupId>
  <version>1.0-SNAPSHOT</version>
</parent>
```

Now we can build all the modules at once. In the parent's project directory run

```
mvn package
```
