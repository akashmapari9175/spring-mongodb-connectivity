# Spring MongoDB Connectivity

Welcome to the Spring MongoDB Connectivity project! This project demonstrates how to connect a Spring Boot application with MongoDB and perform CRUD (Create, Read, Update, Delete) operations.

## Overview

In this project, we utilize Spring Data MongoDB, which provides a high-level abstraction for MongoDB interactions, making it easier to work with MongoDB databases in a Spring Boot application.

Key Features:
- Connect Spring Boot application with MongoDB.
- Implement CRUD operations using Spring Data MongoDB.
- Demonstrate flexible schema design with MongoDB's document-oriented data model.

## Getting Started

To run this project locally, follow these steps:

1. Clone this repository to your local machine.
2. Ensure you have MongoDB installed and running locally. You can download MongoDB from [here](https://www.mongodb.com/try/download/community).
3. Update the MongoDB connection details in the `application.properties` file.
4. Build the project using Maven: `mvn clean install`.
5. Run the Spring Boot application: `mvn spring-boot:run`.

## Usage

Once the application is up and running, you can perform the following CRUD operations:

- Create: Add new tasks to the MongoDB database.
- Read: Retrieve tasks from the MongoDB database.
- Update: Modify existing tasks in the MongoDB database.
- Delete: Remove tasks from the MongoDB database.

## Technologies Used

- Java
- Spring Boot
- MongoDB
- Maven

  ## Usage

Once the application is up and running, you can perform the following CRUD operations:

- **Create**: Add new tasks to the MongoDB database.
  - Endpoint: `POST /api/tasks`
  - Request Body: JSON object representing the new task.
    ```json
    {
        "description": "Task description",
        "severity": 3,
        "assignee": "John Doe",
        "storyPoint": 5
    }
    ```
- **Read**: Retrieve tasks from the MongoDB database.
  - Endpoint: `GET /api/tasks`
  - Retrieve all tasks.
  - Endpoint: `GET /api/tasks/{taskId}`
  - Retrieve a specific task by its ID.
- **Update**: Modify existing tasks in the MongoDB database.
  - Endpoint: `PUT /api/tasks/{taskId}`
  - Update a specific task by its ID.
  - Request Body: JSON object representing the updated task.
    ```json
    {
        "description": "Updated task description",
        "severity": 2,
        "assignee": "Jane Smith",
        "storyPoint": 8
    }
    ```
- **Delete**: Remove tasks from the MongoDB database.
  - Endpoint: `DELETE /api/tasks/{taskId}`
  - Delete a specific task by its ID.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
