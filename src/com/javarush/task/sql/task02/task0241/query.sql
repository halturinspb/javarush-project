select
    year (date_of_birth) as birth_year,
    month(date_of_birth) as birth_month
from employee
group by birth_year, birth_month;
