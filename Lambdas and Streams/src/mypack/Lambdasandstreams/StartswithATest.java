package mypack.Lambdasandstreams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import org.junit.Assert;


public class StartswithATest 
{
	@Test
	public void test() 
	{
		Assert.assertArrayEquals(new String[]{"abc","afg"}, StartswithA.StartsaLen3(Arrays.asList("abc","afg","sravan")).toArray());
		Assert.assertArrayEquals(new String[] {"abc", "acs"}, StartswithA.StartsaLen3(Arrays.asList("abc","bcfd","abcd","acs","sravan")).toArray());
	}
}
