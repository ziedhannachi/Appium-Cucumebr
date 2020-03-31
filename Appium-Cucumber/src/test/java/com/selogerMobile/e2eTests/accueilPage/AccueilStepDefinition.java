package com.selogerMobile.e2eTests.accueilPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;


import com.selogerMobile.e2eTests.utility.Hook;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class AccueilStepDefinition {
	
private WebDriver driver;
	
	public AccueilStepDefinition() {
		this.driver = Hook.getDriver();
	}
	
	@Given("^Ouvrir l application$")
	public void ouvrir_l_application() throws Throwable {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@index='1']")).click();
		Thread.sleep(2000);

	}
	
	@And("^Verifier la page Accueil$")
	public void verifier_la_page_Accueil() throws Throwable {
	    
		String TextHomePage = driver.findElement(By.xpath("//*[@index='1']")).getText();
		System.out.println(TextHomePage);
		Assert.assertTrue(TextHomePage.contains("Que recherchez-vous ?"));
	}

	@When("^Cliquer sur le bouton Acheter$")
	public void cliquer_sur_le_bouton_Acheter() throws Throwable {
	    
		driver.findElement(By.xpath("//*[@text='Acheter']")).click();
		Thread.sleep(5000);
	}

	@Then("^la page s affiche$")
	public void la_page_s_affiche() throws Throwable {
	   
		System.out.println("La page de 'Acheter' s'affiche");
	}
}