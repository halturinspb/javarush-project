select
       case
           when euro is null then 'good'
else 'bad'
end as raiting
from cars;
