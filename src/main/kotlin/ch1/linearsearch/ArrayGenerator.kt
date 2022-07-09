package ch1.linearsearch

object ArrayGenerator {
    fun generateOrderedArray(n: Int): Array<Int> {
        val arr = arrayOf(n)
        for (i in arr.indices) {
            arr[i] = i
        }
        return arr
    }
}
