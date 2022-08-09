package com.aqm.staf.library.PageKeyWord;

import com.aqm.framework.core.TestData;
import com.aqm.framework.entities.ExecutionTestSteps;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.aqm.framework.core.CustomAssert;
import com.aqm.framework.core.TestData;
import com.aqm.framework.entities.ExecutionTestSteps;
import com.aqm.staf.library.pages.common.LoginPage;
import com.aqm.staf.library.pages.common.NiaDashboard;
import com.aqm.staf.library.pages.common.NiaHealth;
import com.aqm.staf.library.pages.common.NiaLoginPage;
import com.aqm.staf.library.pages.common.NiaPolicyInformation;
import com.aqm.staf.library.pages.common.NiaProposalForm;
import com.aqm.staf.library.pages.common.NiapremiumCalc;
import com.aqm.staf.library.pages.common.OrangeHrm;
import com.aqm.testing.testDataEntity.LoginEntity;
import com.aqm.testing.testDataEntity.NiaDashboardEntity_TNIA;
import com.aqm.testing.testDataEntity.NiaHealthEntity;
import com.aqm.testing.testDataEntity.NiaLoginPageEntity_TNIA;
import com.aqm.testing.testDataEntity.NiaPolicyInformationEntity_TNIA;
import com.aqm.testing.testDataEntity.NiaProposalFromEntity;
import com.aqm.testing.testDataEntity.NiapremiumCalcEntity;
import com.aqm.testing.testDataEntity.OrangeHrmEntity;

public class FarmerKeyword {
	public void NiaLoginPageDetails(TestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup) throws Exception {
		System.out.println(" inside NiaLoginPageDetails");
		List<NiaLoginPageEntity_TNIA> NiaLoginPageEntityList = testData.getData().get(NiaLoginPageEntity_TNIA.class);
		for (NiaLoginPageEntity_TNIA niaLoginPageEntity : NiaLoginPageEntityList) {
			if ((niaLoginPageEntity.getAction().equalsIgnoreCase("add") || niaLoginPageEntity.getAction().equalsIgnoreCase("edit")) && niaLoginPageEntity.getStepGroup().equalsIgnoreCase(stepGroup)) {
				NiaLoginPage niaLoginPage = new NiaLoginPage(driver, "NiaLoginPage");
				niaLoginPage.fillandSubmitNIALoginDetails(niaLoginPageEntity, assertReference, testData, stepGroup);
			}
		}
	}
	public void NiaDashboardDetails(TestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup) throws Exception {
		System.out.println(" inside NiaDashboardDetails ");
		List<NiaDashboardEntity_TNIA> NiaDashboardEntityList = testData.getData().get(NiaDashboardEntity_TNIA.class);
		for (NiaDashboardEntity_TNIA niaDashboardEntity : NiaDashboardEntityList) {
			if ((niaDashboardEntity.getAction().equalsIgnoreCase("add") || niaDashboardEntity.getAction().equalsIgnoreCase("edit")) && niaDashboardEntity.getStepGroup().equalsIgnoreCase(stepGroup)) {
				NiaDashboard niaDashboard = new NiaDashboard(driver, "NiaDashboard");
				niaDashboard.fillandSubmitDashboard(niaDashboardEntity, assertReference, testData, stepGroup);
			}
		}
	}
	
	public void NiaPolicyInformationDEtails(TestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup) throws Exception {
		List<NiaPolicyInformationEntity_TNIA> NiaPolicyHolderInformationEntity = testData.getData().get(NiaPolicyInformationEntity_TNIA.class);
		for (NiaPolicyInformationEntity_TNIA niaPolicyHolderInformationEntity : NiaPolicyHolderInformationEntity) {
			if ((niaPolicyHolderInformationEntity.getAction().equalsIgnoreCase("add") || niaPolicyHolderInformationEntity.getAction().equalsIgnoreCase("edit")) && niaPolicyHolderInformationEntity.getStepGroup().equalsIgnoreCase(stepGroup)) {
				NiaPolicyInformation niaPolicyHolderInformation = new NiaPolicyInformation(driver, "NiaPolicyInformation");
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
	public void OrangeHrmDetails(TestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup) throws Exception {
		List<OrangeHrmEntity> OrangeHrmEntity = testData.getData().get(OrangeHrmEntity.class);
		for (OrangeHrmEntity orangeHrmEntity : OrangeHrmEntity) {
			if ((orangeHrmEntity.getAction().equalsIgnoreCase("add") || orangeHrmEntity.getAction().equalsIgnoreCase("edit")) && orangeHrmEntity.getStepGroup().equalsIgnoreCase(stepGroup)) {
				OrangeHrm orangeHrm = new OrangeHrm(driver, "NiaHealth");
				orangeHrm.fillandSubmitLoginDetails(orangeHrmEntity, assertReference, testData, stepGroup);
			}
		}
	}
	
}
