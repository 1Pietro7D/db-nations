-- MILESTONE 1
-- Creare un nuovo database in DBeaver e importare lo schema in allegato.
-- Scrivere una query SQL che restituisca la lista di tutte le nazioni mostrando:
-- nome, id, nome della regione e nome del continente, ordinata per nome della nazione.

select c.name as "country", c.country_id , r.name as "region", c2.name as "continent" 
from countries c
inner join regions r 
on c.region_id = r.region_id 
inner join continents c2
on r.continent_id = c2.continent_id 
order by c.name;