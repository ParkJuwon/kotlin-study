package language.chap5

import java.util.*


fun main(args: Array<String>) {
	val items = listOf(1,2,3,4)
	println(items.first() == 1)
	println(items.last() == 4)
	println(items.filter{ it % 2 == 0})
	
	val rwList = mutableListOf(1,2,3)
	println(rwList.requireNoNulls())
	if(rwList.none {it > 6}) println("No items above 6")
	val item = rwList.firstOrNull()
	println(item)
	
	val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
	println(readWriteMap["foo"])
	val snapshot : Map<String, Int> = HashMap(readWriteMap)
	println(snapshot)
	
}
