with tempTable as (select avg(grossed) as averageGrossed from films),
     tempTable2 as (select avg(year_released) as averageYearReleased from films)
select title, genre, year_released, grossed
from films,
     tempTable,
     tempTable2
where films.grossed > tempTable.averageGrossed
  and films.year_released > tempTable2.averageYearReleased
group by year_released, title, genre, grossed;

