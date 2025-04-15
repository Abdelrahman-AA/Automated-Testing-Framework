# Automated Testing Framework

## Project Overview
This repository contains a comprehensive testing framework for the **Parabank** application ([https://parabank.parasoft.com/](https://parabank.parasoft.com/)). Our testing approach includes API testing, performance testing, and automated testing using Selenium.

## Team Members
- **Abdelrahman Abodief Mohamed**  
- **Areej Abdulkader Abdulkader Gouda**  
- **Alaa Shalaby AbdAllah**  
- **Doaa Azazy Salem**  
- **Marwan Mahmoud Hashem**  

## Testing Scope

### 1. API Testing (Postman)
- **Request & Response Validation:** Ensuring API correctness and reliability.
- **Error Handling:** Testing robustness in various scenarios.
- **Authentication & Authorization:** Validating security aspects.
  - [📊 View API Test Report](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/blob/main/reports/Parabank_APIs_Test_Report.md)

       - 📁 [Postman Collection File](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/blob/main/Parabank_APIs_Test/Parabank_APIs_Test.postman.json)
       - 📄 [Postman Test Run Results (JSON)](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/blob/main/Parabank_APIs_Test/Parabank_APIs_Test.postman_test_run.json)
       - 🧾 [HTML Test Report](https://Abdelrahman-AA.github.io/Automated-Testing-Framework/Parabank_APIs_Test/Parabank_APIs_Test.postman_test_run.html)

### 2. Performance Testing (JMETER)
- **Load Testing:** Evaluating system performance under high user load.
  - [📊 View Load Test Report](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/blob/main/reports/Parabank_Load_Test_Report.md)

       - 📁 [JMeter Load Test Files](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/blob/main/Parabank_Load_Test/Parabank_Load_Test.jmx)
       - 📄 [Load Test Results (CSV)](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/blob/main/Parabank_Load_Test/Parabank_Load_Test-Results.csv)
       - 📄 [Enhanced Test Results (Excel)](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/blob/main/Parabank_Load_Test/Parabank_Load_Test-enhanced_results.xlsx)
       - 📈 [Performance Graphs & Visual Analysis](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/tree/main/Parabank_Load_Test/Graphs)

- **Stress Testing:** Evaluating system performance under extreme user loads to find the breaking point.
  - [📊 View Stress Test Report](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/blob/main/reports/Parabank_Stress_Test_Report.md)

       - 📁 [JMeter Stress Test Files](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/blob/main/Parabank_Stress_Test/Parabank_Stress_Test.jmx)
       - 📄 [Stress Test Results (CSV)](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/blob/main/Parabank_Stress_Test/Parabank_Stress_Test-Result.csv)
       - 📄 [Enhanced Test Results (txt)](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/blob/main/Parabank_Stress_Test/Parabank_Stress_Test-e_result.txt)
       - 📈 [Performance Graphs & Visual Analysis](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/tree/main/Parabank_Stress_Test/Graphs)

### 3. Automated Testing (Selenium)
- **Automated Functional Tests:** Implementing scripts for key workflows.
  - [📊 View Parabank Automated Functional Test Report](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/blob/main/reports/Parabank_Automated_Functional_Test_Report.md)

       - 📁 [Test Files (Test Classes & Methods)](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/tree/main/Parabank_Automated_Functional_Test/Automated_Test/parabank/)
       - 📄 [HTML Test Report](https://abdelrahman-aa.github.io/Automated-Testing-Framework/Parabank_Automated_Functional_Test//Parabank_Automated_Functional_Test-Report.html)
       - 🖼️ [Passed Test Screenshots](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/tree/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED)
       - ❌ [Failed Test Screenshots](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/tree/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/FAILED)
       - 📈 [Graphs & Visual Analysis](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/blob/main/Parabank_Automated_Functional_Test/Graphs.png)

### 4. Continuous Integration (CI) and Continuous Delivery (CD) with (Jnkins)
- **Automated Build, Testing, and Reporting:** Setting up Jenkins pipelines for continuous integration, automated test execution, and generating detailed test reports.
  - **Test Reports and Field Test Screenshots:** View reports generated for automated test runs and field test results and screenshots captured during field tests for better analysis..
    - [📊 View Automated Test Reports and Field Test Screenshots](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/tree/main/Jenkins_Results)


## Documentation
- **GitHub Repo:** Managing project-related tasks and bugs.

## Repository Structure

```
/Parabank_APIs_Test                        # API testing using Postman
      ├── Parabank_APIs_Test.postman.json
      ├── Parabank_APIs_Test.postman_test_run.json
      └── Parabank_APIs_Test.postman_test_run.html

/Parabank_Load_Test                        # Load testing using JMeter
      ├── Parabank_Load_Test.jmx
      ├── parabank_Load_Test-Results.csv
      ├── Parabank_Load_Test-enhanced_results.xlsx
      └──Graphs/
          ├── response_by_request_plot_en.png
          ├── response_vs_users_plot_en.png
          └── ...more visual reports

/Parabank_Stress_Test                      # Stress testing using JMeter
      ├── Parabank_Stress_Test.jmx
      ├── Parabank_Stress_Test-Result.csv
      ├── Parabank_Stress_Test-e_result.txt
      └── Graphs/
          ├── active_users_over_time.png
          ├── error_distribution.png
          └── ...more visual reports

/Parabank_Automated_Functional_Test        # Automated functional testing using Selenium
      ├── Automated_Test/
      │    └── parabank/
      │         ├── src/
      │         │    ├── parabank/
      │         │    │    └── pages/
      │         │    │         └── ...pages - java files
      │         │    └── parabank_tests/
      │         │         └── tests/
      │         │              └── ...tests - java files
      │         ├── pom.xml
      │         ├── Run-testNg.xml
      │         └── test_data.xlsx
      ├── Screenshots For Passed and Failed Tests/
      │   ├── PASSED/
      │   │   └── ...screenshots for passed tests
      │   └── FAILED/
      │       └── ...screenshots for failed tests
      ├── Parabank_Automated_Functional_Test-Report.html
      └── Graphs.png

/reports                                   # Test execution reports
      ├── Parabank_APIs_Test_Report.md
      ├── Parabank_Load_Test_Report.md
      ├── Parabank_Stress_Test_Report.md
      └── Parabank_Automated_Functional_Test_Report.md
```

## License
This project is licensed under the Team License - see the [LICENSE](LICENSE.md) file for details.
