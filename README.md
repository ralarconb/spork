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
```
# Setup
- Get postgres image
- Clone the repository
```sh
docker pull postgres
git clone https://github.com/ralarconb/spork.git
```