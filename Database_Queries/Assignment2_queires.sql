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