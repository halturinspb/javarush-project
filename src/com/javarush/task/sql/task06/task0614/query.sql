# update employee
# set employee.salary = employee.salary + 1000
# where employee.id in (select task.employee_id
#                       from task
#                       where exp_date > '2022-10-01');
#
with test1 as (select employee.id
               from employee
                        left join task on employee.id = task.employee_id
                   and task.exp_date < '2022-10-01'
               group by employee.id
               having count(task.id) = 0)

update employee
set employee.salary = employee.salary + 1000
where employee.id = test1.id;

#
# select task.employee_id
# from task
# where exp_date > '2022-10-01';

# select employee.id
# from employee
#          left join task on employee.id = task.employee_id
#     and task.exp_date < '2022-10-01'
# group by employee.id
# having count(task.id) = 0;
