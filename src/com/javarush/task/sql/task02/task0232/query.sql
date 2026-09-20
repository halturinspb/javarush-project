select is_full_time,
       count(*) as count
from students
group by is_full_time;
