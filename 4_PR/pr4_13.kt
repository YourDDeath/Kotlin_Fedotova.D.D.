fun main() {
    println("Введите ошибку")
    val a = readln().toInt()

    when (a){
        100 -> println("Информационные сообщения, передача данных (не ошибка)")
        200 -> println("Успешный запрос (не ошибка)")
        300 -> println("Перенаправление на другой адрес (не ошибка)")
        400 -> println("Клиентские ошибки")
        500 -> println("Ошибка сервера")
    }
}