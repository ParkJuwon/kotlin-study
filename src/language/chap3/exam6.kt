package language.chap3

val lazyValue: String by lazy(LazyThreadSafetyMode.NONE) {
	println("computed!")
	"Hello"
}

fun main(args: Array<String>) {
	println(lazyValue)
	println (lazyValue)
}