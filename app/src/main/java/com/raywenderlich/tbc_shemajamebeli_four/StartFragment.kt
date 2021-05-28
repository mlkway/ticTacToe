package com.raywenderlich.tbc_shemajamebeli_four

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import com.raywenderlich.tbc_shemajamebeli_four.databinding.FragmentStartBinding


class StartFragment : Fragment() {


    private lateinit var binding: FragmentStartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStartBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.NineDim.setOnClickListener {
            setFragmentResult("request", bundleOf("nine" to 9))
            findNavController().navigate(R.id.action_startFragment_to_nineDimFragment)
        }
        binding.TwentyFiveDim.setOnClickListener {
            setFragmentResult("requesttw", bundleOf("twentyfive" to 25))
            findNavController().navigate(R.id.action_startFragment_to_twentyFiveDimFragment)
        }


    }


}