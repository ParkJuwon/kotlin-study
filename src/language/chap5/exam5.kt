package language.chap5

import kotlin.reflect.KClass
import kotlin.reflect.jvm.*

fun isOdd(x: Int) = x % 2 != 0
fun isOdd(s: String) = s == "brillig" || s == "slithy" || s == "tove"

fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
	return { x -> f(g(x)) }
}

var x = 1

class AA(val p: Int)

val String.lastChar: Char
	get() = this[length - 1]

class AB(val p: Int)

class Foo

fun main(args : Array<String>) {
	fun length(s: String) = s.length
	val oddLength = compose(::isOdd, ::length)
	val strings = listOf("a", "ab", "abc")
	println(strings.filter(oddLength)) // "[a, abc]" 출력
	
	println(::x.get()) // "1" 출력 :
	::x.set(2)
	println(x) // "2" 출력
	
	
	val strs = listOf("a", "bc", "def")
	println(strs.map(String::length)) // [1, 2, 3] 출력
	
	val prop = AA::p
	println(prop.get(AA(1))) // prints "1"
	
	println(String::lastChar.get("abc")) // prints "c"
	
	println(AB::p.javaGetter) // "public final int A.getP()" 출력
	println(AB::p.javaField) // "private final int A.p" 출력
	
	fun getKClass(o: Any): KClass<Any> = o.javaClass.kotlin
	
	
	fun function(factory : () -> Foo) { val x : Foo = factory()
	}
	
	function(::Foo)
}