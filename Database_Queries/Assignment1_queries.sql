--How do you select all columns from the employee table?
select * from employee;

--Write a query to display only the first_name and last_name of all employees.
select first_name , last_name from employee;

--How do you select distinct departments from the employee table?
select distinct department from employee;

--Write a query to count the total number of employees.
select count(first_name) from employee;

--How do you find the highest salary in the company?
select max(salary)from employee;

--Write a query to find the average age of employees.
select avg(timestampdiff(year, date_of_birth, curdate())) as average_age
from employee;

--How do you select all employees whose first name is 'John'?
select * from employee where first_name ='John';

--Write a query to find all employees who were hired in the year 2023.
select * from employee where hire_date = '2023';

--How do you find the number of employees in each department?
select department, count(*) as num_employees
from employee
group by department;


--Write a query to list all employees ordered by their salary in descending order.
select * from employee order by salary desc;

--How do you find the 5 highest paid employees?
select * from employee order by salary desc limit 5;

--Write a query to calculate the total salary paid by the company.
select sum(salary) from employee;


--How do you find all employees whose last name starts with 'S'?
select * from employee where last_name like 'S%';

--Write a query to find the number of male and female employees.
select gender , count(*) from employee group by gender;


--How do you find employees who have a salary greater than $75,000?
select * from  employee where salary > 75000;


--Write a query to find the employee(s) with the longest tenure in the company.
select * from employee order by hire_date limit 1;


--How do you find the average salary for each department?
select department , avg(salary) from employee group by department;


--Write a query to list all employees who are older than 40 years.
select *
from employee
where timestampdiff(year, date_of_birth, curdate()) > 40;


--How do you find employees who were hired in the last 6 months?
select *
from employee
where hire_date >= date_sub(curdate(), interval 6 month);


--Write a query to find the department with the highest average salary.
select department
from employee
group by department
order by avg(salary) desc
limit 1;


--How do you update the salary of an employee with a specific employee_id?
update employee set salary = 90000.78 where employee_id =1;
select * from employee;


--Write a query to delete all employees who are not active.
delete from employee where is_active = false;


--How do you find employees who don't have a manager (manager_id is NULL)?
select * from employee where manager_id=0;

--Write a query to find the employee with the highest salary in each department.
select e.first_name, e.department
from employee e
join (
    select department, max(salary) as max_salary
    from employee
    group by department
) as max_salaries
on e.department = max_salaries.department
and e.salary = max_salaries.max_salary;


--Write a query to find employees who have the same last name.
select distinct e.first_name , e.last_name from employee e inner join employee e2 on e2.last_name=e.last_name;

--How do you find the second highest salary in the company?
select salary from employee order by salary desc  limit 1 offset 1;

--Write a query to list all employees along with their manager's name.
select first_name  manager_id from;


--Write a query to list all employees who are managers.
select first_name from employee where job_title='manager';

--How do you find the most common job title in the company?
select job_title,count(job_title) as count  from employee group by job_title order by count desc limit 1;

--Write a query to list all employees sorted by their age, then by their salary.
select first_name,salary , timestampdiff(year,date_of_birth,curdate() )as age from employee order by age , salary;

--How do you find departments that have more than 50 employees?
select department , count(first_name)as count from employee group by department where count > 50;

--How do you find the department with the highest salary disparity (max salary - min salary)?;
select department, max(salary)-min(salary) as disparity from employee group by department order by disparity desc limit 1;

--How do you find employees who have the same hire date?
select distinct e1.first_name from employee e1 inner join employee e2 on e1.hire_date=e2.hire_date;

--Write a query to find the employee(s) with the highest salary in each job title.
 select first_name
from employee e
where salary = (
    SELECT MAX(salary)
    FROM employee
    WHERE department = e.department
);

--How do you calculate the age of each employee based on their date_of_birth?
select first_name,timestampdiff(year,date_of_birth,curdate() ) as age from employee;

--How do you find employees who have a birthday this month?
select distinct first_name from employee where month(date_of_birth)=month(curdate() );

--How do you find departments where the average salary is below the company average?
select department , avg(salary) as sal from employee group by department where sal< (select avg(salary) from employee);

--How do you find the employee(s) with the longest name(s)?
select first_name , last_name from employee order by length(first_name)+length(last_name) desc limit 1;

--How do you find the most recently hired employee in each department?
select first_name from employee;

--Write a query to calculate the average tenure of employees in each department.
select department, avg(datediff(curdate(), hire_date) / 365) as average_tenure from employee group by department;

--How do you find employees who were hired on a weekend?
select * from employee where dayofweek(hire_date) in (1, 7);

--Write a query to calculate the percentage of employees in each department.
select department, count(*) * 100.0 / (select count(*) from employee) as percentage from employee group by department;

--How do you find employees whose salary is above the company average?
select * from employee where salary > (select avg(salary) from employee);

--Write a query to list all employees and their relative salary (salary / max salary in their department).
select first_name ,

--How do you find departments where the average salary is below the company average?
select department from employee group by department having avg(salary) < (select avg(salary) from employee);

--How do you calculate the employee turnover rate (assuming is_active indicates current employment)?
select (count(*) - sum(is_active)) * 100.0 / count(*) as turnover_rate from employee;

--How do you find the most recently hired employee in each department?
select first_name,last_name,department from employee where (department, hire_date) in ( select department, max(hire_date) from employee group by department );

--Write a query to list all employees and their years of service.
select *, floor(datediff(curdate(), hire_date) / 365) as years_of_service from employee;

--Write a query to calculate the company's total salary expense for each year.
select year(hire_date) as year, sum(salary) as total_salary_expense from employee group by year;