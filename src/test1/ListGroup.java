package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListGroup {

	public static void main(String[] args) {

		
		// ArrayListを作成し、いくつかの整数を追加
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		// Streamを作成し、filterを使って3より大きい数を絞り込む
		List<Integer> filteredNumbers = numbers.stream()
				.filter(n -> n > 3) // 3より大きい数を抽出
				.collect(Collectors.toList()); // 結果をListに戻す

		// 結果を表示
		System.out.println(filteredNumbers); // 出力: [4, 5]

	}

}
