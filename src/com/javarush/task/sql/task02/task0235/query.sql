select YEAR(date_of_birth) as 'year_of_birth',
count(*) as count
from employee
where position like '%developer%'
group by YEAR(date_of_birth);
