with tempTable as (select avg(year_born) as averageDOB from film_directors)
select id, full_name, year_born
from film_directors,
     tempTable
where film_directors.year_born < tempTable.averageDOB;
