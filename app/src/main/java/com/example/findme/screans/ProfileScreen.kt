package com.example.findme.screans

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.findme.R
import com.example.findme.ui.theme.Lato

@Composable
fun ProfileScreen() {

    Box(modifier = Modifier.fillMaxSize()) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally // Align items to the center
        ) {

//          LOGO
            Spacer(modifier = Modifier.size(40.dp))
            Text(
                text = "FATEDATE",
                color = Color.Black,
                style = androidx.compose.ui.text.TextStyle(
                    fontSize = 30.sp,
                    textAlign = TextAlign.Center, // Center align text
                    fontFamily = Lato,
                    fontWeight = FontWeight.Black
                )
            )

//          PROFILE IMG
            Spacer(modifier = Modifier.size(50.dp))
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
                    .border(
                        shape = CircleShape,
                        border = BorderStroke(2.dp, Color.White)
                    )
            )

//          USERNAME
            Spacer(modifier = Modifier.size(40.dp))
            Text(
                text = "USER NAME",
                color = Color.Black,
                style = androidx.compose.ui.text.TextStyle(
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center, // Center align text
                    fontFamily = Lato,
                    fontWeight = FontWeight.Bold
                )
            )

//          SETTINGS BUTT
            Spacer(modifier = Modifier.size(50.dp))
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .width(280.dp)
                    .height(50.dp)
                    .shadow(elevation = 15.dp, shape = RoundedCornerShape(20.dp)), // Add this line
                colors = ButtonDefaults.buttonColors(Color(0xFF59C9A5)) // Correct parameter name
            )
            {
                //Button text
                Text(
                    text = "SETTINGS",
                    color = Color.White,
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center, // Center align text
                        fontFamily = Lato,
                        fontWeight = FontWeight.Bold
                    )
                )
            }

//          EDIT PROFILE BUTT
            Spacer(modifier = Modifier.size(30.dp))
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .width(280.dp)
                    .height(50.dp)
                    .shadow(elevation = 15.dp, shape = RoundedCornerShape(20.dp)), // Add this line
                colors = ButtonDefaults.buttonColors(Color(0xFF59C9A5)) // Correct parameter name
            )
            {
                //Button text
                Text(
                    text = "EDIT PROFILE",
                    color = Color.White,
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center, // Center align text
                        fontFamily = Lato,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 320, heightDp = 640)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}