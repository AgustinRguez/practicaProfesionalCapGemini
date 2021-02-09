1-SELECT first_name,last_name,job_id, department_id FROM employees WHERE commission_pct is null AND salary <= 10000 AND salary<=7000;

2-SELECT first_name,last_name,job_id
FROM employees
WHERE job_id IN ('IT_PROG','ST_MAN','PR_REP')
ORDER BY job_id ASC

3-SELECT first_name,last_name,job_id,salary,commission_pct, salary + commission_pct FROM employees WHERE first_name = 'Alberto';

4-SELECT department_id FROM employees GROUP BY department_id ORDER BY department_id ASC nulls first;

5-SELECT manager_id,last_name 
FROM employees 
WHERE job_id NOT IN ('SA_REP', 'AD_VP') 
and last_name LIKE 'k' or manager_id>=100 
ORDER BY manager_id DESC,  last_name ASC 

6-SELECT COUNT (*) or (department_id) 
FROM employees
WHERE department_id>=40
GROUP BY department_id
ORDER BY  1 desc

7-SELECT country_id
FROM locations
GROUP BY country_id

8-select min(salary)minimo,max(salary)maximo,avg(salary)promedio
FROM employees
GROUP BY department_id
HAVING department_id 
in(110, 20)

para el 8.2 hacer un drop constraint

9-SELECT MAX(salary), MIN(salary), MAX(salary)-MIN(salary) DIFERENCE
FROM employees
GROUP BY job_id

10-SELECT job_id, sum(salary) pago
FROM employees
WHERE job_id NOT LIKE '%REP%'
GROUP BY job_id
HAVING sum(salary) > 13000
ORDER BY sum(salary) DESC

11-SELECT last_name,count(*)
FROM employees
GROUP BY last_name
HAVING count(*)>1

12-SELECT max(promedio) from(
SELECT AVG(salary) promedio	
FROM employees
GROUP BY department_id) as lista

---------------------JOIN-----------------------------

1-SELECT e.first_name, e.last_name, d.department_name, d.location_id
FROM employees e , departments d 
WHERE e.department_id = d.department_id
AND e.manager_id = 149

2-SELECT e.first_name, e.last_name, d.department_name, l.city
FROM employees e, departments d, locations l
WHERE e.department_id = d.department_id
AND  l.location_id = d.location_id

3-SELECT e.last_name, d.department_name, d.location_id, l.city,l.country_id
FROM employees e, departments d, locations l
WHERE e.department_id = d.department_id
AND d.location_id = l.location_id
AND e.commission_pct is not null
AND l.country_id = 'UK'

4-select emp.first_name||' '||emp.last_name ||' es empleado de '|| jef.first_name||' '||jef.last_name
from employees emp join employees jef on emp.manager_id = jef.employee_id;

5-SELECT l.city, d.department_name
FROM departments d
RIGHT JOIN locations l on (d.location_id = l.location_id)

6-select e.first_name||' '||e.last_name|| ' ' ||jef.first_name|| ' '||jef.last_name
from employees e left join employees jef on e.manager_id = jef.employee_id;

7-select e.first_name , e.last_name , e.hire_date ,
        e.hire_date + INTERVAL '6months' as revision,
        case
           when (date_trunc('week', e.hire_date)+ interval '4days' > e.hire_date) then date_trunc('week', e.hire_date)+ interval '4days'
           else date_trunc('week', e.hire_date)+ interval '11days'
       	   end  as primer_viernes
from employees e , departments d
where e.department_id = d.department_id
and d.department_id = 20

8/9-SELECT e.last_name, salary, d.department_name
FROM employees e, departments d
WHERE salary = ANY(SELECT min(e2.salary) 
				   FROM employees e2
				   group by e2.department_id )
and e.department_id = d.department_id
order by d.department_name

-------------------------- CON IN --------------------------
SELECT e.last_name, salary, d.department_name
FROM employees e, departments d
WHERE salary in(SELECT min(e2.salary)
				 FROM employees e2
				 GROUP BY e2.department_id)
and e.department_id = d.department_id
order by d.department_name

10-SELECT e.employee_id, e.last_name, e.job_id, salary
FROM employees e
WHERE salary > ANY(select e2.salary
				  from employees e2
				  WHERE e2.job_id='IT_PROG')
AND e.job_id<>'IT_PROG'
ORDER BY salary

11-SELECT l.country_id,count(*)
FROM locations l, departments d
where d.location_id = l.location_id
and l.country_id in (select c.country_id
					FROM countries c, regions r
					where c.region_id = r.region_id
					and r.region_id in (1,2))
group by l.country_id
order by country_id

12-SELECT e.last_name, e.department_id, e2.last_Name colega
FROM employees e, employees e2
WHERE e.department_id in (20,60)
and e.employee_id != e2.employee_id
and	e.department_id = e2.department_id
order by 2 asc

-------------------UPDATE-INSERT-DELETE---------------------------
1-UPDATE employees e
set department_id = (SELECT dep.department_id 
					 from departments dep
					WHERE department_id = 60),
	salary        = (SELECT emp.salary 
					 from employees emp
					WHERE emp.hire_date = (SELECT min(emp2.hire_date)
								   FROM employees emp2
								   WHERE department_id = 60))
where e.first_name = 'kimberly' 
and e.last_name = 'grant'

2-select * from countries
select * from locations

INSERT INTO countries (country_id,country_name,region_id)
VALUES ('ar','argentina',2)
INSERT INTO locations(location_id,street_address,postal_code,city,state_province,country_id)
VALUES (9999,'Manuela Pedraza',1429,'Buenos Aires','Buenos Aires','ar')

3-update departments d
set location_id = (SELECT l2.location_id FROM locations l2 WHERE l2.location_id = 9999)
where d.location_id = 1400

4--- Cerramos ca 
-- Eliminar al manager del departamento
update departments 
set manager_id = null 
where department_id IN (select d.department_id 
from departments d,locations l 
where d.location_id = l.location_id 
and country_id = 'ca');

-- Borrar job_history
delete from job_history 
where department_id IN (select d.department_id 
from departments d,locations l 
where d.location_id = l.location_id 
and country_id = 'ca')

-- Borrar empleados de departamento con location , el valor country_id='ca' 
delete from employees 
where department_id IN (select d.department_id 
from departments d,locations l 
where d.location_id = l.location_id 
and country_id = 'ca')

select * from employees 
where department_id = (select d.department_id 
from departments d,locations l 
where d.location_id = l.location_id 
and country_id = 'ca')

select department_id from departments d 
where location_id IN (select location_id from locations l 
where country_id = 'ca')

select d.department_id 
from departments d,locations l 
where d.location_id = l.location_id 
and country_id = 'ca'

select location_id from locations l 
where country_id = 'ca'
 
-- Borrar departamento con location , el valor country_id='ca' 
delete  
from departments d 
where d.location_id = (select location_id from locations where country_id = 'ca')

-- Borrar location , el valor country_id='ca' 
delete from locations where country_id = 'ca'

5-select * FROM departments

INSERT INTO departments (department_id,department_name, manager_id,location_id)
SELECT d.department_id + 200 , d.department_name || '' || loc.country_id, d.manager_id, d.location_id
FROM departments d, locations loc
WHERE d.location_id = loc.location_id

6-UPDATE employees
SET department_id = (
SELECT E.department_id
FROM employees E
GROUP BY E.department_id
HAVING COUNT(1) = (
SELECT MAX(Z.cant)
FROM (SELECT E.department_id dpto, COUNT(1) cant
FROM employees E
GROUP BY E.department_id
) Z
)
)
WHERE hire_date = '1997-08-17'

-----------------------------Trigger---------------------------------

/*1)-Implementar la funcion sumar , que recibe dos enteros y devuelve la suma de ambos*/

create or replace function suma (numeroUno integer ,numeroDos integer) returns INTEGER as $$
BEGIN 
	 return numeroUno + numeroDos;
END;
$$ LANGUAGE plpgsql;

select suma(30,45);
 
/*2)- Implementar la funcion IIF que recibe 3 parametros, si p1 es verdadero entonces devuelve p2 y si es falso
devuelve p3 . Analizar que tipos de datos hay que usar para los parametros de la funcion 
, y tambien hacer una sentencia select probarla*/

CREATE OR REPLACE FUNCTION IIF(condicion boolean, verdadero anyelement, falso anyelement) returns anyelement as $$
SELECT CASE WHEN condicion then verdadero else falso
end;
$$ LANGUAGE SQL IMMUTABLE;

select IIF(30>20, 'es mayor'::TEXT,'es menor'::TEXT);

DROP FUNCTION iif(condicion boolean,verdadero anyelement,falso anyelement)
select iif(30>20,'Es mayor'::text,'Es menor'::text);

/*3)- Como al dueño de la empresa le gustan los autos electricos, a cada nuevo empleado hay que agregarle “Tesla” 
a su apellido, hacer un trigger que implemente esa funcionalidad.*/

CREATE OR REPLACE FUNCTION agregarTesla() returns trigger as $$

begin
	NEW.last_name := concat(NEW.last_name,'tesla');
	return NEW;
end;
$$ LANGUAGE plpgsql;

CREATE TRIGGER tgr_tesla
BEFORE insert
ON employees
for each row
execute procedure agregarTesla();

INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id,bonus)
VALUES(1515,'Lisandro','Lopez','lichalopez15@lala','555987','2021-02-04','it_prog',15000,0,null,60,'')

SELECT * from employees
WHERE employee_id = 1515;

4- /*4)- Implementar una funcion que se llame factorial , que reciba un numero y calcule el factorial*/

create or replace function factorial (a integer) returns integer as $$

declare 
		b integer;
begin
		if (a>10) then
       raise 'Estoy cansado, no quiero calcular un numero tan grande';
		elseif (a>1) then
		b:= a; -- a==1
		end if;
		return a*b;	
end;

$$ LANGUAGE plpgsql;

SELECT factorial(5)