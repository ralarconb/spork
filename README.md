# Spork
- Spring Boot CRUD project
# Setup
- Clone the repository
- Go into the project directory
- Build the local image
- Run the project container
```sh
git clone https://github.com/ralarconb/spork.git
cd spork
docker build -t spork .
docker run -d -p8081:8081 spork
```
# Test the API
- Send a get request http://localhost:8080/api/v1/student
- Send a post request http://localhost:8080/api/v1/student
```json
{
    "name": "Just",
    "email": "j.quispe@gmail.com",
    "dob": "2001-01-05"
}
```
- Send a delete request http://localhost:8080/api/v1/student/2
- Send a put request http://localhost:8080/api/v1/student/1?name=Milagros
- Run the application on port 8081
```json
java -jar spork-0.0.1-SNAPSHOT.jar --server.port=8081
```