FROM bellsoft/liberica-openjdk-debian:17

RUN adduser --system spring-boot && addgroup --system spring-boot && adduser spring-boot spring-boot
USER spring-boot

WORKDIR /app
COPY target/dependency ./lib
COPY target/plug_get_post-0.0.1-SNAPSHOT.jar ./application.jar

ENTRYPOINT ["java", "-cp", "./lib/*:./application.jar", "com.example.plux_get_post.PlugGetPostApplication"]