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

WebUI.callTestCase(findTestCase('1.2. Register/Register'), [('username') : username, ('email') : email, ('password') : password
        , ('repassword') : repassword, ('dob') : dob, ('phone') : phone, ('address') : address, ('gender') : gender, ('country') : country
        , ('state') : state, ('city') : city, ('zipcode') : zipcode], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/1.3. Login/TC130001/label_Login'))

WebUI.setText(findTestObject('Object Repository/1.3. Login/TC130001/input_Login__txtUserName'), username)

WebUI.setText(findTestObject('Object Repository/1.3. Login/TC130001/input_Login__txtPassword'), password)

WebUI.click(findTestObject('Object Repository/1.3. Login/TC130001/input_Login_terms'))

WebUI.click(findTestObject('Object Repository/1.3. Login/TC130001/input'))

WebUI.verifyElementPresent(findTestObject('Object Repository/1.3. Login/TC130001/a_logout'), 0)

