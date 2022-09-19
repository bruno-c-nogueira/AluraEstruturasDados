import org.junit.Test

class DoubleLinkedListTest {

    @Test
    fun `push` (){
        val double = DoubleLinkedList<Int>()
        double.push(3)
        double.push(2)
        double.push(1)
        println(double)
    }

    @Test
    fun `append`() {
        val double = DoubleLinkedList<Int>()
        double.append(0)
        double.append(1)
        double.append(2)
        println(double.head)
    }

    @Test
    fun `insert at`(){
        val double = DoubleLinkedList<Int>()
        double.append(0)
        double.append(2)
        double.append(3)
        double.insertAt(1, 1)
        println(double)
    }

    @Test
    fun `test remove first`(){
        val double = DoubleLinkedList<Int>()
        double.append(0)
        double.append(2)
        double.append(3)
        double.removeFirst()
        println(double)
    }

    @Test
    fun `test remove last`(){
        val double = DoubleLinkedList<Int>()
        double.append(0)
        double.append(2)
        double.append(3)
        double.removeLast()
        println(double)
    }

    @Test
    fun `test remove`(){
        val double = DoubleLinkedList<Int>()
        double.append(0)
        double.append(2)
        double.append(3)
        double.remove(1)
        println(double)
    }

    @Test
    fun `test contains`(){
        val double = DoubleLinkedList<Int>()
        double.append(0)
        double.append(2)
        double.append(3)
        assert( double.contains(2))
        println(double)
    }
}