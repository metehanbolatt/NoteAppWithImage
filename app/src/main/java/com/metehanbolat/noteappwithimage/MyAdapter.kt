package com.metehanbolat.noteappwithimage

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.metehanbolat.noteappwithimage.databinding.RowLayoutBinding

class MyAdapter: RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private var person = emptyList<Person>()

    class MyViewHolder(val binding : RowLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = RowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply {
            userName.text = person[position].firstName
            userSurname.text = person[position].lastName
        }
    }

    override fun getItemCount(): Int {
        return person.size
    }

    fun setData(person: List<Person>) {
        this.person = person
        notifyDataSetChanged()
    }
}