package language.chap5


fun main(args: Array<String>) {
	val i = 5
	if(i in 1..10){ //1<=i&&i<=10와 동일
		println(i)
	}
	
	for (i in 1..4) print(i) // "1234" 출력
	println()
	for (i in 4..1) print(i) // 아무것도 출력하지 않음
	println()
	
	for (i in 4 downTo 1) print(i) // "4321" 출력
	println()
	
	for (i in 1..4 step 2) print(i) // "13" 출력
	println()
	for (i in 4 downTo 1 step 2) print(i) // "42" 출력
	println()
}