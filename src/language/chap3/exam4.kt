package language.chap3

interface Base {
	fun print()
}
class BaseImpl(val x: Int) : Base {
	override fun print() {
		print(x)
	}
}

class Derived(b: Base) : Base by b

fun main(args: Array<String>) {
	val b = BaseImpl(10)
	Derived(b).print() // 10 출력
}