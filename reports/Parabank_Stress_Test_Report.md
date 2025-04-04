# Stress Testing Report for ParaBank Website

## 1. Introduction

**Test Objective:** Assess the performance and stability of the ParaBank website under high stress conditions, simulating large-scale concurrent user activity.

**Test Type:** Stress Testing

**Test Scope:** The test simulated a gradual increase in the number of virtual users, reaching a maximum of 5,000 users.

**User Distribution:**
- **Start with 1,000 users**: Gradually ramped up over 300 seconds, each with a randomized delay between 1 and 1.5 seconds per request.
- **Increment of 500 users every 60 seconds**, with start points for each new user distributed over 150 seconds, until reaching 5,000 users.

**Testing Tool:** Apache JMeter


## 2. Test Scenario

Each user executed the following sequence of requests:

1. Retrieve JSESSIONID
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


## 3. Test Results

### Overall Request Success Rate:
- **Success Rate:** 82.23%
- **Total Requests:** 61,947

### Request Type Breakdown:
| **Request Type**     | **Total Requests** | **Success Rate** | **Avg Response Time (ms)** |
|----------------------|:--------------------:|:------------------:|:----------------------------:|
| **Logout-0**         | 2,251              | 100%             | 2138.52                   |
| **Logout-1**         | 2,251              | 98.45%           | 2389.91                   |
| **Get JSESSIONID**   | 7,043              | 99.09%           | 2598.47                   |
| **Login**            | 4,151              | 95.9%            | 2449.86                   |
| **Logout**           | 2,263              | 97.92%           | 4499.2                    |
| **Transfer**         | 2,620              | 73.09%           | 2212.33                   |
| **Billpay**          | 3,806              | 73.67%           | 2164.43                   |
| **Account Balance**  | 3,406              | 95.36%           | 2308.42                   |
| **Deposit**          | 3,595              | 73.8%            | 2121.05                   |
| **Customer Accounts**| 6,734              | 95.59%           | 2583.7                    |
| **Transactions 1**   | 2,493              | 96.19%           | 2528.04                   |
| **Transactions 2**   | 2,366              | 92.6%            | 2511.86                   |
| **Create Account 0** | 3,122              | 54.36%           | 1763.39                   |
| **Create Account 2** | 2,868              | 54.71%           | 1884.37                   |
| **Register**         | 6,729              | 64.02%           | 2684.38                   |
| **Withdraw**         | 3,254              | 74.52%           | 2120.73                   |
| **Create Account 1** | 2,995              | 55.16%           | 1821.39                   |

### Performance Metrics:
| **Metric**                        | **Value**     |
|----------------------------------|:---------------:|
| Maximum Response Time            | 33,100 ms     |
| Minimum Response Time            | 220 ms        |
| 90th Percentile Response Time    | 6,311 ms      |
| 95th Percentile Response Time    | 7,031 ms      |
| 99th Percentile Response Time    | 12,627 ms     |
| Average Response Time            | 2,661.89 ms   |

### Error Distribution:
| **Error Type**                                                                 | **Count** |
|--------------------------------------------------------------------------------|:-----------:|
| Non HTTP response code: java.net.SocketTimeoutException                        | 128       |
| HTTP 400                                                                       | 6,543     |
| HTTP 500                                                                       | 3,697     |
| HTTP 502                                                                       | 15        |
| HTTP 404                                                                       | 619       |
| Non HTTP response code: org.apache.http.NoHttpResponseException                | 5         |

### Users Completing Full Scenario:
- **Users with no failures:** 814 users
- **Average Execution Time for Completed Users:** 32.57 seconds


## 4. Observations

- The system showed **acceptable performance** under moderate load, but **response times increased noticeably** under higher loads, with:
  - **Average Response Time:** 2661.89 ms  
  - **Maximum Response Time:** 33,100 ms  

- **Significant failure rates** were observed in several request types:
  - `create account`: ~54–55% success rate
  - `register`: 64.02% success rate
  - `deposit`, `transfer`, `billpay`: success rates in the ~73% range

- The overall **success rate** across all requests was **82.23%**, indicating **potential performance and reliability issues** under heavy load.

- **Common errors encountered:**
| ***Error***                          | ***Description**              | ***Count*** |
|-----------------------------------|:------------------------------:|:-----------:|
| HTTP 400                          | Bad Request                  | 6,543     |
| HTTP 500                          | Internal Server Error        | 3,697     |
| SocketTimeoutException            | Timeout Exception            | 128       |
| HTTP 404                          | Not Found                    | 619       |
| NoHttpResponseException           | No Response from Server      | 5         |

- Despite the above issues, some request types maintained **high reliability**, including:
  - `logout-0`: 100% success
  - `Get JSESSIONID`: 99.09% success
  - `account balance`: 95.36% success


## 5. Visualized Data

- **Active Users Over Time**: A line chart showing how the number of active users varied throughout the test duration.  
<p align="center">
<img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Stress_Test/active_users_over_time.png" alt="Active Users Over Time" width="600">
</p>

<br>

- **Throughput Over Time**: A line chart indicating the rate of requests handled per second, reflecting system throughput.  
<p align="center">
<img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Stress_Test/throughput_over_time.png" alt="Throughput Over Time" width="600">
</p>

<br>

- **Success Rate Over Time**: A line chart displaying the percentage of successful requests over the course of the test.  
<p align="center">
<img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Stress_Test/success_rate_over_time.png" alt="Success Rate Over Time" width="600">
</p>

<br>

- **Response Times Over Time**: A line chart visualizing the variation in response times during the test period.  
<p align="center">
<img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Stress_Test/response_times_over_time.png" alt="Response Times Over Time" width="600">
</p>

<br>

- **Response Time Distribution**: A bar chart showing how response times were distributed across all requests.  
<p align="center">
<img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Stress_Test/response_time_distribution.png" alt="Response Time Distribution" width="600">
</p>

<br>

- **Response Time Statistics**: A summary graph displaying min, max, average, and standard deviation of response times.  
<p align="center">
<img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Stress_Test/response_time_stats.png" alt="Response Time Statistics" width="600">
</p>

<br>

- **Success Rate by Request Type**: A pie chart comparing success rates across different request types.  
<p align="center">
<img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Stress_Test/success_rate_by_request.png" alt="Success Rate by Request Type" width="600">
</p>

<br>

- **Requests by Type**: A bar chart showing the total number of requests made per type or endpoint.  
<p align="center">
<img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Stress_Test/requests_by_type.png" alt="Requests by Type" width="600">
</p>

<br>

- **Error Distribution**: A bar chart visualizing the types and counts of errors encountered during the test.  
<p align="center">
<img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Stress_Test/error_distribution.png" alt="Error Distribution" width="600">
</p>

<br>


## 6. Recommendations

1. **Investigate critical failure points**, particularly in the `register`, `create account`, and `billpay` requests, which showed success rates below 75%. These endpoints are crucial and need reliability improvements under load.

2. **Analyze error distribution and causes**, especially the high counts of HTTP 400, 500, and timeout-related errors. These indicate potential issues with input validation, server resource handling, or backend availability.

3. **Improve error handling and resilience**, ensuring users who encounter partial failures can recover gracefully or retry automatically where appropriate.

4. **Optimize server performance**, particularly for operations with high average response times such as `logout` (4499 ms), `login` (2449 ms), and `register` (2684 ms). Backend/database performance tuning may be required.

5. **Conduct further stress tests at higher user loads** (beyond 5,000 users), with longer durations, to uncover scalability thresholds and long-term stability.

6. **Monitor system capacity and scale dynamically**, especially during peak loads, using load balancers, database connection pooling, and horizontal scaling techniques.

7. **Ensure test data consistency and isolation**, particularly for operations like `create account` or `transfer`, where dependencies between data may cause conflicts or unexpected behavior during concurrent access.


## 7. Conclusion

The ParaBank system showed moderate resilience under stress, successfully handling over 61,000 requests with an overall success rate of **82.23%**. While core operations such as login, balance inquiries, and logout maintained high success rates, several critical functionalities—particularly `register`, `create account`, `deposit`, and `billpay`—suffered from substantial failure rates ranging between **25% to 45%**.

These issues indicate that while the system can manage concurrent users up to 5,000, it does experience performance degradation and functional instability under peak loads in specific workflows. Addressing these vulnerabilities is crucial to improve the overall reliability, user experience, and scalability of the application under real-world high-traffic scenarios.

Continued optimization and targeted testing of the most error-prone features are highly recommended as next steps.
