# Siga as orientações em: https://spring.io/guides/gs/accessing-data-mysql

1. Utilize o Spring initialzr e crie o projeto "[Projeto]" 

2. Adicione as dependências: Spring Data JPA e MySQL Driver no pom.xml

Spring Data JPA é um wrapper do Hibernate que facilita o controle de transações, implementa 

O padrão Repository que serve como um intermediário entre o domínio e a camada de persistência.

MySQL Driver é o driver JDBC necessário para acessar o MySql ou outro RDB

2. Use o MySql local e não no Docker (sugerido pelo guia).

   Configurar a String de Conexão no application.properties:

   spring.application.name=demo

   spring.datasource.url=jdbc:mysql://localhost:3307/demo_db?createDatabaseIfNotExist=true&useTimezone=true&serverTimezone=UTC

   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

   spring.datasource.username=root

   spring.datasource.password=ifsp

   spring.jpa.hibernate.ddl-auto=update

   spring.jpa.show-sql=true

   logging.level.org.springframework.web=DEBUG

   logging.level.demo=INFO
