package learning.kotlin.android_course

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import learning.kotlin.android_course.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListner()
    }

    private fun setListner() {
         val textBoxList = listOf(
             binding.boxOneText,
             binding.boxTwoText,
             binding.boxThreeText,
             binding.boxFourText,
             binding.boxFiveText
         )
        for (textBox in textBoxList){
            textBox.setOnClickListener {
               makeColored(it)
            }
        }
    }

    private fun makeColored(view: View) {
        when(view.id){
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_blue_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_blue_light)
        else   -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

}