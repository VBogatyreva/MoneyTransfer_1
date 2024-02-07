fun main () {
    val rate = 0.0075
    val minFee = 35
    val amount = 1500

    var totalFee = (amount * rate).toInt()

    if (totalFee < minFee) {
        totalFee = minFee.toInt()
    }

    println("Размер комиссии: " + totalFee + " руб.")

}