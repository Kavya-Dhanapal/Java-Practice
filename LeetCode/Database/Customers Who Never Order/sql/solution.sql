# Write your MySQL query statement below
select name as Customers from customers c LEFT join orders o
on c.id=o.customerid
where o.customerid IS NULL;

