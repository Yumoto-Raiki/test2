package gameTest.pokemon;

import java.util.Scanner;

import gameTest.interfaceFile.ISelectCharacter;
import gameTest.share.characterCorrection;

/**
 * キャラの選択
 * 製作者：湯元来輝
 * 製作日：2025/4/16
 */
public class SelectCharacter implements ISelectCharacter {

	private static PokemonData data = new PokemonData();

	/**
	 * キャラの選択
	 */
	@Override
	public Status select() {

		//キャラクター一覧表示
		data.charactersView();
		characterCorrection.correction("画面上にある\"数字\"でキャラを選択してください\n");
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {

			num = scanner.nextInt();

		}
		// 入力時の改行文字を消費
		scanner.nextLine();
		Status status = data.getStatus(num);
		if (status == null) {

			characterCorrection.correction("\"数字\"が選択範囲を超えています\nもう一度入力してください");
			select();

		}
		if (!SelectCheck(scanner, status)) {
			select();
		}
		return status;

	}

	/**
	 * 選択したキャラでいいかの確認
	 * @return
	 */
	private boolean SelectCheck(Scanner scanner, Status status) {

		status.statusView();
		characterCorrection.correction("このキャラクターでよいですか？\nはい（y） いいえ（n）");
		String input = scanner.nextLine().trim().toLowerCase();
		while (true) {
			if (input.equals("y") || input.equals("はい")) {
				System.out.println("「はい」が選ばれました。");
				// 入力時の改行文字を消費
				scanner.nextLine();
				return true;
			} else if (input.equals("n") || input.equals("いいえ")) {
				System.out.println("「いいえ」が選ばれました。");
				return false;
			} else {
				System.out.println("無効な入力です。もう一度入力してください。");
				return false;
			}
		}
	}

}
