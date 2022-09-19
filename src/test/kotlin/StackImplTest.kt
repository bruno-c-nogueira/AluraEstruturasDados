import org.junit.Test

class StackImplTest{

    private fun  buildStack() = StackImpl<Int>().apply {
        push(1)
        push(2)
        push(3)
    }
    @Test
    fun insert() {
        val stackImpl = buildStack()
        println(stackImpl)
        println(stackImpl.peek())
    }

    @Test
    fun pop() {
        val stackImpl = buildStack()
        println(stackImpl.pop())
        println(stackImpl)
    }
}