# Spork
- Spring Boot spork project
- http://localhost:8080/api/v1/student
- https://youtu.be/9SGDpanrc8U?t=2237
# Config
```sh
docker run --name postgrescontainer -e POSTGRES_PASSWORD=s3cret -d -p5432:5432 postgres
docker run -it --rm --network some-network postgres psql -h postgrescnt -U postgres
docker run -it --rm --name postgrescnt -e POSTGRES_PASSWORD=s3cret -d -p5432:5432 postgres

docker run -it --rm --name postgrescnt -d -p5432:5432 postgres

docker run -it --rm \
  --name postgrescnt \
  -d -p
  postgres

create database student
du # database users
grant all privileges on database "student" to myuser


docker run -it --rm --name postgrescnt -d -p5432:5432 postgres

docker run -it --rm --network some-network postgres psql -h some-postgres -U postgres

docker run -it --rm postgres psql -h postgres -U postgresusr

docker run -d \
 -p 27017:27017 \
 -e MONGO_INITDB_USERNAME=admin \
 -e MONGO_INITDB_PASSWORD=password \
 --name mongodb \
 --net mongo-network \
 mongo
```
# Setup
- Get postgres image
- Get adminer image
- Create postgres network
- Run postgres container
- Rum adminer container
- Go to http://192.168.1.101:8080 and sign in with user postgres and password s3cret
- Create the database student
```sh
docker pull postgres
docker pull adminer
docker network create postgres-network
docker run --name postgrescnt -e POSTGRES_PASSWORD=s3cret -d -p 5432:5432 postgres
docker run --name adminercnt --link postgrescnt:db -d -p 8080:8080 adminer
```
- Clone the repository
- Go into the resources directory
- Run docker compose
- Eval the server with curl
```sh
git clone https://github.com/ralarconb/spork.git
cd spork/src/main/resources
docker-compose -f stack.yml up
curl http://localhost:8080
```
- Go to http://192.168.1.101:8080
