-- challenge: https://www.hackerrank.com/challenges/the-pads/problem
select formatmessage('%s(%s)', name, left(occupation, 1))
from occupations
order by name;

select IIF(count(occupation) > 1,
           formatmessage('There are a total of %d %ss.', count(occupation), lower(occupation)),
           formatmessage('There is a total of %d %s.', count(occupation), lower(occupation))) as count
from occupations
group by occupation
order by count;