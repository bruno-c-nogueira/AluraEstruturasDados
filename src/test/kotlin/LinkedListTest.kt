import org.junit.Test

class LinkedListTest{

    @Test
    fun `testing push in linked list`() {
        val linkedList = LinkedList<Int>()
        linkedList.push(5)
        linkedList.push(4)
        linkedList.push(3)
        linkedList.push(2)
        linkedList.push(1)
        println(linkedList)
    }

    @Test
    fun `testing the append`(){
        val linkedList = LinkedList<Int>()
        linkedList.append(1)
        linkedList.append(2)
        linkedList.append(3)
        println(linkedList)
    }

    @Test
    fun `testing insert at`(){
        val linkedList = LinkedList<Int>()
        linkedList.append(1)
        linkedList.append(3)

        linkedList.insertAt(0,0)
        linkedList.insertAt(2,2)
        linkedList.insertAt(4,4)
        println(linkedList)
    }

    @Test
    fun `remove first element`(){
        val linkedList = LinkedList<Int>()
        linkedList.append(1)
        linkedList.append(2)
        linkedList.append(3)
        println(linkedList)
        linkedList.pop()
        println(linkedList)
    }

    @Test
    fun  `remove at`() {
        val linked = LinkedList<Int>()
        linked.append(1)
        linked.append(2)
        linked.append(3)
        linked.removeAt(3)
        println(linked)
    }
}