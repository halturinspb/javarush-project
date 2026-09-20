select
    name,
    year(discovery_date) as d_year,
    monthname(discovery_date) AS d_month,
    dayname(discovery_date) AS d_day
from object;