package ch1.linearsearch

object LinearSearch {
    fun <E> linearSearch(arr: Array<E>, target: E): Int {
        for ((index, e) in arr.withIndex()) {
            if (e == target) {
                return index
            }
        }
        return -1
    }
}
