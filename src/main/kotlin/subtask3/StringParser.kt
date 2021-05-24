package subtask3

class StringParser {
    private val resultStrings: MutableList<String> = mutableListOf()
    private val brackets = hashMapOf('[' to ']', '<' to '>', '(' to ')')

    fun getResult(inputString: String): Array<String> {
        val chars = inputString.toCharArray()
        for (i in chars.indices) {
            if (chars[i] == '[' || chars[i] == '<' || chars[i] == '(') {
                addBalancedBracketString(chars.drop(i + 1).toCharArray(), chars[i])
            }
        }
        return resultStrings.toTypedArray()
    }

    private fun addBalancedBracketString(chars: CharArray, bracket: Char) {
        val result: MutableList<Char> = mutableListOf()
        val closeBracket = brackets[bracket]
        var countOpenBrackets = 0
        for (i in chars.indices) {
            if (chars[i] == bracket) {
                countOpenBrackets++
            }
            if (chars[i] == closeBracket) {
                if (countOpenBrackets == 0) {
                    resultStrings.add(String(result.toCharArray()))
                    return
                } else {
                    countOpenBrackets--
                }
            }
            result.add(chars[i])
        }
    }
}
