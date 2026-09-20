select name, sum(price) as sum_price, avg(price) as avg_price
from cars
group by name
having avg_price > 100000;

