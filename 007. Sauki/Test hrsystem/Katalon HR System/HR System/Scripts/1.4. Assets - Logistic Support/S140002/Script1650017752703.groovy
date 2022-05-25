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

WebUI.callTestCase(findTestCase('1.4. Assets - Logistic Support/S140001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/1.4. Assets - Logistic Support/a_Add Logistic Support'))

WebUI.click(findTestObject('1.4. Assets - Logistic Support/span_Choose a Category'))

WebUI.click(findTestObject('1.4. Assets - Logistic Support/li_Laptop T10'))

WebUI.click(findTestObject('1.4. Assets - Logistic Support/span_Choose a Category_1'))

WebUI.click(findTestObject('1.4. Assets - Logistic Support/li_Project X23'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1.4. Assets - Logistic Support/select_Demo Task Title for TestingIni Task _c857b2'), 
    '2', true)

WebUI.click(findTestObject('1.4. Assets - Logistic Support/span_Choose a Category3'))

WebUI.setText(findTestObject('Object Repository/1.4. Assets - Logistic Support/input_Start Date_startdate'), '2020-04-11')

WebUI.setText(findTestObject('Object Repository/1.4. Assets - Logistic Support/input_End Date_enddate'), '2020-04-12')

WebUI.setText(findTestObject('Object Repository/1.4. Assets - Logistic Support/input_Assign Qty_assignqty'), '5')

WebUI.setText(findTestObject('Object Repository/1.4. Assets - Logistic Support/textarea_Remarks_remarks'), 'ludo')

WebUI.click(findTestObject('Object Repository/1.4. Assets - Logistic Support/button_Submit'))

WebUI.verifyTextPresent('Successfully Updated', false)

WebUI.closeBrowser()

