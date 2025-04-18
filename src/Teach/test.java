package Teach;

public class test {

	public static void main(String[] args) {

		call();

		// 参加する人を足す人の数足す処理
		int count = add(6, 5);
		System.out.println(count);

		// やっぱりやめた人の数を減らす処理
		count = remove(count, 2);
		System.out.println(count);

	}

	public static void call() {

		System.out.println("飲み会来る人～");

	}

	public static int add(int value1, int value2) {

		return value1 + value2;

	}

	public static int remove(int allMenber, int removeMenber) {

		return allMenber - removeMenber;

	}

}
