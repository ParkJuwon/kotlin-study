package language.chap5

fun main(args: Array<String>) {
	val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
	val readOnlyView: List<Int> = numbers
	println(numbers) // "[1, 2, 3]" 출력
	numbers.add(4)
	println(readOnlyView) // "[1, 2, 3, 4]" 출력
//	readOnlyView.clear() // -> 컴파일되지 않음
	
	val strings = hashSetOf("a", "b", "c", "c")
	assert(strings.size == 3)
}

