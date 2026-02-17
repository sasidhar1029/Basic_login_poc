🔐 Login Application (React + Spring Boot + MySQL)
This is a simple Login Application built using:


⚛️ React (Frontend)


🌱 Spring Boot (Backend)


🗄️ MySQL (Database)


🔗 REST API


📦 JPA + Hibernate


🛠️ Lombok



📌 Project Structure
🔹 Frontend (React)


Login form with:


Username


Password




Sends POST request using Axios


Displays login success or failure message


🔹 Backend (Spring Boot)


REST Controller (/api/login)


JPA Repository for DB operations


MySQL database integration


CORS enabled for frontend



⚙️ Technologies Used
🔵 Frontend


React JS


Axios


useState Hook


🟢 Backend


Spring Boot


Spring Web


Spring Data JPA


MySQL Driver


Lombok


🗄️ Database


MySQL



🗄️ Database Setup
1️⃣ Create Database
CREATE DATABASE login_app;

2️⃣ Create Table
CREATE TABLE users (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(100),
    password VARCHAR(100)
);

3️⃣ Insert Sample Data
INSERT INTO users (username, password) VALUES ('admin', '1234');
INSERT INTO users (username, password) VALUES ('sasi', 'password');


🔧 Backend Configuration
📄 application.properties
spring.application.name=users

server.port=8080
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/login_app
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

⚠️ Note:
Make sure MySQL is running on port 3306.

🚀 How to Run the Project
🟢 Step 1: Run Backend


Open project in STS / IntelliJ


Run UsersApplication.java


Server starts at:


http://localhost:8080


🔵 Step 2: Run Frontend


Go to React project folder


Install dependencies:


npm install



Start React app:


npm start

Runs at:
http://localhost:3001


🔗 API Endpoint
POST Login API
POST http://localhost:8080/api/login

Request Body (JSON)
{
  "username": "admin",
  "password": "1234"
}

Response


"Login Successful"


"Invalid Credentials"



🔄 CORS Configuration
@CrossOrigin(origins = "http://localhost:3001")

This allows React (port 3001) to access backend (port 8080).

🧠 How It Works


User enters username & password in React form.


Axios sends POST request to backend.


Spring Boot:


Fetches user from database


Compares password




Returns success or failure message.


React displays response.



📂 Backend Components
LayerFileControllerLoginController.javaRepositoryUserRepository.javaEntityUser.javaMain ClassUsersApplication.java

📌 Important Notes
✅ Username is trimmed before checking
✅ Password is compared using equals()
⚠️ Passwords are stored in plain text (Not recommended for production)

🔐 Future Improvements


Add password encryption (BCrypt)


Use Spring Security


Add JWT Authentication


Add Registration API


Add Validation


Handle proper HTTP status codes


Improve UI design



👨‍💻 Author
Developed as part of Java Full Stack practice.

If you want, I can also give:


📦 Production-ready version with Spring Security


🔐 JWT Authentication version


🧪 Postman collection


🐳 Docker setup


📄 Professional GitHub README version


Just tell me 💪
