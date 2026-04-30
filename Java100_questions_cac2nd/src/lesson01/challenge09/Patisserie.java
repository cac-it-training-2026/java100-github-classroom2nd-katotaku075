/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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
		double num1 = Double.parseDouble(str1);
		String str2 = reader.readLine();
		double num2 = Double.parseDouble(str2);
		String str3 = reader.readLine();
		double num3 = Double.parseDouble(str3);

		System.out.println("シトロンを" + num1 + "個");
		System.out.println("ショコラを" + num2 + "個");
		System.out.println("ピスターシュを" + num3 + "個");

		double sum = num1 + num2 + num3;
		double sit_total = num1 * 250;
		double sho_total = num2 * 280;
		double pis_total = num3 * 320;
		double total = sit_total + sho_total + pis_total;

		System.out.println("合計個数　　" + sum + "個");
		System.out.println("合計金額　" + (int) total + "円");
		System.out.println("をお買い上げですね。\n承りました。");
		System.out.println("シトロン　　　　\\250・・・残り" + (int) (sit - num1) + "個");
		System.out.println("ショコラ　　　　\\280・・・残り" + (int) (sho - num2) + "個");
		System.out.println("ピスターシュ　　\\320・・・残り" + (int) (pis - num3) + "個");
		System.out.println("閉店時間となりました。\nまたのお越しをお待ちしております。");
		System.out.println("売上合計金額　" + (int) total + "円");
		System.out.println(
				"内訳\nシトロン　\\" + (int) sit_total + "・・・" + (int) ((sit_total / total) * 100) + "%\nショコラ \\"
						+ (int) sho_total + "・・・" + (int) ((sho_total / total) * 100) + "%" + "\nピスターシュ  \\"
						+ (int) pis_total + "・・・"
						+ (int) ((pis_total / total) * 100)
						+ "%");
		System.out.println("明日の三色マカロンの配合が決まりました！");
		System.out.println("シトロンの味　　　・・・" + (int) ((sit_total / total) * 100) + "％");
		System.out.println("ショコラの味　　　・・・" + (int) ((sho_total / total) * 100) + "％");
		System.out.println("ピスタチオの味　　・・・" + (int) ((pis_total / total) * 100) + "％");
		System.out.println("が楽しめます！\n値段は\\" + (int) (total / sum) + "円");
	}

}
