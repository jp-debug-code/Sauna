import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
  await page.goto('http://localhost:8080/rakurakusauna/shop/login');
  await page.getByRole('link', { name: 'ログイン' }).click();
  await page.getByRole('link', { name: 'ユーザ登録はこちら' }).click();
  await page.getByPlaceholder('Name').click();
  await page.getByPlaceholder('Name').fill('test');
  await page.getByPlaceholder('Email').click();
  await page.getByPlaceholder('Email').fill('TC1@example.com');
  await page.getByPlaceholder('Zipcode').click();
  await page.getByText('郵便番号（ハイフンあり）:').click();
  await page.getByPlaceholder('Zipcode').dblclick();
  await page.getByPlaceholder('Zipcode').fill('252-0023');
  await page.getByRole('button', { name: '住所検索' }).click();
  await page.getByPlaceholder('Tel').click();
  await page.getByPlaceholder('Tel').fill('0120-223-223');
  await page.getByPlaceholder('Password', { exact: true }).click();
  await page.getByPlaceholder('Password', { exact: true }).fill('testuser1');
  await page.getByPlaceholder('Confirmation Password').click();
  await page.getByPlaceholder('Confirmation Password').fill('testuser1');
  await page.getByRole('button', { name: '登録' }).click();
});