import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = { "sdfs", "sdfsdf", "sdfdf" };
		for (String str : strArr) {
			System.out.println(str);
		}
		String[] strArr2;
		strArr2 = new String[5];
		for (int i = 0; i < strArr2.length; i++) {
			strArr2[i] = "bla" + i;
		}

		for (String str : strArr2) {
			System.out.println(str);
		}

		String[][][] strArr3 = new String[5][][];

		for (int i = 0; i < strArr3.length; i++) {
			strArr3[i] = new String[2][];
			for (int j = 0; j < strArr3[i].length; j++) {
				strArr3[i][j] = new String[3];
				for (int k = 0; k < strArr3[i][j].length; k++) {
					System.out.println("in a loop " + i + j + k);
					strArr3[i][j][k] = "yaya" + i + j + k;
				}
			}
		}

		int count = 0;
		for (String[][] str : strArr3) {
			for (String[] str2 : str) {
				for (String str3 : str2) {
					System.out.println(str3);
					count++;
				}

			}
		}
		System.out.println("count: " + count);

		List<String> arrList = new ArrayList();
		arrList.add("vasya");
		arrList.add("petya");

		System.out.println(arrList);
		System.out.println(arrList.contains("vas1ya"));

		Map<String, Integer> ageMap = new HashMap();
		ageMap.put("vasya", 15);
		ageMap.put("petya", 20);
		System.out.println(ageMap);
		for (String key : ageMap.keySet()) {
			System.out.println(ageMap.get(key));
		}

		for (Entry<String, Integer> entry : ageMap.entrySet()) {
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
		}

		net.skillsup.automationcourse.TestExample test;
		TestExample defaultEx;
	}

}
