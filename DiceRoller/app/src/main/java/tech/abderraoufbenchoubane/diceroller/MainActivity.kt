package tech.abderraoufbenchoubane.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var imageView: ImageView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button);
        imageView = findViewById(R.id.dice_value);
        rollButton.text = "Let's roll";
        rollButton.setOnClickListener {
            handleRollDice();
        };
    }

    private fun handleRollDice() {
        val drawableResource = when(Random.nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_5
        }
        imageView.setImageResource(drawableResource);
    }

}