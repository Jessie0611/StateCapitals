package com.example.statecapitals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val findCapital = findViewById<Button>(R.id.find_capital)
        findCapital.setOnClickListener{
            val onState = findViewById<Spinner>(R.id.state)
            val state = onState.selectedItem
            val stCapital = getCapital(state.toString())
            val textBox = stCapital.reduce { str, item -> str}
            val capital = findViewById<TextView>(R.id.capital)
            capital.text = textBox
    }
}
    fun getCapital(state:String): List<String> {
    return when (state) {
        "Alabama" -> listOf("Montgomery")
        "Alaska" -> listOf("Juneau")
        "Arizona" -> listOf("Phoenix")
        "Arkansas" -> listOf("Little Rock")
        "California" -> listOf("Sacramento")
        "Colorado" -> listOf("Denver")
        "Connecticut" -> listOf("Hartford")
        "Delaware" -> listOf("Dover")
        "Florida" -> listOf("Tallahassee")
        "Georgia" -> listOf("Atlanta")
        "Hawaii" -> listOf("Honolulu")
        "Idaho" -> listOf("Boise")
        "Illinois" -> listOf("Springfield")
        "Indiana" -> listOf("Indianapolis")
        "Iowa" -> listOf("Des Moines")
        "Kansas" -> listOf("Topeka")
        "Kentucky" -> listOf("Frankfort")
        "Louisiana" -> listOf("Baton Rouge")
        "Maine" -> listOf("Augusta")
        "Maryland" -> listOf("Annapolis")
        "Massachusetts" -> listOf("Boston")
        "Michigan" -> listOf("Lansing")
        "Minnesota" -> listOf("Saint Paul")
        "Mississippi" -> listOf("Jackson")
        "Missouri" -> listOf("Jefferson City")
        "Montana" -> listOf("Helena")
        "Nebraska" -> listOf("Lincoln")
        "Nevada" -> listOf("Carson City")
        "New Hampshire" -> listOf("Concord")
        "New Jersey" -> listOf("Trenton")
        "New Mexico" -> listOf("Santa Fe")
        "New York" -> listOf("Albany")
        "North Carolina" -> listOf("Raleigh")
        "North Dakota" -> listOf("Bismarck")
        "Ohio" -> listOf("Columbus")
        "Oklahoma" -> listOf("Oklahoma City")
        "Oregon" -> listOf("Salem")
        "Pennsylvania" -> listOf("Harrisburg")
        "Rhode Island" -> listOf("Providence")
        "South Carolina" -> listOf("Columbia")
        "South Dakota" -> listOf("Pierre")
        "Tennessee" -> listOf("Nashville")
        "Texas" -> listOf("Austin")
        "Utah" -> listOf("Salt Lake City")
        "Vermont" -> listOf("Montpelier")
        "Virginia" -> listOf("Richmond")
        "Washington" -> listOf("Olympia")
        "West Virginia" -> listOf("Charleston")
        "Wisconsin" -> listOf("Madison")
        else -> listOf("Cheyenne")
    }
}
}