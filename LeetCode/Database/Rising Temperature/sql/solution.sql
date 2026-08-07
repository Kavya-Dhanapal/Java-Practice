# Write your MySQL query statement below
Select w.id from weather w
join weather a
on datediff(w.recordDate,a.recordDate)=1
where a.temperature< w.temperature