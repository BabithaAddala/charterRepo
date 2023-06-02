Retail Customer reward points charter based on transactions.

A retailer offers a rewards program to its customers, awarding points based on each recorded purchase. A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent over $50 in each transaction (e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points). Given a record of every transaction during a three month period, calculate the reward points earned for each customer per month and total.

Below are the technical points to run the application.

1. Clone the project from github location to your Intellij/Eclipse
2. The package is structured as "com.retailer.rewards.charter"
3. Run "CharterApplication"
4. The application uses H2 database as you see those default properties in the file application.properties
5. Ones you succesfully run the application, open H2 console "http://localhost:8080/h2-console/" to view the tables.
6. Use data.sql to insert the data to the two tables (CUSTOMER & TRANSACTION) created from schema.sql
7. Now use the below GET endpoint to hit the api which lists down the reward points based on the transactions.
   a. localhost:8080/charter/1001/rewards
8. You will see the below response from postman or any client you use to hit the request.
   {
   "customerId": 1001,
   "lastMonthRewardPoints": 90.0,
   "lastSecondMonthRewardPoints": 90.0,
   "lastThirdMonthRewardPoints": 0.0,
   "totalRewards": 180.0
   }
