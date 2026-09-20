select month(date), count(*)
from event
where status = 'ERROR'
   or status = 'FAILED'
group by month(date)
order by count(*) desc
limit 1;

