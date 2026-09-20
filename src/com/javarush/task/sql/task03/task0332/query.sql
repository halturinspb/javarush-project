select аuth.last_name as author,
       book.genre as book_genre,
       book.date_released
from authors as аuth
    right join books as book
on аuth.author_id =  book.author_id
where book.date_released < 1900
group by аuth.last_name, book.genre,book.date_released;