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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://202.159.35.218:9090/hrsystem/')

WebUI.setText(findTestObject('1.2. Employees - Edit Employees - Bank Account/input_Remember Me_email'), 'superadmin@mail.com')

WebUI.setEncryptedText(findTestObject('1.2. Employees - Edit Employees - Bank Account/input_Remember Me_password'), 'p4y+y39Ir5Pc2g9xt3QkeQ==')

WebUI.click(findTestObject('1.2. Employees - Edit Employees - Bank Account/button_Log In'))

WebUI.verifyElementPresent(findTestObject('1.2. Employees - Edit Employees - Bank Account/h3_Dashboard'), 0)

WebUI.delay(3)

