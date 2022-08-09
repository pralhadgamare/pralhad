package com.aqm.staf.library.PageKeyWord;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.aqm.framework.core.CustomAssert;
import com.aqm.framework.core.TestData;
import com.aqm.framework.entities.ExecutionTestSteps;
import com.aqm.staf.library.pages.common.CustomerMaintancePage;
import com.aqm.staf.library.pages.common.Homepages;
import com.aqm.staf.library.pages.common.LoginPage;
import com.aqm.staf.library.pages.common.NiaDashboard;
import com.aqm.staf.library.pages.common.NiaHealth;
import com.aqm.staf.library.pages.common.NiaLoginPage;
import com.aqm.staf.library.pages.common.NiaPolicyHolderInformation;
import com.aqm.staf.library.pages.common.NiaProposalForm;
import com.aqm.staf.library.pages.common.NiaSanjeevani;
import com.aqm.staf.library.pages.common.NiaSanjeevaniPremCalc;
import com.aqm.staf.library.pages.common.NiapremiumCalc;
import com.aqm.staf.library.pages.common.OrangeHrm;
import com.aqm.staf.library.pages.common.SanjeevaniProposalform;
import com.aqm.testing.testDataEntity.CustomerMaintanceEntity;
import com.aqm.testing.testDataEntity.DashboardEntity;
import com.aqm.testing.testDataEntity.HomeEntity;
import com.aqm.testing.testDataEntity.LoginEntity;
import com.aqm.testing.testDataEntity.NiaDashboardEntity;
import com.aqm.testing.testDataEntity.NiaHealthEntity;
import com.aqm.testing.testDataEntity.NiaLoginPageEntity;
import com.aqm.testing.testDataEntity.NiaPolicyHolderInformationEntity;
import com.aqm.testing.testDataEntity.NiaProposalFromEntity;
import com.aqm.testing.testDataEntity.NiaSanjeevaniEntity;
import com.aqm.testing.testDataEntity.NiaSanjeevaniPremCalcEntity;
import com.aqm.testing.testDataEntity.NiapremiumCalcEntity;
import com.aqm.testing.testDataEntity.OrangeHrmEntity;
import com.aqm.testing.testDataEntity.SanjeevaniProposalformEntity;

public class PageKeyWord {

	// ---------example-------
	public void loginDetailsPage(TestData testData, ExecutionTestSteps executionTestStep, CustomAssert assertReference,
			WebDriver driver, String stepGroup) throws Exception {
		List<LoginEntity> LoginEntityList = testData.getData().get(LoginEntity.class);
		for (LoginEntity LoginEntity : LoginEntityList) {
			if ((LoginEntity.getAction().equalsIgnoreCase("add") || LoginEntity.getAction().equalsIgnoreCase("edit"))
					&& LoginEntity.getStepGroup().equalsIgnoreCase(stepGroup)) {
				LoginPage loginPage = new LoginPage(driver, "Login Page");
				loginPage.fillandSubmitLoginDetails(LoginEntity, assertReference, testData, stepGroup);
			}
		}
	}

	
	public void homePageDetails(TestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup) throws Exception {
		List<HomeEntity> homeEntityList = testData.getData().get(HomeEntity.class);
		for (HomeEntity homeEntity : homeEntityList) {
			if ((homeEntity.getAction().equalsIgnoreCase("add") || homeEntity.getAction().equalsIgnoreCase("edit")) && homeEntity.getStepGroup().equalsIgnoreCase(stepGroup)) {
				Homepages homepages = new Homepages(driver, "Homepages");
				homepages.fillandSubmitHomeDetails(homeEntity, assertReference, testData, stepGroup);
			}
		}
	}
	public void CustomerMaintancePageDetails(TestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup) throws Exception {
		List<CustomerMaintanceEntity> customerMaintanceEntityList = testData.getData().get(CustomerMaintanceEntity.class);
		for (CustomerMaintanceEntity customerMaintanceEntity : customerMaintanceEntityList) {
			if ((customerMaintanceEntity.getAction().equalsIgnoreCase("add") || customerMaintanceEntity.getAction().equalsIgnoreCase("edit")) && customerMaintanceEntity.getStepGroup().equalsIgnoreCase(stepGroup)) {
				CustomerMaintancePage customerMaintancePage = new CustomerMaintancePage(driver, "CustomerMaintancePage");
				customerMaintancePage.fillandSubmitCustomerMAinDeatils(customerMaintanceEntity, assertReference, testData, stepGroup);
			}
		}
	}
	
	public void NiaLoginPageDetails(TestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup) throws Exception {
		List<NiaLoginPageEntity> NiaLoginPageEntityList = testData.getData().get(NiaLoginPageEntity.class);
		for (NiaLoginPageEntity niaLoginPageEntity : NiaLoginPageEntityList) {
			if ((niaLoginPageEntity.getAction().equalsIgnoreCase("add") || niaLoginPageEntity.getAction().equalsIgnoreCase("edit")) && niaLoginPageEntity.getStepGroup().equalsIgnoreCase(stepGroup)) {
				NiaLoginPage niaLoginPage = new NiaLoginPage(driver, "NiaLoginPage");
				niaLoginPage.fillandSubmitNIALoginDetails(niaLoginPageEntity, assertReference, testData, stepGroup);
			}
		}
	}
	public void NiaDashboardDetails(TestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup) throws Exception {
		List<NiaDashboardEntity> NiaDashboardEntityList = testData.getData().get(NiaDashboardEntity.class);
		for (NiaDashboardEntity niaDashboardEntity : NiaDashboardEntityList) {
			if ((niaDashboardEntity.getAction().equalsIgnoreCase("add") || niaDashboardEntity.getAction().equalsIgnoreCase("edit")) && niaDashboardEntity.getStepGroup().equalsIgnoreCase(stepGroup)) {
				NiaDashboard niaDashboard = new NiaDashboard(driver, "NiaDashboard");
				niaDashboard.fillandSubmitDashboard(niaDashboardEntity, assertReference, testData, stepGroup);
			}
		}
	}
	
	public void NiaPolicyHolderInformationDetails(TestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup) throws Exception {
		List<NiaPolicyHolderInformationEntity> NiaPolicyHolderInformationEntity = testData.getData().get(NiaPolicyHolderInformationEntity.class);
		for (NiaPolicyHolderInformationEntity niaPolicyHolderInformationEntity : NiaPolicyHolderInformationEntity) {
			if ((niaPolicyHolderInformationEntity.getAction().equalsIgnoreCase("add") || niaPolicyHolderInformationEntity.getAction().equalsIgnoreCase("edit")) && niaPolicyHolderInformationEntity.getStepGroup().equalsIgnoreCase(stepGroup)) {
				NiaPolicyHolderInformation niaPolicyHolderInformation = new NiaPolicyHolderInformation(driver, "NiaPolicyHolderInformation");
				niaPolicyHolderInformation.fillandSubmiNiaPolicyDeatails(niaPolicyHolderInformationEntity, assertReference, testData, stepGroup);
			}
		}
	}
	public void NiaHealthDetails(TestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup) throws Exception {
		List<NiaHealthEntity> NiaHealthEntity = testData.getData().get(NiaHealthEntity.class);
		for (NiaHealthEntity niaHealthEntity : NiaHealthEntity) {
			if ((niaHealthEntity.getAction().equalsIgnoreCase("add") || niaHealthEntity.getAction().equalsIgnoreCase("edit")) && niaHealthEntity.getStepGroup().equalsIgnoreCase(stepGroup)) {
				NiaHealth niaHealth = new NiaHealth(driver, "NiaHealth");
				niaHealth.fillandSubmitHealth(niaHealthEntity, assertReference, testData, stepGroup);
			}
		}
	}
	
	public void NiapremiumCalcDetails(TestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup) throws Exception {
		List<NiapremiumCalcEntity> NiapremiumCalcEntity = testData.getData().get(NiapremiumCalcEntity.class);
		for (NiapremiumCalcEntity niapremiumCalcEntity : NiapremiumCalcEntity) {
			if ((niapremiumCalcEntity.getAction().equalsIgnoreCase("add") || niapremiumCalcEntity.getAction().equalsIgnoreCase("edit")) && niapremiumCalcEntity.getStepGroup().equalsIgnoreCase(stepGroup)) {
				NiapremiumCalc niapremiumCalc = new NiapremiumCalc(driver, "NiaHealth");
				niapremiumCalc.fillandSubmitpremiumCalc(niapremiumCalcEntity, assertReference, testData, stepGroup);
			}
		}
	}
	
	public void NiaProposalFormDetails(TestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup) throws Exception {
		List<NiaProposalFromEntity> NiaProposalFromEntity = testData.getData().get(NiaProposalFromEntity.class);
		for (NiaProposalFromEntity niaProposalFromEntity : NiaProposalFromEntity) {
			if ((niaProposalFromEntity.getAction().equalsIgnoreCase("add") || niaProposalFromEntity.getAction().equalsIgnoreCase("edit")) && niaProposalFromEntity.getStepGroup().equalsIgnoreCase(stepGroup)) {
				NiaProposalForm niaProposalForm = new NiaProposalForm(driver, "NiaHealth");
				niaProposalForm.fillandSubmitNiaProposalForm(niaProposalFromEntity, assertReference, testData, stepGroup);
			}
		}
	}
	
	public void NiaSanjeevaniDetails(TestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup) throws Exception {
		List<NiaSanjeevaniEntity> NiaSanjeevaniEntity = testData.getData().get(NiaSanjeevaniEntity.class);
		for (NiaSanjeevaniEntity niaSanjeevaniEntity : NiaSanjeevaniEntity) {
			if ((niaSanjeevaniEntity.getAction().equalsIgnoreCase("add") || niaSanjeevaniEntity.getAction().equalsIgnoreCase("edit")) && niaSanjeevaniEntity.getStepGroup().equalsIgnoreCase(stepGroup)) {
				NiaSanjeevani niaSanjeevani = new NiaSanjeevani(driver, "NiaHealth");
				niaSanjeevani.fillandSubmitSanjeevani(niaSanjeevaniEntity, assertReference, testData, stepGroup);
			}
		}
	}
	public void NiaSanjeevaniPremCalcDetails(TestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup) throws Exception {
		List<NiaSanjeevaniPremCalcEntity> NiaSanjeevaniPremCalcEntity = testData.getData().get(NiaSanjeevaniPremCalcEntity.class);
		for (NiaSanjeevaniPremCalcEntity niaSanjeevaniPremCalcEntity : NiaSanjeevaniPremCalcEntity) {
			if ((niaSanjeevaniPremCalcEntity.getAction().equalsIgnoreCase("add") || niaSanjeevaniPremCalcEntity.getAction().equalsIgnoreCase("edit")) && niaSanjeevaniPremCalcEntity.getStepGroup().equalsIgnoreCase(stepGroup)) {
				NiaSanjeevaniPremCalc niaSanjeevaniPremCalc = new NiaSanjeevaniPremCalc(driver, "NiaHealth");
				niaSanjeevaniPremCalc.fillandSubmitpremiumCalc1(niaSanjeevaniPremCalcEntity, assertReference, testData, stepGroup);
			}
		}
	}
	public void SanjeevaniProposalformDetails(TestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup) throws Exception {
		List<SanjeevaniProposalformEntity> SanjeevaniProposalformEntity = testData.getData().get(SanjeevaniProposalformEntity.class);
		for (SanjeevaniProposalformEntity sanjeevaniProposalformEntity : SanjeevaniProposalformEntity) {
			if ((sanjeevaniProposalformEntity.getAction().equalsIgnoreCase("add") || sanjeevaniProposalformEntity.getAction().equalsIgnoreCase("edit")) && sanjeevaniProposalformEntity.getStepGroup().equalsIgnoreCase(stepGroup)) {
				SanjeevaniProposalform sanjeevaniProposalform = new SanjeevaniProposalform(driver, "NiaHealth");
				sanjeevaniProposalform.fillandSubmitsanjeevani(sanjeevaniProposalformEntity, assertReference, testData, stepGroup);
			}
		}
	}
	public void OrangeHrmDetails(TestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup) throws Exception {
		List<OrangeHrmEntity> OrangeHrmEntity = testData.getData().get(OrangeHrmEntity.class);
		for (OrangeHrmEntity orangeHrmEntity : OrangeHrmEntity) {
			if ((orangeHrmEntity.getAction().equalsIgnoreCase("add") || orangeHrmEntity.getAction().equalsIgnoreCase("edit")) && orangeHrmEntity.getStepGroup().equalsIgnoreCase(stepGroup)) {
				OrangeHrm orangeHrm = new OrangeHrm(driver, "NiaHealth");
				orangeHrm.fillandSubmitLoginDetails(orangeHrmEntity, assertReference, testData, stepGroup);
			}
		}
	}
	
	

	/*
	 * //DEPENDENCY CODE public void
	 * DependencyForCIFNoInApplicationSearch(CreateProspectEntity
	 * createProspectEntity,TestData testData){
	 * if(createProspectEntity.getStringValueForField("DependencyForCIFNo")!=null){
	 * List<ApplicationSearchEntity>
	 * applicationSearchEntity=testData.getObjectByReference(testData.getData().get(
	 * ApplicationSearchEntity.class),
	 * createProspectEntity.getStringValueForField("DependencyForCIFNo"));
	 * for(ApplicationSearchEntity
	 * applicationSearchEntityList:applicationSearchEntity){
	 * applicationSearchEntityList.setStringValueForField("CIFNumber",
	 * createProspectEntity.getStringValueForField("CIFNumber"));
	 * testData.updateRecordsForCriteria(applicationSearchEntityList);
	 * FrameworkServices.logMessage("CIF Dependency Update SuccessFully"); } } }
	 * 
	 * public void DependencyForCIFNoInApplicationWorkList(CreateProspectEntity
	 * createProspectEntity,TestData testData){
	 * if(createProspectEntity.getStringValueForField(
	 * "DependencyForCIFNoForAppWorkList")!=null){ List<ApplicationWorkListEntity>
	 * applicationWorkLIstEntity=testData.getObjectByReference(testData.getData().
	 * get(ApplicationWorkListEntity.class),
	 * createProspectEntity.getStringValueForField(
	 * "DependencyForCIFNoForAppWorkList")); for(ApplicationWorkListEntity
	 * applicationWorkListEntityList:applicationWorkLIstEntity){
	 * applicationWorkListEntityList.setStringValueForField("CIFNumber",
	 * createProspectEntity.getStringValueForField("CIFNumber"));
	 * testData.updateRecordsForCriteria(applicationWorkListEntityList);
	 * FrameworkServices.
	 * logMessage("CIF Dependency Update SuccessFully For ApplicationWorkList"); } }
	 * 
	 * }
	 */

}
