package gameTest.pokemon;

import gameTest.enums.CharacterName;
import gameTest.share.Tuple;
import gameTest.share.characterCorrection;

/**
 * ステータスの
 * @author CS
 * 製作者：湯元来輝
 * 製作日：2025/4/17
 */
public class Status {

	/**
	 * 名前
	 */
	private CharacterName name = null;
	/**
	 * 鳴き声
	 */
	private String voice = "";

	/**
	 * 体力
	 */
	private Tuple<String, Integer> hp = new Tuple<>("", 0);
	/**
	 * 力
	 */
	private Tuple<String, Integer> pow = new Tuple<>("", 0);
	/**
	 * 速さ
	 */
	private Tuple<String, Integer> speed = new Tuple<>("", 0);
	/**
	 * 防御力
	 */
	private Tuple<String, Integer> def = new Tuple<>("", 0);

	/**
	 * コンストラクタ
	 * @param name
	 * @param voice
	 * @param currentHp
	 * @param attack
	 * @param speed
	 */
	public Status(CharacterName name, String voice, int currentHp, int pow, int speed, int def) {

		this.name = name;
		this.voice = voice;
		this.hp.setElement1("体力");
		this.hp.setElement2(currentHp);
		this.pow.setElement1("力");
		this.pow.setElement2(pow);
		this.speed.setElement1("速さ");
		this.speed.setElement2(speed);
		this.def.setElement1("耐久力");
		this.def.setElement2(def);

	}

	/**
	 * nameを呼び出し元に返す
	 */
	public CharacterName getName() {
		return name;
	}

	/**
	 * @param name を nameにセットする
	 */
	public void setName(CharacterName name) {
		this.name = name;
	}

	/**
	 * voiceを呼び出し元に返す
	 */
	public String getVoice() {
		return voice;
	}

	/**
	 * @param voice を voiceにセットする
	 */
	public void setVoice(String voice) {
		this.voice = voice;
	}

	/**
	 * hpを呼び出し元に返す
	 */
	public int getHp() {
		return hp.getElement2();
	}

	/**
	 * @param hp を hpにセットする
	 */
	public void setHp(int hp) {
		this.hp.setElement2(hp);
	}

	/**
	 * powを呼び出し元に返す
	 */
	public int getPow() {
		return pow.getElement2();
	}

	/**
	 * @param pow を powにセットする
	 */
	public void setPow(int pow) {
		this.pow.setElement2(pow);
	}

	/**
	 * speedを呼び出し元に返す
	 */
	public int getSpeed() {
		return speed.getElement2();
	}

	/**
	 * @param speed を speedにセットする
	 */
	public void setSpeed(int speed) {
		this.speed.setElement2(speed);
	}

	/**
	 * defを呼び出し元に返す
	 */
	public int getDef() {
		return def.getElement2();
	}

	/**
	 * @param def を defにセットする
	 */
	public void setDef(int def) {
		this.def.setElement2(def);
	}

	public void statusView() {

		characterCorrection.correction(
				name.toString() + name.getLabel() + "\n" +
						hp.getElement1() + ":" + hp.getElement2() + "\n" +
						pow.getElement1() + ":" + pow.getElement2() + "\n" +
						speed.getElement1() + ":" + speed.getElement2() + "\n" +
						def.getElement1() + ":" + def.getElement2() + "\n");

	}

}
