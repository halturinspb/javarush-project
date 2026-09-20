select gym.location,
       person.location
from gyms as gym,
     customers as person
where person.location not in ('London')
group by gym.location,
         person.location;
