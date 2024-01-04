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

public class defaultset {
    public static void setDefaultValues(Page page){

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
        address.fill("神奈川県大和市中央林間7-12-2");
        System.out.println("住所");

        Locator password= page.locator("#password");
        password.fill("testuser");
        System.out.println("パスワード");

        Locator confirmpassword= page.locator("#confirmationPassword");
        confirmpassword.fill("testuser");
        System.out.println("パスワード確認");

    };

}
