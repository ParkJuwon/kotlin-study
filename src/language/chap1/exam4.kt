package language.chap1

// 이디엄 (관용구, 숙어, 용어)

// DTO 만들기
data class Customer(val name: String, val email: String)


fun main(args: Array<String>) {
	
	// 함수 파라미터의 기본 값
	fun foo(a: Int = 0, b: String = "") {
	}
	
	
	// 리스트 필터
	val list = mutableListOf<Int>()
	val positive1 = list.filter { x -> x > 0 }
	val positive2 = list.filter { it > 0 }
	
	
	fun test() {
		// 문자열 인터폴레이션 ( 삽입 )
		val name = "hello"
		println("Name $name")
		
		// 인스턴스 검사
		/*
		when(x) {
			is Foo -> ...
			is Bar -> ...
			else -> ...
		}
		
		*/
	}
	
	// map/list pair 탐색
/*
for((k, v) in map) {
 println("$k -> $v")
}
 */

	// 범위 사
	for (i in 1..100) {
	}
	for (x in 2..10) {
	}
	
	// 읽기 전용 리스트
	val readList = listOf("a", "b", "c")
	// 읽기 전용 맵
	val map = mapOf("a" to 1, "b" to 2, "c" to 3)
	
	// 맵 접근
	println(map["key"])
	val value = 1
	// map["key"] = value
	
	// 지연 프로퍼티
	//val p : String by lazy<Unit> { }
	
	// 확장 함수
	fun String.spaceToCamelCase() {
		println("123")
	}
	"abc".spaceToCamelCase();
	
}







