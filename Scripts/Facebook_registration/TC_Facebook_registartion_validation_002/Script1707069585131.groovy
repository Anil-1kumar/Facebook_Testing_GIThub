import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('www.facebook.com')

WebUI.click(findTestObject('TC_Facebook_registration_validation_002_OR/Page_Facebook  log in or sign up/Page_Facebook  log in or sign up/a_Create new account'))

WebUI.setText(findTestObject('TC_Facebook_registration_validation_002_OR/Page_Facebook  log in or sign up/Page_Facebook  log in or sign up/input_firstname'), 
    'anil')

WebUI.setText(findTestObject('TC_Facebook_registration_validation_002_OR/Page_Facebook  log in or sign up/Page_Facebook  log in or sign up/input_lastname'), 
    'chelimilla')

WebUI.selectOptionByLabel(findTestObject('TC_Facebook_registration_validation_002_OR/Page_Facebook  log in or sign up/Page_Facebook  log in or sign up/select_day'), 
    '9', true)

WebUI.selectOptionByValue(findTestObject('TC_Facebook_registration_validation_002_OR/Page_Facebook  log in or sign up/Page_Facebook  log in or sign up/select_month'), 
    '5', true)

WebUI.selectOptionByIndex(findTestObject('TC_Facebook_registration_validation_002_OR/Page_Facebook  log in or sign up/Page_Facebook  log in or sign up/select_year'), 
    '24')

WebUI.click(findTestObject('TC_Facebook_registration_validation_002_OR/Page_Facebook  log in or sign up/Page_Facebook  log in or sign up/label_Male'))

WebUI.click(findTestObject('TC_Facebook_registration_validation_002_OR/Page_Facebook  log in or sign up/Page_Facebook  log in or sign up/button_Sign Up'))

WebUI.closeBrowser()

