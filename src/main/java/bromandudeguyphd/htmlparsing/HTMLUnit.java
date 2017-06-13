/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bromandudeguyphd.htmlparsing;

import com.gargoylesoftware.htmlunit.BrowserVersion;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.HtmlElement;

import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import java.util.Scanner;

public class HTMLUnit {
    
    
    public static void main(String[] args){

    }
    
    
        public static String imgid(String url) throws Exception {
        java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
        java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);
        
        WebClient webClient = new WebClient(BrowserVersion.CHROME);
        webClient.getOptions().setJavaScriptEnabled(true);

        // Get the first page
        HtmlPage page1 = webClient.getPage("https://www.captionbot.ai/");

        final HtmlElement button = page1.getFirstByXPath("//*[@id=\"idTextSubmitButton\"]");
        final HtmlTextInput textField = page1.getFirstByXPath("//*[@id=\"idTextField\"]");

        textField.setValueAttribute(url);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        // Now submit the form by clicking the button and get back the second page.
        final HtmlPage page2 = button.click();

        
        try {
            Thread.sleep(8000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        DomElement element = page2.getFirstByXPath("//*[@id=\"captionLabel\"]");

        if(element.asText().isEmpty() ){
            return "Something went wrong";
        }
        
        else{
            return element.asText();
        }
    }
        
        
    public String steamGauge(String username) throws Exception {
             
             
        java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
        java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);
        
        WebClient webClient = new WebClient(BrowserVersion.CHROME);
        webClient.getOptions().setJavaScriptEnabled(true);
        webClient.getOptions().setUseInsecureSSL(true);
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        
        // Get the first page
        HtmlPage steamAccountInfo = webClient.getPage("https://www.mysteamgauge.com/account?username="+username);

        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        HtmlElement element = steamAccountInfo.getFirstByXPath("html/body/div[2]/div/div[1]/table/tbody/tr/td[2]/div[2]");

        if(element.asText().isEmpty() ){
            return "Something went wrong";
        }
        
        else{
            return element.asText().replace("you've", username);
        }
    }
        
        
}
