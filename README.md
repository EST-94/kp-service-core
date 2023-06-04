# kp-service-core

## 1. Purpose
- The core service is mainly responsible for business logic and data processing. It receives requests from the gateway server after authentication and authorization, processes the necessary data, and provides appropriate responses. Examples of the core service's responsibilities include retrieving a user's profile information, performing data analysis, and implementing search functionality. In other words, the core service performs business logic to return results based on the request.

## 2. Implementation

### Server
- The following features will be implemented this platform:

| Feature                             | Description                                                                                                                                                                       |
|-------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Database management                 | APIs for managing the database that stores user information, collected data, etc. are required. This includes database design, access, and CRUD operations.                       |
| RESTful API server                  | APIs for provides functionality such as user profile information retrieval, data analysis, and search capabilities, among others.                                                 |
| Security features                   | Security features for the database and APIs are necessary, such as SSL certificates using HTTPS or implementing security functions like JWT for authentication and authorization. |

### Database
- The database technology for the platform has not been decided yet. However, popular options for Spring Boot include MySQL, PostgreSQL, and MongoDB. The choice of database will depend on the specific requirements of the platform, such as the volume of data and the desired data model.
- Once the database has been decided, it will be integrated with Spring Boot using the appropriate Spring Data module.

### Conclusion
- This platform will be implemented using Spring Boot on the server-side and an undecided database. By leveraging the power of Spring Boot, we can create a scalable and secure platform for conducting psychological tests and surveys.