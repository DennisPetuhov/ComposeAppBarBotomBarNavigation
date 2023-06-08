package com.example.composeappbarbotombarnavigation

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopBar(navcontroller:NavHostController) {
    TopAppBar(
        title = {
//                    Text(text = "Top App Bar")
            Row() {
                IconButton(onClick = { }) {
                    Icon(Icons.Filled.Menu, contentDescription = "Меню")
                }
                Text("WWWW", fontSize = 22.sp)
                Spacer(Modifier.weight(1f, true))

                IconButton(onClick = { navcontroller.navigate("1to2")}) {
                    Icon(Icons.Filled.Info, contentDescription = "Информация о приложении")
                }
                IconButton(onClick = {  }) {
                    Icon(Icons.Filled.Search, contentDescription = "Поиск")
                }

            }
        },
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(Icons.Filled.ArrowBack, "backIcon")
            }
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = Color.Blue,
        ),

        )

}
