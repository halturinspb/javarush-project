select
    case
        when ifnull(euro, 6) > 5 then 'best'
        when euro = 5 then 'good'
        else 'bad'
        end as car_rating
from cars;