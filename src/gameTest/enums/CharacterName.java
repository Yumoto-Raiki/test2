package gameTest.enums;

/**
 * キャラのenum
 * @author CS
 * 製作者：湯元来輝
 * 製作日：2025/4/16
 */
public enum CharacterName {

	/**
	 * ピカチュウ
	 */
	PIKACHU("ピカチュウ"),
	/**
	 * ヒトカゲ
	 */
	CHARMANDER("ヒトカゲ"),
	/**
	 * ミジュマル
	 */
	OSHAWOTT("ミジュマル"),
	/**
	 * モクロー
	 */
	ROWLET("モクロー");

	private final String label;

	private CharacterName(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
