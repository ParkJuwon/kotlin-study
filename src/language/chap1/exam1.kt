/*
package language.chap1

// 패키지 정의
import java.util.*

////////////////////////////////////////////////////////////////////////////////////////////////////
// 함수 정의
fun sum1(a: Int, b: Int): Int {
	return a + b
}

// 리턴 타입만 추론
fun sum2(a: Int, b: Int) = a + b

// 의미있는 값을 리턴하지 않는 함수
fun printSum1(a: Int, b: Int): Unit {
	print(a + b)
}

//Unit은 생략 가능
fun printSum2(a: Int, b: Int) {
	print(a + b)
}

////////////////////////////////////////////////////////////////////////////////////////////////////
// 로컬 변수 정의

// 한번만 할당 가능한 (읽기 전용) 로컬 변수
val a: Int = 1
val b = 1 // Int 타입 추론
val c: Int // 값을 할당하지 않을 경우 타입 필요
c = 1 // 확정 할당

// 변경 가능 변수
var x = 5 // Int 타입 추론
x += 1

//주석
// 이것은 라인(end-of-line) 주석
/*
	이것은 블록 추석
*/

////////////////////////////////////////////////////////////////////////////////////////////////////
//문자열 템플릿 사용하기
fun main(args: Array<String>) {
	if (args.size == 0) return
	
	print("First argument : ${args[0]}")
}

////////////////////////////////////////////////////////////////////////////////////////////////////
// 조건식 사용하기
fun max(a: Int, b: Int) : Int {
	if(a > b)
		return a
	else
		return b
}
// 식에 if 사용
fun max(a: Int, b: Int) = if (a > b) a else b

////////////////////////////////////////////////////////////////////////////////////////////////////
// nullable 값 사용과 null 검사
// str이 정수를 포함하지 않을 때 null 을 리턴하는 코드
fun parseInt(str: String): Int? {
	///
}

// nullable 값을 리턴하는 함수 사용
fun main(args : Array<String>) {
	if (args.size < 2) {
		print("Two integers expected")
		return
	}
	
	val x = parseInt(args[0])
	val y = parseInt(args[1])
	
	// 두 값이 null일 수 있으므로 `x * y`는 에러를 발생할 수 있다
	if(x != null && y != null) {
		// null 검사 후에 x와 y를 non-nullable로 자동 변환
		print(x * y)
	}
	
	/**
	 * 다른 예
	 * if(x == null) {
	 *  print("Wrong number format in '${args[0]}'")
	 *  return
	 * }
	 * if(y == null) {
	 *  print("Wrong number format in '${args[0]}'")
	 *  return
	 * }
	 *
	 * // null 검사 후에 x와 y를 non-nullable로 자동 변환
	 * print(x * y)
	 */
}




*/