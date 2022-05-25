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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/TC120001/input_Address type HomeOffice_fld_username'), 'xa28326222222')

WebUI.setText(findTestObject('Object Repository/TC120001/input_Address type HomeOffice_fld_email'), 'xa28326222222@gmail.com')

WebUI.setText(findTestObject('Object Repository/TC120001/input_Address type HomeOffice_fld_password'), 'batch283!!')

WebUI.setText(findTestObject('Object Repository/TC120001/input_Address type HomeOffice_fld_cpassword'), 'batch283!!')

WebUI.setText(findTestObject('Object Repository/TC120001/input_Address type HomeOffice_dob'), '1/1/2020')

WebUI.setText(findTestObject('Object Repository/TC120001/input_Address type HomeOffice_phone'), '012345678')

WebUI.setText(findTestObject('Object Repository/TC120001/input_Address type HomeOffice_address'), 'Jln. H. Abdul Majid No.6')

WebUI.click(findTestObject('Object Repository/TC120001/input_Address type HomeOffice_add_type'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TC120001/select_Choose Gender                  Male _4c15ff'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC120001/select_Select CountryAfghanistanAlbaniaAlge_9a933d'), 
    '102', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC120001/select_Select StateAcehBaliBangka-BelitungB_c81dd0'), 
    '1673', true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC120001/select_Select CityCengkarengJakarta'), '21497', true)

WebUI.setText(findTestObject('Object Repository/TC120001/input_Address type HomeOffice_zip'), '12410')

WebUI.click(findTestObject('Object Repository/TC120001/input_Address type HomeOffice_terms'))

WebUI.click(findTestObject('Object Repository/TC120001/input'))

String text = WebUI.getText(findTestObject('TC120001/div_User is successfully Register. Now You _baeefb'))

if (text.contains('successfully Register')) {
    println('sukses')
} else {
    println('gagal')
}

WebUI.closeBrowser()

