-- First 
select employee.employee_id, employee.employee_name, department.department_name
from employee,department


-- Second
select employee.employee_name, employee.salary 
from employee 
ORDER by employee.salary DESC


-- Third
select department.department_name, avg(emp.salary) 
from department, employee emp 
GROUP by department_name