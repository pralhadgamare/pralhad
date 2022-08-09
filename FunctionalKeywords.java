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

import com.aqm.staf.library.PageKeyWord.PageKeyWord;

public class FunctionalKeywords extends PageKeyWord implements StepWiseExecution {
	public static Properties prop;
	private InputStream input;
	private String stepGroup;
	static int step = 0;

	public void executeStep(TestScenario testScenario, ExecutionTestSteps executionTestStep, TestData testData,
			WebDriver driver, CustomAssert assertReference) throws Exception {

		String keyword = executionTestStep.getExecutionTestStepMasterAutomationScriptStepKeyword();
		int stepNumber = executionTestStep.getExecutionTestStepMasterAutomationScriptStepExecutionSequence();
		stepGroup = executionTestStep.getExecutionTestStepMasterAutomationScriptStepStepGroup();
		FrameworkServices.logMessage("<B><u>StepNumber-</u>" + stepNumber + "<i><Font Color = /'#00008B/'> Executing :"
				+ keyword + " </Font></i></B>");
		
		int skipStepsInExecution = Integer
				.parseInt(FrameworkServices.getConfigurationPropertie().getProperty("skipSteps"));
		step = stepNumber;

		if (stepNumber >= skipStepsInExecution) // || keyword.equalsIgnoreCase("LoginUser")
		{
			System.out.println("Keyword=" + keyword);

			if (keyword.equalsIgnoreCase("LoginPage")) {
				loginDetailsPage(testData, executionTestStep, assertReference, driver, stepGroup);
			} else if (keyword.equalsIgnoreCase("fillHomepageDetals")) {
				homePageDetails(testData, executionTestStep, assertReference, driver, stepGroup);
			}else if (keyword.equalsIgnoreCase("fillCustomerMAinDetails")) {
				 CustomerMaintancePageDetails(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			else if (keyword.equalsIgnoreCase("NiaLoginPage")) {
				NiaLoginPageDetails(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			else if (keyword.equalsIgnoreCase("NiaDashboard")) {
				NiaDashboardDetails(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			else if (keyword.equalsIgnoreCase("NiaPolicyHolderInformation")) {
				NiaPolicyHolderInformationDetails(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			else if (keyword.equalsIgnoreCase("NiaHealth")) {
				NiaHealthDetails(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			else if (keyword.equalsIgnoreCase("NiapremiumCalc")) {
				NiapremiumCalcDetails(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			else if (keyword.equalsIgnoreCase("NiaProposalForm")) {
				NiaProposalFormDetails(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			else if (keyword.equalsIgnoreCase("NiaSanjeevani")) {
				NiaSanjeevaniDetails(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			else if (keyword.equalsIgnoreCase("NiaSanjeevaniPremCalc")) {
				NiaSanjeevaniPremCalcDetails(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			else if (keyword.equalsIgnoreCase("SanjeevaniProposalform")) {
				SanjeevaniProposalformDetails(testData, executionTestStep, assertReference, driver, stepGroup);
			}
			else if (keyword.equalsIgnoreCase("OrangeHrm")) {
				OrangeHrmDetails(testData, executionTestStep, assertReference, driver, stepGroup);
			}

		}

	}
}
