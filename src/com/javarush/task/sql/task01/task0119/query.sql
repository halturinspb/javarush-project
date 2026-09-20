-- Write your code here:
select *
FROM employee
WHERE department = 'dev'
   OR department = 'qa';