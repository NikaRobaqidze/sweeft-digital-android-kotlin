package robakidze.nikoloz.tasks

class SecondTask {

    fun minSplit(amount: Int): Int {

        val monets = arrayOf(50, 20, 10, 5, 1)
        var tempAmount = amount
        var monetsNum = 0

        for (monet in monets) {

            val numNeeded = tempAmount / monet

            monetsNum += numNeeded
            tempAmount -= numNeeded * monet

            if (tempAmount == 0) break
        }

        return monetsNum
    }
}