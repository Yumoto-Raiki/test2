package gameTest.pokemon;

import gameTest.enums.CharacterName;

/**
 * ポケモンのデータベース
 * @author CS
 * 製作者：湯元来輝
 * 製作日：2025/4/17
 */
public class PokemonData {

	private Status[] statuss = {

			new Status(CharacterName.PIKACHU, "ぴかぴか", 10, 8, 10, 10),
			new Status(CharacterName.CHARMANDER, "カゲー", 10, 8, 10, 10),
			new Status(CharacterName.OSHAWOTT, "ジュマジュマ", 10, 8, 10, 10),
			new Status(CharacterName.ROWLET, "ピヨォォー", 10, 8, 10, 10)

	};

	/**
	 * キャラクターのステータス取得
	 * @param num
	 * @return
	 */
	public Status getStatus(int num) {

		// コンソールの選択肢と一致させるために、インクリメント
		num--;
		// 配列数を超えた、または満たしていないときNullを返す
		if (num >= statuss.length || num < 0) {

			return null;

		}
		return statuss[num];

	}

	/**
	 * キャラクターを一覧表示する
	 */
	public void charactersView() {

		for (int i = 0; i < statuss.length; i++) {

			// 添え字の始まりを１に
			System.out.println((i + 1) + "  " + statuss[i].getName().getLabel());

		}

	}

	public int getStatussArrayLenght() {

		return statuss.length;

	}
}
