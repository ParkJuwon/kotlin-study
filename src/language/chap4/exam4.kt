package language.chap4



fun main(args : Array<String>) {
	
	fun <T> max(collection: Collection<T>, less: (T, T) -> Boolean): T? {
		var max: T? = null
		for (it in collection)
			if (max == null || less(max, it))
				max = it
		return max
	}
	
//	fun compare(a: String, b: String): Boolean = a.length < b.length
	val compare : (String, String) -> Boolean = {x,y -> x.length < y.length }
	
	val strings = listOf("123","45","1234512341")
	
	println(max(strings, {a, b -> a.length < b.length}))
	println(max(strings, compare))
	
}

val sum1 = { x: Int, y: Int -> x + y }
val sum2: (Int, Int) -> Int = { x, y -> x + y }