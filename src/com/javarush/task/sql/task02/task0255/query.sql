select name, min(price) as min_price, max(price) as max_price
from cars
group by name
having max_price < 200000;