package language.chap3

fun copy(from: Array<Any>, to: Array<Any>) {
	assert(from.size == to.size)
	for (i in from.indices)
		to[i] = from[i]
}

val ints: Array<Int> = arrayOf(1, 2, 3)
//val any = Array<Any>(3)
//copy(ints, any) // 에러: expects (Array<Any>, Array<Any>)
