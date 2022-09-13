
class Array<T> {
    private var size = 0
    var list = arrayOfNulls<Any>(2)

    private fun doubleSpace() {
        val newArray = arrayOfNulls<Any>(list.size * 2)
        if (size == list.size) {
            for (i in list.indices) {
                newArray[i] = list[i]
            }
            list = newArray
        }
    }

    fun add(element: T) {
        doubleSpace()
        list[size] = element
        size++
    }

    fun addByPosition(position: Int, element: T) {
        doubleSpace()
        if (position > size) return
        for (i in size downTo position) {
            list[i + 1] = list[i]
        }
        list[position] = element
        size++
    }

    fun removeByPosition(position: Int) {
        for (i in position until size) {
            list[i] = list[i + 1]
        }
        size--
    }

    @Suppress("UNCHECKED_CAST")
    fun getByPosition(position: Int): T {
        kotlin.runCatching {
            return list[position] as T
        }
        throw IllegalArgumentException("Posicao Errada")
    }

    fun printElements() {
        list.forEach {
            println(it.toString())
        }
    }

}

fun main() {
    var myarray = Array<String>()
    myarray.add("Bruno")
    myarray.add("Joselito")
    myarray.add("Aloha")
    myarray.addByPosition(1, "Xablau")
    myarray.removeByPosition(1)
    myarray.printElements()
}