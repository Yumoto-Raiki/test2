package gameTest.share;

/**
 * 自作のタプル型
 * ジェネリッククラス
 * @author CS
 *
 * @param <A>
 * @param <B>
 * 製作者：湯元来輝
 * 製作日：2025/4/17
 */
public class Tuple<A, B> {

	private A element1;
	private B element2;

	public Tuple(A element1, B element2) {
		this.setElement1(element1);
		this.setElement2(element2);
	}

	public A getElement1() {
		return element1;
	}

	public void setElement1(A element1) {
		this.element1 = element1;
	}

	public B getElement2() {
		return element2;
	}

	public void setElement2(B element2) {
		this.element2 = element2;
	}

}
