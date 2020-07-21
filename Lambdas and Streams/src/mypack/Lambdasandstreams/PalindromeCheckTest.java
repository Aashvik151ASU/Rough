package mypack.Lambdasandstreams;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;


public class PalindromeCheckTest 
{
	@Test
	public void test() {
		Assert.assertArrayEquals(new String[]{"aba","aca"}, PalindromeCheck.palindrome(Arrays.asList("aba","aca","abab")).toArray());
		Assert.assertArrayEquals(new String[]{"abcdcba","sravannavars"}, PalindromeCheck.palindrome(Arrays.asList("abcdcba","afga","sravannavars")).toArray());
	}
}
