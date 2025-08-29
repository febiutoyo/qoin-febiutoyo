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
import groovy.json.JsonSlurper as JsonSlurper

JsonSlurper parser = new JsonSlurper()

//ListUser

def responseListUser = WS.sendRequest(findTestObject('Object Repository/OR01-RequestListUser'), 
	FailureHandling.STOP_ON_FAILURE)

WS.verifyResponseStatusCode(responseListUser, 200)

def parserResponseListUser = parser.parseText(responseListUser.getResponseBodyContent())


//SingleUser

def responseSingleUser = WS.sendRequest(findTestObject('Object Repository/OR02-RequestSingleUser'))

WS.verifyResponseStatusCode(responseSingleUser, 200)

def parserResponseSingleUser = parser.parseText(responseSingleUser.getResponseBodyContent())


//Update

def name = 'Febiutoyo'

def job = 'Principal Software Engineer'

def responseUpdate = WS.sendRequest(findTestObject('OR03-Update', [('name') : name, ('job') : job]))

WS.verifyResponseStatusCode(responseUpdate, 200)

def parserResponseUpdate = parser.parseText(responseUpdate.getResponseBodyContent())

WS.verifyMatch(parserResponseUpdate.name, name, false)

WS.verifyMatch(parserResponseUpdate.job, job, false)


//RegisterSuccessful

def email = parserResponseSingleUser.data.email

def responseRegisterSuccessful = WS.sendRequest(findTestObject('Object Repository/OR04-RequestRegisterSuccess',
	[('email') : email]))

WS.verifyResponseStatusCode(responseRegisterSuccessful, 200)

def parserResponseRegisterSuccessful = parser.parseText(responseRegisterSuccessful.getResponseBodyContent())

WS.verifyNotEqual(parserResponseRegisterSuccessful.token, null)






