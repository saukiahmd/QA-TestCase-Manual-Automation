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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Object Repository/Pencarian_DataFiles/input_Kategori_css-ubsgp5 e110g5pc0'), keywordSearch)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Pencarian_DataFiles/button_Kategori_css-1czin5k e1v32nag1'))

WebUI.click(findTestObject('Object Repository/Pencarian_DataFiles/div_Bisa pilih alamat pengirimanmu dulu_unf_c11ad3'))

String text = WebUI.getText(findTestObject('Pencarian_DataFiles/div_Menampilkan 1 - 60 barang dari total 16_180726'))

if (text.contains('Apakah yang kamu maksud')) {
    println('produk ditemukan dan muncul rekomendasi')
} else if (text.contains('total')) {
    println('produk ditemukan')
} else {
    println('produk tidak ditemukan')
}

WebUI.closeBrowser()

