# spring-mvc-home-demo
Spring MVC
Steps to create Spring MVC project using maven
1. Create maven project
     Group Id : org.apache.maven.archetypes
     Artifact Id: maven-archetype-webapp
     Version : 1.4
2. Go to Build Path -> Configure Build Path -> Add library -> Server Runtime -> Select apache server
3. In pom.xml add below dependency
     <dependency>
    	<groupId>org.springframework</groupId>
    	<artifactId>spring-webmvc</artifactId>
    	<version>6.0.13</version>
    </dependency>
    
    <!-- https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api -->
    <dependency>
    	<groupId>javax.servlet</groupId>
    	<artifactId>javax.servlet-api</artifactId>
    	<version>4.0.1</version>
    	<scope>provided</scope>
    </dependency> 
4. Build the project.
