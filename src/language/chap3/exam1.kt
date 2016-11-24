package language.chap3

abstract class Source<out T> {
	abstract fun nextT(): T
}

fun demo(strs: Source<String>) {
	strs.nextT()
	val objects: Source<Any> = strs // T는 out 파라미터이므로 OK // ...
}

abstract class Comparable<in T> {
	abstract fun compareTo(other: T): Int
}
fun demo(x: Comparable<Number>) {
	x.compareTo(1.0) // 1.0은 Number의 상위 타입은 Double 타입을 갖는다 // 그래서, Comparable<Double> 타입 변수를 x에 할당할 수 있다
	val y: Comparable<Double> = x // OK!
}