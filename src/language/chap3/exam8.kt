package language.chap3

class You(val map: Map<String, Any?>) {
	val name: String by map
	val age: Int by map
}

class MutableUser(val map: MutableMap<String, Any?>) {
	var name: String by map
	var age: Int by map
}

fun main(args:Array<String>) {
	
	val user = You( mapOf(
			"name" to "John Doe",
			"age" to 25
	))
	
	
	println(user.name) // "John Doe" 출력
	println(user.age) // 25 출력
	
	
	val muser = MutableUser(mutableMapOf(
			"name" to "John park",
			"age" to 30
	))
	
	println(muser.name) // "John Doe" 출력
	println(muser.age) // 25 출력
}
