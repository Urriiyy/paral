/*          вычисление объема параллелепипеда со сторонами 20х10х8
 *
 *                 *****************
 *          thirdSide             **
 *               ***************** *
 *               *               * *
 *         secondSide            **
 *               *****************
 *                  firstSide
 */

fun main() {
    var volParal: Int    // объем параллелепипеда
    println("Введите длинну перврй стороны")
    var firstSide = readLine()!!.toInt()    // одна сторона
    println("Введите длинну второй стороны")
    var secondSide = readLine()!!.toInt()   // вторая сторона
    println("Введите длинну третьей стороны")
    var thirdSide = readLine()!!.toInt()    // третья сторона

    volParal = firstSide * secondSide * thirdSide

    println("Объем параллелепипеда со сторонами ${firstSide}х${secondSide}х${thirdSide} равен $volParal")
}