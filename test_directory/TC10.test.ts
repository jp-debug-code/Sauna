import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
  await page.goto('http://localhost:8080/rakurakusauna/shop/login');
  await page.getByRole('link', { name: 'ログイン' }).click();
  await page.getByRole('link', { name: 'ユーザ登録はこちら' }).click();
  await page.getByPlaceholder('Name').click();
  await page.getByPlaceholder('Name').fill('<script>alert("XSSname");</script>');
  await page.getByPlaceholder('Email').click();
  await page.getByPlaceholder('Email').fill('TC10@example.com');
  await page.getByPlaceholder('Zipcode').click();
  await page.getByPlaceholder('Zipcode').fill('232-0021');
  await page.getByRole('button', { name: '住所検索' }).click();
  await page.getByPlaceholder('Tel').click();
  await page.getByPlaceholder('Tel').fill('012-3456-7890');
  await page.getByPlaceholder('Password', { exact: true }).click();
  await page.getByPlaceholder('Password', { exact: true }).fill('testuser1');
  await page.getByPlaceholder('Confirmation Password').click();
  await page.getByPlaceholder('Confirmation Password').fill('testuser1');
  await page.getByRole('button', { name: '登録' }).click();
});