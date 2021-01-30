-- challenge: https://www.hackerrank.com/challenges/occupations/problem
select min(iif(occupation = 'Doctor', name, null))    as doctor,
       min(iif(occupation = 'Professor', name, null)) as professor,
       min(iif(occupation = 'Singer', name, null))    as singer,
       min(iif(occupation = 'Actor', name, null))     as actor
from (select oc.occupation, oc.name, row_number() over (partition by oc.occupation order by oc.name) as rowNumber
      from occupations as oc) as rn_oc
group by rn_oc.rowNumber;

-- solution using pivot
select doctor,
       professor,
       singer,
       actor
from (select row_number() over (partition by occupation order by name) rowNumber, * from occupations) ranrowNumberked
pivot (max (name) for occupation in (doctor, professor, singer, actor)) as pivotTable
