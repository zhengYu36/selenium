package com.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/***
 * 测试通过selenium打开指定的浏览器后，然后去读取自己指定的页面中的数据
 *
 */
public class ReadHtmDemo {

	private static WebDriver driver = null;

	static{
		System.out.println("init webdriver");
		driver = new InternetExplorerDriver(); // 打开ie
		Navigation navigation = driver.navigate();  //C:\Users\lenovo\Desktop\学习\svg
		navigation.to("http://www.cnblogs.com/zyw-205520/p/3421687.html");
		System.out.println("start firefox browser succeed...");
		
		System.out.println("TTT");
		WebElement element = driver.findElement(By.id("MathJax_Message")); //得到其中的元素
		System.out.println(element.getText());
	}


	public static void main(String[] args) {
		/*System.out.println("TTT");
		WebElement element = driver.findElement(By.id("MathJax_Message")); //得到其中的元素
		System.out.println(element.getText());*/
	}
}
