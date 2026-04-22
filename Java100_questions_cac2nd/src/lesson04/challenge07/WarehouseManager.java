/**
 * 第4章 倉庫番のお仕事
 *
 * 問題7 荷物の並べ替え（昇順、降順）
 *
 * AB興産からの次の依頼は、昇順、降順による並べ替えです。
 * 5袋ある荷物を中の値によって、小さい順に並べ替えて表示した後、
 * 大きい順に並べ替えて表示します。
 *
 * 袋にはそれぞれ1～5の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定します。
 * さらにそれぞれの袋の値が重複しないものとします。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産の荷物の並べ替えをお願いします。
 *
 *  Yさん：
 *  はい、
 *  並べ替え前の状態は、
 *  3,2,1,5,4
 *  です。
 *
 *  小さい順に並べ替えた後の状態は、
 *  1,2,3,4,5
 *  です。
 *
 *  大きい順に並べ替えた後の状態は、
 *  5,4,3,2,1
 *  です。
 *
 */

package lesson04.challenge07;

public class WarehouseManager {

	public static void main(String[] args) {

		int[] ABKosanArray = new int[5];
		boolean loopFlag = false;
		int IntputNum = 0;

		//ここに重複チェックおよび値の代入処理を記述する
		for (int i = 0; i < ABKosanArray.length; i++) {
			do {
				loopFlag = false;
				IntputNum = (int) (Math.random() * 10 % 5) + 1;
				for (int j = 0; j < i; j++) {
					if (IntputNum == ABKosanArray[j]) {
						loopFlag = true;
						break;
					}
				}
			} while (loopFlag);
			ABKosanArray[i] = IntputNum;
		}
		System.out.println("E主任：");
		System.out.println("AB興産の荷物の並べ替えをお願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");
		System.out.println("並べ替え前の状態は、");

		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		//ここに昇順にソートする処理を記述する
		int[] ChangeSlot = new int[ABKosanArray.length];
		for (int i = 0; i < ABKosanArray.length; i++) {
			if (ABKosanArray[i] == 1) {
				ChangeSlot[0] = ABKosanArray[i];
			} else if (ABKosanArray[i] == 2) {
				ChangeSlot[1] = ABKosanArray[i];
			} else if (ABKosanArray[i] == 3) {
				ChangeSlot[2] = ABKosanArray[i];
			} else if (ABKosanArray[i] == 4) {
				ChangeSlot[3] = ABKosanArray[i];
			} else if (ABKosanArray[i] == 5) {
				ChangeSlot[4] = ABKosanArray[i];
			}
		}
		for (int i = 0; i < (ABKosanArray.length); i++) {
			ABKosanArray[i] = ChangeSlot[i];
		}
		//		模範解答
		//		for (int i = 0; i < ABKosanArray.length - 1; i++) {
		//			for (int j = i + 1; j < ABKosanArray.length; j++) {
		//				if (ABKosanArray[i] > ABKosanArray[j]) {左の要素より大きければ
		//					int temp = ABKosanArray[i];         一旦要素を空に
		//					ABKosanArray[i] = ABKosanArray[j];  空にした部分に左の要素を入れる
		//					ABKosanArray[j] = temp;　　　　　　 空いた左の要素に一時的に保管していた要素を入れる
		//				}
		//			}
		//		}

		System.out.println("小さい順に並べ替えた後の状態は、");
		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		//ここに降順にソートする処理を記述する
		for (int i = 0; i < ABKosanArray.length; i++) {
			if (ABKosanArray[i] == 1) {
				ChangeSlot[4] = ABKosanArray[i];
			} else if (ABKosanArray[i] == 2) {
				ChangeSlot[3] = ABKosanArray[i];
			} else if (ABKosanArray[i] == 3) {
				ChangeSlot[2] = ABKosanArray[i];
			} else if (ABKosanArray[i] == 4) {
				ChangeSlot[1] = ABKosanArray[i];
			} else if (ABKosanArray[i] == 5) {
				ChangeSlot[0] = ABKosanArray[i];
			}
		}
		for (int i = 0; i < (ABKosanArray.length); i++) {
			ABKosanArray[i] = ChangeSlot[i];
		}
		//		模範解答
		//		for (int i = 0; i < ABKosanArray.length - 1; i++) {
		//			for (int j = i + 1; j < ABKosanArray.length; j++) {
		//				if (ABKosanArray[i] < ABKosanArray[j]) {
		//					int temp = ABKosanArray[i];
		//					ABKosanArray[i] = ABKosanArray[j];
		//					ABKosanArray[j] = temp;
		//				}
		//			}
		//		}

		System.out.println("大きい順に並べ替えた後の状態は、");
		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。");
	}
}
