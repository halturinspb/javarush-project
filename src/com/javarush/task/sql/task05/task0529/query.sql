-- ?????????????????????????
SELECT author.full_name,
       count(distinct publisher.id) as publishers
from author
         left join book on author.id = book.author_id
         left join publisher on publisher_id = book.publisher_id
group by author.id;
