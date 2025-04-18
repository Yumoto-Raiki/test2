package gameTest.gameManager;

import gameTest.interfaceFile.ISelectCharacter;
import gameTest.interfaceFile.ISpawn;
import gameTest.pokemon.Pokemon;
import gameTest.pokemon.SelectCharacter;
import gameTest.pokemon.Status;
import gameTest.spawner.Spawner;

/**
 * ゲーム管理クラス
 * 製作者：湯元来輝
 * 製作日：2025/4/16
 */
public class GameManager {

	/**
	 * 処理のスタート地点
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 *キャラ選択
		 *キャラのステータスを見せそのキャラでいいかを問う
		 *キャラ生成
		 *敵キャラ生成（ランダム）
		 *バトル
		 */
		// インターフェース取得
		ISelectCharacter iSelectCharactor = new SelectCharacter();
		ISpawn iSpawn = new Spawner();
		// 選択したキャラのステータスを取得
		Status statsu = iSelectCharactor.select();
		// 指定したキャラのインスタンスを取得
		Pokemon pokemon = iSpawn.spawn(statsu);

	}

}
