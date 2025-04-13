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


## Documentation
- **GitHub Issues:** Managing project-related tasks and bugs.

## Repository Structure
```
/Parabank_APIs_Test                 # API testing using Postman
/Parabank_Automated_Functional_Test # Automated functional testing using Selenium
/Parabank_Load_Test                 # Load testing using JMeter
/Parabank_Stress_Test               # Stress testing using JMeter
/reports                            # Test execution reports
```
```
/Parabank_APIs_Test                 # API testing using Postman
├── Parabank_APIs_Test.postman_collection.json
├── Parabank_APIs_Test.postman_environment.json
├── Parabank_APIs_Test.postman_test_run.html

/Parabank_Automated_Functional_Test # Automated functional testing using Selenium
├── src/
│   └── main/
│       └── java/
│           └── parabank/
│               ├── pages/
│               ├── tests/
│               └── utils/
├── testng.xml
├── screenshots/
│   └── (test execution screenshots)

/Parabank_Load_Test                 # Load testing using JMeter
├── Parabank_Load_Test.jmx
├── Parabank_Load_Test-Results.csv
├── Parabank_Load_Test-enhanced_results.xlsx
├── Graphs/
│   ├── ResponseTimeGraph.png
│   ├── ThroughputGraph.png
│   └── ...more visual reports

/Parabank_Stress_Test               # Stress testing using JMeter
├── Parabank_Stress_Test.jmx
├── Parabank_Stress_Test-Results.csv
├── Parabank_Stress_Test-enhanced_results.xlsx
├── Graphs/
│   ├── ErrorRateGraph.png
│   ├── CPU_UsageGraph.png
│   └── ...more visual reports

/reports                            # Test execution reports for all modules
├── FunctionalTest_Report.html
├── APIs_Test_Report.html
├── LoadTest_Report.xlsx
└── StressTest_Report.xlsx
```

## License
This project is licensed under the Team License - see the [LICENSE](LICENSE.md) file for details.
