FROM adoptopenjdk/openjdk11:latest

USER www-data

VOLUME /tmp

ARG DEPENDENCY=build/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app

EXPOSE 8080
ENTRYPOINT ["java","-cp","app:app/lib/*","com.gap.arch.akstestphil.AksTestPhilApplication"]
