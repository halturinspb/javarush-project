-- Write your code here:
select * FROM parts
WHERE description IS NOT NULL OR identifier IS NULL;