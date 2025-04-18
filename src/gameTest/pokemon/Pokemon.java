package gameTest.pokemon;

/**
 * ポケモンの具象クラス
 * @author CS
 * 製作者：湯元来輝
 * 製作日：2025/4/16
 */
public class Pokemon extends PokemonBase {

	/**
	 * コンストラクタ
	 * @param name
	 * @param voice
	 * @param status
	 */
	public Pokemon(Status status) {

		this.status = status;

	}

	/**
	 * オーバーロード
	 * 
	 */
	@Override
	public void attack() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(status.getName() + "が" + status.getPow() + "ダメージの攻撃");

	}

}
