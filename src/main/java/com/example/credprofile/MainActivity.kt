package com.example.credprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import coil.compose.AsyncImage
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { ProfileScreen() }
    }
}

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF1C1C1C))
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(text = "←    Profile              ", style = MaterialTheme.typography.headlineLarge,
                color = Color.White)
            Box(
                modifier = Modifier
                    .border(
                        brush = Brush.linearGradient(colors = listOf(Color.Gray, Color.Gray)),
                        width = 1.dp,
                        shape = CircleShape
                    ).padding(10.dp)
            ) {
                Row {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Support",
                        tint = Color.White,
                        modifier = Modifier
                            .size(16.dp)
                            .background(Color.Black)

                    )
                    Text(text = " Support", color = Color.White, style = MaterialTheme.typography.bodyMedium)
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        HeaderSection()
        KnowYourVehicleSection()
        Spacer(modifier = Modifier.height(16.dp))
        SectionCard()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
        ) {
            RewardsSection()
            Spacer(Modifier.height(20.dp))

            TransactionSection()
            Spacer(Modifier.height(250.dp))
        }
    }
}

@Composable
fun HeaderSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        ProfilePicture(imageUrl = "https://th.bing.com/th/id/OIP.JAAd31mxF33HqZEgYq9zgAHaHv?rs=1&pid=ImgDetMain")

        Spacer(modifier = Modifier.width(12.dp))

        Column {
            Text(
                text = "Andaz Kumar",
                style = MaterialTheme.typography.headlineSmall,
                color = Color.White
            )
            Text(
                text = "Member since December 2020",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Gray
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        Box(
            modifier = Modifier.padding(12.dp)
                .border(
                    brush = Brush.linearGradient(colors = listOf(Color.Gray, Color.Gray)),
                    width = 1.dp,
                    shape = CircleShape
                )
        ) {
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = "Edit Profile",
                tint = Color.Gray,
                modifier = Modifier
                    .size(30.dp)
                    .padding(4.dp)
                    .background(color = Color.Black)

            )
        }

    }
}

@Composable
fun ProfilePicture(imageUrl: String) {
    AsyncImage(
        model = imageUrl,
        contentDescription = "Profile Picture",
        modifier = Modifier
            .size(60.dp)
            .clip(CircleShape),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun SectionCard(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text("📊 Credit Score",style = MaterialTheme.typography.bodyLarge, color = Color.White, textAlign = TextAlign.End)
            Text("•REFRESH AVAILABLE",style = MaterialTheme.typography.bodyLarge, color = Color.Green, textAlign = TextAlign.End)
            Spacer(modifier = Modifier.width(40.dp))
            Text("757 ➝", style = MaterialTheme.typography.bodyLarge, color = Color.White, textAlign = TextAlign.End)


        }
        Divider(color = Color.Gray, thickness = 1.dp, modifier =Modifier.padding(vertical = 8.dp))
        Row (
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text("🎁 Lifetime Cashback", style = MaterialTheme.typography.bodyLarge, color = Color.White)
            Spacer(modifier = Modifier.width(170.dp))
            Text("₹3 ➝", style = MaterialTheme.typography.bodyLarge, color = Color.White, textAlign = TextAlign.End)
        }
        Divider(color = Color.Gray, thickness = 1.dp, modifier =Modifier.padding(vertical = 8.dp))
        Row (
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text("🏦 Bank Balance", style = MaterialTheme.typography.bodyLarge, color = Color.White)
            Spacer(modifier = Modifier.width(180.dp))
            Text("Check ➝", style = MaterialTheme.typography.bodyLarge, color = Color.White, textAlign = TextAlign.End)
        }
        Divider(color = Color.Gray, thickness = 1.dp, modifier =Modifier.padding(vertical = 8.dp))



    }

}
@Composable
fun KnowYourVehicleSection() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        border = BorderStroke(1.dp, color = Color.Gray),
        colors = CardDefaults.cardColors(containerColor = Color.Black)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
                .clip(RectangleShape),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "\uD83D\uDE97 Get to know your vehicle inside out.",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text("CRED Garage ➝", style = MaterialTheme.typography.bodyMedium, color = Color.White)
        }
    }
}




@Composable
fun RewardsSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
    ) {
        Text("YOUR REWARDS & BENEFITS", style = MaterialTheme.typography.bodyMedium, color = Color.White)
        Spacer(modifier = Modifier.height(12.dp))

        Text("💰 Cashback Balance", style = MaterialTheme.typography.bodyMedium, color = Color.White)
        Text("₹0", style = MaterialTheme.typography.bodyMedium, color = Color.White)

        Divider(color = Color.Gray, thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))

        Text("🪙 Coins", style = MaterialTheme.typography.bodyMedium, color = Color.White)
        Text("26,46,583", style = MaterialTheme.typography.bodyMedium, color = Color.White)

        Divider(color = Color.Gray, thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            "Win upto ₹1000 \nRefer & Earn",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.White
        )
    }
}


@Composable
fun TransactionSection() {
    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Text("  TRASACTIONS & SUPPORT", style = MaterialTheme.typography.bodyMedium, color = Color.White, textAlign = TextAlign.End)
        Spacer(modifier = Modifier.height(12.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(" 📜 All Transactions", style = MaterialTheme.typography.bodyLarge, color = Color.White)
            Text("➝", style = MaterialTheme.typography.bodyLarge, color = Color.White, textAlign = TextAlign.End)
        }

    }
}
