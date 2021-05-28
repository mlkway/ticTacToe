package com.raywenderlich.tbc_shemajamebeli_four

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.raywenderlich.tbc_shemajamebeli_four.databinding.ItemTicTacToeBinding

class DimAdapter(private val dateDims: MutableList<TicTacToe>,private val itemClick: ItemClick):RecyclerView.Adapter<DimAdapter.ViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemTicTacToeBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = dateDims.size

    inner class ViewHolder(private val binding: ItemTicTacToeBinding):RecyclerView.ViewHolder(binding.root),View.OnClickListener{


        fun bind(){
            binding.clickButton.setBackgroundResource(R.drawable.tic_tac)
            binding.clickButton.setOnClickListener(this)

        }





        override fun onClick(v: View?) {
            if (v == binding.clickButton){
                itemClick.clickListener(v as Button, adapterPosition)

            }
        }
    }


}