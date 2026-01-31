The Tech Blog Application is a monolithic backend application built using Java and Spring Boot that allows users to register, authenticate, and manage technical blog posts. Authenticated users can create and manage their own blogs, while all users can view published blogs with efficient pagination support. The application follows clean architecture principles and is designed to be scalable and production-ready.

👤 User Management

User registration with secure password encryption

User login using Basic Authentication

Role-based access control for secured endpoints

📝 Blog Management

Create new blog posts (authenticated users only)

Delete own blog posts

View all blogs created by different users

Fetch blogs with pagination and sorting

🔐 Security

Spring Security with Basic Authentication

Password encryption using BCrypt

Secured endpoints for blog creation and deletion

Public access for viewing blogs

📄 Pagination

Database-level pagination using Spring Data JPA

Configurable page size and page number
