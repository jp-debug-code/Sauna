package com.example.registory;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.AfterEach;

import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//変数定義
public class Regitest_tc1_tc10 {
    private static final Playwright playwright=Playwright.create();
  private final Page page;
  private  final Browser browser;
  private final String url;
  //コンストラクタ
  public Regitest_tc1_tc10(String url){
      this.url = url;
      this.browser=playwright.chromium().launch();
      this.page=browser.newPage();

  }
    //mainクラス
  public static void main(String[] args) {
      Regitest_tc1_tc10 rg = new Regitest_tc1_tc10("http://localhost:8080/rakurakusauna/shop/to-signup");
      for (int i = 1; i <= 10; i++) {
          rg.signupConfirm();
          rg.runTest("TC" + i);
          rg.tearDown();
      }
      rg.closeBrowser();
  }
  private void runTest(String testName){
      switch (testName){
          case "TC1":
              tc1();
              break;
          case "TC2":
              tc2();
              break;
          case "TC3":
              tc3();
              break;
          case "TC4":
              tc4();
              break;
          case "TC5":
              tc5();
              break;
          case "TC6":
              tc6();
              break;
          case "TC7":
              tc7();
              break;
          case "TC8":
              tc8();
              break;
          case "TC9":
              tc9();
              break;
          case "TC10":
              tc10();
              break;
      }
  }


private void signupConfirm(){
    try{  page.navigate(url);
      System.out.println("接続しました");}catch(Exception e){
        e.printStackTrace();
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("TCcon.png")));

    }

}

private void tc1(){
      Locator name= page.locator("#name");
      name.fill("test");
    System.out.println("名前");

    Locator email= page.locator("#email");
    email.fill("tc2@example.com");
    System.out.println("Email");

    Locator zipcode= page.locator("#zipcode");
    zipcode.fill("252-0023");
    System.out.println("郵便番号");

    Locator getAddress= page.locator("#address");
   try {
       getAddress.click();
       System.out.println("コンテンツ");
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
    page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc10/TC1-a.png")));

    Locator locator= page.locator("#register");
      locator.click();

    page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc10/TC1-b.png")));
System.out.println("TC１実行しました");
    System.out.println("------------------------------------");
}

    private void tc2(){
        Locator name= page.locator("#name");
        name.fill("0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789");
        System.out.println("名前");

        Locator email= page.locator("#email");
        email.fill("tc2b@example.com");
        System.out.println("Email");

        Locator zipcode= page.locator("#zipcode");
        zipcode.fill("252-0023");
        System.out.println("郵便番号");

        Locator getAddress= page.locator("#address");
        try {
            getAddress.click();

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
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc10/TC2-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc10/TC2-b.png")));
        System.out.println("TC2実行しました");
        System.out.println("------------------------------------");
    }
    private void tc3(){
        Locator name= page.locator("#name");
       // name.fill("0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789");
        System.out.println("名前未入力");

        Locator email= page.locator("#email");
        email.fill("tc2b@example.com");
        System.out.println("Email");

        Locator zipcode= page.locator("#zipcode");
        zipcode.fill("252-0023");
        System.out.println("郵便番号");

        Locator getAddress= page.locator("#address");
        try {
            getAddress.click();

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
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc10/TC3-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc10/TC3-b.png")));
        System.out.println("TC3実行しました");
        System.out.println("------------------------------------");
    }
    private void tc4(){
        Locator name= page.locator("#name");
         name.fill("0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345");
        System.out.println("名前入力");

        Locator email= page.locator("#email");
        email.fill("tc2b@example.com");
        System.out.println("Email");

        Locator zipcode= page.locator("#zipcode");
        zipcode.fill("252-0023");
        System.out.println("郵便番号");

        Locator getAddress= page.locator("#address");
        try {
            getAddress.click();

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
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc10/TC4-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc10/TC4-b.png")));
        System.out.println("TC4実行しました");
        System.out.println("------------------------------------");
    }
    private void tc5(){
        Locator name= page.locator("#name");
        name.fill(";｡｢℀℁ℂ");
         System.out.println("名前未入力");

        Locator email= page.locator("#email");
        email.fill("tc3@example.com");
        System.out.println("Email");

        Locator zipcode= page.locator("#zipcode");
        zipcode.fill("252-0023");
        System.out.println("郵便番号");

        Locator getAddress= page.locator("#address");
        try {
            getAddress.click();

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
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc10/TC5-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc10/TC5-b.png")));
        System.out.println("TC5実行しました");
        System.out.println("------------------------------------");
    }
    private void tc6(){
        Locator name= page.locator("#name");
        name.fill("><hr><");
        System.out.println("名前入力");
        Locator email= page.locator("#email");
        email.fill("tc5@example.com");
        System.out.println("Email");

        Locator zipcode= page.locator("#zipcode");
        zipcode.fill("252-0023");
        System.out.println("郵便番号");

        Locator getAddress= page.locator("#address");
        try {
            getAddress.click();

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
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc10/TC6-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc10/TC6-b.png")));
        System.out.println("TC6実行しました");
        System.out.println("------------------------------------");
    }
    private void tc7(){
        Locator name= page.locator("#name");
        name.fill(" ");
        System.out.println("名前：半角スペースのみ");
        Locator email= page.locator("#email");
        email.fill("tc7@example.com");
        System.out.println("Email");

        Locator zipcode= page.locator("#zipcode");
        zipcode.fill("252-0023");
        System.out.println("郵便番号");

        Locator getAddress= page.locator("#address");
        try {
            getAddress.click();

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
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc10/TC7-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc10/TC7-b.png")));
        System.out.println("TC7実行しました");
        System.out.println("------------------------------------");
    }
    private void tc8(){
        Locator name= page.locator("#name");
        name.fill("　");
        System.out.println("名前：全角スペースのみ");
        Locator email= page.locator("#email");
        email.fill("tc8@example.com");
        System.out.println("Email");

        Locator zipcode= page.locator("#zipcode");
        zipcode.fill("252-0023");
        System.out.println("郵便番号");

        Locator getAddress= page.locator("#address");
        try {
            getAddress.click();

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
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc10/TC8-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc10/TC8-b.png")));
        System.out.println("TC8実行しました");
        System.out.println("------------------------------------");
    }
    private void tc9(){
        Locator name= page.locator("#name");
        name.fill("'");
        System.out.println("名前入力");
        Locator email= page.locator("#email");
        email.fill("tc9@example.com");
        System.out.println("Email");

        Locator zipcode= page.locator("#zipcode");
        zipcode.fill("252-0023");
        System.out.println("郵便番号");

        Locator getAddress= page.locator("#address");
        try {
            getAddress.click();

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
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc10/TC9-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc10/TC9-b.png")));
        System.out.println("TC9実行しました");
        System.out.println("------------------------------------");
    }
    private void tc10(){
        Locator name= page.locator("#name");
        name.fill("<script>alert('XSSname');</script>");
        System.out.println("名前入力");
        Locator email= page.locator("#email");
        email.fill("tc9@example.com");
        System.out.println("Email");

        Locator zipcode= page.locator("#zipcode");
        zipcode.fill("252-0023");
        System.out.println("郵便番号");

        Locator getAddress= page.locator("#address");
        try {
            getAddress.click();

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
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc10/TC10-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc10/TC10-b.png")));
        System.out.println("TC10実行しました");
        System.out.println("------------------------------------");
    }

    @AfterEach
    public void tearDown() {

      try{
          Class.forName("org.postgresql.Driver");

          Connection connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/ec-202110a","postgres","postgres");

          Statement statement=connection.createStatement();
          statement.executeUpdate("DELETE FROM USERS");
          System.out.println("削除処理完了");
      } catch (ClassNotFoundException | SQLException e) {
          e.printStackTrace();
      }
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
