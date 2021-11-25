package com.sumeyra.animation3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sumeyra.animation3.databinding.FragmentThirdBinding



class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThirdBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =
            FragmentThirdBinding.inflate(LayoutInflater.from(requireContext()), container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnThirdFragment.setOnClickListener{

            val direction = ThirdFragmentDirections.actionThirdFragmentToSecondFragment()
            findNavController().navigate(direction)
        }


        // actionThirdFragmentToSecondFragment()




    }



}