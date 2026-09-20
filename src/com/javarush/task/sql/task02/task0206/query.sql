select *,
       if(salary <= 500, 1000, 0) as bonus
from employee
where id > 5
limit 10;