package pl.adaroz.challenge1

fun main() {
    val hello1 = "Hello"
    val hello2 = "Hello"
    println("hello1 and hello2 are structurally equal: ${hello1 == hello2}")
    println("hello1 and hello2 are referentially equal: ${hello1 === hello2}")

    var number = 2988

    val any: Any = "The Any type is the root of the Kotlin class hierarchy"
    if (any is String)
        println(any.toUpperCase())

    println("   1\n  11\n 111\n1111")
    println(
        """   1
          |  11
          | 111
          |1111""".trimMargin()
    )
    println(
        """1   ${1}
          1  ${11}
          1 ${111}
          1${1111}""".trimMargin("1")
    )
}
