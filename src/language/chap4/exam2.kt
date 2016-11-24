package language.chap4

import java.util.*

fun <T> asList(vararg ts: T): List<T> { val result = ArrayList<T>()
	for (t in ts) // ts는 Array
		result.add(t)
	
	return result
}

fun main(args: Array<String>) {
	val list = asList(1, 2 ,3)
	println(list)
	
	// * : 펼침 연산 (spread operator)
	val a = arrayOf(1, 2, 3)
	val list2 = asList(-1, 0, *a, 4)
	
	println(list2)
}

// 꼬리 재귀 함 (Tail recursive functions)
tailrec fun findFixPoint(x: Double = 1.0): Double
		= if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))
