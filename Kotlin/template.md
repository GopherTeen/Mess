# Cases

```kotlin
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

fun main() {
    repeat(IO.readInt()) {

    }
}
```

# Grammar

```kotlin
// listOf:
//
// get []
// sublist
// indexOf
// first
// last lastIndex  lastIndexOf
// size  isEmpty 
// forEach
// contains
// equals
// 
// binarySearch  binarySearchBy
// drop  dropLast
// find findLast
// groupBy
// slice  count  filter
// any  all
```
