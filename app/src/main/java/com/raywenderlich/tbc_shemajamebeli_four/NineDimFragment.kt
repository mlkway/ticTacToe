package com.raywenderlich.tbc_shemajamebeli_four

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResultListener
import androidx.recyclerview.widget.GridLayoutManager
import com.raywenderlich.tbc_shemajamebeli_four.databinding.FragmentNineDimBinding


class NineDimFragment : Fragment() {

    private lateinit var binding: FragmentNineDimBinding

    private lateinit var adapter: DimAdapter

    private  var ticTacToe = mutableListOf<TicTacToe>()

    private var indexIndicator = 2




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        makeObj()
        binding = FragmentNineDimBinding.inflate(layoutInflater,container,false)

        adapter = DimAdapter(ticTacToe, object:ItemClick{
            override fun clickListener(btn: Button, position: Int) {
                if (indexIndicator % 2 == 0){
                    btn.text = "X"
                    btn.isClickable = false
                    indexIndicator++
                    ticTacToe[position].clicked = "X"

                }else {
                    btn.text = "O"
                    indexIndicator++
                    btn.isClickable = false
                    ticTacToe[position].clicked = "X"
                }
            }
        })
        binding.recyclerview.layoutManager = GridLayoutManager(context,3)
        binding.recyclerview.adapter = adapter
        // Inflate the layout for this fragment
        return binding.root



    }

    private fun makeObj(){
        ticTacToe.add(TicTacToe(""))
        ticTacToe.add(TicTacToe(""))
        ticTacToe.add(TicTacToe(""))
        ticTacToe.add(TicTacToe(""))
        ticTacToe.add(TicTacToe(""))
        ticTacToe.add(TicTacToe(""))
        ticTacToe.add(TicTacToe(""))
        ticTacToe.add(TicTacToe(""))
        ticTacToe.add(TicTacToe(""))
    }

    private fun checkWinner(){
        if(indexIndicator > 5){
            if (ticTacToe[0].clicked == ticTacToe[1].clicked && ticTacToe[2].clicked == ticTacToe[1].clicked){
                Toast.makeText(context,"winner is ${ticTacToe[0].clicked}", Toast.LENGTH_SHORT).show()
            }else if (ticTacToe[0].clicked == ticTacToe[3].clicked && ticTacToe[6].clicked == ticTacToe[1].clicked){
                Toast.makeText(context,"winner is ${ticTacToe[0].clicked}", Toast.LENGTH_SHORT).show()
            }
        }
    }



}