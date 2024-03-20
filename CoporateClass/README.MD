# Corporation
- Write a Java program that creates a class hierarchy for employees of a company. 
- The base class should be Employee, with subclasses Manager, Architect and Programmer. 
- Each subclass should have properties such as name, address, salary, experience (in_years), pay grade(1-15), performance and job title. 
- Implement methods for 
-- calculating bonuses, 
-- generating performance report summary, 
-- assigning employees to projects.
-- calculating bill_rate (divide salaray on number of hours in  a year calculated  on 8 hour work day and 251 working days per year)
    bill_rate = salary / (8 * 251);


# Create another class that represent a Project
- Project has Name, Status (completed/in-progress/planning/not-started), Budget (in USD), duration(in hrs), completion_time(in hours), Owner (Manager), Team (list of Architect(max 2) and Programmers (Max 20) members/team)
- Create a method to calculate profit per project
- Give 1% of profit to each Team member and 5% of profit to manager
- Create a method to create project performance, based on budget, (duration - completion_time), pay_grade, experience of each team member
```
// Find a BudgetFactor based on the sum of all budgets and calculating the budgetFactor
if (Status == Complete)
employee_project_performance = (0.9 * Current_Employeee_Performance) + ( 0.1 * (duration - completion_time) * BudgetFactor; 
```

