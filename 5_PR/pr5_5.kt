fun main() {
    print("Введите число: ")
    val n = readln().toInt()
    if (isSim(n)) println("Число $n - простое")
    else println("Число $n - непростое")
}

fun isSim(n: Int): Boolean {
    if (n == 1) return false
    else {
        for(i in 1..n-1) {
            if (i == 1)continue
            else if (n % i == 0) return false
        }
    }
    return true
}