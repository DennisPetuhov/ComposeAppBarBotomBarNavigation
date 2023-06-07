package com.example.composeappbarbotombarnavigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

class Fragments {
}

@Composable
fun FragmentOne(text: String, navcontroller: NavController, modifier: Modifier = Modifier) {

    Column() {
        Text(text = "Hello first Fragment", modifier = modifier)
        Button(onClick = { navcontroller.navigate("2to1") }) {

        }

    }
}


@Composable
fun FragmentTwo(text: String, navcontroller: NavController, modifier: Modifier = Modifier) {

    Column() {
        Text(text = "Hello second Fragment", modifier = modifier)
        
        Button(onClick = { navcontroller.navigate("1to2") }) {

        }
        Button(onClick = { navcontroller.navigate("myNavExtension2") }) {
            
        }

    }
}
@Composable
fun Fragment3(text: String, navcontroller: NavController, modifier: Modifier = Modifier) {

    Column() {
        Text(text = "Hello 3 Fragment", modifier = modifier)
        Button(onClick = { navcontroller.navigate("4to3") }) {

        }

    }
}@Composable
fun Fragment4(text: String, navcontroller: NavController, modifier: Modifier = Modifier) {

    Column() {
        Text(text = "Hello 4 Fragment", modifier = modifier)
        Button(onClick = { navcontroller.navigate("3to4") }) {

        }

    }
}