package language.chap1

import java.util.*


fun main(args : Array<String>) {
	
	// for 루프 사용
	for (arg in args)
		print(arg)
	
	//또는
	for(i in args.indices)
		print(args[i])
	
	// while 루프 사용
	var i = 0
	while(i < args.size)
		print(args[i++])
	
	
	// when 식 사용
	fun cases(obj : Any) {
		when(obj) {
			1 -> print("One")
			"Hello" -> print("Greeting")
			is Long -> print("Long")
			!is String -> print("Not a string")
			else -> print("Unknown")
		}
	}
	
	// 범위(range) 사용하기
	val x = 5
	val y = 10
	if(x in 1..y-1)
		print("OK")
	
	if(x !in 0..args.lastIndex)
		print("Out")
	
	// 범위의 속한 숫자를 반복
	for (x in 1..5)
		print(x)
	
	//콜랙션 사용
	//반복
	val names = mutableListOf<String>()
	names.add("김갑수")
	names.add("박철수")
	names.add("이환수")
	for( name in names)
		println(name)
	
	// in 연산자를 사용해서 콜렉션이 객체를 포함하고 있는지 검사
	if ( "이환수" in names)
		print("yes")
	
	// 콜렉션 필터링 및 변환 을 위한 람다 사용
	names
		.filter{ it.startsWith("김")}
		.sortedBy { it }
		.map{ it.toUpperCase() }
		.forEach { print(it) }
}

