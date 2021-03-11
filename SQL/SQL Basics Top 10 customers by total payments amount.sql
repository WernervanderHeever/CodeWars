/*Description:
Overview
For this kata we will be using the DVD Rental database.

Your are working for a company that wants to reward its top 10 customers with a free gift. You have been asked to generate a simple report that returns the top 10 customers by total amount spent ordered from highest to lowest. Total number of payments has also been requested.

The query should output the following columns:

customer_id [int4]
email [varchar]
payments_count [int]
total_amount [float]
and has the following requirements:

only returns the 10 top customers, ordered by total amount spent from highest to lowest*/

-- Replace with your query (in pure SQL)
select  c.customer_id,
        c.email,
        COUNT(j.payment_id) as payments_count,
        ROUND( SUM(j.amount),2)::float as total_amount
        from customer c
        inner join payment j on c.customer_id = j.customer_id
        group by c.customer_id
        order by total_amount desc
        limit 10;