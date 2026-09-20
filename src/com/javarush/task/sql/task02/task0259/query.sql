select
    position,
    group_concat(name separator ', ') as names
from
    employee
group by position
having position like '%developer%';

