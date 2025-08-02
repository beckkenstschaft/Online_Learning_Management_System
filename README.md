# Learning Management System (LMS)
This is a simple and secure Learning Management System made using Java and full-stack development tools.  
It helps instructors upload courses and lessons, and lets students learn easily from a user-friendly dashboard.

## 🌟 Key Features
- Instructor registration and login  
- Student registration and login  
- Instructor dashboard to upload courses and videos  
- Student dashboard to browse, view, and track lessons  
- Video lessons support  
- REST API to connect to other frontends (like React)  
- Secure user authentication with roles  
- Simple and clean design using HTML + Thymeleaf  
- Supports future features like quizzes, notes, and grading  

## 🛠️ Tech Stack Used
| Layer              | Technology                  |
|--------------------|---------------------------  |
| Language           | Java (JDK 17)               |
| Framework          | Spring Boot                 |
| Template Engine    | Thymeleaf                   |
| Backend Tools      | Spring MVC, Spring Data JPA |
| Security           | Spring Security, BCrypt     |
| REST API           | Spring Web + JSON           |
| Frontend           | HTML5, CSS3, Thymeleaf      |
| Database           | MySQL                       |
| IDE Used           | IntelliJ IDEA / VS Code     |
| Build Tool         | Maven                       |

## 🧩 Folder Structure (Simplified)
src/
└── main/
├── java/
│ └── com/lms/
│ ├── controller/
│ ├── model/
│ ├── repository/
│ ├── security/
│ └── LmsApplication.java
└── resources/
├── templates/
└── application.properties

## 🔄 How It Works (In Simple Terms)

1. A user signs up as either an instructor or students.  
2. Instructors get a dashboard to add new lessons or courses.  
3. Each course can have a title, description, and video link.  
4. Students can browse available courses on their dashboard.  
5. Clicking a course opens the video and other details.  
6. The system checks who is logged in and shows pages accordingly.  
7. REST API endpoints are available to use this system with a React or mobile app.

## 🚀 Getting Started
### 1. Clone the Repository
CLI:
git clone https://github.com/yourusername/lms-project.git

2. Set Up MySQL
Create a new database: lms
Update your username/password in application.properties

3. Run the App
./mvnw spring-boot:run
Visit: http://localhost:8080

🔐 Security
User passwords are encrypted with BCrypt.
Spring Security protects all routes.
Only instructors can upload lessons.
Only registered users can access dashboards.

📱 REST API
We also provide REST endpoints like:
/api/courses - List all courses
/api/lessons/{id} - Get a specific lesson
/api/users - Register or log in
These can be used by React, mobile apps, or other systems.

🌱 Future Enhancements
Add quiz functionality
Student progress tracking
Instructor feedback system
Certificate generation
Live class support (Zoom/Meet integration)

👨‍💻 Author
Made with ❤️ by Syed Amaan Hasan

📄 License
This project is open-source and free to use.
Feel free to modify and improve it as per your needs!
