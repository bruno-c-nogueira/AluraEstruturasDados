import org.junit.Test

class QueueImplTest {

    @Test
    fun add(){
        val queue: Queue<String> = QueueImpl<String>()

        queue.add("Bruno")
        queue.add("Jose")
        println(queue)
        println("ïtem removed ${queue.remove()}")
        println(queue)
    }
}