package language.chap5

// 한정한 this
class ZA { // implicit label @A
	inner class B { // implicit label @B
		fun Int.foo() { // implicit label @foo
			val a = this@ZA
			val b = this@B
			
			val c = this // foo() 의 리시버인 Int
			val c1 = this@foo // foo()의 리시버인 Int
			
			val funLit = lambda@ fun String.() {
				val d = this // funLit의 리시버
			}
			
			val funLit2 = { s : String ->
				// 둘러싼 람다 식이 리시버를 갖지 않음으로
				// foo()의 리시버
				val d1 = this
			}
		}
		
	}
}