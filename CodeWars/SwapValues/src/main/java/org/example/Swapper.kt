package org.example

class Swapper(@JvmField var arguments: Array<Int?>) {
    fun swapValues() {
        val temp = arguments[0]
        arguments[0] = arguments[1]
        arguments[1] = temp
    }
}
