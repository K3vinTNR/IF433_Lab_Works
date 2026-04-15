package oop_00000105724_KevinTaniar_Week8

class UserProfile(
    val name: String,         // Non-Null (Wajib)
    val email: String?,       // Nullable (Opsional)
    val phone: String? = null // Nullable dengan default value null
)