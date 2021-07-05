import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class PrimerTest {

    public WebDriver getNetflixDriver(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com");
        return driver;
    }
    public WebDriver getdrDriver(String url{
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com");
        return driver;
    }

    @Test
    public void primerosTest(){
        WebDriver driver= getNetflixDriver();
        driver.manage().window().maximize(); //maximiza la pantalla
       // driver.close();//cierra el browser
        //driver.quit();//cierra el browser
        System.out.println("El titulo de la pagina es: " +driver.getTitle());
        System.out.println("La url de la página es: " + driver.getCurrentUrl());
        WebElement elementoh1= driver.findElement(By.tagName("h1"));
        System.out.println("H1: " + elementoh1.getText());
        //traigo una lista de h1
        List<WebElement>listah1=driver.findElements(By.tagName("h1"));
        System.out.println("La cantidad de h1 es: " + listah1.size());
        for (WebElement H1: listah1){
            System.out.println("H1 es: " + H1.getText());
        }

        System.out.println("xxxxxxxxxxxxxxx xxxxxxxxxxxxxxxx");
        List<WebElement> listaLink= driver.findElements(By.tagName("a"));
        System.out.println("La cantidad de link es: " + listaLink.size());
        for (WebElement link:listaLink){

            System.out.println("------>" + link.getText());
        }

        System.out.println("xxxxxxxxxxxxxxx xxxxxxxxxxxxxxxx");



    }
    @Test
    public void spotifyTest(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.spotify.com");

        System.out.println(driver.getTitle());
        if (driver.getTitle().equals("Escuchar es todo - Spotify")) {
            System.out.println("TestPassed");
        } else{
                System.out.println("test Failed");

            }

            }
}
