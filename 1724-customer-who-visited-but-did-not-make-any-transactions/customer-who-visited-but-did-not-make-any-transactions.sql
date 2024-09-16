# Write your MySQL query statement below

-- select v.customer_id, count(v.visit_id) as count_no_trans 
-- from Visits v
-- left join Transactions t
--     on v.visit_id = t.visit_id
-- where t.transaction_id is NULL  
-- group by v.customer_id
-- ;  

select customer_id , count(visit_id) as count_no_trans
from Visits v
where V.visit_id not in (
    select distinct t.visit_id from Transactions t
)
group by customer_id;
