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
        binding.btnRoll.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val randomNumber = Random.nextInt(6) + 1
         binding.tvFirstText.text = getString(R.string.roll_dice, randomNumber)
    }

}