package com.example.artspace

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.artspace.ui.theme.ArtSpaceTheme
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.res.stringArrayResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
                DisplayEverything()
            }
        }
    }
}

@Composable
fun TextDisplay(title: String, author: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = title)
        Text(text = author)
    }
}

@Composable
fun DisplayEverything() {
    var count by remember { mutableStateOf(1) }
    val nameArray = stringArrayResource(R.array.building_name)
    val descriptionArray = stringArrayResource(R.array.description)
    var name: String = nameArray[count - 1]
    var description: String = descriptionArray[count - 1]

//    when(count){
//        1 -> {
//            name = nameArray [count - 1]
//            description = descriptionArray[count - 1]
//        }
//        2 -> {
//            name = nameArray [count - 1]
//            description = descriptionArray[count - 1]
//        }
//        3 -> {
//            name = nameArray [count - 1]
//            description = descriptionArray[count - 1]
//        }
//        4 -> {
//            name = nameArray [count - 1]
//            description = descriptionArray[count - 1]
//        }
//        5 -> {
//            name = nameArray [count - 1]
//            description = descriptionArray[count - 1]
//        }
//        6 -> {
//            name = nameArray [count - 1]
//            description = descriptionArray[count - 1]
//        }
//        7 -> {
//            name = nameArray [count - 1]
//            description = descriptionArray[count - 1]
//        }
//        8 -> {
//            name = nameArray [count - 1]
//            description = descriptionArray[count - 1]
//        }
//        9 -> {
//            name = nameArray [count - 1]
//            description = descriptionArray[count - 1]
//        }
//        else -> {
//            name = nameArray [count - 1]
//            description = descriptionArray[count - 1]
//        }
//}

var image = when (count) {
    1 -> R.drawable.al_hamra
    2 -> R.drawable.burj_al_arab
    3 -> R.drawable.burj_khalifa
    4 -> R.drawable.canton_tower
    5 -> R.drawable.kingdom_centre
    6 -> R.drawable.lotte_world_tower
    7 -> R.drawable.marina_bay_sands
    8 -> R.drawable.shanghai_tower
    9 -> R.drawable.space_needle
    else -> R.drawable.transamerica_pyramid
}
Row(modifier = Modifier) {
    Image(
        painter = painterResource(image),
        contentDescription = null,
    )
    Spacer(modifier = Modifier.width(16.dp))
    TextDisplay(title = name, author = description)
}
Row(
modifier = Modifier.fillMaxSize(),
horizontalArrangement = Arrangement.Center
) {
    //   Text(text = "text")
//        Button(
//            onClick = {
//                count += 1
//                if(count > 10){
//                    count = 1
//                }
//                if(count < 1){
//                    count = 10
//                }
//            },
//            modifier = Modifier.padding(8.dp)
//        ) {
//            Text(text = "Next")
//        }
//        Button(
//            onClick = { count -= 1 },
//            modifier = Modifier.padding(8.dp)
//        ) {
//            Text(text = "Previous")
//        }
}
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ArtSpacePreview() {
    ArtSpaceTheme {
        DisplayEverything()
    }
}