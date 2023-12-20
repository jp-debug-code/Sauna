package com.example.registory;

import com.microsoft.playwright.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.nio.file.Paths;

//変数定義
public class Regitest { private static final Playwright playwright=Playwright.create();
  private final Page page;
  private  final Browser browser;
  private final String url;
  //コンストラクタ
  public  Regitest(String url){
      this.url = url;
      this.browser=playwright.chromium().launch();
      this.page=browser.newPage();

  }
    //mainクラス
  public static void main(String[] args){
      Regitest rg= new Regitest("http://localhost:8080/rakurakusauna/shop/to-signup");
      rg.signupConfirm();
      rg.tc1();
      rg.closeBrowser();



  }

private void signupConfirm(){
    try{  page.navigate(url);
      System.out.println("接続しました");}catch(Exception e){
        e.printStackTrace();
    }

}
private void tc1(){
      Locator name= page.locator("#name");
      name.fill("test");
    System.out.println("名前");

    Locator email= page.locator("#email");
    email.fill("test@example.com");
    System.out.println("Email");

    Locator zipcode= page.locator("#zipcode");
    zipcode.fill("252-0023");
    System.out.println("郵便番号");

    Locator getAddress= page.locator("#address");
   try {
       getAddress.click();
       page.waitForTimeout(2000);
       String pageContents= page.content();
       System.out.println("コンテンツ"+pageContents);
       page.waitForTimeout(2000);
       System.out.println("押した");
   }catch(Exception e){
        System.out.println("押されていない");
        e.printStackTrace();
    }

    Locator telephone= page.locator("#telephone");
    telephone.fill("012-3456-7890");
    System.out.println("電話番号");

    Locator address= page.locator("#address");
    address.fill("神奈川県大和市");
    System.out.println("住所");

    Locator password= page.locator("#password");
    password.fill("testuser1");
    System.out.println("パスワード");

    Locator confirmpassword= page.locator("#confirmationPassword");
    confirmpassword.fill("testuser1");
    System.out.println("パスワード確認");

    Locator locator= page.locator("#register");
      locator.click();

    page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("TC1.png")));
System.out.println("TC１実行しました");
}
    private void tc2(){
        Locator name= page.locator("#name");
        name.fill("test");
        System.out.println("名前");

        Locator email= page.locator("#email");
        email.fill("test@example.com");
        System.out.println("Email");

        Locator zipcode= page.locator("#zipcode");
        zipcode.fill("252-0023");
        System.out.println("郵便番号");

        Locator getAddress= page.locator("#address");
        try {
            getAddress.click();
            page.waitForTimeout(2000);
            String pageContents= page.content();
            System.out.println("コンテンツ"+pageContents);
            page.waitForTimeout(2000);
            System.out.println("押した");
        }catch(Exception e){
            System.out.println("押されていない");
            e.printStackTrace();
        }

        Locator telephone= page.locator("#telephone");
        telephone.fill("012-3456-7890");
        System.out.println("電話番号");

        Locator address= page.locator("#address");
        address.fill("神奈川県大和市");
        System.out.println("住所");

        Locator password= page.locator("#password");
        password.fill("testuser1");
        System.out.println("パスワード");

        Locator confirmpassword= page.locator("#confirmationPassword");
        confirmpassword.fill("testuser1");
        System.out.println("パスワード確認");

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("TC1.png")));
        System.out.println("TC１実行しました");
    }


// 最後に閉じる
private void closeBrowser(){
     try{
         Thread.sleep(3500);
         page.context().close();
      page.close();} catch (Exception e){
         e.printStackTrace();
     }

}









}
