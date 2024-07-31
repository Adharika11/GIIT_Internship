USE employee;

select * from employee;

-- How do you find the most recently hired employee in each department?
select e1.first_name,e1.department from employee e1 where e1.hire_date = (select MAX(e2.hire_date) from employee e2 where e1.department = e2.department);

-- find median of the salary

-- How do you find employees whose email doesn't follow the standard format (firstname.lastname@example.com)?
select first_name from employee where email LIKE '_%._%@_%._%' AND LENGTH(email) - LENGTH(REPLACE(email, '@', ''))>=1 AND LENGTH(email) - LENGTH(REPLACE(email, '.', ''))>=1;

-- Write a query to list all employees and the number of coworkers they have in the same department.
SELECT e.first_name,e.last_name,
       (SELECT COUNT(*)
        FROM employee e1
        WHERE e1.department = e.department
          AND e1.employee_id != e.employee_id) AS coworker_count
FROM employee e;

-- How do you find employees who were hired on the same day as another employee in their department?
select e1.first_name from employee e1 where EXISTS(select 1 from employee e2 where e2.department=e1.department AND e1.hire_date=e2.hire_date);

-- How do you find employees who have the same birth month as their hire month?
select first_name from employee where MONTH(date_of_birth)= MONTH(hire_date);

-- How do you find employees who were hired on the same day as another employee in their department?
select e1.first_name from employee e1 INNER JOIN employee e2 where e1.hire_date = e2.hire_date;

-- Write a query to list all employees and their salary difference from their department's average.
select e1.first_name ,e1.salary-(select avg(e2.salary) from employee e2  where e2.department= e1.department group by department) as salary from employee e1;

-- How do you find the employee(s) with the most common first name?
SELECT first_name
FROM employee
GROUP BY first_name
HAVING COUNT(*) = (
    SELECT MAX(name_count)
    FROM (
             SELECT COUNT(*) AS name_count
             FROM employee
             GROUP BY first_name
         ) subquery
);

-- How do you find the department with the highest percentage of active employees?
SELECT department
FROM employee
WHERE is_active = 1
GROUP BY department
ORDER BY COUNT(is_active) DESC
LIMIT 1;

-- Find Employees Whose Names Are Palindromes
SELECT first_name
FROM employee
WHERE first_name = REVERSE(first_name);

-- Find the Department with the Youngest Average Age
select department from employee group by department order by avg(timestampdiff(year,date_of_birth,curdate())) asc limit 1;

-- Calculate the Salary Quartiles for the Entire Company
SELECT
    MIN(salary) AS Q1,
    MAX(salary) AS Q4
FROM (
         SELECT salary,
                NTILE(4) OVER (ORDER BY salary) AS quartile
         FROM employee
     ) AS quartiles
WHERE quartile = 1
   OR quartile = 4;

-- List All Employees and Their Salary Rank Within Their Job Title
SELECT first_name, job_title, salary,
       (SELECT COUNT(*)
        FROM employee e2
        WHERE e2.job_title = e1.job_title AND e2.salary > e1.salary) + 1 AS salary_rank
FROM employee e1;

-- Find Employees Whose Salary Is a Prime Number
SELECT first_name, salary
FROM employee
WHERE is_prime(salary) = 1;

--  Calculate the Average Salary Increase Percentage
SELECT AVG((current_salary - previous_salary) / previous_salary * 100) AS avg_increase_percentage
FROM salary_history;

-- Write a query to calculate the company's salary expense as a percentage of a hypothetical total revenue.
SELECT (SUM(salary) / 1000000.0) * 100 AS salary_expense_percentage
FROM employee;

-- How do you find employees who were hired on company anniversaries?
SELECT first_name, hire_date
FROM employee
WHERE MONTH(hire_date) = 1 AND DAY(hire_date) = 1;

-- Write a query to list all employees and their salary difference from the next highest salary in their department.
select e1.first_name ,(select MIN(e2.salary) from employee e2 where e2.department =e1.department  AND e2.salary> e1.salary  )-e1.salary from employee e1;
-- How do you find the job title with the widest salary range?
SELECT job_title
FROM employee
GROUP BY job_title
ORDER BY MAX(salary) - MIN(salary) DESC
LIMIT 1;

-- Write a query to calculate the average tenure of employees for each manager.
SELECT manager_id,
       AVG(DATEDIFF(CURDATE(), hire_date) / 365) AS avg_tenure
FROM employee
GROUP BY manager_id;

-- How do you find employees whose salary is a perfect square?
SELECT first_name, salary
FROM employee
WHERE is_perfect_square(salary) = 1;

-- Write a query to list all employees and their "level" (assuming a hierarchical structure based on manager_id).
SELECT employee_id, manager_id,
       (SELECT COUNT(*)
        FROM employee e2
        WHERE e2.manager_id = e1.manager_id) + 1 AS level
FROM employee e1;

-- How do you find the department with the most diverse age range?
SELECT department
FROM employee
GROUP BY department
ORDER BY MAX(age) - MIN(age) DESC
LIMIT 1;

-- Write a query to calculate the ratio of male to female employees in each department.
SELECT department,
       SUM(CASE WHEN gender = 'Male' THEN 1 ELSE 0 END) * 1.0 / NULLIF(SUM(CASE WHEN gender = 'Female' THEN 1 ELSE 0 END), 0) AS male_to_female_ratio
FROM employee
GROUP BY department;

-- How do you find employees who have the same first name as their manager?
SELECT e1.first_name AS employee_name, e2.first_name AS manager_name
FROM employee e1
         JOIN employee e2 ON e1.manager_id = e2.employee_id
WHERE e1.first_name = e2.first_name;

