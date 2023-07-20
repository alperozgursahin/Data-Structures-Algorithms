package HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyHashTable {

	private int size = 7;
	private Node[] dataMap;

	class Node {
		private String key;
		private int value;
		private Node next;

		public Node(String key, int value) {
			this.key = key;
			this.value = value;
		}

		public String getKey() {
			return key;
		}

		public int getValue() {
			return value;
		}

		public Node getNext() {
			return next;
		}
	}

	public MyHashTable() {
		dataMap = new Node[size];
	}

	public void set(String key, int value) {
		int index = hash(key);
		Node newNode = new Node(key, value);
		if (dataMap[index] == null) {
			dataMap[index] = newNode;
		} else {
			Node temp = dataMap[index];
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public int get(String key) {
		int index = hash(key);
		Node temp = dataMap[index];
		while (temp != null) {
			if (temp.key == key)
				return temp.value;
			temp = temp.next;
		}
		return 0;
	}

	public ArrayList<String> keys() {
		ArrayList<String> allKeys = new ArrayList<>();
		for (int i = 0; i < dataMap.length; i++) {
			Node temp = dataMap[i];
			while (temp != null) {
				allKeys.add(temp.key);
				temp = temp.next;
			}
		}
		return allKeys;
	}

	public int hash(String key) {
		int hash = 0;
		char[] keyChars = key.toCharArray();
		for (int i = 0; i < keyChars.length; i++) {
			int asciiValue = keyChars[i];
			hash = (hash + asciiValue * 23) % dataMap.length;
		}
		return hash;
	}

	public List<Integer> findDuplicates(int[] nums) {

		if (nums.length < 2)
			return null;
		List<Integer> duplicates = new ArrayList<>();
		HashMap<Integer, Boolean> mymap = new HashMap<>();

		for (int i : nums) {
			if (mymap.get(i) == null) {
				mymap.put(i, true);
			} else {
				duplicates.add(i);
			}

		}
		return duplicates;

	}

	public Character firstNonRepeatingChar(String string) {
		Map<Character, Integer> charCounts = new HashMap<>();

		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
		}

		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (charCounts.get(c) == 1) {
				return c;
			}
		}

		return null;
	}

	public List<List<String>> groupAnagrams(String[] strings) {
		Map<String, List<String>> anagramGroups = new HashMap<>();

		for (String string : strings) {
			char[] chars = string.toCharArray();
			Arrays.sort(chars);
			String canonical = new String(chars);

			if (anagramGroups.containsKey(canonical)) {
				anagramGroups.get(canonical).add(string);
			} else {
				List<String> group = new ArrayList<>();
				group.add(string);
				anagramGroups.put(canonical, group);
			}
		}
		return new ArrayList<>(anagramGroups.values());

	}

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			int complement = target - num;

			if (numMap.containsKey(complement)) {
				return new int[] { numMap.get(complement), i };
			}
			numMap.put(num, i);
		}
		return new int[] {};

	}

	public static int[] subarraySum(int[] nums, int target) {
		Map<Integer, Integer> sumIndex = new HashMap<>();
		sumIndex.put(0, -1);
		int currentSum = 0;

		for (int i = 0; i < nums.length; i++) {
			currentSum += nums[i];
			if (sumIndex.containsKey(currentSum - target)) {
				return new int[] { sumIndex.get(currentSum - target) + 1, i };
			}
			sumIndex.put(currentSum, i);
		}

		return new int[] {};
	}

	public List<Integer> removeDuplicates(List<Integer> myList) {
		Set<Integer> uniqueSet = new HashSet<>(myList);
		return new ArrayList<>(uniqueSet);
	}

	public boolean hasUniqueChars(String string) {
		Set<Character> charSet = new HashSet<>();

		for (char ch : string.toCharArray()) {
			if (charSet.contains(ch)) {
				return false;
			}
			charSet.add(ch);
		}

		return true;
	}

	public List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
		Set<Integer> mySet = new HashSet<>();
		List<int[]> pairs = new ArrayList<>();

		for (int num : arr1) {
			mySet.add(num);
		}

		for (int num : arr2) {
			int complement = target - num;
			if (mySet.contains(complement)) {
				pairs.add(new int[] { complement, num });
			}
		}

		return pairs;
	}

	public static int longestConsecutiveSequence(int[] nums) {
		Set<Integer> numSet = new HashSet<>();
		for (Integer num : nums)
			numSet.add(num);

		int longestStreak = 0;

		for (Integer num : numSet) {
			if (!numSet.contains(num - 1)) {
				int currentNum = num;
				int currentStreak = 1;

				while (numSet.contains(currentNum + 1)) {
					currentNum++;
					currentStreak++;
				}
				longestStreak = Math.max(longestStreak, currentStreak);

			}
		}
		return longestStreak;
	}

	public void printTable() {
		for (int i = 0; i < dataMap.length; i++) {
			System.out.println(i + ":");
			Node temp = dataMap[i];
			while (temp != null) {
				System.out.println("  {" + temp.key + " = " + temp.value + "}");
				temp = temp.next;
			}
		}

	}

}
