package org.suisound.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform