# **Getting started**

### **Java Version**
Ensure that you have Java JDK 17 installed on your system
[Oracle JDK Download Page](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

### **Cloning the repository**
```sh
git clone https://github.com/rush1016/crud_app_api
```

### **Running the application**
Go to the project directory
```sh
cd /crud_app_api
```

Then execute the following commands depending on your system

#### Windows:
```sh
mvnw.cmd spring-boot:run
```
#### Linux/MacOS:
```sh
chmod +x ./mvnw
```

```sh
./mvnw spring-boot:run
```

### **Testing API endpoints**
A Postman collection is included in the **postman/** directory of the project.

### **Database Configuration**
The default configuration for the database that this app is using are:
username: root
password: password

To change this configuration, navigate to:
/src/main/resources/application.properties

And change the following values

```sh
spring.datasource.username=root
```
```sh
spring.datasource.password=password
```