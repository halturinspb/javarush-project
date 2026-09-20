select if(position = 'manager',
          if(salary > 10000, 'good', 'bad'),
          if(salary > 5000, 'good', 'bad')) as mark
from employee
where city = 'London';