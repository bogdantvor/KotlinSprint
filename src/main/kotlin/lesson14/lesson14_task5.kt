package lesson14

class Chat {
    val messages = mutableListOf<Message>()

    fun addMessage(text: String, author: String) {
        val message = Message(text, author)
        messages.add(message)
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        val message = ChildMessage(text, author, parentMessageId)
        messages.add(message)
    }

    fun printChat() {
        val groupedMessages = messages.groupBy { if (it is ChildMessage) it.parentMessageId else it.id }
        printMessages(groupedMessages, null, 0)
    }

    fun printMessages(groupedMessages: Map<Int, List<Message>>, parentId: Int?, depth: Int) {
        groupedMessages[parentId]?.forEach { message ->
            println("\t".repeat(depth) + message.toString())
            if (message is ChildMessage) {
                printMessages(groupedMessages, message.id, depth + 1)
            }
        }
    }
}

open class Message(val text: String, val author: String) {
    companion object {
        private var nextId = 1
    }

    val id: Int = nextId++

    override fun toString(): String {
        return "[$author]: $text"
    }
}

class ChildMessage(text: String, author: String, val parentMessageId: Int) : Message(text, author) {
    override fun toString(): String {
        return "[Reply to message $parentMessageId from $author]: $text"
    }
}

fun main() {
    val chat = Chat()
    chat.addMessage("Hello, everyone!", "Alice")
    chat.addMessage("Hi, Alice!", "Bob")
    chat.addThreadMessage("What's up?", "Charlie", 1)
    chat.addThreadMessage("Not much, just chilling.", "Dave", 3)
    chat.addMessage("Nice weather today!", "Eve")
    chat.printChat()
}
