package kbtu.test.sampleproject

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first.view.*

class FirstFragment : Fragment() {

    companion object {
        fun newInstance(title: String): FirstFragment {
            val fragment = FirstFragment()
            val arguments = Bundle()
            arguments.putString("title", title)
            fragment.arguments = arguments
            return fragment
        }
    }


    lateinit var title: String
    lateinit var listener: OnItemSelectedListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (arguments != null)
            title = arguments!!.getString("title")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        Log.d("Title: ", title)
//        hello_text.text = "This Is Hello Text!"
        view.btn.setOnClickListener({
            listener.onItemSelected("My Link")
        })
        return view
    }


    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is OnItemSelectedListener)
            listener = context
    }

    fun changeTitle(title: String) {
        this.title = title
        Log.d("ChangedTitle: ", title)
    }

    public interface OnItemSelectedListener {
        fun onItemSelected(link: String)
    }
}