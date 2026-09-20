select YEAR(date_of_birth), count(*) as 'number of birth'
from employee
group by YEAR(date_of_birth);
