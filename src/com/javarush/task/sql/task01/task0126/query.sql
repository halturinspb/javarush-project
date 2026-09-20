-- Write your code here:
select brand, model, quantity, booked_quantity FROM car
WHERE brand IN ('renault', 'opel', 'seat', 'skoda')
OR (quantity - booked_quantity) < 10;