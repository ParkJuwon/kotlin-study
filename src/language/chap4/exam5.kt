package language.chap4



fun main(args: Array<String>) {
	var sum = 0
	val ints = listOf(1,2,3,4,5,6)
	
	ints.filter { it > 0 }.forEach {
		sum += it }
	println(sum)
	
	val sum2 = fun Int.(other: Int): Int = this + other
	
	println(1.sum2(44))
	
	
	class HTML {
		fun body() {  }
	}
	fun html(init: HTML.() -> Unit): HTML {
		val html = HTML() // 리시버 객체 생성
		html.init() // 람다에 리시버 객체를 전달
		return html
	}
	html {
		// 리시버를 가진 람다 시작
		body() // 리시버 객체의 메서드 호출
	}
	
}


