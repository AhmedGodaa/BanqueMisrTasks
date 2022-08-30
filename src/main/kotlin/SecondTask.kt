fun main(args: Array<String>) {


//    First Problem
    getFirstStringMatch(listOf("Maze", "Mr.", "More"))
//    Second Problem
    getTheDefaultORMatch(listOf("Mr.", "Maze", "More"))
//    Third Problem
    checkAtLeastOneItemMatchCount(listOf("a", "abc"), 3)
//    Fourth Problem
    checkAllItemsMatchCount(listOf("a", "abc"), 2)
//    Fifth Problem
    getItemBeforeCondition(listOf("abc", "Ma", "M"))
//    Sixth Problem
    getListLength(listOf("a", "abc", "ab"))

}

/**
 * I want to return the first item that matches the following conditions:
 *1. The item contains the character 'r'
 *2. The item starts with the character 'M'
 *
Hint: ["Maze", "Mr.", "More"] will return "Mr.".
 */
fun getFirstStringMatch(list: List<String>) {
    for (text in list) {
        if (text.startsWith("M")) {
            if (text.contains("r")) {
                println(text)
                break
            }
        }


    }
}


/**
 * Problem 2
 *
 *I want to return the only item that matches the following conditions:
 *1. The item contains the character 'r'
 *2. The item starts with the character 'M'
 *
 *Hint: If no match or more than one match were found, return default result.
 *
 *Hint: ["Mr.", "Maze"] will return "Mr.". ["Mr.", "More"] will return the default result
 */
fun getTheDefaultORMatch(list: List<String>) {
    val _list = mutableListOf<String>()
    for (text in list) {
        if (text.startsWith("M")) {
            if (text.contains("r")) {
                _list.add(text)
            }
        }
    }
    if (_list.size != 1) {
        print(list[0])
    } else {
        print(_list[0])
    }


}

/**
 * Problem 3
 *
 * I want to return true if at least one item matches the following conditions:
 *
 *1. The item length is >= 'count' Otherwise, return false.
 *
 *Hint: if items = ["a", "abc"] and count = 3, will return true.
 */
fun checkAtLeastOneItemMatchCount(list: List<String>, count: Int) {
    var counter = 0
    for (text in list) {
        if (text.length >= count) {
            counter++

        }
    }
    if (counter >= 1) {
        println(true)
    } else {
        println(false)
    }
}

/**
 * Problem 4
 *
 *I want to return true if all items match the following conditions:
 *
 *1. The item length is >= 'count' Otherwise, return false.
 *
 * Hint: if items = ["a", "abc"] and count = 3, will return false.
 */
fun checkAllItemsMatchCount(list: List<String>, count: Int) {
    var itemsMatches = 0
    for (text in list) {
        if (text.length >= count) {
            itemsMatches++

        }
    }
    if (itemsMatches == list.size) {
        println(true)
    } else {
        println(false)
    }
}

/**
 * Fifth Problem
 *
 * I want to return the items before the one that matches the following conditions:
 * 1. The item contains the character 'a'
 * 2. The item starts with the character 'M',
 *
 * Hint: ["a", "Ma", "M"] will return ["a"]
 */
fun getItemBeforeCondition(list: List<String>) {
    var counter = -1
    for (text in list) {
        counter++
        if (text.startsWith("M")) {
            if (text.contains("a")) {
                try {
                    println(list[counter - 1])
                } catch (e: Exception) {
                    println("No item before condition first item is " + list[counter])
                }

                break
            }
        }
    }

}

/**
 * Problem 6
 *
 *I want to return the items starting with the one that matches the following conditions:
 *
 *1. The item length equals 'count'
 *
 *Hint: if items = ["a", "abc", "ab"] and count = 3, will return ["abc", "ab"]
 */
fun getListLength(list: List<String>) {
    val listLength = mutableListOf<Int>()
    for (text in list) {
        listLength.add(text.length)
    }
    return print(listLength)


}
