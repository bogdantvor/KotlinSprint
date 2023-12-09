package lesson11

data class Room(
    val coverUrl: String,
    val name: String,
    val participants: List<RoomParticipant>
)

data class User(
    val userId: Int,
    val username: String,
    val avatarUrl: String
)

enum class RoomStatus {
    TALKING,
    MICROPHONE_OFF,
    USER_MUTED
}

data class RoomParticipant(
    val user: User,
    val status: RoomStatus
)

fun main() {
    val user1 = User(1, "Алексей", "https://example.com/avatar1.jpg")
    val user2 = User(2, "Богдан", "https://example.com/avatar2.jpg")
    val user3 = User(3, "Михаил", "https://example.com/avatar3.jpg")

    val participants = listOf(
        RoomParticipant(user1, RoomStatus.TALKING),
        RoomParticipant(user2, RoomStatus.MICROPHONE_OFF),
        RoomParticipant(user3, RoomStatus.USER_MUTED)
    )

    val room = Room(
        coverUrl = "https://example.com/room-cover.jpg",
        name = "Programming Chat",
        participants = participants
    )

    println("Room Name: ${room.name}")
    println("Cover URL: ${room.coverUrl}")

    println("Participants:")
    room.participants.forEach { participant ->
        println("${participant.user.avatarUrl} - ${participant.status}")
    }

}
