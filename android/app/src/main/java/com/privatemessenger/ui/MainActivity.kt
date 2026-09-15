package com.privatemessenger.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.privatemessenger.R
import com.privatemessenger.ui.theme.DeepNavy
import com.privatemessenger.ui.theme.GlacierMist
import com.privatemessenger.ui.theme.RoyalCobalt
import com.privatemessenger.ui.theme.SealTheme
import com.privatemessenger.ui.theme.SoftYellow
import com.privatemessenger.ui.theme.SteelBlue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SealTheme {
                SkeletonScreen()
            }
        }
    }
}

@Composable
fun SkeletonScreen() {
    val gradient = Brush.verticalGradient(
        colors = listOf(
            RoyalCobalt,
            SteelBlue,
            DeepNavy
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(gradient),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(32.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_logo_seal),
                contentDescription = "Seal logo",
                modifier = Modifier.size(220.dp)
            )

            Spacer(modifier = Modifier.height(28.dp))

            Text(
                text = "Seal",
                style = MaterialTheme.typography.headlineLarge.copy(
                    fontWeight = FontWeight.Bold,
                    color = GlacierMist
                )
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Private messenger",
                style = MaterialTheme.typography.bodyLarge.copy(
                    color = SoftYellow
                )
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Stage 2  •  Skeleton",
                style = MaterialTheme.typography.bodySmall.copy(
                    color = GlacierMist.copy(alpha = 0.65f)
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SkeletonPreview() {
    SealTheme {
        SkeletonScreen()
    }
}
