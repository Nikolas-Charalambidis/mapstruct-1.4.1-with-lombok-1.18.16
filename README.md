# MapStruct 1.4.1 with Lombok 1.18.16

Demonstrates the compatibility of the following dependencies based on the Based on MapStruct pull request [#2266](https://github.com/mapstruct/mapstruct/pull/2266):

**Dependencies**

 - `org.mapstruct`:`mapstruct`:`1.4.1.Final`
 - `org.projectlombok`:`lombok`:`1.18.16` as the `provided` scope
 - `org.projectlombok`:`lombok-mapstruct-binding`:`0.1.0`
 
**Annotation processors**

  - `org.projectlombok`:`lombok-mapstruct-binding`:`1.18.16`
  - `org.mapstruct`:`mapstruct-processor`:`1.4.1.Final`

## How to run
 
The application is configured against Java 11

    mvn clean install