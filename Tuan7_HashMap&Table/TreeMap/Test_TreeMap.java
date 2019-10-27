package TreeMap;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

import Map.MethodOfMap;

public class Test_TreeMap {
	public static void main(String args[]) {
		MethodOfMap test = new MethodOfMap();
		String[] arrTuDien = { "coincide - trùng hợp", "commit - cam kết", "conform - tuân thủ", "confront - đương đầu",
				"confuse - bối rối", "congratulate - chúc mừng", "congress - quốc hội", "dialogue - hội thoại",
				"discrepancy - sự khác nhau", "envelope - phong bì", "especially - đặc biệt", "hyphen - dấu nối",
				"impress- gây ấn tượng", "indicate - chỉ ra", "legend - huyển thoại", "momnet - khoảng khắc",
				" recall - gọi lại", "recommend - giới thiệu", "refer -  giới thiệu", "refuse -  từ chối",
				"relevant - liên quan", "repel - đẩy lùi", "address - địa chỉ", "almost - hầu như",
				"advice - lời khuyên", "annual - hàng năm", "appear - xuất hiện", "applause - tiếng vỗ tay",
				"appointment - cuộc hẹn" };
		Map<String, String> dictionary = new TreeMap<>();
//		Map<String, String> directory = new HashMap<>();

		dictionary = test.createMapWithStringArray(dictionary, arrTuDien);
		
		test.disPlayWithIterator(dictionary);

		System.out.println(test.showAllWordsStartingWithChar(dictionary, "ad"));
	}

}
