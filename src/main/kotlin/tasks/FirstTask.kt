package robakidze.nikoloz.tasks

class FirstTask {

    fun singleNumber(numbs: Array<Int>) :Int {

        val countMap = HashMap<Int, Int>()

        for (num in numbs) {

            countMap[num] = countMap.getOrDefault(num, 0) + 1
        }

        for ((num, count) in countMap) {

            if (count == 1) {

                println("Single number is $num.")
                return num
            }
        }

        println("Single number not found.")
        return -1
    }
}