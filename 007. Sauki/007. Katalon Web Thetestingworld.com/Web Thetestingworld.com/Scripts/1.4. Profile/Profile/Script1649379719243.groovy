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

WebUI.callTestCase(findTestCase('1.3. Login/Login'), [('username') : username, ('email') : email, ('password') : password
        , ('repassword') : repassword, ('dob') : dob, ('phone') : phone, ('address') : address, ('gender') : gender, ('country') : country
        , ('state') : state, ('city') : city, ('zipcode') : zipcode], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/1.4. Profile/TC140001/input_Password_fld_password'), password_regis)

WebUI.setText(findTestObject('Object Repository/1.4. Profile/TC140001/input_Date of birth_dob'), dob_regis)

WebUI.setText(findTestObject('Object Repository/1.4. Profile/TC140001/input_Phone_phone'), phone_regis)

WebUI.selectOptionByValue(findTestObject('Object Repository/1.4. Profile/TC140001/select_Choose Gender                  Male _4c15ff'), 
    gender_regis, true)

WebUI.click(findTestObject('Object Repository/1.4. Profile/TC140001/input_HomeOffice_add_type'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1.4. Profile/TC140001/select_Select Country                      _8cd27e'), 
    country_regis, true)

WebUI.delay(4)

WebUI.selectOptionByValue(findTestObject('Object Repository/1.4. Profile/TC140001/select_Select StateBuenos AiresCatamarcaCha_e6a64e'), 
    state_regis, true)

WebUI.delay(4)

WebUI.selectOptionByValue(findTestObject('Object Repository/1.4. Profile/TC140001/select_Select CityEldoradoOberaPosadas'), 
    city_regis, true)

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/1.4. Profile/TC140001/input_Address_address'), address_regis)

WebUI.setText(findTestObject('Object Repository/1.4. Profile/TC140001/input_Zip Code_zip'), zipcode_regis)

WebUI.click(findTestObject('Object Repository/1.4. Profile/TC140001/button_Update Profile'))

WebUI.click(findTestObject('Object Repository/1.4. Profile/TC140001/div_Profile updated successfully'))

WebUI.closeBrowser()

