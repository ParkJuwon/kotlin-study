package language.chap1

import java.io.File
import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
	// if not null 단축 표현
	val files = File("Text").listFiles()
	println(files?.size)
	
	// if not null 과 else 단축 표현
	println(files?.size ?: "empty")
	
	// null 이면 문장 실행
	val data = mapOf("test" to 1)
	val email = data["email"] ?: throw IllegalStateException("Email is missing")
	
	// null이 아니면 실행
	data?.let {
		// null 이 아니면 이 블록 실행
	}
	
	
	// when 문장에서 리턴하기
	fun transform(color: String): Int {
		return when (color) {
			"Red" -> 0
			"Green" -> 1
			"Blue" -> 2
			else -> throw IllegalArgumentException("Invalid color param value")
		}
	}
	
	// try/catch 식
	fun test() {
		val result = try {
			
		} catch (e: ArithmeticException) {
			throw IllegalStateException(e)
		}
		
		// 작업 block
	}
	
	// if 식
	fun foo(param: Int) {
		val result = if (param == 1) {
			"one"
		} else if (param == 2) {
			"two"
		} else {
			"three"
		}
	}
	
	// unit 을 리턴하는 메서드를 빌더 스타일로 사용
	fun arrayOfMinusOnes(size: Int): IntArray {
		return IntArray(size).apply { fill(-1) }
	}
	
	// 한 개 식을 갖는 함수
	fun theAnswer() = 42
	
	// 이 코드와 동일
	fun theANswer(): Int {
		return 42
	}
	
	// 코드를 더 짧게 하기 위해 다른 이디엄과 함께 사용
	fun transForm(color: String): Int = when (color) {
		"red" -> 0
		"Green" -> 1
		"Blue" -> 2
		else -> throw IllegalArgumentException("Invalid color param value")
	}
	
	
	// 객체 인스턴스 여러번 호출 하기 ( with )
	class Turtle {
		fun penDown() {
		}
		
		fun penUp() {
		}
		
		fun turn(degree: Double) {
		}
		
		fun forward(pixels: Double) {
		}
	}
	
	val myTurtle = Turtle()
	with(myTurtle) {
		penDown()
		for (i in 1..4) {
			forward(100.0)
			turn(90.0)
		}
		penUp()
	}
	
	// 자바 7의 try-with-resource
	val stream = Files.newInputStream(Paths.get("/some/file.txt"))
	stream.buffered().reader().use { reader ->
		println(reader.readText())
	}
	
	// 제네릭 타입 정보가 필요한 제네릭 함수를 위한 간편 형식
	//inline fun <reified T : Any> Gson.fromJson(json): T = this.fromJson(json, T::class.java)
	
}




