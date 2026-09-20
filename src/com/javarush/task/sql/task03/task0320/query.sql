select r.ret_name,
       r.ret_revenue,
       s.sup_name,
       s.sup_revenue
from top_retailers as r
         join suppliers as s on r.ret_revenue = s.sup_revenue
where s.sup_revenue > 50;