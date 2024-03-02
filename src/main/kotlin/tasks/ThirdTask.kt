package robakidze.nikoloz.tasks

class ThirdTask {

    fun longestPrefix(array: Array<String>): String {

        if (array.isEmpty()) return ""

        val firstWord = array[0]
        var prefix = ""

        for (i in 0 .. firstWord.length) {

            val currentPrefix = firstWord.substring(0, i + 1)

            if (array.all { it.indexOf(currentPrefix) == 0 }) {

                prefix = currentPrefix

            } else { break }
        }

        return prefix
    }
}