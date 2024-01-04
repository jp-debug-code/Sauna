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

public class Regi_tc44_tc55 {

    private static final Playwright playwright=Playwright.create();
    private final Page page;
    private  final Browser browser;
    private final String url;
    //コンストラクタ
    public Regi_tc44_tc55(String url) {
        this.url = url;
        this.browser = playwright.chromium().launch();
        this.page = browser.newPage();
    }
    public static void main(String[] args) {
        Regi_tc44_tc55 rg = new Regi_tc44_tc55("http://localhost:8080/rakurakusauna/shop/to-signup");
        for (int i = 43; i <= 55; i++) {
            rg.signupConfirm();
            rg.runTest("TC"+i);
            rg.tearDown();
        }
        rg.closeBrowser();
    }
    private void runTest(String testName){
        switch (testName){

            case "TC44"->tc44();
            case "TC46"->tc46();
            case "TC47"->tc47();
            case "TC48"->tc48();
            case "TC49"->tc49();
            case "TC50"->tc50();
            case "TC51"->tc51();
            case "TC52"->tc52();
            case "TC53"->tc53();
            //default -> throw new IllegalArgumentException("テスト失敗"+ testName);//どの行にも当てはまらない場合に実施
        }
    }
    private void tc44(){
        defaultset.setDefaultValues(page);
        Locator address= page.locator("#address");
        address.fill("神奈川県大和市湘南台7-12-2");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc43/TC33-a.png")));
        Locator locator= page.locator("#register");
        locator.click();
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc43/TC33-b.png")));
        System.out.println("TC44実行しました");
        System.out.println("------------------------------------");
    }
    private void tc46(){
        defaultset.setDefaultValues(page);
        Locator address= page.locator("#address");
        address.fill("012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901235");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc43/TC34-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc55/TC34-b.png")));
        System.out.println("TC34実行しました");
        System.out.println("------------------------------------");
    }
    private void tc47(){
        defaultset.setDefaultValues(page);
        Locator address= page.locator("#address");
        address.fill("");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc43/TC36-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc43/TC36-b.png")));
        System.out.println("TC47実行しました");
        System.out.println("------------------------------------");
    }
    private void tc48(){
        defaultset.setDefaultValues(page);
        Locator address= page.locator("#address");
        address.fill("0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345");

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc43/TC37-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc43/TC37-b.png")));
        System.out.println("TC37実行しました");
        System.out.println("------------------------------------");
    }
    private void tc49(){
        defaultset.setDefaultValues(page);
        Locator address= page.locator("#address");
        address.fill(";｡｢℀℁ℂ");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc43/TC38-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc4/TC38-b.png")));
        System.out.println("TC38実行しました");
        System.out.println("------------------------------------");
    }
    private void tc50(){
        defaultset.setDefaultValues(page);
        Locator address= page.locator("#address");
        address.fill("><hr><");

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc55/TC39-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc55/TC39-b.png")));
        System.out.println("------------------------------------");
    }
    private void tc51(){
        defaultset.setDefaultValues(page);
        Locator address= page.locator("#address");
        address.fill(" ");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc43/TC40-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc43/TC40-b.png")));
        System.out.println("TC51実行しました");
        System.out.println("------------------------------------");
    }

    private void tc52(){
        defaultset.setDefaultValues(page);
        Locator address= page.locator("#address");
        address.fill("'");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc43/TC42-a.png")));

        Locator locator= page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc43/TC42-b.png")));
        System.out.println("TC52実行しました");
        System.out.println("------------------------------------");
    }
    private void tc53() {
        defaultset.setDefaultValues(page);
        Locator address = page.locator("#address");
        address.fill("<script>alert(\"XSSpass\");</script>");
        System.out.println("住所");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc43/TC43-a.png")));

        Locator locator = page.locator("#register");
        locator.click();

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("~tc43/TC43-b.png")));
        System.out.println("TC53実行しました");
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

