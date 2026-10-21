//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Введите пять ингридиентов через запятую и пробел: ")
    val ingredients = readln().split(", ").toMutableList()
    if (ingredients.size != 5) {
        println("Необходимо ввести ровно 5 ингридиентов.")
        return
    }
    println("Вы ввели ингредиенты: ${ingredients.sorted().joinToString(", ")}")

}