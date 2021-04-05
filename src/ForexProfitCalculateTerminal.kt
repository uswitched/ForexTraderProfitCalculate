object ForexProfitCalculateTerminal {

    @JvmStatic
    fun main(args: Array<String>) {
        val deposit = 3400.00
        var result: Double = deposit

        var percentTask = 3.5F
        var percentWithdrawProfit=0.05F
        val percentDecrease = 0.995F

        var taskProfit: Double
        var dayClearProfit: Double
        var allProfit = 0.0

        val timeFrame = 334

        var i = 1
        println("            Deposit = $deposit")
        println(" Day     Equity    Result       Task    Profit    Clear Profit  All ClearProfit")

        while (i <= timeFrame) {

            print(" (" + String.format("%03d", i) + ")")
            print(" " + String.format("%9.2f", result))

            taskProfit = result / 100 * percentTask
            dayClearProfit = taskProfit*percentWithdrawProfit
            allProfit += dayClearProfit
            result += taskProfit-dayClearProfit


            print(" " + String.format("%9.2f", result))

            print(" " + String.format("%9.2f", percentTask))

            print(" " + String.format("%9.2f", taskProfit))
            print("    " + String.format("%9.2f", dayClearProfit))
            print("    " + String.format("%9.2f", allProfit))

            println()

            i += 1
            percentTask *= percentDecrease
            //percentWithdrawProfit *= percentDecrease


        }
    }
}