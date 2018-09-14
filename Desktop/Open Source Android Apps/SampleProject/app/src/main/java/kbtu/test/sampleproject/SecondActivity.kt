package kbtu.test.sampleproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val str = intent.getStringExtra("key")
        intent.getIntExtra("number", 0)
        intent.getParcelableExtra<User>("user")
        second_text.text = str
    }
}
