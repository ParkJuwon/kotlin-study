package language.chap3

class Outer {
	private val bar: Int = 1
	
	class Nested {
		//		fun foo() = bar // 불가능
		fun foo() = 2
	}
}

val demo = Outer.Nested().foo() // == 2

class Outer2 {
	private val bar: Int = 1
	
	inner class Inner {
		fun foo() = bar
	}
}

val demo2 = Outer2().Inner().foo() // == 1


open class A(x: Int) {
	public open val y: Int = x
}

interface B {}

val ab: A = object : A(1), B {
	override val y = 15
}


fun main(args : Array<String> ) {
	val adHoc = object {
		var x: Int = 0
		var y: Int = 0
	}
	print(adHoc.x + adHoc.y)
}
