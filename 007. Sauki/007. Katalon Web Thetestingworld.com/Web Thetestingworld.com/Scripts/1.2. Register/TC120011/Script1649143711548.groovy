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

WebUI.navigateToUrl('https://thetestingworld.com/testings/index.php')

WebUI.verifyElementHasAttribute(findTestObject('TC120003/input_Address type HomeOffice_fld_username'), 'required', 0)

WebUI.verifyElementHasAttribute(findTestObject('TC120003/input_Address type HomeOffice_fld_email'), 'required', 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementHasAttribute(findTestObject('TC120003/input_Address type HomeOffice_fld_password'), 'required', 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementHasAttribute(findTestObject('TC120003/input_Address type HomeOffice_fld_cpassword'), 'required', 0)

WebUI.verifyElementHasAttribute(findTestObject('TC120003/select_Choose Gender                  Male _4c15ff'), 'required', 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC120011/select_Select CountryAfghanistanAlbaniaAlge_9a933d'), 
    '102', true)

WebUI.verifyElementNotPresent(findTestObject('TC120001/div_User is successfully Register. Now You _baeefb'), 0)

WebUI.click(findTestObject('Object Repository/TC120011/input'))

WebUI.closeBrowser()

