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

WebUI.navigateToUrl('https://stage.mobipaid.com/en/Home/login')

WebUI.setText(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Login/input_MERCHANT LOGIN_email'), 'aang@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Login/input_MERCHANT LOGIN_password'), 
    'NJDkbljeEllVk/lHlXeAHg==')

WebUI.click(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Login/button_Login please wait'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Mobipaid  Merchant Dashboard/a_Customers'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Mobipaid  Merchant Dashboard/a_My Customers'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Mobipaid  Customer/a_Add'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Mobipaid  Customer/label_Mrs'))

WebUI.setText(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Mobipaid  Customer/input_First name_firstname'), 
    'Angelo')

WebUI.setText(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Mobipaid  Customer/input_Last name_lastname'), 
    '')

WebUI.click(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Mobipaid  Customer/input_Last name_lastname'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Mobipaid  Customer/label_Last name'))

WebUI.doubleClick(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Mobipaid  Customer/input_Last name_lastname'))

WebUI.setText(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Mobipaid  Customer/input_Last name_lastname'), 
    'Critian')

WebUI.click(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Mobipaid  Customer/input_Last name_lastname'))

WebUI.setText(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Mobipaid  Customer/input_Email_email'), 
    'angelocr@mail.com')

WebUI.click(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Mobipaid  Customer/div_Mobile number_iti__selected-flag'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Mobipaid  Customer/span_Indonesia'))

WebUI.setText(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Mobipaid  Customer/input_land Islands_form-control int_tel_input'), 
    '8833275835')

WebUI.setText(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Mobipaid  Customer/input_Address line 1_address_line1'), 
    'menteng')

WebUI.doubleClick(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Mobipaid  Customer/input_Address line 1_address_line1'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Mobipaid  Customer/span_Country'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Mobipaid  Customer/input_State  Province  Region_state_add'))

WebUI.click(findTestObject('Object Repository/Customer/Page_Customer_add customer/Page_Mobipaid  Customer/button_Save'))

WebUI.closeBrowser()

