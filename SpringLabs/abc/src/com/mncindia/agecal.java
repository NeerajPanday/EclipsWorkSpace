package com.mncindia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class agecal {
	/**
	 * @param birthdate
	 * @return Prgram will print yr month till april if u wanna increse the
	 *         month
	 */
	public static Age calculateAge(Date birthdate) {
		int yrs = 0;
		int mon = 0;
		int days = 0;
		Calendar birthday = Calendar.getInstance();
		birthday.setTimeInMillis(birthdate.getTime());
		long currTime = System.currentTimeMillis();
		Calendar now = Calendar.getInstance();
		now.setTimeInMillis(currTime);
		yrs = now.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
		int currMon = now.get(Calendar.MONTH) + 3;// now.get(Calendar.MONTH)-
													// will give currentmonth-1
													// AND increase the month
													// based on
		// ur requirement as of now
		// its for 4th month (April)
		System.out.println(now.get(Calendar.MONTH) + 3);
		int birthMonth = birthday.get(Calendar.MONTH) + 1;
		System.out.println(birthMonth);
		mon = currMon - birthMonth;
		if (mon < 0) {
			yrs--;
			mon = 12 - birthMonth + currMon;
			if (now.get(Calendar.DATE) < birthday.get(Calendar.DATE))
				mon--;
		} else if (mon == 0
				&& now.get(Calendar.DATE) < birthday.get(Calendar.DATE)) {
			int today = now.get(Calendar.DAY_OF_MONTH);
			now.add(Calendar.MONDAY, -1);
			days = now.getActualMaximum(Calendar.DAY_OF_MONTH) + today;
		} else {
			days = 0;
			if (mon == 12) {
				System.out.println(mon);
				yrs++;
				mon = 0;
			}
		}
		return new Age(days, mon, yrs);
	}

	public static void main(String... args) throws ParseException, IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("enter date in dd/mm/yyyy format");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		Date birthdate = sdf.parse(st);
		// Date birthdate = sdf.parse("13/04/1993");
		Age age = calculateAge(birthdate);
		System.out.println(age);
	}
}
