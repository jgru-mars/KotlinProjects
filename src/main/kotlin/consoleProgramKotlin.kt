/*
The author of this code is Josiah Groux

This program is made in Kotlin and will ask the user to enter the names of countries in Europe. It only accepts answers
that are the correct name with the first letter capitalized. If anything else is entered, it will have the user try again.
The program continues until the user can not enter any more countries, then they can exit the program. Right before the
program closes, it will proceed to print out the list of countries that the user did get correct.
 */

import kotlin.system.exitProcess

// the start
fun main() {

    //list of the countries
    val countries = listOf(
        "France",
        "United Kingdom",
        "Spain",
        "Andorra",
        "Portugal",
        "Ireland",
        "Iceland",
        "Norway",
        "Sweden",
        "Finland",
        "Denmark",
        "Austria",
        "Hungary",
        "Switzerland",
        "Germany",
        "Luxembourg",
        "Belgium",
        "Netherlands",
        "Italy",
        "Monaco",
        "Vatican City",
        "San Marino",
        "Slovenia",
        "Slovakia",
        "Croatia",
        "Serbia",
        "Belarus",
        "Russia",
        "Latvia",
        "Ukraine",
        "Moldova",
        "Poland",
        "Czech Republic",
        "Kosovo",
        "Greece",
        "Albania",
        "Romania",
        "Bulgaria",
        "Lithuania",
        "Bosnia and Herzegovina",
        "Estonia",
        "North Macedonia",
        "Malta",
        "Montenegro",
        "Liechtenstein"
    )
    // This is the list that keeps track of the countries the user gets correct
    val foundCountries = mutableListOf("The Countries that you found:")
    var count = 0

    println("This is a game where you enter in names of countries in Europe.")
    println("The rules are simple: Country names start with a Capital letter. Keep going until you can not think of any other European countries. Let us see how many you get!")
    println("Type the name of a European country:")

    // The following takes the input from the User and answers whether the country is correct or they need to try again
    var userInput = readLine()
    if (countries.contains(userInput)) {
        println("The $userInput is a country in Europe!")
        // The next two lines add the input into the list of found countries
        var addCountry = userInput.toString()
        foundCountries.add(addCountry)
        count++
    } else {
        println("Uhhh!Try again! Also, don't forget the first letter is capitalized! And no spaces before the country name!")
    }

    // It enters a while loop that will continue until User says that they do not know any more countries
    another@ while (true) {
        println("Lets go again!")
        println("Yes or No, do you know anymore countries in Europe?")
        when (readLine()?.lowercase()) {
            // if answer is yes to go again, it runs this
            "yes" -> {
                println("Type the name of a new European country:")
                //reads user input
                var userInput = readLine()
                // checks input with country list
                if (countries.contains(userInput)) {
                    println("The $userInput is a country in Europe!")
                    // The next two lines add the input into the list of found countries
                    var addCountry = userInput.toString()
                    foundCountries.add(addCountry)
                    count++
                } else {
                    println("Uhhh!Try again! Also, don't forget the first letter is capitalized! And no spaces before the country name!")
                }
                //continues while loop
                continue@another
            }
            // if answer is no to go again, it exits program after saying what countries they found
            "no" -> {
                println("Okay, thank you for playing")
                println(foundCountries)
                println("you got $count out of 45 European countries!")
                exitProcess(0)
            }
            "yes or no" -> {
                println("Please say either yes or no.")
                //The continue@another will make it so the while loop continues until it exits with a "no" answer
                continue@another
            }
            // if not a yes or no it will run this command. This is a validation
            else -> {
                println("Please say yes or no.")
                //The continue@another will make it so the while loop continues until it exits with a "no" answer
                continue@another
            }
        }
    }
}


