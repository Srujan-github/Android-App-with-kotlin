package learning.kotlin.android_course

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import learning.kotlin.MyName
import learning.kotlin.android_course.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("Sai Srujan")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myName = myName
        binding.button.setOnClickListener {
            addNickName(it)
        }
    }

    private fun addNickName(view: View) {
        binding.apply {
            myName?.nickName = editNickNameText.text.toString()
            initializeViewTreeOwners()
            nickNameText.visibility = View.VISIBLE
            editNickNameText.visibility = View.GONE
            view.visibility = View.GONE
        }
        binding.myName = myName
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

}