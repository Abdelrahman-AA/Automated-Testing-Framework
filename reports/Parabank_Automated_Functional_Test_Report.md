# Parabank Functional Automation Test Report

**Toolset**: Selenium WebDriver + TestNG    
**Report Type**: Functional Automated Testing  

---

## Overview

This report documents the automated functional tests performed on the [Parabank](http://parabank.parasoft.com) banking web application using Selenium WebDriver and TestNG. The test scenarios were designed to cover core banking functionalities including user registration, login, profile updates, account operations, transactions, and loan requests.

---

## 🔗 Project Resources

Here are direct links to key resources within the project repository:

- 📁 [Test Files (Test Classes & Methods)](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/tree/main/Parabank_Automated_Functional_Test/Automated_Test/parabank.rar)
- 📄 [HTML Test Report](https://abdelrahman-aa.github.io/Automated-Testing-Framework/Parabank_Automated_Functional_Test//Parabank_Automated_Functional_Test-Report.html)
- 🖼️ [Passed Test Screenshots](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/tree/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED)
- ❌ [Failed Test Screenshots](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/tree/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/FAILED)
- 📊 [Graphs & Visual Analysis](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/blob/main/Parabank_Automated_Functional_Test/Graphs.png)


---

## Test Summary

| **Metric**               | **Value**                  |
|--------------------------|:--------------------------:|
| **Total Test Scenarios** | 14                         |
| **Total Test Cases**     | 78                         |
| **Passed**               | 77 ✅                      |
| **Failed**               | 1 ❌                       |
| **Success Rate**         | 98.7%                      |
| **Execution Time**       | ~3 minutes and 59 seconds  |

---

## Graphs and Visualizations

- `Test Summary Pie`: Pass vs Fail Ratio  
- `Timeline Chart`: Execution Timeline
<p align="center">
<img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Graphs.png" alt="Graphs" width="1000">
</p>

<br>

---

## Scenario Execution Details

### Scenario 1: Verify Application Readiness (Home and Register Pages)  
**Result**: ✅ Passed

**Steps**:
1. Navigate to the ParaBank homepage  
2. Verify that the homepage loads successfully  
3. Click on "Register"  
4. Verify that the registration page loads successfully
   
**Screenshot**:
<p align="center">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_1_CheckWebsiteIsReadyForTest_openHomePage_PASSED_20250412_200234.png" alt="Graphs" width="500" style="display:inline-block; margin-right: 10px;">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_1_CheckWebsiteIsReadyForTest_openRegisterPage_PASSED_20250412_200236.png" alt="Another Graph" width="500" style="display:inline-block;">
</p>

---

### Scenario 2: Register a New User and Log Out  
**Result**: ✅ Passed

**Steps**:
1. Go to "Register" page  
2. Fill in user details with valid data  
3. Submit the form  
4. Verify registration success  
5. Log out  
6. Confirm redirection to homepage
   
**Screenshot**:
<p align="center">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_2_RegisterNewUserAndLogOut_RegisterWith_ValidData_PASSED_20250412_200249.png" alt="Graphs" width="500" style="display:inline-block; margin-right: 10px;">
</p>

---

### Scenario 3: Login and Logout With Valid Data 
**Result**: ✅ Passed

**Steps**:
1. Go to ParaBank homepage  
2. Enter valid username and password  
3. Click "Log In"  
4. Verify that the customer account page is loaded  
5. Click "Log Out"  
6. Confirm redirection to home page
   
**Screenshot**:
<p align="center">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_3_LoginAndLogoutFromHomePage_logIn_PASSED_20250412_200258.png" alt="Graphs" width="500" style="display:inline-block; margin-right: 10px;">
</p> 

---

### Scenario 4: Forgot Login Information  
**Result**: ✅ Passed

**Steps**:
1. Navigate to "Forgot Login Info"  
2. Enter customer details  
3. Submit form  
4. Verify correct credentials are displayed
   
**Screenshot**:
<p align="center">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_4_ForgetLoginInformation_openLoginInformation_PASSED_20250412_200306.png" alt="Graphs" width="500" style="display:inline-block; margin-right: 10px;">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_4_ForgetLoginInformation_checkUNameAndPassword_PASSED_20250412_200311.png" alt="Another Graph" width="500" style="display:inline-block;">
</p>

---

### Scenario 5: Update User Profile and Verify Changes
**Result**: ✅ Passed

**Steps**:
1. Login  
2. Open "Update Profile"  
3. Change first name  
4. Save and verify success message  
5. Log out and log back in  
6. Confirm name update persists
   
**Screenshot**:
<p align="center">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_5_UpdateUserProfileAndVerifyChanges_editFirsName_ValidData_PASSED_20250412_200324.png" alt="Graphs" width="500" style="display:inline-block; margin-right: 10px;">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_5_UpdateUserProfileAndVerifyChanges_openUUpdateContactInfoPage_2_PASSED_20250412_200330.png" alt="Another Graph" width="500" style="display:inline-block;">
</p> 

---

### Scenario 6: Open New CHECKING Account  
**Result**: ✅ Passed

**Steps**:  
1. Login  
2. Navigate to "Open New Account"  
3. Select "CHECKING" and submit  
4. Confirm account creation
   
**Screenshot**:
<p align="center">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_6_OpenNew_CHECKING_Accounts_goTo_OpenNewAccountPage_PASSED_20250412_200340.png" alt="Graphs" width="500" style="display:inline-block; margin-right: 10px;">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_6_OpenNew_CHECKING_Accounts_checkNewCHECKINGAccountIsOpened_PASSED_20250412_200343.png" alt="Another Graph" width="500" style="display:inline-block;">
</p>  

---

### Scenario 7: Open New SAVINGS Account  
**Result**: ✅ Passed

**Steps**:
1. Login  
2. Navigate to "Open New Account"  
3. Select "SAVINGS" and submit  
4. Confirm account creation
   
**Screenshot**:
<p align="center">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_7_OpenNew_SAVINGS_Accounts_goTo_OpenNewAccountPage_PASSED_20250412_200353.png" alt="Graphs" width="500" style="display:inline-block; margin-right: 10px;">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_7_OpenNew_SAVINGS_Accounts_checkNewSAVINGSAccountIsOpened_PASSED_20250412_200355.png" alt="Another Graph" width="500" style="display:inline-block;">
</p>  

---

### Scenario 8: Bill Payment Process  
**Result**: ✅ Passed

**Steps**:
1. Login  
2. Open "Bill Pay" page  
3. Enter payee details and amount  
4. Submit payment  
5. Verify success message
   
**Screenshot**:
<p align="center">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_8_BillPaymentProcess_goTo_BillPayPage_PASSED_20250412_200405.png" alt="Graphs" width="500" style="display:inline-block; margin-right: 10px;">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_8_BillPaymentProcess_doBillPay_ValidAmount_PASSED_20250412_200411.png" alt="Another Graph" width="500" style="display:inline-block;">
</p>

---

### Scenario 9: Transfer Funds and Verify  
**Result**: ✅ Passed

**Steps**:
1. Login  
2. Open "Transfer Funds"  
3. Enter transfer details  
4. Submit and verify confirmation  
5. Open "Accounts Overview"  
6. Access account details and verify transfer
   
**Screenshot**:
<p align="center">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_9_TransferAmountAndVerifyAccountsOverviewAndDetails_checkSuccessfulTransferTheAmount_PASSED_20250412_200423.png" alt="Graphs" width="500" style="display:inline-block; margin-right: 10px;">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_9_TransferAmountAndVerifyAccountsOverviewAndDetails_checkTransactionDetailsPageIsOpened_PASSED_20250412_200429.png" alt="Another Graph" width="500" style="display:inline-block;">
</p> 

---

### Scenario 10: Search Transactions by Transaction ID  
**Result**: ❌ Failed

**Steps**:
1. Login  
2. Navigate to "Find Transactions"  
3. Enter a known Transaction ID  
4. Submit and verify transaction appears
   
**Issue**:  
```java
java.lang.AssertionError: expected [true] but found [false]
at tests.Scenario_10_SearchTransactionsById.foundTransactionById(Scenario_10_SearchTransactionsById.java:43)
```

**Screenshot**:
<p align="center">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_10_SearchTransactionsById_goTo_FindTransactionsPage_PASSED_20250412_200441.png" alt="Graphs" width="500" style="display:inline-block; margin-right: 10px;">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/FAILED/Scenario_10_SearchTransactionsById_foundTransactionById_FAILED_20250412_200503.png" alt="Another Graph" width="500" style="display:inline-block;">
</p>  

---

### Scenario 11: Search Transactions by Date  
**Result**: ✅ Passed

**Steps**:
1. Login  
2. Navigate to "Find Transactions"  
3. Enter a date  
4. Verify correct transactions are displayed
   
**Screenshot**:
<p align="center">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_11_SearchTransactionsByTransactionDate_goTo_FindTransactionsPage_PASSED_20250412_200513.png" alt="Graphs" width="500" style="display:inline-block; margin-right: 10px;">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_11_SearchTransactionsByTransactionDate_foundTransactionById_PASSED_20250412_200527.png" alt="Another Graph" width="500" style="display:inline-block;">
</p> 

---

### Scenario 12: Search Transactions by Date Range  
**Result**: ✅ Passed

**Steps**:
1. Login  
2. Navigate to "Find Transactions"  
3. Enter a from/to date range  
4. Verify results match
   
**Screenshot**:
<p align="center">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_12_SearchTransactionsByDateRange_goTo_FindTransactionsPage_PASSED_20250412_200537.png" alt="Graphs" width="500" style="display:inline-block; margin-right: 10px;">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_12_SearchTransactionsByDateRange_foundTransactionById_PASSED_20250412_200550.png" alt="Another Graph" width="500" style="display:inline-block;">
</p> 

---

### Scenario 13: Search Transactions by Amount  
**Result**: ✅ Passed

**Steps**:
1. Login  
2. Navigate to "Find Transactions"  
3. Search by amount  
4. Verify correct results
   
**Screenshot**:
<p align="center">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_13_SearchTransactionsByTransactionAmount_goTo_FindTransactionsPage_PASSED_20250412_200601.png" alt="Graphs" width="500" style="display:inline-block; margin-right: 10px;">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_13_SearchTransactionsByTransactionAmount_foundTransactionById_PASSED_20250412_200614.png" alt="Another Graph" width="500" style="display:inline-block;">
</p>  

---

### Scenario 14: Request a Loan  
**Result**: ✅ Passed

**Steps**:
1. Login  
2. Navigate to "Request Loan"  
3. Fill in loan details  
4. Submit and confirm approval
   
**Screenshot**:
<p align="center">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_14_RequestLoanAndVerifyApproval_openRequestLoanPage_PASSED_20250412_200624.png" alt="Graphs" width="500" style="display:inline-block; margin-right: 10px;">
  <img src="https://raw.githubusercontent.com/Abdelrahman-AA/Automated-Testing-Framework/main/Parabank_Automated_Functional_Test/Screenshots%20For%20Passed%20and%20Failed%20Tests/PASSED/Scenario_14_RequestLoanAndVerifyApproval_requestLoan_PASSED_20250412_200626.png" alt="Another Graph" width="500" style="display:inline-block;">
</p> 

---

## Observations

- All functionalities passed except one.  
- Scenario 10 failed due to An Internal Error Has Occurred and has been Logged.  
- Recommendation: Check logs for that transaction before re-execution.
