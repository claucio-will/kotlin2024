package enums


fun main() {
   println( Role.ADMIN.level)
    println(Role.ADMIN.canDelete())
    println(Role.USER.canDelete())
}

enum class Role(val level: Level) {
    USER(Level.BASIC),
    MODERATOR(Level.MEDIUM),
    ADMIN(Level.HIGH);

    fun canDelete() = this == ADMIN

}

enum class Level {
    BASIC,
    MEDIUM,
    HIGH
}