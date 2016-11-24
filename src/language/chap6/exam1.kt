package language.chap6

import java.util.*
import java.util.Calendar


fun demo(source: List<Int>) {
	val list = ArrayList<Int>()
	
	// 자바 콜렉션을 'for'-루프에서 사용:
	for (item in source)
		list.add(item)
	
	// 연산자 규칙도 작동:
	for (i in 0..source.size - 1)
		list[i] = source[i] // get과 set 호출
}


fun calendarDemo() {
	val calendar = Calendar.getInstance()
	if (calendar.firstDayOfWeek == Calendar.SUNDAY) { // getFirstDayOfWeek() 호출
		calendar.firstDayOfWeek = Calendar.MONDAY // setFirstDayOfWeek() 호출
	}
}