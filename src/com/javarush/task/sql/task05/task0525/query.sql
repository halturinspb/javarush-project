select author.full_name, count(book.id) as books
from author
         join book on author.id = book.author_id
group by author.id
having count(book.id) > 1;
