select book.isbn, book.title
from author join book on author.id =book.author_id
where author.last_name like 'S%';
