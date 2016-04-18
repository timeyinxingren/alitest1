package alitest;

public class Ali1 {
	public int result() {

		int[] a = { 88, 459, 5262, 88, -17, 677, 88, 667, -17, 459, 5262 };
		String str = "";
		for (int i = 0; i < a.length; i++) {

			str = str + a[i] + ",";
		}

		int result = 0;
		for (int i = 0; i < a.length; i++) {
			Integer temp = a[i];

			int beginIndex = str.indexOf(temp.toString());

			int endIndex = str.lastIndexOf(temp.toString());

			String str2 = str.substring(beginIndex + 1, endIndex);
			if (str2.indexOf(temp.toString()) != -1) {
				result = a[i];
				return result;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int result=new Ali1().result();
		System.out.println(result);
	}
	

}