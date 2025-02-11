fun readInt() = readln().toInt()
fun readLong() = readln().toLong()
fun readDouble() = readln().toDouble()
fun readStrings() = readln().split(" ")
fun readInts() = readStrings().map { it.toInt() }
fun readLongs() = readStrings().map { it.toLong() }
fun readDoubles() = readStrings().map { it.toDouble() }

fun <T> call(vararg items: T) {
    for (item in items) {
        print("$item ")
    }
    println()
}

fun solve() {
    val a = readln().split('+')
    val n = a.size
    var ans = a[0].toLong() + a[n - 1].toLong()
    for (i in 1..n - 2) {
        val t = a[i]
        var mx = 0L
        for (j in 1..<t.length) {
            mx = maxOf(mx, t.substring(0, j).toLong() + t.substring(j).toLong())
        }
        ans += mx
    }
    call(ans)

    println()
}

fun main() {
    repeat(readInt()) {
        solve()
    }
}