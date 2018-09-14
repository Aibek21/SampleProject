package kbtu.test.sampleproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val users = ArrayList<User>()

        val adapter = ListAdapter(users)
        recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler.adapter = adapter

        for (i in 1..50) {
            users.add(User("User$i", i + 10))
        }

        adapter.notifyDataSetChanged()
//        users.add(User("New User", 11))

    }
}
