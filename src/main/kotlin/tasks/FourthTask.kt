package robakidze.nikoloz.tasks

class FourthTask {

    private fun AddBinaryHelper(

        i: Int, j: Int,
        a: String, b: String,

        carry: Int,
        result: StringBuilder

    ): StringBuilder {

        if (i < 0 && j < 0 && carry == 0) {

            return result.reverse()
        }

        val digitA = if (i >= 0) a[i] - '0' else 0
        val digitB = if (j >= 0) b[j] - '0' else 0

        val sum = digitA + digitB + carry
        result.append(sum % 2)

        return AddBinaryHelper(
            i - 1, j - 1,
            a, b,

            sum / 2, result
        )
    }

    fun addBinary(a: String, b: String): String {

        return AddBinaryHelper(

            a.length - 1, b.length - 1,
            a, b, 0,

            StringBuilder()

        ).toString()
    }
}