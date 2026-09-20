select
       case
           when experience < 1 then 'junior'
           when experience < 3 and experience >= 1 then 'middle'
           when experience < 5 and experience >= 3 then 'senior'
           end as level
from developers;
