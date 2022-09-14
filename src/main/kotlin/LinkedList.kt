data class Node<T>(val value: T?, var next: Node<T>? = null) {
    override fun toString(): String {
        return if (next != null) {
            "$value -> ${next.toString()}"
        } else {
            "$value"
        }
    }
}

class LinkedList<T>() {
    var size = 0

    var head: Node<T>? = null
    var tail: Node<T>? = null

    fun push(value: T?) {
        head = Node<T>(value, next = head)
        if (size == 0) {
            tail = head
        }
        size++
    }

    fun append(value: T?) {
        if (size == 0) {
            push(value)
            return
        }
        tail?.next = Node(value, null)
        tail = tail?.next
        size++
    }

    private fun positionIsValid(position: Int) = (position in 0..size)

    private fun nodeAt(position: Int): Node<T>? {
        if (!positionIsValid(position)) {
            throw IllegalArgumentException("invalid position")
        }
        var currentHead = head
        for (i in 0 until position) {
            currentHead = currentHead?.next
        }
        return currentHead
    }

    fun insertAt(position: Int, value: T) {
        if (position == 0) {
            push(value)
            return
        } else if (position == size) {
            append(value)
            return
        }
        val nodeAt = nodeAt(position - 1)
        val newNode = Node(value, nodeAt?.next)
        nodeAt?.next = newNode
    }

    fun pop() {
        if (size == 0) {
            throw java.lang.IllegalArgumentException("Empty list")
        }
        head = head?.next
        size--
        if (size == 0) {
            tail = null
        }


    }
    fun removeAt(position: Int) {
        if (position > size) {
            throw IllegalArgumentException("Invalid position")
        }
        if (position == 0) {
            head = head?.next
            size--
        } else {
            val nodeAt = nodeAt(position - 1)
            nodeAt?.next = nodeAt?.next?.next
            size--
        }

        if (size == 0) {
            tail = null
        }
    }

    override fun toString(): String {
        return if (size == 0) {
            return "Empty list"
        } else {
            this.head.toString()
        }
    }

}