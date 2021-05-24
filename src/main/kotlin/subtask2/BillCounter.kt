package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val fairlySplit = "Bon Appetit"
        val billAnna = bill.filterIndexed { index, _ -> index != k }.sum() / 2
        return if (billAnna == b) fairlySplit else (b - billAnna).toString()
    }
}

