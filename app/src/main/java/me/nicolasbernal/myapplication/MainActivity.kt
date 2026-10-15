package me.nicolasbernal.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import me.nicolasbernal.myapplication.ui.theme.FacebookTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FacebookTheme {
                var showRegister by remember { mutableStateOf(false) }

                if (showRegister) {
                    FacebookRegisterScreen(
                        onBackClick = { showRegister = false },
                        onLoginClick = { showRegister = false }
                    )
                } else {
                    FacebookLoginScreen(
                        onCreateAccountClick = { showRegister = true }
                    )
                }
            }
        }
    }
}