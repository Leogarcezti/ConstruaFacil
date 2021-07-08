//1- Pacote
package webTests;

//2- Bibliotecas

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//3- Classe
public class seleniumSimples {
    //3.1 - Atributos

     WebDriver driver;                  //declar o objeto do Selenium WebDriver

    //3.2 - Métodos e Funções
   @BeforeMethod
   public void inicar(){
       //A- Início
       //Aponta para onde está o driver do Chrome
       System.setProperty("webdriver.chrome.driver", "drivers/chrome/91/chromedriver.exe");
       // Instancia o objeto driver com um controlador do Chrome
       driver =new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    }

    @AfterMethod
    public void finalizar(){
        driver.close();
        driver.quit();
    }

    @Test(priority = 1)
    public void consultarCursoMantis(){

               // B - Realizar o teste
        driver.get("https://www.iterasys.com.br"); //Abre o site alvo do teste
        driver.manage().window().setSize(new Dimension(1382, 744));
        driver.findElement(By.id("searchtext")).click();
        driver.findElement(By.id("searchtext")).clear();
        driver.findElement(By.id("searchtext")).sendKeys("mantis");

        driver.findElement(By.id("btn_form_search")).click();

        assertEquals(driver.findElement(By.cssSelector("h3")).getText(), "Cursos › \"mantis\""); //Mudar encoding para windows-1252
        //assertTrue(driver.findElement(By.cssSelector("h3")).getText().contains("mantis"));

        driver.findElement(By.cssSelector("span.comprar")).click();
        assertEquals(driver.findElement(By.cssSelector("span.item-title")).getText(), "Mantis");
        assertEquals(driver.findElement(By.cssSelector("span.new-price")).getText(), "R$ 49,99");


    }
    @Test(priority = 2, dependsOnMethods = {"consultarCursoMantis"})
    public void consultarCursoCTFL(){

          // B - Realizar o teste
        driver.get("https://www.iterasys.com.br"); //Abre o site alvo do teste
        driver.manage().window().setSize(new Dimension(1382, 744));

        driver.findElement(By.id("searchtext")).click();
        driver.findElement(By.id("searchtext")).clear();
        driver.findElement(By.id("searchtext")).sendKeys("preparatório ctfl");

        driver.findElement(By.id("btn_form_search")).click();

        assertEquals(driver.findElement(By.cssSelector("h3")).getText(), "Cursos › \"preparatório ctfl\""); //Mudar encoding para windows-1252
        //assertTrue(driver.findElement(By.cssSelector("h3")).getText().contains("mantis"));

        driver.findElement(By.cssSelector("span.comprar")).click();
        assertEquals(driver.findElement(By.cssSelector("span.item-title")).getText(), "Preparatório CTFL");
        assertEquals(driver.findElement(By.cssSelector("span.new-price")).getText(), "R$ 169,00");

    }
}
