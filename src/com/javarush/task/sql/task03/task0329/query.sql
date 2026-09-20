select c.customer_id,
           o.order_status
from customers as c
    right join orders as o
on o.customer_id = c.customer_id;
