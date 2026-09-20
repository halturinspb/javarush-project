-- Write your code here:
select required, identifier, description  FROM parts
WHERE description IS NOT NULL;