select dayname(date), count(type)
from event
where type = 'registration'
group by dayname(date)
order by count(type) desc
limit 1;

