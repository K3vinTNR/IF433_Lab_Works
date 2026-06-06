package oop_00000105724_KevinTaniar_week14

class InvoiceProcessor {
    fun calculateTotal(price: Double, taxRate: Double): Double {
        return price + (price * taxRate)
    }
    fun saveToFile(invoiceId: String, total: Double) {
        println("Saving invoice $invoiceId with total $total to database.")
    }
    fun sendEmailNotification(email: String) {
        println("Sending invoice confirmation email to $email.")
    }
}