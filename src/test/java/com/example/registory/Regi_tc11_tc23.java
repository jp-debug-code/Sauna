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

public class Regi_tc11_tc23 {
    private static final Playwright playwright=Playwright.create();
    private final Page page;
    private  final Browser browser;
    private final String url;
    //コンストラクタ
    public Regi_tc11_tc23(String url) {
        this.url = url;
        this.browser = playwright.chromium().launch();
        this.page = browser.newPage();
    }
    public static void main(String[] args) {
        Regi_tc11_tc23 rg = new Regi_tc11_tc23("http://localhost:8080/rakurakusauna/shop/to-signup");
        for (int i = 1; i <= 23; i++) {
            rg.signupConfirm();
            rg.runTest("TC"+i);
            rg.tearDown();
        }
        rg.closeBrowser();
    }
    private void runTest(String testName){
        switch (testName){
            case "TC11" ->tc11();
            case "TC12"->tc12();
            case "TC13"->tc13();
            case "TC14"->tc14();
            case "TC15"->tc15();
            case "TC16"->tc16();
            case "TC17"->tc17();
            case "TC18"->tc18();
            case "TC19"->tc19();
            case "TC20"->tc20();
            case "TC21"->tc21();
            case "TC22"->tc22();
            case "TC23"->tc23();
            //default -> throw new IllegalArgumentException("テスト失敗"+ testName);//どの行にも当てはまらない場合に実施
        }
    }
    private void tc11(){
        Locator name= page.locator("#name");
        name.fill("test");
        System.out.println("名前");

        Locator email= page.locator("#email");
        email.fill("abcdefghijklmn@pqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyza");
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
        confirmpassword.fill("testuser1");
        System.out.println("パスワード確認");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC11-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC11-b.png")));
        System.out.println("TC11実行しました");
        System.out.println("------------------------------------");
    }
    private void tc12(){
        Locator name= page.locator("#name");
        name.fill("test");
        System.out.println("名前");

        Locator email= page.locator("#email");
        email.fill("");
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
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC12-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC12-b.png")));
        System.out.println("TC12実行しました");
        System.out.println("------------------------------------");
    }
    private void tc13(){
        Locator name= page.locator("#name");
        name.fill("test");
        System.out.println("名前");

        Locator email= page.locator("#email");
        email.fill("abcdefghijklmn@pqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyza");
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
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC13-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC13-b.png")));
        System.out.println("TC13実行しました");
        System.out.println("------------------------------------");
    }
    private void tc14(){
        Locator name= page.locator("#name");
        name.fill("test");
        System.out.println("名前");

        Locator email= page.locator("#email");
        email.fill("亜あアｱＡ@example.com");
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
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC14-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC14-b.png")));
        System.out.println("TC14実行しました");
        System.out.println("------------------------------------");
    }
    private void tc15(){
        Locator name= page.locator("#name");
        name.fill("test");
        System.out.println("名前");

        Locator email= page.locator("#email");
        email.fill("abcdefghijklmn@pqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaa");
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
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC15-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC15-b.png")));
        System.out.println("TC15実行しました");
        System.out.println("------------------------------------");
    }
    private void tc16(){
        Locator name= page.locator("#name");
        name.fill("test");
        System.out.println("名前");

        Locator email= page.locator("#email");
        email.fill(";｡｢@℀℁ℂ");
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
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC16-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC16-b.png")));
        System.out.println("TC16実行しました");
        System.out.println("------------------------------------");
    }
    private void tc17(){
        Locator name= page.locator("#name");
        name.fill("test");
        System.out.println("名前");

        Locator email= page.locator("#email");
        email.fill(">@<hr><");
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
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC17-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC17-b.png")));
        System.out.println("TC17実行しました");
        System.out.println("------------------------------------");
    }
    private void tc18(){
        Locator name= page.locator("#name");
        name.fill("test");
        System.out.println("名前");

        Locator email= page.locator("#email");
        email.fill("x@x x");
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
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC18-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC18-b.png")));
        System.out.println("TC18実行しました");
        System.out.println("------------------------------------");
    }
    private void tc19(){
        Locator name= page.locator("#name");
        name.fill("test");
        System.out.println("名前");

        Locator email= page.locator("#email");
        email.fill("x@x　x");
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
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC19-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC19-b.png")));
        System.out.println("TC19実行しました");
        System.out.println("------------------------------------");
    }
    private void tc20(){
        Locator name= page.locator("#name");
        name.fill("test");
        System.out.println("名前");

        Locator email= page.locator("#email");
        email.fill("testasample.com");
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
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC20-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC20-b.png")));
        System.out.println("TC20実行しました");
        System.out.println("------------------------------------");
    }
    private void tc21(){
        insertTestDataBeforeTest();//登録実施
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
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC21-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC21-b.png")));
        System.out.println("TC21実行しました");
        System.out.println("------------------------------------");
    }
    private void tc22(){

        Locator name= page.locator("#name");
        name.fill("test");
        System.out.println("名前");

        Locator email= page.locator("#email");
        email.fill("a'test@test");
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
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC22-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC22-b.png")));
        System.out.println("TC22実行しました");
        System.out.println("------------------------------------");
    }
    private void tc23(){

        Locator name= page.locator("#name");
        name.fill("test");
        System.out.println("名前");

        Locator email= page.locator("#email");
        email.fill("<script>alert('XSS@mail');</script>");
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
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC23-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc23/TC23-b.png")));
        System.out.println("TC23実行しました");
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