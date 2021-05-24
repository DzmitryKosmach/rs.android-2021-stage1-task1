package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val happyList: MutableList<Int> = sadArray.toMutableList()
        for (i in happyList.size - 2 downTo 1) {
            if ((happyList[i - 1] + happyList[i + 1]) < happyList[i]) {
                happyList.removeAt(i)
            }
        }
        return happyList.toIntArray()
    }
}
