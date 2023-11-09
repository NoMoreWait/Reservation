package com.konkuk.reserve

data class ReservedInfo(
    val pid: String,
    val uid: String,
    val rid: Long,
    val datetime: Long,
    val numberOfPeople: Long,
)
