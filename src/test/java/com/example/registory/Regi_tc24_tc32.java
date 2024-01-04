package com.example.registory;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Regi_tc24_tc32 {

        private static final Playwright playwright=Playwright.create();
        private final Page page;
        private  final Browser browser;
        private final String url;
        //コンストラクタ
        public Regi_tc24_tc32(String url) {
            this.url = url;
            this.browser = playwright.chromium().launch();
            this.page = browser.newPage();
        }
        public static void main(String[] args) {
            com.example.registory.Regi_tc24_tc32 rg = new com.example.registory.Regi_tc24_tc32("http://localhost:8080/rakurakusauna/shop/to-signup");
            for (int i = 24; i <= 32; i++) {
                rg.signupConfirm();
                rg.runTest("TC"+i);
                rg.tearDown();
            }
            rg.closeBrowser();
        }
        private void runTest(String testName){
            switch (testName){
                case "TC24" ->tc24();
                case "TC25"->tc25();
                case "TC26"->tc26();
                case "TC27"->tc27();
                case "TC28"->tc28();
                case "TC29"->tc29();
                case "TC30"->tc30();
                case "TC31"->tc31();
                case "TC32"->tc32();
                //default -> throw new IllegalArgumentException("テスト失敗"+ testName);//どの行にも当てはまらない場合に実施
            }
        }
        private void tc24(){
            Locator name= page.locator("#name");
            name.fill("test");
            System.out.println("名前");

            Locator email= page.locator("#email");
            email.fill("tc24@example.com");
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
            telephone.fill("012-3456-789");
            System.out.println("電話番号");

            Locator address= page.locator("#address");
            address.fill("神奈川県大和市");
            System.out.println("住所");

            Locator password= page.locator("#password");
            password.fill("testuser");
            System.out.println("パスワード");

            Locator confirmpassword= page.locator("#confirmationPassword");
            confirmpassword.fill("testuser");
            System.out.println("パスワード確認");
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc32/TC24-a.png")));

            Locator locator= page.locator("#register");
            locator.click();

            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc32/TC24-b.png")));
            System.out.println("TC11実行しました");
            System.out.println("------------------------------------");
        }
    private void tc25(){
        Locator name= page.locator("#name");
        name.fill("test");
        System.out.println("名前");

        Locator email= page.locator("#email");
        email.fill("tc25@example.com");
        System.out.println("Email");

        Locator zipcode= page.locator("#zipcode");
        zipcode.fill("");
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
        telephone.fill("012-3456-789");
        System.out.println("電話番号");

        Locator address= page.locator("#address");
        address.fill("神奈川県大和市");
        System.out.println("住所");

        Locator password= page.locator("#password");
        password.fill("testuser");
        System.out.println("パスワード");

        Locator confirmpassword= page.locator("#confirmationPassword");
        confirmpassword.fill("testuser");
        System.out.println("パスワード確認");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc32/TC25-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc32/TC25-b.png")));
        System.out.println("TC11実行しました");
        System.out.println("------------------------------------");
    }
    private void tc26(){
        Locator name= page.locator("#name");
        name.fill("test");
        System.out.println("名前");

        Locator email= page.locator("#email");
        email.fill("tc26@example.com");
        System.out.println("Email");

        Locator zipcode= page.locator("#zipcode");
        zipcode.fill("２５２－００２１");
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
        telephone.fill("012-3456-789");
        System.out.println("電話番号");

        Locator address= page.locator("#address");
        address.fill("神奈川県大和市");
        System.out.println("住所");

        Locator password= page.locator("#password");
        password.fill("testuser");
        System.out.println("パスワード");

        Locator confirmpassword= page.locator("#confirmationPassword");
        confirmpassword.fill("testuser");
        System.out.println("パスワード確認");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc32/TC26-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc32/TC26-b.png")));
        System.out.println("TC11実行しました");
        System.out.println("------------------------------------");
    }
    private void tc27(){
        Locator name= page.locator("#name");
        name.fill("test");
        System.out.println("名前");

        Locator email= page.locator("#email");
        email.fill("tc27@example.com");
        System.out.println("Email");

        Locator zipcode= page.locator("#zipcode");
        zipcode.fill(";｡｢℀℁ℂ");
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
        telephone.fill("012-3456-789");
        System.out.println("電話番号");

        Locator address= page.locator("#address");
        address.fill("神奈川県大和市");
        System.out.println("住所");

        Locator password= page.locator("#password");
        password.fill("testuser");
        System.out.println("パスワード");

        Locator confirmpassword= page.locator("#confirmationPassword");
        confirmpassword.fill("testuser");
        System.out.println("パスワード確認");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc32/TC27-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc32/TC27-b.png")));
        System.out.println("TC11実行しました");
        System.out.println("------------------------------------");
    }
    private void tc28(){
        Locator name= page.locator("#name");
        name.fill("test");
        System.out.println("名前");

        Locator email= page.locator("#email");
        email.fill("tc28@example.com");
        System.out.println("Email");

        Locator zipcode= page.locator("#zipcode");
        zipcode.fill("><hr><");
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
        telephone.fill("012-3456-789");
        System.out.println("電話番号");

        Locator address= page.locator("#address");
        address.fill("神奈川県大和市");
        System.out.println("住所");

        Locator password= page.locator("#password");
        password.fill("testuser");
        System.out.println("パスワード");

        Locator confirmpassword= page.locator("#confirmationPassword");
        confirmpassword.fill("testuser");
        System.out.println("パスワード確認");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc32/TC28-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc32/TC28-b.png")));
        System.out.println("TC11実行しました");
        System.out.println("------------------------------------");
    }
    private void tc29(){
        Locator name= page.locator("#name");
        name.fill("test");
        System.out.println("名前");

        Locator email= page.locator("#email");
        email.fill("tc29@example.com");
        System.out.println("Email");

        Locator zipcode= page.locator("#zipcode");
        zipcode.fill(" 252-0021");
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
        telephone.fill("012-3456-789");
        System.out.println("電話番号");

        Locator address= page.locator("#address");
        address.fill("神奈川県大和市");
        System.out.println("住所");

        Locator password= page.locator("#password");
        password.fill("testuser");
        System.out.println("パスワード");

        Locator confirmpassword= page.locator("#confirmationPassword");
        confirmpassword.fill("testuser");
        System.out.println("パスワード確認");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc32/TC29-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc32/TC29-b.png")));
        System.out.println("TC11実行しました");
        System.out.println("------------------------------------");
    }
    private void tc30(){
        Locator name= page.locator("#name");
        name.fill("test");
        System.out.println("名前");

        Locator email= page.locator("#email");
        email.fill("tc30@example.com");
        System.out.println("Email");

        Locator zipcode= page.locator("#zipcode");
        zipcode.fill("　252-0021");
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
        telephone.fill("012-3456-789");
        System.out.println("電話番号");

        Locator address= page.locator("#address");
        address.fill("神奈川県大和市");
        System.out.println("住所");

        Locator password= page.locator("#password");
        password.fill("testuser");
        System.out.println("パスワード");

        Locator confirmpassword= page.locator("#confirmationPassword");
        confirmpassword.fill("testuser");
        System.out.println("パスワード確認");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc32/TC30-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc32/TC30-b.png")));
        System.out.println("TC11実行しました");
        System.out.println("------------------------------------");
    }
    private void tc31(){
        Locator name= page.locator("#name");
        name.fill("test");
        System.out.println("名前");

        Locator email= page.locator("#email");
        email.fill("tc31@example.com");
        System.out.println("Email");

        Locator zipcode= page.locator("#zipcode");
        zipcode.fill("'");
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
        telephone.fill("012-3456-789");
        System.out.println("電話番号");

        Locator address= page.locator("#address");
        address.fill("神奈川県大和市");
        System.out.println("住所");

        Locator password= page.locator("#password");
        password.fill("testuser");
        System.out.println("パスワード");

        Locator confirmpassword= page.locator("#confirmationPassword");
        confirmpassword.fill("testuser");
        System.out.println("パスワード確認");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc32/TC31-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc32/TC31-b.png")));
        System.out.println("TC11実行しました");
        System.out.println("------------------------------------");
    }
    private void tc32(){
        Locator name= page.locator("#name");
        name.fill("test");
        System.out.println("名前");

        Locator email= page.locator("#email");
        email.fill("tc32@example.com");
        System.out.println("Email");

        Locator zipcode= page.locator("#zipcode");
        zipcode.fill("<script>alert('XSSpass');</script>");
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
        telephone.fill("012-3456-789");
        System.out.println("電話番号");

        Locator address= page.locator("#address");
        address.fill("神奈川県大和市");
        System.out.println("住所");

        Locator password= page.locator("#password");
        password.fill("testuser");
        System.out.println("パスワード");

        Locator confirmpassword= page.locator("#confirmationPassword");
        confirmpassword.fill("testuser");
        System.out.println("パスワード確認");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc32/TC32-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc32/TC32-b.png")));
        System.out.println("TC11実行しました");
        System.out.println("------------------------------------");
    }



    private void signupConfirm () {
            try {
                page.navigate(url);
                System.out.println("接続しました");
            } catch (Exception e) {
                e.printStackTrace();
                page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("TCcon.png")));

            }


        }
        @BeforeEach
        public void insertTestDataBeforeTest() {
            try {
                Class.forName("org.postgresql.Driver");

                Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ec-202110a", "postgres", "postgres");

                Statement statement = connection.createStatement(); {

                    // 事前データの挿入
                    String insertQuery = "INSERT INTO USERS (name, email,password,zipcode,address,telephone,point) VALUES ('test', 'test@example.com','testuser',232-0021,'神奈川県大和市湘南台','012-3456-7890',0)";
                    statement.executeUpdate(insertQuery);
                    System.out.println("登録実施");

                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @AfterEach
        public void tearDown () {

            try {
                Class.forName("org.postgresql.Driver");

                Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ec-202110a", "postgres", "postgres");

                Statement statement = connection.createStatement();
                statement.executeUpdate("DELETE FROM USERS");
                System.out.println("削除処理完了");
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }


        // 最後に閉じる
        private void closeBrowser() {
            try {
                Thread.sleep(3500);
                page.context().close();
                page.close();
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }

