select department,
       count(*) as emp_count
from employee
where position = 'backend developer'
group by department;
