<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#clone-the-repository">Clone the repository</a></li>
      </ul>
    </li>
    <li>
      <a href="#setup">Setup</a>
    </li>
    <li><a href="#installation-and-prerequisites">Installation And Prerequisites</a></li>
    <li><a href="#how-to-run-tests">How to run tests</a></li>

  </ol>
</details>



## About the project
This project tests the UI functionality of https://www.saucedemo.com/ using Selenium, junit and Cucumber(BDD) 


### Clone the repository

```sh
git clone git@github.com:EiriniMoschopoulou/saucedemoUI_Automation.git
```

## Setup

To build it, you will need to download and unpack the latest (or recent) version of Maven (https://maven.apache.org/download.cgi) and put the mvn command on your path. Then, you will need to install a Java 1.8 (or higher) JDK (not JRE!), and make sure you can run java from the command line. Now you can run `mvn clean install` and Maven will compile your project, and export the results in an HTML file in the target directory.

How you run this code is up to you, but usually you would start by using an IDE like NetBeans, Intellij IDEA, or Eclipse.


## Installation And Prerequisites

1. JDK 1.8+ 

2. Maven 

3. Your preferred IDE (Proposed IDE is Intellij)

Required Intellij Plugins:  

1. Maven
2. Cucumber + 
3. Cucumber for Java
4. Gherkin Overview
5. Gherkin



## How to run Tests

- Run the following command to execute the features: `mvn clean test` . By default, this command will invoke the Chrome browser and execute the tests. You can always right click to TestRunner.java and run all the tests as well.
- To run a specific feature file among multiple feature files, use the command: (e.g.) `mvn test -Dcucumber.features="src/test/resources/Features/burgerMenu.feature"`. You can always right click to a specific feature file or unique scenario and run it.
  ### Run with reports
  -  To run all the tests and produce the corresponding HTML cucumber report use this command: ` mvn test -Dcucumber.options="--plugin html:target/result.html"`.
  -  To run a specific test and produce the corresponding HTML cucumber report use this command:(e.g) ` mvn test -Dcucumber.features="src/test/resources/Features/burgerMenu.feature"  -Dcucumber.options="--plugin html:target/result.html"`.

