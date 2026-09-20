-- Write your code here:
select  id, identifier, description FROM parts
ORDER BY identifier DESC, required DESC, description ASC