import java.util.*


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val userInput = scanner.nextLine()
    var res = 0
    val stack = Stack<Int>()
    var num = 0
    var sign = '+'
    var index = 0
    while (index < userInput.length) {
        val cur = userInput[index]
        if (Character.isDigit(cur)) {
            num = 10 * num + (cur.toInt() - '0'.toInt())
        }
        if (!Character.isDigit(cur) && cur != ' ' || index == userInput.length - 1) {
            if(sign == '+') {
                stack.push(num)
            } else if(sign == '-') {
                stack.push(-num)
            } else if(sign == '*') {
                stack.push(stack.pop() * num)
            } else if(sign == '/') {
                stack.push(stack.pop() / num)
            }

            sign = cur
            num = 0
        }
        index++
    }
    while (!stack.empty()) {
        res += stack.pop()
    }
    println(intArrayOf(res, index)[0])

}


