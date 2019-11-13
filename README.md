# Challenge HostelWorld

Display a scrollable list of properties retrieved from our mobile API. Each item should at least show the
name of the property, some indication if the property is featured, the property rating formatted as 1 to 10
values with one decimal (8.7) and the property lowest price per night. All prices must be shown in EUR.
Please deliver the code as a zipped project so that it can be built locally or host the project in a public
GitHub/Bitbucket repo.
The API is returning all prices in Venezuelan Bolivar. 1 EUR is found by dividing the VEF value by 7.55
Details
Retrieve the data via GET
https://gist.githubusercontent.com/dovdtel87/ef6dd1422a86554d22172e5975222f81/raw/ba5b81b567efebc
1039a481b7e9712b7cd61ea6c/properties.json

Much of the information can be discarded for the purpose of this challenge. The information you’ll be most
interested in is as follows:
“location” - “city” – Contains information about the city and country.
“properties” - An array of properties inside the city.
"lowestPricePerNight" - shows the lowest price per night for the property.
“overview” - small description
“overallRating” - ”overall” - the property rating from 1 to 100.

Hints
The challenge is deliberately quite open ended; you can do as much or as little as you see fit. However,
there are a few things that we’d like to see:

 Kotlin preferred, although please use Java if you’re more comfortable
 Some testing, Unit and/or integration and/or UI
 Some use of RxJava
 Some use of your preferred dependency injection framework
 A nice Material Design UI is a plus, as is handling loading/content/failure states
 Leave us notes! If you want to explain what you were thinking or trying to achieve, document it in
code.