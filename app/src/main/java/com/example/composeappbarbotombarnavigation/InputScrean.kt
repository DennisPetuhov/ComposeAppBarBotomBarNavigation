package com.example.composeappbarbotombarnavigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

class InputScrean {
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyEditText() {
    var inputvalue1 by remember { mutableStateOf("") }
    var isValide by remember { mutableStateOf(false) }

    TextField(value = "",
        onValueChange = { newValue: String ->
            inputvalue1 = newValue
            isValide = validateInput(newValue)
        })
   if (isValide)
        Text(text = "Error")

}

fun validateInput(newValue: String): Boolean {
    return if (newValue.length < 3) return false else true

}


