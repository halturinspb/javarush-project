-- Write your code here:
select id, salary, department, name
from employee
WHERE salary < 5000
  AND department = 'dev';