package language.chap5

fun result(args: Array<String>) = html {
	head {
		title { +"XML encoding with Kotlin" }
	}
	body {
		h1 { +"XML encoding with Kotlin" }
		p { +"this format can be used as an alternative markup to XML" }
		
		// 애트리뷰트와 텍스트 컨텐트를 가진 엘리먼트
		a(href = "http://kotlinlang.org") { +"Kotlin" }
		
		// 혼합 컨텍트
		p {
			+"This is some"
			b { +"mixed" }
			+"text. For more see the"
			a(href = "http://kotlinlang.org") { +"Kotlin" }
			+ "project"
		}
		p { +"some text" }
		// 생성된 컨텍트
		p {
			for (arg in args) +arg
		}
	}
}


fun main(args : Array<String>) {
	println(result( arrayOf("안녕하세요.", "반값습니다.")))
}