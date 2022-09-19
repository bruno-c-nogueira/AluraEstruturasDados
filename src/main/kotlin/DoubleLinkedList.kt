data class DoubleNode<T>(var value: T?, var next: DoubleNode<T>? = null, var prev: DoubleNode<T>? = null) {
    override fun toString(): String {
        return if (next != null) {
            "$value -> ${next.toString()}"
        } else {
            "$value"
        }
    }
}


class DoubleLinkedList<T>() {
    var size = 0
    var head: DoubleNode<T>? = null
    var tail: DoubleNode<T>? = null

    fun push(value: T?) {
        if (size == 0) {
            head = DoubleNode(value)
            tail = head
        } else {
            val new = DoubleNode(value, next = head)
            head?.prev = new
            head = new
        }
        size++
    }

    fun append(value: T?) {
        if (size == 0) {
            push(value)
        } else {
            val new = DoubleNode(value)
            tail?.next = new
            new.prev = tail
            tail = new
            size++
        }
    }

    fun insertAt(position: Int, value: T?) {
        if (position == 0) {
            push(value)
        } else if (position == size) {
            append(value)
        } else {
            var prev = nodeAt(position - 1)
            var next = prev?.next
            val new = DoubleNode(value, prev?.next)
            new.prev = prev
            prev?.next = new
            next?.prev = new
            size++
        }
    }

    fun nodeAt(position: Int): DoubleNode<T>? {
        var node: DoubleNode<T>? = head
        for (i in 0 until position) {
            node = node?.next
        }

        return node
    }

    fun removeFirst() {
        if (size == 0) return
        head = head?.next
        size--

        if (size == 0) {
            tail = null
        }
    }

    fun removeLast() {
        if (size == 1) {
            removeFirst()
        } else {
            val penult = tail?.prev
            penult?.next = null
            tail = penult
            size--
        }

    }

    fun remove(position: Int) {
        if (position == 0) {
            removeFirst()
        } else if (position == size) {
            removeLast()
        } else {
            val prev = nodeAt(position - 1)
            val current = prev?.next
            val next = current?.next

            prev?.next = next
            next?.prev = prev
            size--
        }
    }

    fun contains(value: T): Boolean{
        var current = head
        while (current != null){
            if (current.value == value){
                return true
            }
            current = current.next

        }
        return false
    }


    override fun toString(): String {
        return if (size == 0) {
            return "Empty list"
        } else {
            this.head.toString()
        }
    }

}