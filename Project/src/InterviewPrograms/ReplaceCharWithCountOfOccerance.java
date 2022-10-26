package InterviewPrograms;

public class ReplaceCharWithCountOfOccerance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		charCount("Sreelaxmi", 'e');
	}

	public static String charCount(String name, char ch) {
		int count = '0';
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ch) {
				count++;
			}
		}
		char c = (char) count;
		name = name.replace(ch, c);
		System.out.println(name);
		return name;
	}

}
