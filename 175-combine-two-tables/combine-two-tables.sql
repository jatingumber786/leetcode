# Write your MySQL query statement below
select p.firstName , p.lastName , a.city , a.state from person as p
left join 
address as a 
On p.personid = a.personid;