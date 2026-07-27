# Write your MySQL query statement below
select m.name as Employee 
from Employee e
inner Join 
Employee m
on e.id = m.managerID
where e.salary < m.salary;