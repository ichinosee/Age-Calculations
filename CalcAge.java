package la.mgr;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalcAge {
	public int howOld(int year, int month, int date) {
		//誕生日を設定
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DAY_OF_MONTH, date);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		//現在時刻と誕生日を文字列にしてintする
		int now = Integer.parseInt(sdf.format(new Date()));
		int birth = Integer.parseInt(sdf.format(cal.getTime()));

		//年齢を計算
		//(20080811 - 19780220) / 1000
		return (int)((now - birth) / 10000);
	}

}
