# Spork
- Spring Boot spork project
- http://localhost:8080/api/v1/student
- https://youtu.be/9SGDpanrc8U?t=2237
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
```sh
git clone https://github.com/ralarconb/spork.git
```