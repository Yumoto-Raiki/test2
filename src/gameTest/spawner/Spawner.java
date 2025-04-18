package gameTest.spawner;

import gameTest.interfaceFile.ISpawn;
import gameTest.pokemon.Pokemon;
import gameTest.pokemon.Status;

/**
 * ポケモンのインスタンスを生成するクラス
 * @author CS
 * 製作者：湯元来輝
 * 製作日：2025/4/17
 */
public class Spawner implements ISpawn {

	/**
	 * ステータスをもとにポケモンのインスタンスを生成
	 */
	@Override
	public Pokemon spawn(Status status) {

		Pokemon pikachu = new Pokemon(status);

		return pikachu;

	}

}
