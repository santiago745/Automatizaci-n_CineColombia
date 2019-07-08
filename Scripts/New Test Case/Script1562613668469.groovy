import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.cinecolombia.com/bogota/comidas')

WebUI.click(findTestObject('Object Repository/Page_COMIDAS  Cine Colombia SA/div_close'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_COMIDAS  Cine Colombia SA/a_Aceptar'))

WebUI.click(findTestObject('Object Repository/Page_COMIDAS  Cine Colombia SA/a_CINE FIESTAS'))

WebUI.setText(findTestObject('Object Repository/Page_COMIDAS  Cine Colombia SA/input__nombres_apellidos'), 'pepito perez')

WebUI.setText(findTestObject('Object Repository/Page_COMIDAS  Cine Colombia SA/input__email'), 'pepitoperez,12@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_COMIDAS  Cine Colombia SA/input__telefono'), '2846571')

WebUI.setText(findTestObject('Object Repository/Page_COMIDAS  Cine Colombia SA/input_Celular_celular'), '3002849127')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_COMIDAS  Cine Colombia SA/select_SeleccionarARMENIABARRANQUILLABOGOTBUCARAMANGACALICARTAGENAMANIZALESMEDELLNMONTERAPEREIRAIBAGUVILLAVICENCIOPOPAYN'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Page_COMIDAS  Cine Colombia SA/input_Capacidad requerida_cap_requerida'), 
    '2')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_COMIDAS  Cine Colombia SA/select_- Select -ARMENIABARRANQUILLABOGOTBUCARAMANGACALICARTAGENAMEDELLNPEREIRAVILLAVICENCIO'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Page_COMIDAS  Cine Colombia SA/label_Date'))

WebUI.click(findTestObject('Object Repository/Page_COMIDAS  Cine Colombia SA/a_24'))

WebUI.setText(findTestObject('Object Repository/Page_COMIDAS  Cine Colombia SA/input__cantidad_ninos'), '34')

WebUI.setText(findTestObject('Object Repository/Page_COMIDAS  Cine Colombia SA/input_Hora inicio_hora_inicio'), '7:30')

WebUI.setText(findTestObject('Page_COMIDAS  Cine Colombia SA/textarea_Comentarios_comentarios'), 'agradezco su atencion y colaboracion ')

