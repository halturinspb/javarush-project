select prod_year,
       count(*) as 'count'
from cars
where name = 'Blue Car'
group by prod_year;

