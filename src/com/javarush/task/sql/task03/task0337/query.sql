select *
from authors
where author_id not in
      (select author_id from books where title = 'War and Peace' and author_id = 7);

