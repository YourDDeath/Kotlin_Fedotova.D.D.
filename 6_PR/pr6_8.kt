fun main(){
    print("Введите размер массива: ")
    val n = readln().toInt()
    val arr = IntArray(n)
    print("Массив: ")
    for(i in 0..n-1){
        arr[i] = (1..666).random()
        print("${arr[i]}  ")
    }
    print("\nВведите элемент массива: ")
    val num = readln().toInt()
    println("Индекс = ${arr.indexOf(num)}")
}