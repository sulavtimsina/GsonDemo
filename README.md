# GsonDemo

This project will take a JSON response (which for simplicity is saved in a res/raw/json file), read it and convert it into POJO(Normal Java Object).

The JSON string is the reponse I got when calling a Walmart API. It has many objects but my Product model only has 2 fields which I require to display in my text view.
This is the simplest possible demo of Gson Library.

Make sure to add the gson dependency in build.gradle file for the app.
compile group: 'com.google.code.gson', name: 'gson', version: '2.8.2'

At the time when you are viewing it, the gson version may have changed, so make sure you enter the recent version.