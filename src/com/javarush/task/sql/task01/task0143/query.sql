-- Write your code here:
select id, identifier, description FROM parts
ORDER BY identifier ASC, required DESC, description DESC
LIMIT 7;