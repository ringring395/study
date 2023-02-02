package study_200;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class study_57_main {
//list 출력하기
	public static void main(String[] args) {
		List<Integer> mmlist = Arrays.asList(5,14,15,23,34,43);
		mmlist.forEach(
				m -> {System.out.printf(m+"\t");}
		);
		System.out.println();
		Consumer<Integer> con = (Integer m)->{System.out.printf(m+"\t");};
		mmlist.forEach(con);
	}
}
