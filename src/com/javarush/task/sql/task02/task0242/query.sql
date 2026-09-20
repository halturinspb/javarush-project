select
    YEAR(date_of_birth) AS birth_year,
    MONTH(date_of_birth) AS birth_month,
    COUNT(*) AS employee_count
from
    employee
group by
    birth_year, birth_month;
