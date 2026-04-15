package oop_00000105724_KevinTaniar_Week8

object DatabaseMock {
    fun findUser(id: Int): UserProfile? {
        return if (id == 1) UserProfile("TestUser", "test@test.com") else null
    }

    fun runMockUnitTest() {
        println("\n=== RUNNING UNIT TEST ===")
        val testUser = findUser(1)
        // Penggunaan !! lazim di testing agar test langsung gagal jika null [cite: 176]
        val initial = testUser!!.name.substring(0, 1)
        check(initial == "T") { "Test Failed! Initial is wrong." }
        println("Test Passed: Initial is T")
    }
}