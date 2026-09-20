select name,
       count(*) as count
from cars
WHERE prod_year = 2021
group by name;




