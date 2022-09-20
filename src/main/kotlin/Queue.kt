interface Queue<T> {
    fun add(value: T?)
    fun remove(): T?
    fun isEmpty(): Boolean
    fun peek(): T?
}

class QueueImpl<T> : Queue<T> {
    private var list = LinkedList<T>()

    override fun add(value: T?) {
        list.append(value)
    }

    override fun remove(): T? {
        return list.pop()
    }

    override fun isEmpty(): Boolean {
        return list.size > 0
    }

    override fun peek(): T? {
        return list.head?.value
    }

    override fun toString(): String {
        return list.toString()
    }


}

