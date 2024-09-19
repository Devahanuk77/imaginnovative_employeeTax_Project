
Project Name :- EmployeAndTaxCalculation

DataBase : - Mysql
IDE :- STS

1. Clone the Repository :-
git clone https://github.com/Devahanuk77/imaginnovative_employeeTax_Project.git
cd your-repository name 

Configure Database :-
Mysql setup:-

1.create A database :-
query :- CREATE DATABASE employee_tax; [employee_tax is the database name].

add below details in the application.properties file:- 
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password

3. Build the project :- mvn clean install by using this command.
4. Run the application by using springboot starter.


