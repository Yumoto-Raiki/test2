package gameTest.interfaceFile;

import gameTest.pokemon.Pokemon;
import gameTest.pokemon.Status;

/**
 * キャラを生成するインターフェース
 * @author CS
 * 製作者：湯元来輝
 * 製作日：2025/4/17
 */
public interface ISpawn {

	public Pokemon spawn(Status status);

}
