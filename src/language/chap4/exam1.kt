package language.chap4

// 중위 표현


// Int에 대한 확장 함수
infix fun Int.shl(x: Int): Int {
	return 1
}

fun main(args:Array<String>) {
// 중위 표현을 사용해서 확장 함수 호출
	1 shl 2
// 다음 코드와 같음
	1.shl(2)
}

open class A {
	open fun foo(i: Int = 10) {
		//...
	}
}
class B : A() {
	override fun foo(i: Int) {
	//	...
	} // 기본 값을 허용하지 않음
}