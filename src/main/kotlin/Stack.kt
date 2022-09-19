interface Stack<T> {
    fun push(value: T?)
    fun pop():T?
    fun isEmpty(): Boolean
    fun peek(): T?
}

class StackImpl<T>: Stack<T> {
    private val linkedList = java.util.LinkedList<T>()
    override fun push(value: T?) {
        if (value != null) {
            linkedList.add(value)
        }
    }

    override fun pop(): T? {
        return linkedList.removeAt(linkedList.size - 1)
    }

    override fun isEmpty(): Boolean {
        return linkedList.isEmpty()
    }

    override fun peek(): T? {
        return linkedList.peekLast()
    }

    override fun toString(): String {
        return linkedList.toString()
    }

}
