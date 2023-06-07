package com.example.composeappbarbotombarnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.composeappbarbotombarnavigation.ui.theme.ComposeAppBarBotomBarNavigationTheme

import androidx.compose.material.*

import androidx.compose.material.icons.filled.*
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.composeappbarbotombarnavigation.ui.theme.myNavExtension1
import com.example.composeappbarbotombarnavigation.ui.theme.myNavExtesion2
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            navController = rememberNavController()

            MyScaffold(navController)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyScaffold(navcontroller: NavHostController) {
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        floatingActionButton = {
            var clickCount by remember { mutableStateOf(0) }
            ExtendedFloatingActionButton(
                onClick = {
                    // show snackbar as a suspend function
                    scope.launch {
                        snackbarHostState.showSnackbar(
                            "Snackbar # ${++clickCount}"

                        )
                    }
                }
            ) { Text("Show snackbar") }
        },
        topBar = {
            TopAppBar(
                title = {
//                    Text(text = "Top App Bar")
                    Row() {
                        IconButton(onClick = { }) {
                            Icon(Icons.Filled.Menu, contentDescription = "Меню")
                        }
                        Text("METANIT.COM", fontSize = 22.sp)
                        Spacer(Modifier.weight(1f, true))

                        IconButton(onClick = { }) {
                            Icon(Icons.Filled.Info, contentDescription = "Информация о приложении")
                        }
                        IconButton(onClick = { navcontroller.navigate("1to2") }) {
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
        }, content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp)
                    .padding(it),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.weight(1f))

                Navigation(navcontroller = navcontroller)
                Spacer(modifier = Modifier.weight(1f))

            }
        })
}



@Composable
fun Navigation(navcontroller: NavHostController) {

    NavHost(navController = navcontroller, startDestination = "myNavExtention1" ){
        myNavExtension1(navcontroller)
        myNavExtesion2(navcontroller)





    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeAppBarBotomBarNavigationTheme {
        Greeting("Android")
    }
}