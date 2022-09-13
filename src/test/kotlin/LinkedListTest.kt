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
        linkedList.append2(1)
        linkedList.append2(2)
        linkedList.append2(3)
        println(linkedList)
        linkedList.pop()
        println(linkedList)
    }
}