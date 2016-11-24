package language.chap4

import javax.swing.tree.TreeNode

fun <T> TreeNode.findParentOfType(clazz: Class<T>): T? {
	var p = parent
	while (p != null
			&& !clazz.isInstance(p)) {
		p = p?.parent
	}
	@Suppress("UNCHECKED_CAST")
	return p as T
}

inline fun <reified T> membersOf() = T::class.members
fun main(s: Array<String>) {
	println(membersOf<StringBuilder>().joinToString("\n"))
}