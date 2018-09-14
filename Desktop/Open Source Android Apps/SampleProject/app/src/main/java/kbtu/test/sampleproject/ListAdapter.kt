package kbtu.test.sampleproject

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.list_item.view.*

class ListAdapter(var users: List<User>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = users[position].name
        holder.age.text = users[position].age.toString()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_item, parent, false)

        Log.e("onCreateViewHolder", "********************** recreate")
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }


    inner class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var name: TextView = itemView!!.name
        var age: TextView = itemView!!.age


    }
}