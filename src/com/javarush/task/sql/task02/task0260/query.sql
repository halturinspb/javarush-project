select
    rating,
    group_concat(name separator ', ') as names
from employee
group by rating
having rating > 2;

