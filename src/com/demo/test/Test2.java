package com.demo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/***
 * 关于selenium的测试
 * 其实现在我好多东西都没有搞明白，这个selenium自动化测试有什么用的
 * 
 * 现在可以打开浏览器了哈
 * @author lenovo
 *
 */
public class Test2 {
	public static void main(String[] args) {
		System.out.println("自动化测试 test2");
		
		/*System.setProperty("webdriver.firefox.bin", "D:\\LearnSoft\\FireFox\\APK\\firefox.exe");
		WebDriver webDriver = new FirefoxDriver();
		System.out.println("TTT:"+webDriver.getCurrentUrl());*/
		
		StartFireFoxNotByDefault();
	}
	
	public static void StartFireFoxNotByDefault(){
        System.out.println("start firefox browser...");
        
        /**这里我一直打不了firefox浏览器，最后我在网上查资料得到应该是驱动版本的问题
         * 
         * 因为我下载的selenium rc的版本可能比较老了(我是从csdn上面下载下来的，应该比较老了哈)
         * firefox是直接在网上下载的最新版本
         * 我严重怀疑是不是这个原因导致的(后期可以用新版本的selenium jar包，浏览器的版本稍微用第一点的版本一般这样就可以了哈)
         * 参考资料
         * http://chqyu520.blog.163.com/blog/static/210399092201526101135328/
         * */
        //System.setProperty("webdriver.firefox.bin", "D:/LearnSoft/FireFox/APK/firefox.exe");
        //WebDriver driver = new FirefoxDriver();
        
        WebDriver driver = new InternetExplorerDriver ();  //ie
        Navigation navigation = driver.navigate();
        navigation.to("http://www.hao123.com/");
        System.out.println("start firefox browser succeed...");  
        System.out.println("TTT:"+driver.getCurrentUrl());
    }
}
