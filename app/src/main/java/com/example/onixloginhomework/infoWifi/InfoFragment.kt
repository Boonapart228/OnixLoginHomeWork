package com.example.onixloginhomework.infoWifi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.navArgs
import com.example.onixloginhomework.R
import com.example.onixloginhomework.databinding.FragmentInfoBinding
import com.example.onixloginhomework.fragments.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class InfoFragment :
DialogFragment(){
    private val scanResult by navArgs<InfoFragmentArgs>()
    lateinit var binding : FragmentInfoBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentInfoBinding.inflate(inflater, container, false)
            .also { binding = it }.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        scanResult.scanResult
        binding.textInfo.text = getString(R.string.network_name,scanResult.scanResult.SSID)
        binding.text.text = getString(R.string.network_score,scanResult.scanResult.level.toString())
    }



}