
select distinct (customer.phone)  FROM customer 
                	INNER JOIN "order" ON "customer".customer_id = "order".customer_id  
WHERE customer.org_id = 13336 and "order".created_at BETWEEN 	'2023-06-18' AND '2023-07-18';