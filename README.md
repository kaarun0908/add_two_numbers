# Add Two Numbers - Java & Maven Project

A simple Java application to add two numbers, built using Apache Maven, unit tested with JUnit 5, and automated with a Jenkins CI Pipeline.

---

## Project Structure

```
add_two_numbers/
├── .gitignore
├── Jenkinsfile
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── example
    │               └── App.java
    └── test
        └── java
            └── com
                └── example
                    └── AppTest.java
```

---

## Local Development & Build

### Prerequisites
- Java JDK 17 or higher
- Apache Maven 3.8+

### Compile the Code
```bash
mvn clean compile
```

### Run Unit Tests
```bash
mvn test
```

### Package into Executable JAR
```bash
mvn package
```

### Run the Application
Run the packaged JAR:
```bash
java -jar target/add-two-numbers-1.0-SNAPSHOT.jar
```
Or pass custom numbers as arguments:
```bash
java -jar target/add-two-numbers-1.0-SNAPSHOT.jar 25 35
```

---

## Jenkins Configuration

### Option 1: Jenkins Pipeline (Recommended)
1. In Jenkins, create a **New Item** -> Choose **Pipeline**.
2. Under **Pipeline Definition**, select **Pipeline script from SCM**.
3. Set SCM to **Git** and enter Repository URL:
   `https://github.com/kaarun0908/add_two_numbers.git`
4. Set Branch Specifier to `*/main`.
5. Script Path: `Jenkinsfile`.
6. Click **Save** and **Build Now**.

### Option 2: Freestyle Project
1. In Jenkins, create a **New Item** -> Choose **Freestyle project**.
2. Under **Source Code Management**, select **Git** and enter the repository URL.
3. Under **Build Steps**, add **Invoke top-level Maven targets**:
   - Goals: `clean test package`
4. Under **Post-build Actions**:
   - Add **Publish JUnit test result report**: `**/target/surefire-reports/*.xml`
   - Add **Archive the artifacts**: `target/*.jar`