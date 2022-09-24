import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class Game {
    private val LightColors = lightColors()
    private val DarkColors = darkColors()

    @Composable
    @Preview
    fun game(squareSize: Int) {
        var text by remember { mutableStateOf("Hello, World!") }
        var gameField = arrayListOf<Int>()
        var change = false
        var change2 = false

        MaterialTheme(colors = darkColors()) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Column(
                    modifier = Modifier.align(Alignment.BottomStart).fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceAround
                ) {
                    TextButton(
                        onClick = {
                            if (change) {
                                text = "Hello, Desktop!"
                                change = false
                            } else {
                                text = "Hello, World!"
                                change = true
                            }
                        },
                        shape = RoundedCornerShape(30.0F)
                    ) {
                        Text(text)
                    }

                    Button(
                        onClick = {
                            text = "Hello, PC!"
                        },
                        modifier = Modifier.background(Color.Cyan), shape = RoundedCornerShape(30.0F)
                    ) {
                        Text(text)
                    }
                }
            }
        }
    }
}