const val amount = 1_000_000

fun main() {
    val fee = calcFee(amount)
    println("""
        Transfer amount: $amount kopecks.
        The commission will be: $fee kopecks.
    """.trimIndent())
}

fun calcFee(amount: Int): Int{
    val possibleFee = amount / 10_000 * 75
    val minFee = 3_500
    return if (possibleFee > minFee) possibleFee else minFee
}

