# Club Management Application

A Spring Boot MVC application for managing clubs and their information.

## Features

- View a list of all clubs
- Create new clubs with details (title, content, photo URL)
- Persistent data storage with PostgreSQL database
- MVC architecture for clean separation of concerns

## Technologies Used

- **Java 17**
- **Spring Boot 3.1.3**
- **Spring Data JPA** - For database access
- **Thymeleaf** - Server-side Java template engine
- **PostgreSQL** - Database
- **Lombok** - Reduces boilerplate code
- **Maven** - Dependency management and build
- **Bootstrap** - For responsive UI

## Prerequisites

- JDK 17 or higher
- PostgreSQL server
- Maven

## Setup and Installation

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd mvc
   ```

2. **Configure Database**
   - Create a PostgreSQL database named `mvc`
   - Update database credentials in `src/main/resources/application.properties` if needed

3. **Build and Run the Application**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the Application**
   - Open a web browser and go to `http://localhost:8080/clubs`

## Project Structure

```
src/main/java/com/ozguc/mvc/
├── controller/        # Controllers handling HTTP requests
├── dto/               # Data Transfer Objects
├── model/             # Entity models
├── repository/        # Database access interfaces
├── service/           # Business logic
│   ├── abstracts/     # Service interfaces
│   └── concretes/     # Service implementations
└── MvcApplication.java # Application entry point
```

## Usage

### View All Clubs
- Navigate to `http://localhost:8080/clubs` to see a list of all clubs

### Add a New Club
- Navigate to `http://localhost:8080/clubs/new`
- Fill in the club details (title, photo URL, content)
- Click the Create button

## Future Enhancements

- User authentication and authorization
- Club editing and deletion
- Member management
- Event scheduling
- Search and filtering
- RESTful API for mobile applications
- Advanced validation
- File upload for club photos

## License

[MIT License](LICENSE)

## Credits

Developed by Ozguc 