select year(date), month(date), day(date), count(total)
from data
group by year(date), month(date), day(date);
