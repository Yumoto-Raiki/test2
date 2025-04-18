package gameTest.interfaceFile;

import gameTest.pokemon.PokemonBase;

/**
 * 技のインターフェース
 * @author CS
 * 製作者：湯元来輝
 * 製作日：2025/4/16
 */
public interface ISkill {

	/**
	 * 対象を渡しアクションを起こす
	 * @param pokemonBase
	 */
	public void action(PokemonBase pokemonBase);

}
