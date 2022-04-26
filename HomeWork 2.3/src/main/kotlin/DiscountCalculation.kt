import java.util.*

fun main() {

    val startDiscount = 10_000
    val discount5 = 0.05
    val discountMeloman = 0.01
    var discount = 0
    var finalDiscount = 0

    val scanner = Scanner(System.`in`)

    println("Введите сумму покупки")
    val input = scanner.nextDouble()
    val amount = (input * 100).toInt()
    if (amount <= 100_000) {
        println("Скидки за разовую покупку нет")
        discount = amount/100
    } else if (amount >= 100_100 && amount <= 1_000_000) {
        discount = (amount - startDiscount) / 100
        println("Скидка за разовую покупку 100 рублей, сумма к оплате $discount")

    } else if (amount >= 1_000_100) {
        discount = (amount - (amount * discount5).toInt()) / 100
        println("Скидка за разовую покупку 5 процентов, сумма к оплате  $discount")
    }
    println("Введите статус покупателя true and false")
    val meloman = scanner.nextBoolean()
    if (meloman == true){
        finalDiscount = (discount - (discount * discountMeloman)).toInt()
        println("Действует скидка постоянного покупателя, сумма к оплате $finalDiscount")
    } else println("Нет скидки постоянного покупателя, сумма к оплате $discount")
}