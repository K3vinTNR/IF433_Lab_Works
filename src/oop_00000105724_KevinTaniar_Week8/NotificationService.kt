package oop_00000105724_KevinTaniar_Week8

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        if (user.email != null) {
            // Smart Cast: compiler tahu user.email tidak null di sini
            sendEmail(emailAddress = user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}