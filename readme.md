# Для локальной работы
* Выполнить команду ```docker-compose -f compose-env.yml up -d```
* Запустить приложение
* Swagger смотреть тут:
1. http://localhost:8080/swagger-ui/index.html
2. http://localhost:8080/v3/api-docs
3. http://localhost:8080/v3/api-docs.yaml


# Для запуска в docker:
* Запустить файл [build_and_push.sh](build_and_push.sh)
* Узнать ваш IP адрес
* Выполнить команду ```docker run -ti --rm -e DATASOURCE_HOST=ВАШ_IP -p 8081:8080 456321987/api-cat:1.0.0```
* Swagger смотреть тут:
1. http://localhost:8081/swagger-ui/index.html
2. http://localhost:8081/v3/api-docs
3. http://localhost:8081/v3/api-docs.yaml

# Пример
![Swagger1.jpg](src%2Fmain%2Fresources%2Fimg%2FSwagger1.jpg)
![Swagger2.jpg](src%2Fmain%2Fresources%2Fimg%2FSwagger2.jpg)