# 📊 Parabank APIs Test Report

---

 ### 🟢 Summary
   - **Total Tests:** `154`  
   - **Passed:** `145` ✅  
   - **Failed:** `9` ❌  
   - **Total Execution Time:** `17s 38ms`  
   - **Average Response Time:** `293ms`

---

 ### 🔗 Project Resources
 
  Here are direct links to key API testing resources within the project repository:
   
   - 📁 [Postman Collection File](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/blob/main/Parabank_APIs_Test/Parabank_APIs_Test.postman.json)  *Includes all API test requests and test scripts used for validating the Parabank services.*
   
   - 📄 [Postman Test Run Results (JSON)](https://github.com/Abdelrahman-AA/Automated-Testing-Framework/blob/main/Parabank_APIs_Test/Parabank_APIs_Test.postman_test_run.json)   *Raw test execution data including status codes, assertions, execution time, and request/response logs.*
   
   - 🧾 [HTML Test Report](https://Abdelrahman-AA.github.io/Automated-Testing-Framework/Parabank_APIs_Test/Parabank_APIs_Test.postman_test_run.html)   *A visual test report generated after executing the Postman collection, providing summary and detailed views.*

---

### 📌 Test Results

```
✅ PASSED - Parabank_Get_JSESSIONID (928ms)
✅ PASSED - parabank_Register_1 (269ms)
✅ PASSED - parabank_Login1_1 (328ms)
✅ PASSED - parabank_CleanDB (238ms)
✅ PASSED - parabank_Login1_2 (237ms)
✅ PASSED - parabank_Register_2 (244ms)
✅ PASSED - parabank_Login2_1 (247ms)
✅ PASSED - parabank_InitializeDB (445ms)
✅ PASSED - parabank_Login2_2 (257ms)
✅ PASSED - parabank_ShutdownJmsListener (746ms)
✅ PASSED - parabank_StartupJmsListener (240ms)
✅ PASSED - parabank_Register_F (238ms)
✅ PASSED - parabank_Register_WithRName (240ms)
✅ PASSED - parabank_Login_F (334ms)
✅ PASSED - parabank_UserByID (233ms)
✅ PASSED - parabank_cusomerUpdate (258ms)
✅ PASSED - parabank_loginOldUname (260ms)
✅ PASSED - parabank_loginNewUName (265ms)
✅ PASSED - parabank_CustomersAccounts (326ms)
✅ PASSED - parabank_Billpay (266ms)
✅ PASSED - parabank_CustomersAccounts_AfterBillpay (228ms)
✅ PASSED - parabank_ِAccountDeposit (227ms)
✅ PASSED - parabank_CAccountBalance_AfterDEposit (321ms)
✅ PASSED - parabank_AccountWithdraw (254ms)
✅ PASSED - parabank_CAccountBalance_AfterWithdrew (227ms)
✅ PASSED - parabank_CreateAccount_CHECKING (230ms)
✅ PASSED - parabank_CreateAccount_SAVINGS (240ms)
✅ PASSED - parabank_CreateAccount_LOAN (235ms)
✅ PASSED - parabank_CustomersAccounts after New Accounts (240ms)
✅ PASSED - parabank_Transfer (250ms)
✅ PASSED - parabank_CAccountBalance_AfterTransfer (261ms)
✅ PASSED - parabank_TransactionsAccount1 (259ms)
✅ PASSED - parabank_TransactionsAccount2 (240ms)
✅ PASSED - parabank_Transactions_WithAmount (225ms)
✅ PASSED - parabank_Transactions_WithMonth+Type (318ms)
❌ FAILED - parabank_Transactions_FromDateToDate (277ms)
❌ FAILED - parabank_Transactions_OnDate (320ms)
✅ PASSED - parabank_Transactions_byTransactionID (248ms)
❌ FAILED - parabank_RequestLoan (410ms)
✅ PASSED - parabank_SetParameter (231ms)
✅ PASSED - parabank_CustomerPositions (229ms)
✅ PASSED - parabank_BuyPosition (269ms)
✅ PASSED - parabank_positions_ByPoditionID (338ms)
✅ PASSED - parabank_CustomerPositions_2 (266ms)
❌ FAILED - parabank_Positions_by id within a date range (247ms)
❌ FAILED - parabank_SellPosition (278ms)
```

---

### 📌 Key Insights
✔ **High Success Rate:** `94.2%` of tests passed  
✔ **Fast Execution:** Average test response time under `300ms`  
❌ **Failures in Transaction & Loan Tests:** Possible validation issues  

---

### 📌 Next Steps
- **Investigate failed tests** (`9` total), especially `Transactions_FromDateToDate`, `RequestLoan`, and `SellPosition`.  
- **Review API response formats** to ensure correct data structures.  
- **Optimize slow requests** if needed.  

---

### 📌 **Overall, the API tests performed well with a high pass rate.** 
