package language.chap4

import java.util.concurrent.locks.Lock

fun <T> lock(lock: Lock, body: () -> T): T {
	lock.lock()
	try {
		return body()
	} finally {
		lock.unlock()
	}
}


fun <T, R> List<T>.map2(transform: (T) -> R): List<R> {
	val result = arrayListOf<R>()
	for (item in this)
		result.add(transform(item))
	return result
}

fun main(args: Array<String>) {
	val a = listOf(3,4,5)
	println(a.map2 { it -> it  * 2 })
	println(a.map2 { it  * 4 })
}
