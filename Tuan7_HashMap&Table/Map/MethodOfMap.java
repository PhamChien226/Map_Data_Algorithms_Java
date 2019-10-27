package Map;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;

public class MethodOfMap {

	public static void disPlayWithIterator(Map<? extends Object, ? extends Object> listMap) {
		Iterator iter = listMap.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry pair = (Entry) iter.next();
			System.out.println(pair.getKey() + ", " + pair.getValue() + ";");
		}
	}

	public static void disPlayWithoutIterator(Map<? extends Object, ? extends Object> listMap) {
		Set<? extends Object> keySet = listMap.keySet();
		// tai sao thay bang object thi lai duoc
		for (Object key : keySet) {
			System.out.println(key + " " + listMap.get(key));
		}
	}

	public void remove(Map<? extends Object, ? extends Object> listMap, Object key) {
		listMap.remove(key);
	}

	public Map get10NumberPhone(Map<String, String> listPhone) {
		Map<String, String> listPhone10Num = new HashMap<String, String>();
		Set<? extends Object> keySet = listPhone.keySet();
		// tai sao thay bang object thi lai duoc
		for (Object key : keySet) {
			String NumPhone = (String) key;
			if (NumPhone.length() == 11) {
				NumPhone = convert11NumberTo10(NumPhone);
			}
			listPhone10Num.put(NumPhone, (String) listPhone.get(key));
		}
		return listPhone10Num;
	}

	public String convert11NumberTo10(String NumPhone) {
		String numberConvert = NumPhone.substring(0, 3);
		switch (numberConvert) {
		case "016":
			NumPhone = convert016(NumPhone);
			break;
		case "012":
			NumPhone = convert012(NumPhone);
			break;
		case "018":
			NumPhone = convert018(NumPhone);
			break;
		case "019":
			NumPhone = convert019(NumPhone);
			break;
		default:
			break;
		}
		return NumPhone;
	}

	public String convert016(String num) {
		return num.replace("016", "03");
	}

	public String convert012(String num) {
		String convertNumber = num.substring(0, 5);
		String mobifone = "0120 0121 0122 0126 0128";
		if (convertNumber.indexOf(mobifone) != -1) {
			convertNumber = "07".concat(num.substring(3));
		} else
			convertNumber = "08".concat(num.substring(3));
		return convertNumber;
	}

	public String convert018(String num) {
		return num.replace("018", "05");
	}

	public String convert019(String num) {
		return num.replace("019", "05");
	}

	public Map<String, String> showAllWordsStartingWithChar(Map<String, String> dictionary, String ch) {
		Map<String, String> worsListStartingWith = new TreeMap<String, String>();
		String temp = "";

		Set set = dictionary.entrySet();
		// Lay mot iterator
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			Map.Entry words = (Map.Entry) iter.next();
			String englishWord = (String) words.getKey();

			if (englishWord.startsWith(ch)) {
				worsListStartingWith.put((String) words.getKey(), (String) words.getValue());
			}
		}
		return worsListStartingWith;
	}

	public Map<String, String> createMapWithStringArray(Map<String, String> map, String[] arr) {
		String[] arrword = {};
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			arrword = arr[i].trim().split("-", 2);
			map.put(arrword[0], arrword[1]);
		}
		return map;
	}

}
