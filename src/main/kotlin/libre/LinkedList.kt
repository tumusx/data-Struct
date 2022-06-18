package libre

import org.w3c.dom.Node

class LinkedList<T> {
    var head: No<T>? = null
    var tail: No<T>? = null
    private var size = 0

    internal fun isEmpity(): Boolean {
        return size == 0
    }

    override fun toString(): String {
        if (isEmpity()) {
            return "Lista vazia"
        } else {
            return head.toString()
        }
    }

    internal fun append(valor: T): LinkedList<T> {
        if (isEmpity()) {
            pushList(valor)
        }
        tail?.proximo = No(valor)
        tail = tail?.proximo
        size++
        return this
    }

    fun insertNode(valor: Int): No<T>? {
        var currentNode = head
        var currentIndice = 0

        while (currentNode != null && currentIndice < valor) {
            currentNode = currentNode.proximo
            currentIndice++
        }

        return currentNode
    }

    fun insert(valor: T, afterNode: No<T>): No<T>? {
        if (tail == afterNode) {
            append(valor)
            return tail
        }
        val nextNode = No(valor, afterNode.proximo)
        afterNode.proximo = nextNode
        size++
        return nextNode
    }

    internal fun pushList(valor: T): LinkedList<T> {
        head = No(valor = valor, proximo = head)
        if (tail == null) {
            tail = head
        }
        size++

        return this
    }

    internal fun removeElement(valor: T) {
        if (head?.valor != null) {
            head?.proximo = null
        } else {
            pushList(valor)
        }
        pushList(valor)
    }
}

fun main() {
    val objLinkedList = LinkedList<Int>()
    objLinkedList.pushList(9).pushList(8).pushList(7).pushList(6)
    objLinkedList.append(5).append(6).append(8)
    println(objLinkedList)

    // println("Antes de inserir $objLinkedList")
    var noM = objLinkedList.insertNode(1)
    for (i in 1..3) {
        noM = objLinkedList.insert(-1 * i, noM!!)
    }

    println("aqui foi antes de remover os valores: $objLinkedList")
    objLinkedList.removeElement(4)
    println("aqui foi depois de remover os elementos: $objLinkedList")
    //print("Depois de inserir $objLinkedList")

}