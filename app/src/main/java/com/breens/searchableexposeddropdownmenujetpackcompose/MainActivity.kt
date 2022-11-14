package com.breens.searchableexposeddropdownmenujetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.breens.searchableexposeddropdownmenujetpackcompose.ui.theme.SearchableExposedDropDownMenuJetpackComposeTheme
import com.kanyidev.searchable_dropdown.SearchableExpandedDropDownMenu

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SearchableExposedDropDownMenuJetpackComposeTheme {
                Column(
                    Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    val sports =
                        mutableListOf(
                            "Basketball",
                            "Rugby",
                            "Football",
                            "MMA",
                            "Motorsport",
                            "Snooker",
                            "Tennis"
                        )
                    SearchableExpandedDropDownMenu(
                        listOfItems = sports,
                        modifier = Modifier.fillMaxWidth(),
                        onDropDownItemSelected = { item ->
                            Toast.makeText(applicationContext, item, Toast.LENGTH_SHORT).show()
                        }
                    )
                }
            }
        }
    }
}
