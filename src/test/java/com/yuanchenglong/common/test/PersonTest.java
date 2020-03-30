package com.yuanchenglong.common.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.yuanchenglong.common.utils.RandomUtil;
import com.yuanchenglong.common.utils.StringUtil;

public class PersonTest {

	@Test
	public void testToString() throws ParseException {
		for (int i = 0; i < 10000; i++) {
			Person person = new Person();
			person.setName(StringUtil.generateChineseName());
			person.setAge(RandomUtil.random(1, 120));
			person.setAbout(StringUtil.randomChineseString(140));
			SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date starDate = sFormat.parse("2010-0-1");
			Date enDate = sFormat.parse("2020-3-30");
			long randomDate = RandomUtil.randomDate(starDate.getTime(), enDate.getTime());
			person.setCreated(new Date(randomDate));
			System.out.println(person);
		}
		
	}

}
