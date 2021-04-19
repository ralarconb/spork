# Spork
- Spring Boot spork project
# Test api
- List http://localhost:8080/api/v1/student
- Add http://localhost:8080/api/v1/student
```json
{
    "name": "Just",
    "email": "j.quispe@gmail.com",
    "dob": "2001-01-05"
}
```
- Delete http://localhost:8080/api/v1/student/2
- Update http://localhost:8080/api/v1/student/1?name=Milagros
# Setup
- Get postgres image
- Get adminer image
- Run postgres container
- Run adminer container
```sh
docker pull postgres
docker pull adminer
docker run --name postgrescnt -e POSTGRES_PASSWORD=s3cret -d -p 5432:5432 postgres
docker run --name adminercnt --link postgrescnt:db -d -p 8080:8080 adminer
```
- Go to http://192.168.1.101:8080 and sign in with user postgres and password s3cret
- Create the database student
- Clone the repository
- Run the application on port 8081
```sh
git clone https://github.com/ralarconb/spork.git
java -jar spork-0.0.1-SNAPSHOT.jar --server.port=8081
```
- http://localhost:8081/api/v1/student