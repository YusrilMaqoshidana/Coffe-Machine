package id.usereal.coffemachine

fun main() {
    while (inputMachine()) {
        // The inputMachine() function will be called within the loop
    }
}

fun inputMachine(): Boolean {
    println("Ingin pesan kopi? (y/n)")
    val choose = readln()
    return if (choose == "y") {
        println("=== Welcome to Coffe Machine ===")
        print("Siapa namamu: ")
        val name = readln()
        print("Pesan kopi jenis apa: ")
        val jenis = readln()
        print("Ukuran berapa: ")
        val size = readln()
        print("Ingin berapa gula: ")
        val sugarCount = readln().toInt()
        val detail = CoffeDetails(name, jenis, size, sugarCount)
        println("Pesanan kamu")
        println("Nama\t: ${detail.name}")
        println("Jenis\t: ${detail.jenis}")
        println("Ukuran\t: ${detail.size}")
        println("Jumlah gula\t: ${detail.sugarCount}")
        true
    } else {
        false
    }
}

data class CoffeDetails(
    val name: String,
    val jenis: String,
    val size: String,
    val sugarCount: Int
)
