package com.juaracoding.tesday15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Postday15 {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\juaracoding\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://shop.demoqa.com/");
            System.out.println("get URL");
            driver.manage().window().maximize();
            System.out.println("Maximize Browser");
            System.out.println("Delay 3 second");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }