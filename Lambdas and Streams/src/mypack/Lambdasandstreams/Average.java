package mypack.Lambdasandstreams;

import java.util.*;
import java.util.function.Function;
public class Average {
	public static int average(List<Integer> a) 
	{
		Function<List<Integer>,Integer> sum = su ->{int v=0; for(Integer i:su) v+=i; return v;};
		Function<List<Integer>, Integer> function = p -> {int y=sum.apply(a); return y/p.size();};
		return function.apply(a);
	}
	
}
