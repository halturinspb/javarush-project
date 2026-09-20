SELECT
    id,
    IF(salary > 1000, 'yes', 'no') AS salary_check
FROM
    employee
WHERE
    id < 5;
