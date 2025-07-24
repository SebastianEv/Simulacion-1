package com;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Miprimerasimulacion {
	  WebDriver driver;
	  

	    @Before
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "./src/test/resources/Driver/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }
	    @Test
	    public void miprimeraprueba() {
	        driver.get("https://demoqa.com/text-box");

	        WebElement nombre = driver.findElement(By.id("userName"));
	        WebElement email = driver.findElement(By.id("userEmail"));
	        WebElement direccionActual = driver.findElement(By.id("currentAddress"));
	        WebElement direccionPermanente = driver.findElement(By.id("permanentAddress"));
	        WebElement botonEnviar = driver.findElement(By.id("submit"));

	        nombre.sendKeys("Ramon Quiros");
	        email.sendKeys("RamonQuiros@guniversidad.com");
	        direccionActual.sendKeys("San jose");
	        direccionPermanente.sendKeys("Heredia");
	        botonEnviar.click();
	     
	    }  

	    @Test
	    public void misegundaprueba() {
	    	driver.get("https://www.saucedemo.com");

	   
	        driver.findElement(By.id("user-name")).sendKeys("standard_user");
	        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	        driver.findElement(By.id("login-button")).click();
	        driver.findElement(By.id("item_4_title_link")).click();
	        driver.findElement(By.id("add-to-cart")).click();
	        driver.findElement(By.className("shopping_cart_link")).click();
	        driver.findElement(By.id("checkout")).click();
	        driver.findElement(By.id("first-name")).sendKeys("Eduardo");
	        driver.findElement(By.id("last-name")).sendKeys("Quiros");
	        driver.findElement(By.id("postal-code")).sendKeys("10101");
	        driver.findElement(By.className("cart_button")).click();
	        driver.findElement(By.className("cart_button")).click();

     
	
	    }


	    @Test
	    public void miterceraprueba() {
	    	driver.get("https://www.saucedemo.com");

	 	   
	        driver.findElement(By.id("user-name")).sendKeys("standard_user");
	        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	        driver.findElement(By.id("login-button")).click();
	        driver.findElement(By.id("item_4_title_link")).click();
	        driver.findElement(By.id("add-to-cart")).click();
	        driver.findElement(By.id("back-to-products")).click();
	        driver.findElement(By.id("item_2_title_link")).click();
	        driver.findElement(By.id("add-to-cart")).click();
	        driver.findElement(By.id("back-to-products")).click();
	        driver.findElement(By.id("item_3_title_link")).click();
	        driver.findElement(By.id("add-to-cart")).click();
	        driver.findElement(By.className("shopping_cart_link")).click();
	        driver.findElement(By.id("checkout")).click();
	        driver.findElement(By.id("first-name")).sendKeys("Eduardo");
	        driver.findElement(By.id("last-name")).sendKeys("Quiros");
	        driver.findElement(By.id("postal-code")).sendKeys("10101");
	        driver.findElement(By.className("cart_button")).click();
	        driver.findElement(By.className("cart_button")).click();
	    }

	    @Test
	    public void micuartaprueba() {
	    	driver.get("https://www.saucedemo.com");

		 	   
	        driver.findElement(By.id("user-name")).sendKeys("standard_user");
	        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	        driver.findElement(By.id("login-button")).click();
	        driver.findElement(By.id("item_0_title_link")).click();
	        driver.findElement(By.id("add-to-cart")).click();
	        driver.findElement(By.id("back-to-products")).click();
	        driver.findElement(By.id("item_2_title_link")).click();
	        driver.findElement(By.id("add-to-cart")).click();
	        driver.findElement(By.className("shopping_cart_link")).click();
	        driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
	    }

	    @Test
	    public void miquintaprueba() {
	    	 driver.get("https://demoqa.com/automation-practice-form");
	    	 
	    	  driver.findElement(By.id("firstName")).sendKeys("Eduardo");
		        driver.findElement(By.id("lastName")).sendKeys("Quiros");
		        driver.findElement(By.id("userEmail")).sendKeys("EduardoQuiros01@universidad.com");
		        driver.findElement(By.cssSelector("label[for='gender-radio-1']")).click();
		        driver.findElement(By.id("userNumber")).sendKeys("9834234584");
		        driver.findElement(By.id("subjectsContainer")).click();
		        driver.findElement(By.id("subjectsInput")).sendKeys("English");
		        driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
		        driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).click();
		        String rutaImagen = System.getProperty("user.dir") + "/src/test/resources/Imagen/descarga.jpeg";
		        driver.findElement(By.id("uploadPicture")).sendKeys(rutaImagen);
		        driver.findElement(By.id("currentAddress")).sendKeys("Heredia");
		        driver.findElement(By.id("state")).click();
		        driver.findElement(By.cssSelector("#state input")).sendKeys("NCR", Keys.ENTER);
		        driver.findElement(By.id("city")).click();
		        driver.findElement(By.cssSelector("#city input")).sendKeys("Delhi", Keys.ENTER);
		        driver.findElement(By.id("submit")).click();

;

	    }

	    @Test
	    public void misextaprueba() {
	    	driver.get("https://www.saucedemo.com");

	 	   
	        driver.findElement(By.id("user-name")).sendKeys("standard_user");
	        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	        driver.findElement(By.id("login-button")).click();
	        driver.findElement(By.id("item_3_title_link")).click();
	        driver.findElement(By.id("add-to-cart")).click();
	        driver.findElement(By.className("shopping_cart_link")).click();
	        driver.findElement(By.id("checkout")).click();
	        driver.findElement(By.id("first-name")).sendKeys("Eduardo");
	        driver.findElement(By.id("last-name")).sendKeys("Calvo");
	        driver.findElement(By.id("postal-code")).sendKeys("75634");
	        driver.findElement(By.className("cart_button")).click();
	        driver.findElement(By.className("cart_button")).click();

	      

	    }

	   @After
	    public void tearDown() {
	        driver.quit();
	    }
	}