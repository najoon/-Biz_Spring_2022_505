# Spring Mybatis Project
* SpringMVC Projecdt 와 Oracle,MySql 등 dbms 와 연동하는 project
## Dependency 설정
### spring-jdbc
* spring-jdbc 는 spring-webmvc 와 ```version을 일치``` 시켜야 한다
```
<!-- https://mvnrepository.com/artifact/org.springframework/spring-jdbc -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-jdbc</artifactId>
			<version>${org.springframework-version}</version>
		</dependency>
```
### mybatis
*현재(2022-05-04)3.5.9 최신버전
``` 
<dependency>
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis</artifactId>
    <version>3.5.9</version>
</dependency>
```
### mybatis-spring
* 현재 2.0.7 최신버전
```
<!-- https://mvnrepository.com/artifact/org.mybatis/mybatis-spring -->
<dependency>
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis-spring</artifactId>
    <version>2.0.7</version>
</dependency>

```
### commons-dbcp2
* 2.9.0
* dbms 와 연결할때 Connection Pool 을 관리하는 도구
```
<!-- https://mvnrepository.com/artifact/org.apache.commons/commons-dbcp2 -->
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-dbcp2</artifactId>
    <version>2.9.0</version>
</dependency>

```
### ojdbc 또는 mysql-connector/j
* 각 dbms Vender 별로 제공하는 jdbc
* Oracle은 ```ojdbc8``` 을 사용하며 ```21.5.0.0``` 현재사용
* maven repository 에서 ```oracle```로 검색하기
```
<!-- https://mvnrepository.com/artifact/com.oracle.database.jdbc/ojdbc8 -->
<dependency>
    <groupId>com.oracle.database.jdbc</groupId>
    <artifactId>ojdbc8</artifactId>
    <version>21.5.0.0</version>
</dependency>
```
* mysql 은 dbms 버전에 따라 다른 connector 를 사용한다
* 5.7.x 은 5.x.x 를 사용하고 8.x.x 는 현재 8.0.29를 사용한다
```
<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.29</version>
</dependency>

```