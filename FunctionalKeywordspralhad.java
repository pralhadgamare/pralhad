package com.aqm.staf.library;

import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.aqm.framework.core.CustomAssert;
import com.aqm.framework.core.FrameworkServices;
import com.aqm.framework.core.StepWiseExecution;
import com.aqm.framework.core.TestData;
import com.aqm.framework.entities.ExecutionTestSteps;
import com.aqm.framework.entities.TestScenario;
import com.aqm.framework.exceptions.UndefinedKeywordException;
import com.aqm.staf.library.PageKeyWord.AccountingKeyword;
import com.aqm.staf.library.PageKeyWord.ClaimKeyWord;
import com.aqm.staf.library.PageKeyWord.FarmerKeyword;
import com.aqm.staf.library.PageKeyWord.LocationKeyWord;
import com.aqm.staf.library.PageKeyWord.PartyKeyWord;
import com.aqm.staf.library.PageKeyWord.PolicyKeyWord;
import com.aqm.staf.library.PageKeyWord.SecurityKeyword;
import com.aqm.staf.library.pages.common.ApplicationHomePage;
import com.aqm.staf.library.pages.common.LogOut;
import com.aqm.staf.library.pages.common.LoginPage;
import com.aqm.staf.library.pages.common.LoginPageReinsurance;
import com.aqm.staf.library.pages.common.PartyKeyWordReinsurance;
import com.aqm.staf.library.pages.common.PolicyKeywordReinsurance;
import com.aqm.testing.testDataEntity.LoginEntity;
import com.aqm.testing.testDataEntity.LoginEntityReinsurance;

public class FunctionalKeywords extends BasePage implements StepWiseExecution{
	public static Properties prop;
	private InputStream input;
	private  String stepGroup;

	public void executeStep(TestScenario testScenario, ExecutionTestSteps executionTestStep, TestData testData, WebDriver driver, CustomAssert assertReference) throws Exception {
		String keyword = executionTestStep.getExecutionTestStepMasterAutomationScriptStepKeyword();
		System.out.println("keyword<>>"+keyword);
//		String configData = executionTestStep.getExecutionTestStepMasterAutomationScriptStepConfigData();
		int stepNumber=executionTestStep.getExecutionTestStepMasterAutomationScriptStepExecutionSequence();
		stepGroup = executionTestStep.getExecutionTestStepMasterAutomationScriptStepStepGroup();
		FrameworkServices.logMessage("<B><u>StepNumber-</u>"+stepNumber+"<i><Font Color = /'#00008B/'> Executing :"+keyword+" </Font></i></B>");

		int skipStepsInExecution= Integer.parseInt(FrameworkServices.getConfigurationPropertie().getProperty("skipSteps"));
		
		if (stepNumber>=skipStepsInExecution || keyword.equalsIgnoreCase("LoginUser") ){
			//if(executionTestStep.getExecutionTestStepMasterAutomationScriptStepSkipStep().equalsIgnoreCase("no") || allStepExecutionMode){
			if (keyword.equalsIgnoreCase("LoginUser") ) {

				List<LoginEntity> loginEntities = testData.getData().get(LoginEntity.class);
				LoginEntity login=loginEntities.get(0);
				LoginPage loginPage = new LoginPage(driver, "Login Page");
				loginPage.fillandSubmitLoginDetails(login, assertReference,testScenario);
				ApplicationHomePage homePage = new ApplicationHomePage(driver, "Application Home Page");
				homePage.verifyHomePage();

			}
			else if (keyword.equalsIgnoreCase("LoginReinsuranceUser") ) {
				List<LoginEntityReinsurance> ReinsuranceloginEntities = testData.getData().get(LoginEntityReinsurance.class);
				LoginEntityReinsurance login=ReinsuranceloginEntities.get(0);
				LoginPageReinsurance loginPage = new LoginPageReinsurance(driver, "Login Page");
				loginPage.fillandSubmitLoginDetails(login, assertReference, testScenario);
				
			}
			
			
			else if(keyword.equalsIgnoreCase("CreatePartyReinsurance"))
			{
				PartyKeyWordReinsurance partyKeyWord=new PartyKeyWordReinsurance();
				partyKeyWord.createParty(testData, executionTestStep, assertReference,driver,stepGroup);
				
			}
			else if(keyword.equalsIgnoreCase("createReinsurancePolicy"))
			{
				PolicyKeywordReinsurance policyKeywordReinsurance=new PolicyKeywordReinsurance();
				policyKeywordReinsurance.createReinsurancePolicy(testData, executionTestStep, assertReference,driver,stepGroup);
				
			}
			else if(keyword.equalsIgnoreCase("VerifyReinsurancePolicy"))
			{
				PolicyKeywordReinsurance policyKeywordReinsurance=new PolicyKeywordReinsurance();
				policyKeywordReinsurance.VerifyReinsurancePolicy(testData, executionTestStep, assertReference,driver,stepGroup);
				
			}
			/*else if (keyword.equalsIgnoreCase("Script1_Step1")) {
				System.out.println("Step001");
			}
			else if (keyword.equalsIgnoreCase("Script1_Step2")) {
				System.out.println("Step002");
			}
			else if (keyword.equalsIgnoreCase("Script1_Step3")) {
				System.out.println("Step003");
			}
			else if (keyword.equalsIgnoreCase("Script1_Step4")) {
				System.out.println("Step004");
			}*/
			else if (keyword.equalsIgnoreCase("CreateParty")) {
				PartyKeyWord partyKeyWord=new PartyKeyWord();
				partyKeyWord.createParty(testData, executionTestStep, assertReference,driver,stepGroup);
			}
			else if (keyword.equalsIgnoreCase("VerifyParty")) {
				PartyKeyWord partyKeyWord=new PartyKeyWord();
				partyKeyWord.verifyParty(testData, executionTestStep, assertReference,driver,stepGroup);
			}		
			else if (keyword.equalsIgnoreCase("EditParty")){
				PartyKeyWord partyKeyWord=new PartyKeyWord();
				partyKeyWord.editParty(testData, executionTestStep, assertReference,driver,stepGroup);
			}
	
			// Policy Keyword
			else if (keyword.equalsIgnoreCase("CreatePolicy")) {
				PolicyKeyWord policyKeyWord= new PolicyKeyWord();
				policyKeyWord.createPolicy(testData, executionTestStep, assertReference, driver,stepGroup);
			}
			
			else if (keyword.equalsIgnoreCase("EditPolicy"))
			{
				PolicyKeyWord policyKeyWord= new PolicyKeyWord();
				policyKeyWord.editPolicy(testData, executionTestStep, assertReference, driver,stepGroup);
			}
			else if (keyword.equalsIgnoreCase("VerifyPolicy")) {
				PolicyKeyWord policyKeyWord= new PolicyKeyWord();
				policyKeyWord.verifyPolicy(testData, executionTestStep, assertReference, driver,stepGroup);
			}
			
			else if (keyword.equalsIgnoreCase("CreateLocation")) {
				LocationKeyWord locationKeyWord=new LocationKeyWord();
				locationKeyWord.createLocation(testData, executionTestStep, assertReference, driver,stepGroup);
			}
			else if (keyword.equalsIgnoreCase("EditLocation")) {
				LocationKeyWord locationKeyWord=new LocationKeyWord();
				locationKeyWord.editPartyLocation(testData, executionTestStep, assertReference, driver,stepGroup);
			}
			else if (keyword.equalsIgnoreCase("VerifyLocation")) {
				LocationKeyWord locationKeyWord=new LocationKeyWord();
				locationKeyWord.verifyPartyLocation(testData, executionTestStep, assertReference, driver,stepGroup);
			}
			//Claim Keyword
			else if (keyword.equalsIgnoreCase("CreateClaim")) {
				ClaimKeyWord claimKeyWord= new ClaimKeyWord();
				claimKeyWord.createClaim(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			else if (keyword.equalsIgnoreCase("EditClaim")) {
				ClaimKeyWord claimKeyWord= new ClaimKeyWord();
				claimKeyWord.editClaim(testData, executionTestStep, assertReference, driver,stepGroup);
			
			}
			else if (keyword.equalsIgnoreCase("VerifyClaim")) {
				ClaimKeyWord claimKeyWord= new ClaimKeyWord();
				claimKeyWord.verifyClaim(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			//@ akshata
			else if (keyword.equalsIgnoreCase("CreateAccounting")) {
				AccountingKeyword accountingKeyword=new  AccountingKeyword();
				accountingKeyword.createAccounting(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			else if (keyword.equalsIgnoreCase("EditAccounting")) {
				AccountingKeyword accountingKeyword=new  AccountingKeyword();
				accountingKeyword.editAccounting(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			else if (keyword.equalsIgnoreCase("VerifyAccounting")) {
				AccountingKeyword accountingKeyword=new  AccountingKeyword();
				accountingKeyword.verifyAccounting(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			// Create RI Contract
			else if (keyword.equalsIgnoreCase("CreateRIContract")) {
				AccountingKeyword accountingKeyword=new  AccountingKeyword();
				accountingKeyword.verifyAccounting(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			else if (keyword.equalsIgnoreCase("LogOutUser")) {
				LogOut logOut= new  LogOut(driver, "Log Out");
				logOut.navigateToLoginPage();
			}
			else if (keyword.equalsIgnoreCase("LoginUser2")) {
				List<LoginEntity> loginEntities = testData.getData().get(LoginEntity.class);
				LoginPage loginPage = new LoginPage(driver, "Login Page");
				LoginEntity login=loginEntities.get(1);
				driver.navigate().refresh();
				loginPage.fillandSubmitLoginDetails(login, assertReference,testScenario);
				ApplicationHomePage homePage = new ApplicationHomePage(driver, "Application Home Page");
				homePage.verifyHomePage();
			}
			else if (keyword.equalsIgnoreCase("SecurityPage")) {
				SecurityKeyword securityKeyword= new  SecurityKeyword();
				securityKeyword.createSuperuser(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			
			else if (keyword.equalsIgnoreCase("NiaLoginPageDetails")) {
				System.out.println("keyword>>"+keyword);
				FarmerKeyword fk=new FarmerKeyword();
				fk.NiaLoginPageDetails(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			else if (keyword.equalsIgnoreCase("NiaDashboardDetails")) {
				System.out.println("inside>>"+keyword);
				FarmerKeyword fk=new FarmerKeyword();
				fk.NiaDashboardDetails(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			else if (keyword.equalsIgnoreCase("NiaPolicyInformationDEtails")) {
				
				FarmerKeyword fk=new FarmerKeyword();
				fk.NiaPolicyInformationDEtails(testData, executionTestStep, assertReference, driver, stepGroup);
			}
else if (keyword.equalsIgnoreCase("NiaHealthDetails")) {
				
				FarmerKeyword fk=new FarmerKeyword();
				fk.NiaHealthDetails(testData, executionTestStep, assertReference, driver, stepGroup);
			}
else if (keyword.equalsIgnoreCase("NiapremiumCalcDetails")) {
	
	FarmerKeyword fk=new FarmerKeyword();
	fk.NiapremiumCalcDetails(testData, executionTestStep, assertReference, driver, stepGroup);
}
else if (keyword.equalsIgnoreCase("NiaProposalFormDetails")) {
	
	FarmerKeyword fk=new FarmerKeyword();
	fk.NiaProposalFormDetails(testData, executionTestStep, assertReference, driver, stepGroup);
}
else if (keyword.equalsIgnoreCase("OrangeHrmDetails")) {
	
	FarmerKeyword fk=new FarmerKeyword();
	fk.OrangeHrmDetails(testData, executionTestStep, assertReference, driver, stepGroup);
}
			
			
			else {
				throw new UndefinedKeywordException("Keyword : " + keyword + " undefined.");
			}	
		}
	}
}
