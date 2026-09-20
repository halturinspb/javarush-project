select name, sum(price) as total
from cars
group by name
having total >200000;