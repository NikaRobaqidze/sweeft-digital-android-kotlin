package robakidze.nikoloz.tasks

private class Node(val key: Int, val value: Int) {

    var prev: Node? = null
    var next: Node? = null
}

class LinkedList {

    private val map = HashMap<Int, Node>()

    private var head: Node? = null
    private var tail: Node? = null

    fun delete(key: Int) {

        val node = map[key] ?: return

        if (node.prev != null) {

            node.prev!!.next = node.next

        } else {

            head = node.next
        }

        if (node.next != null) {

            node.next!!.prev = node.prev

        } else {

            tail = node.prev
        }

        map.remove(key)
    }

    fun insert(key: Int, value: Int) {

        delete(key)

        val newNode = Node(key, value)
        map[key] = newNode

        if (head == null) {

            head = newNode
            tail = newNode

        } else {

            newNode.next = head
            head!!.prev = newNode
            head = newNode
        }
    }

    fun print() {

        var current = head

        print("[")

        while (current != null) {

            print("{ ${current.key}: ${current.value} }")
            current = current.next

            if (current != null) print(", ")
        }

        println("]")
    }
}