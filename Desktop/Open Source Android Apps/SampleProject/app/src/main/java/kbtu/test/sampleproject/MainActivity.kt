package kbtu.test.sampleproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number = 0
    lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "------------------- onCreate()")
        user = User("Aibek", number)

        if (savedInstanceState != null) {
            number = savedInstanceState.getInt("number")
            user = savedInstanceState.getParcelable("user")
        }


        hello_text.text = user.age.toString()


//        button.setOnClickListener(View.OnClickListener {
//            val intent = Intent(this, SecondActivity::class.java)
//            startActivity(intent)
//        })
    }

    fun onClick(view: View) {

        when (view.id) {
            R.id.button -> {
//                val intent = Intent(this, SecondActivity::class.java)
//                intent.putExtra("key", "Hello World Text")
//                intent.putExtra("number", 123)
//                intent.putExtra("user", user)
//                startActivity(intent)
                number++
                hello_text.text = number.toString()
                user.age = number
            }
        }
    }


    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        Log.d("onSaveInstanceState", number.toString())
        outState?.putInt("number", number)
        outState?.putParcelable("user", user)
    }
}
