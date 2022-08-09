# OurStars

**Design studies:**
  - Anna Kot - [Behance](https://www.behance.net/annakot6) - [Website](https://www.kotanna.com/) - [GitHub](https://github.com/Kot-Anna)
### Frontend
![](https://img.shields.io/badge/Website-TODO-red?style=for-the-badgge&logo=next.js)
![](https://img.shields.io/badge/Android-1.1.0-green?style=for-the-badge&logo=android)

### Backend
![](https://img.shields.io/badge/Database-1.2-green?style=for-the-badge&logo=postgresql)
![](https://img.shields.io/badge/Rest%20API-1.0.0-green?style=for-the-badge&logo=Spring)

### Technologies
![](https://img.shields.io/badge/Database-PostgreSQL-blue?style=for-the-badge&logo=mysql)
![](https://img.shields.io/badge/Build-Gradle-blue?style=for-the-badge&logo=Gradle)
![](https://img.shields.io/badge/Deployment-Docker-blue?style=for-the-badge&logo=Docker)

![](https://img.shields.io/badge/Development%20Server-Ubuntu%2020.04%20LTS-orange?style=for-the-badge&logo=Ubuntu)
___
### Building the API
```gradle
gradle clean build
```
### Running the API
```bash
java -jar .\build\libs\X.X.jar --CJ_HOST=URL --CJ_PORT=PORT --CJ_DB=DBNAME --CJ_USER=DBUSER --CJ_PW=DBPASSWORD
```
### Building the docker image
```docker
docker build . --build-arg HOST=X --build-arg PORT=X --build-arg DB=X --build-arg USER=X --build-arg PW=X --no-cache
```
