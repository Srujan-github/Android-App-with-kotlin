package learning.kotlin.android_course

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import learning.kotlin.android_course.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val randomNumber = Random.nextInt(6) + 1
        val drawableResource = when(randomNumber){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
         binding.diceImage.setImageResource(drawableResource)
    }

}