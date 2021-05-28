package com.raywenderlich.tbc_shemajamebeli_four

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import com.raywenderlich.tbc_shemajamebeli_four.databinding.FragmentNineDimBinding


class TwentyFiveDimFragment : Fragment() {


    private lateinit var binding: FragmentNineDimBinding

    private lateinit var adapter: DimAdapter

    private val ticTacToe = mutableListOf<TicTacToe>()

    private var indexIndicator = 2


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{

        makeObj()
        binding = FragmentNineDimBinding.inflate(inflater,container,false)

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
        binding.recyclerview.layoutManager = GridLayoutManager(context,5)
        binding.recyclerview.adapter = adapter
        return binding.root
    }

    private fun checkWinner(){
        if (indexIndicator > 5){

        }
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
        ticTacToe.add(TicTacToe(""))
        ticTacToe.add(TicTacToe(""))
        ticTacToe.add(TicTacToe(""))
        ticTacToe.add(TicTacToe(""))
        ticTacToe.add(TicTacToe(""))
        ticTacToe.add(TicTacToe(""))
        ticTacToe.add(TicTacToe(""))
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





}