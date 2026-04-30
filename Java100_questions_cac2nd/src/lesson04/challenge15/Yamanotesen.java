package lesson04.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("※※※ 山手線ゲーム ※※※");
		System.out.println("      ゲームスタート！    ");

		int loopCount = 0;
		int randomChoice;
		int[] answerLog = new int[30];
		boolean loopFlag = false;
		boolean loopFlag2 = false;
		String[] answers = { "東京", "新宿", "新橋", "御徒町", "五反田", "秋葉原", "浜松町", "渋谷", "田町", "恵比寿", "有楽町", "目黒", "大崎",
				"原宿", "品川", "目白", "大塚", "上野", "池袋",
				"日暮里", "西日暮里", "駒込", "田端", "高田馬場", "神田", "鶯谷", "代々木", "新大久保", "巣鴨", "高輪ゲートウェイ", };

		boolean[] stationFlag = new boolean[answers.length];

		//Arrays.fillはAをBで埋める
		Arrays.fill(stationFlag, true);
		//	A          B
		boolean hitFlag = false;
		int gameCount = 0;
		Random rand = new Random();

		// 勝ち負けが決まるまで繰り返し
		do {
			// プレイヤーに駅名を入力してもらう
			String inputStationName = br.readLine();

			// プレイヤーの入力した駅名がOKかどうかを判定するための繰り返し（駅の総数まで繰り返す）
			for (int i = 0; i < answers.length; i++) {

				// プレイヤーの入力した駅名が配列に含まれていれば
				if (answers[i].equals(inputStationName)) {

					// / その番号の駅が既出でないか判定する
					if (stationFlag[i]) {

						// 正解したという目印にフラグを立てる
						hitFlag = true;

						// この駅名はもう答えましたという意味でfalseに変えておく
						stationFlag[i] = false;

						// 内側のループを抜ける
						break;

						// 入力した駅名が既出であればゲームオーバー
					} else {

						// 内側のループを抜ける
						break;
					}
				}
			}

			// ゲームの実行回数を一つ増やす
			gameCount++;

			// プレイヤーが誤答した場合または全ての駅名が出尽くした場合
			if (!hitFlag || (gameCount == answers.length)) {

				// 外側のループを抜けて終了処理へ
				break;
			}

			// フラグをクリアしておく
			hitFlag = false;

			// コンピュータが回答するための繰り返し（正解するまで繰り返す）
			while (!hitFlag) {

				// 総駅数の範囲で乱数を取得
				int num = rand.nextInt(answers.length);

				// その番号の駅が既出でないか判定する
				if (stationFlag[num]) {

					// 既出でなければ駅名を出力する
					System.out.println(answers[num]);

					// この駅名はもう答えましたという意味でfalseに変えておく
					stationFlag[num] = false;

					// 正解したという目印にフラグを立てる
					hitFlag = true;
				}
			}

			// ゲームの実行回数を一つ増やす
			gameCount++;

			// フラグをクリアしておく
			hitFlag = false;

			// 駅名が出尽くした場合ループを抜ける
		} while (gameCount != answers.length);
		if (gameCount == answers.length)

		{
			System.out.println("あなたの勝ちです！");
		} else {
			System.out.println("あなたの負けです！");
		}

	}
}
