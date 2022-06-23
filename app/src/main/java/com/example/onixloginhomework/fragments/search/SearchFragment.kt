package com.example.onixloginhomework.fragments.search

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.fragment.findNavController
import com.example.onixloginhomework.R
import com.example.onixloginhomework.WifiData
import com.example.onixloginhomework.databinding.FragmentSearchBinding
import com.example.onixloginhomework.fragments.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class SearchFragment :

    BaseFragment<FragmentSearchBinding>(R.layout.fragment_search) {

    val viewModel: SearchViewModel by viewModel()
    val textArray = arrayListOf<TextView>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel


    }

    override fun setObservers() {
        super.setObservers()
        viewModel.result.observe(viewLifecycleOwner) { data ->
            val constraintLayout: ConstraintLayout = binding.cl

            repeat(textArray.size) {
                constraintLayout.removeView(textArray[it])
            }



            repeat(data.size) {
                val textView = TextView(context)
                textView.text = data[it].short.substring(0, 4)
                constraintLayout.addView(textView)
                val params = textView.layoutParams as ConstraintLayout.LayoutParams
                params.circleConstraint = R.id.getWifi
                params.circleAngle = data[it].angle
                params.circleRadius = data[it].radius * 4
                textView.textSize = 20f
                textView.layoutParams = params
                textView.setOnClickListener{_ ->
                    val action = SearchFragmentDirections.actionSearchFragmentToInfoFragment(data[it].scanResult)
                    navigate(action)
                }
                textArray.add(textView)

            }
        }


    }
}