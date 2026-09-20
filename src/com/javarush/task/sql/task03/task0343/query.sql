select film_directors.full_name
from film_directors
         left join (select director_id, title from films  where genre = 'comedy') as f
on film_directors.id = f.director_id;

