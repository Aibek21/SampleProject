package kbtu.test.sampleproject

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_fragment_tes.*

class FragmentTestActivity : AppCompatActivity(), FirstFragment.OnItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_tes)

        val adapter = MyPagerAdapter(supportFragmentManager)
        pager.adapter = adapter
        tabs.setupWithViewPager(pager)

        pager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                Log.d("Page Selected: ", position.toString())
            }

        })
//        val fragmentFirst = FirstFragment.newInstance("My title")
//        val transaction = supportFragmentManager.beginTransaction()
//        transaction.add(R.id.container, fragmentFirst)
//        transaction.add(R.id.container2, SecondFragment())
//        transaction.commit()
//
//        fragmentFirst.changeTitle("New Title")
    }

//
//    fun onClick(view: View) {
//        val transaction = supportFragmentManager.beginTransaction()
//        transaction.replace(R.id.container, SecondFragment())
//        transaction.commit()
//    }


    override fun onItemSelected(link: String) {
        Log.d("Link: ", link)
    }
}
