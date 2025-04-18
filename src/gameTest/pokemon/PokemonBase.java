package gameTest.pokemon;

/**
 * ポケモンの抽象クラス
 * @author CS
 * 製作者：湯元来輝
 * 製作日：2025/4/16
 */
public abstract class PokemonBase {

	protected Status status;

	// インターフェースで技をセット

	protected void voice() {

		System.out.println(status.getName() + "の鳴き声" + status.getVoice());

	}

	public abstract void attack();

}
