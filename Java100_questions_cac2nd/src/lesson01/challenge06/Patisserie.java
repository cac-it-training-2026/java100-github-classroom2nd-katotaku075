/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		int sit = 30;
		int sho = 30;
		int pis = 30;

		System.out.println("それぞれ何個ずつ買いますか？");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str1 = reader.readLine();
		int num1 = Integer.parseInt(str1);
		String str2 = reader.readLine();
		int num2 = Integer.parseInt(str2);
		String str3 = reader.readLine();
		int num3 = Integer.parseInt(str3);

		System.out.println("シトロンを" + num1 + "個");
		System.out.println("ショコラを" + num2 + "個");
		System.out.println("ピスタチオを" + num3 + "個");
		System.out.println("合計個数　　　" + (num1 + num2 + num3) + "個");
		System.out.println("合計金額　" + (num1 * 250 + num2 * 280 + num3 * 320) + "円");
		System.out.println("をお買い上げですね。\n承りました。");
		System.out.println("シトロン　　　\\250・・・残り" + (sit - num1) + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + (sho - num2) + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + (pis - num3) + "個");
	}

}
