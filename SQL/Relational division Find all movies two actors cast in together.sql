/*Description:
Given film_actor and film tables from the DVD Rental sample database find all movies 
both Sidney Crowe (actor_id = 105) and Salma Nolte (actor_id = 122) cast in together 
and order the result set alphabetically.*/

-- Replace with your SQL Query
select c.title
from film c
inner join film_actor j on c.film_id = j.film_id
inner join film_actor b on c.film_id = b.film_id
where j.actor_id = '105' AND b.actor_id = '122'
group by title