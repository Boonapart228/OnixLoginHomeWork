package com.example.onixloginhomework.fragments

import android.animation.Animator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewPropertyAnimator
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.onixloginhomework.R
import com.example.onixloginhomework.databinding.FragmentSplashBinding

class SplashFragment : Fragment(R.layout.fragment_splash) {
    lateinit var binding: FragmentSplashBinding
    private lateinit var animator: ViewPropertyAnimator
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        animator = binding.drachki.animate().apply {
            duration = Companion.duringAnimation.toLong()
            rotationXBy(rotationByX)
            rotationYBy(rotationByY)
        }.setListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) {

            }

            override fun onAnimationEnd(animation: Animator?) {
                findNavController().navigate(R.id.action_splashFragment_to_loginFragment)

            }

            override fun onAnimationCancel(animation: Animator?) {

            }

            override fun onAnimationRepeat(animation: Animator?) {

            }

        })
        animator.start()
    }

    override fun onPause() {
        super.onPause()
        animator.cancel()
    }

    companion object {
        private const val duringAnimation = 5000
        private const val rotationByX = 720f
        private const val rotationByY = 720f
    }
}
