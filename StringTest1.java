import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StringTest1 {

	static final String CHAR_HYPHEN = "-";
	static final String STR_NULL = "";

	public static String getNo(String Id){

		long start = System.nanoTime();

		if(STR_NULL.endsWith(Id)){
			return "";
		}

		String jiNo = "";
		String[] jiNos = Id.split(String.valueOf(CHAR_HYPHEN));

		if (jiNos == null || jiNos.length == 0) {
			return "";
		}

		int[] nums = {2,8,2};
		for (int i = 0; i < nums.length; i++){
			if (nums[i] != jiNos[i].length()) {
				return "";
			} else {
				jiNo = jiNo.concat(jiNos[i]);
			}
		}

		long end = System.nanoTime();
		System.out.println("time to Concat =	" + (end - start) + "nanoTime");

		return jiNo;

	}

	public static String getNo2(String Id){
		long start = System.nanoTime();

		if(STR_NULL.endsWith(Id)){
			return "";
		}

		String jiNo = "";
		String[] jiNos = Id.split(String.valueOf(CHAR_HYPHEN));

		if (jiNos == null || jiNos.length == 0) {
			return "";
		}

		int[] nums = {2,8,2};
		for (int i = 0; i < nums.length; i++){
			if (nums[i] != jiNos[i].length()) {
				return "";
			} else {
				jiNo = jiNo + jiNos[i];
			}
		}

		long end = System.nanoTime();
		System.out.println("time to Plus =		" + (end - start) + "nanoTime");

		return jiNo;
	}

	public static String getNo3(String Id){
		long start = System.nanoTime();

		if(STR_NULL.endsWith(Id)){
			return "";
		}

		String jiNo = "";
		String[] jiNos = Id.split(String.valueOf(CHAR_HYPHEN));

		if (jiNos == null || jiNos.length == 0) {
			return "";
		}

		int[] nums = {2,8,2};
		for (int i = 0; i < nums.length; i++){
			if (nums[i] != jiNos[i].length()) {
				return "";
			} else {
				jiNo = String.valueOf(new StringBuilder(String.valueOf(jiNo)).append(jiNos[i]));
			}
		}

		long end = System.nanoTime();
		System.out.println("time to StringBuilder =	" + (end - start) + "nanoTime");

		return jiNo;
	}


	@Test
	public final void testGetNoByConcat() {
		assertEquals("AB12345678CD",getNo("AB-12345678-CD"));
	}

	@Test
	public final void testGetNoByPlus() {
		assertEquals("AB12345678CD",getNo2("AB-12345678-CD"));
	}

	@Test
	public final void testGetNoByStringBuilder() {
		assertEquals("AB12345678CD",getNo3("AB-12345678-CD"));
	}

}
