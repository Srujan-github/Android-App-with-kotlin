package learning.kotlin.android_course

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
        addNickName(it)
        }
    }
    fun addNickName(view: View){
        val editText = findViewById<EditText>(R.id.editNickNameText)
        val nickNameText =  findViewById<TextView>(R.id.nickNameText)
        nickNameText.text = editText.text
        nickNameText.visibility = View.VISIBLE
        editText.visibility = View.GONE
        view.visibility = View.GONE

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

}