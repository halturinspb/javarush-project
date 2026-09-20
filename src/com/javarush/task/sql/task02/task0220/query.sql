select distinct name,
                case
                    when prod_year = 2020 then 'new'
                    when prod_year = 2021 then 'newer'
                    when prod_year = 2022 then 'even newer'
end as result
from cars
-- where prod_year IN (2020, 2021, 2022);

