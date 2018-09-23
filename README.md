# spring-docker
testing with spring within docker

1. Erzeuge openJDK8 image (Dockerfile liegt im entsprechenden Ordner)
2. Via "mvn clean package" die jar-file erzeugen
3. Dockerfile nutzen um springangular image zu erzeugen
4. angular image:
4.1 https://github.com/RobertK83/angular-docker
4.2 npm install
4.3 ng build --prod
4.4 docker build -f=Dockerfile.client -t [lorem]:[tag]

Final:
docker-compose.yml nutzen. (Wenn Image-Namen angepasst wurden, dann muss das auch hier passieren)
