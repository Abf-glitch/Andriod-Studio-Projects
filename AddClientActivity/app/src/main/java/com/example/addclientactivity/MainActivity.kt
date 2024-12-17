package com.example.addclientactivity

import android.R.attr.contentDescription
import android.R.attr.label
import android.media.Image
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.addclientactivity.ui.theme.AddClientActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AddClientActivityTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    AddClient()
                }
                }
            }
        }
    }


@Composable
fun AddClient() {
    val imageUri = rememberSaveable (){
        mutableStateOf<Uri?>(null)
    }
    val painter = rememberImagePainter(
        data = imageUri.value ?: R.drawable.placeholder,
        builder = {Crossfade(true)})
    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()) { }
    var firstname by remember {
        mutableStateOf(value = "")
    }
    Scaffold(
        bottomBar = {
            BottamAppBar(
                actions = {
                    IconButton(onClick = {TODO()}) {
                        Icon(Icons.Filled.Home, contentDescription = "Home")
                    }
                    IconButton(onClick = {TODO()}) {
                        Icon(Icons.Filled.Settings, contentDescription = "Settings")
                    }
                    IconButton(onClick = {TODO()}) {
                        Icon(Icons.Filled.Email, contentDescription = "Email")
                    }
                },
                floatingActionButton = {
                    FloatingActionButton(
                        onClick = {TODO()},
                        containerColor = androidx.compose.material3.BottomAppBarDefaults.bottomAppBarFabColor,
                        elevation = androidx.compose.material3.FloatingActionButtonDefaults.bottomAppBarFabElevation() { }
                    ) {
                        Icon(Icons.Filled.AccountCircle, contentDescription = "Profile")
                    }
                }
            )


        }
    ) { innerPadding->
        Column (modifier = Modifier.padding(innerPadding)){
            Text(text = "ENTER NEW CLIENT",
                fontSize = 25.sp,
                fontStyle = FontStyle,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .background(Color.Magenta)
            )
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween){
                Button(onClick = {TODO()}) {
                    Text(text = "BACK")
                }
                Button(onClick = {TODO()}) {
                    Text(text = "SAVE")
                }
            }
            Column (
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Card(
                    shape = CircleShape,
                    modifier = Modifier.padding(10.dp)
                        .size(180.dp)
                )
                Card (){ 
                    Image(painter = painter, contentDescription = null, modifier = Modifier
                       .size(180.dp)
                       .clickable{launcher.launch("image/*")},
                        contentScale = ContentScale.Crop)
                }
                Text(text = "Attach a picture")
            }
            OutlinedTextField(value = firstname,
                onValueChange = {newFirstname -> firstname = newFirstname},
                placeholder = {Text(text = "Enter your first name")}),
                label = {Text(text = "Enter your first name")},
                modifier = Modifier
                    .wrapContentWidth()
                    .align(Alignment.CenterHorizontally)
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}

@Composable
fun BottamAppBar(actions: @Composable () -> Unit, floatingActionButton: @Composable () -> Unit) {
    TODO("Not yet implemented")
}

@Preview(showBackground = true)
@Composable
fun AddClientPreview() {
    AddClientActivityTheme {
        AddClient()
    }
}

fun rememberImagePainter(data: Any, builder: () -> Unit) {}