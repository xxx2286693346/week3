package com.yuanchenglong.common.utils;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * 
    * @ClassName: RandomUtil
    * @Description: TODO(用来操作随机数字的工具类)
    * @author 袁成龙
    * @date 2020年3月30日
    *
 */
public class RandomUtil {
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
		return (int) (min+Math.random()*(max-min+1));
	
	}
	//返回a-b的随机日期
	public static long randomDate(long min, long max){
		return (long) (min+Math.random()*(max-min+1));
	
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static int[] subRandom (int min, int max, int subs){
		//TODO 实现代码
		int zhi[] = {subs};
		Set<Integer> set = new HashSet();
		Random random = new Random();
		for (int i = 0; i < subs; i++) {
			int random2 = random(min, max);
			set.add(random2);
		}
		System.out.println(set);
		int h=0;
		for (Integer ig : set) {
			zhi[h]=ig;
			h++;
		}		
		return zhi;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		String str="123456789qazwsxedcrfvtgbyhnujmikolpAQZWSXEDCRFVTGBYHNUJMIKOLP";
		return str.charAt(random(0, str.length()-1));
	
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		//TODO 实现代码
		String buffer = new String();
		for (int i = 0; i < length; i++) {
			buffer+=randomCharacter();
		}
		return buffer;
	
	}
}
