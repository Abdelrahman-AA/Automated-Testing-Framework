# Load Testing Report for ParaBank Website

---

## Introduction
- **Test Objective:** Assess the performance and stability of the ParaBank website under simulated load conditions.
- **Test Type:** Load Testing
- **Test Scope:** The test simulated **1,000 virtual users**, each executing a complete transaction scenario.
- **User Distribution:** The **1,000 users** were ramped up gradually over **300 seconds**.
- **Request Delay:** Each request had a randomized delay of **1 to 1.5 seconds** to mimic real-world conditions.
- **Testing Tool:** Apache JMeter

---

 ## Project Resources

  Here are direct links to key resources within the project repository:
  
   - 📁 [JMeter Load Test Files](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/blob/main/Parabank_Load_Test/Parabank_Load_Test.jmx)
   - 📄 [Load Test Results (CSV)](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/blob/main/Parabank_Load_Test/Parabank_Load_Test-Results.csv)
   - 📄 [Enhanced Test Results (Excel)](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/blob/main/Parabank_Load_Test/Parabank_Load_Test-enhanced_results.xlsx)
   - 📈 [Performance Graphs & Visual Analysis](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/tree/main/Parabank_Load_Test/Graphs)

---

## 2. Test Scenario
Each user executed the following sequence of requests:
1. Retrieve `JSESSIONID`
2. Register a new user
3. Log in
4. Retrieve user account details
5. Pay a bill
6. Deposit funds
7. Check account balance
8. Withdraw funds
9. Create a new account (repeated three times)
10. Retrieve account details again
11. Transfer funds between two user accounts
12. View transfer history from the sending account
13. View transfer history from the receiving account
14. Log out

---

## Test Results
- **Overall Request Success Rate:** **96.7%**
- **Failures:**
  - **45 users** failed to create an account, preventing further requests in their scenarios.
  - **141 users** encountered a failure in at least one request but continued the scenario.
  - **13 users** experienced failures in multiple requests.
- **Performance Metrics:**
  - **Maximum response time:** **2.26 seconds**
  - **Minimum response time:** **0.22 seconds**
  - **Number of users completing the full scenario without failures:** **814 users**
  - **Average execution time for users completing the full scenario (including random request delays):** **32.57 seconds**

---

## Observations
  - Response times remained stable with only minor variations throughout the test.
  - No performance bottlenecks were observed at the **1,000-user** threshold under the defined load distribution.
  - The request success-to-failure ratio remained within acceptable limits.
---

## Visualized Data

- **Response Time vs. Number of Users**: A line chart illustrating how response time changed as the number of users increased.
<p align="center">
<img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Load_Test/Graphs/response_vs_users_plot_en.png" alt="Response Time" width="600">
</p>

<br>

- **Request Success vs. Failure Rate**: A pie chart showing the percentage of successful and failed requests.
  <p align="center">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Load_Test/Graphs/success_rate_plot_en.png" alt="Response Time" width="600">
</p>

<br>

- **Response Time Distribution by Request Type**: A bar chart displaying average response times for each request type.
  <p align="center">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Load_Test/Graphs/response_by_request_plot_en.png" alt="Response Time Distribution by Request Type" width="600">
</p>

<br>

- **End-to-End Scenario Execution Time Distribution**: A box plot or line chart showing the distribution of execution times across completed user scenarios.
  <p align="center">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Load_Test/Graphs/scenario_response_distribution_plot_en.png" alt="End-to-End Scenario Execution Time Distribution" width="600">
</p>

<br>

- **Active Users Over Time**: A line chart depicting how the number of active users increased over the **300-second** ramp-up period.
  <p align="center">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Load_Test/Graphs/users_over_time_plot_en.png" alt="Active Users Over Time" width="600">
</p>

<br>

---

## Recommendations
- Investigate the cause of account creation failures for the affected **45 users**.
- Analyze the failures experienced by **128 users** (single failures) and **13 users** (multiple failures) to identify any patterns or potential system issues.
- Conduct additional tests with increased user loads to identify system scalability limits.
- Consider performance optimizations to further reduce response times for critical transactions.

---

## Conclusion
The ParaBank website successfully handled **1,000 concurrent users** with a high request success rate of **96.7%**. No major performance degradation was observed, and the system remained stable throughout the test. Minor failures in account creation and other transactions should be further analyzed to enhance reliability in real-world conditions.

