This is a sample project demonstrating RESTful web service using Spring Boot and Apache Derby(Embedded Database)

Control Flow Illustration

RestController		ServiceProvider		Repository			Database
userController <---> userService <---> userRepository <---> Derby Database

UserController class hosts the RestController. It maps all the incoming HTTP requests to the appropriate service methods.

UserService class contains all the methods that interact with the repository and perform appropriate actions.

UserRepository class leverages the powerful CRUD methods provided by the JPA CrudRepository.

The in-memory database used here is Apache Derby.

Example Payload

GET http://localhost:8080/user - Returns the list of users

POST http://localhost:8080/user - Returns persisted user

Test Payload
{
	"name" : "test","email" : "ash@ash.com","password" : "password","username" : "test"
}

GET http://localhost:8080/user/{user_id} - Returns a single user that matches the user_id

PUT http://localhost:8080/user/{user_id} - Updates existing user

DELETE http://localhost:8080/user/{user_id} - Deletes existing user