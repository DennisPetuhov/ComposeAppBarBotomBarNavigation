package com.example.composeappbarbotombarnavigation.ui.theme

import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.composeappbarbotombarnavigation.Fragment3
import com.example.composeappbarbotombarnavigation.Fragment4
import com.example.composeappbarbotombarnavigation.FragmentOne
import com.example.composeappbarbotombarnavigation.FragmentTwo

fun NavGraphBuilder.myNavExtension1(navController: NavController) {
    navigation(startDestination = "1to2", route = "myNavExtention1")
    {

        composable("1to2") {
            FragmentOne(
                navcontroller = navController,
                modifier = Modifier,
                text = "Navigate from 1 to 2"
            )
        }
        composable("2to1") {
            FragmentTwo(
                text = "Navigate from 2 to 1",
                navcontroller = navController,
                modifier = Modifier
            )
        }


    }


}
fun NavGraphBuilder.myNavExtesion2(navController: NavController){
    navigation(startDestination = "3to4", route="myNavExtension2")
    {
        composable("3to4") {
            Fragment3(
                navcontroller = navController,
                modifier = Modifier,
                text = "Navigate from 1 to 2"
            )
        }
        composable("4to3") {
            Fragment4(
                text = "Navigate from 2 to 1",
                navcontroller = navController,
                modifier = Modifier
            )
        }

    }
}