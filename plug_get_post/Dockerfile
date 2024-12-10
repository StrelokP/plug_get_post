# Dockerfile
FROM openjdk:11-jre-slim


# Копируем ваш .jar файл в контейнер
COPY target/plug_get_post-0.0.1-SNAPSHOT.jar /app/plug_get_post-0.0.1-SNAPSHOT.jar

# Копируем Jolokia agent
COPY docker/jolokia-agent-jvm-javaagent.jar /app/jolokia-agent-jvm-javaagent.jar

# Устанавливаем рабочую директорию
WORKDIR /app

# Определяем команду запуска
CMD ["sh", "-c", "java -javaagent:/docker/jolokia-agent-jvm-javaagent.jar -jar plug_get_post-0.0.1-SNAPSHOT.jar"]