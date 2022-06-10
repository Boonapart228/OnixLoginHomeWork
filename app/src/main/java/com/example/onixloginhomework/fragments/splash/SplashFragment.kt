package com.example.onixloginhomework.fragments.splash

import android.animation.Animator
import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.View
import android.view.ViewPropertyAnimator
import androidx.core.graphics.rotationMatrix
import androidx.navigation.fragment.findNavController
import com.example.onixloginhomework.R
import com.example.onixloginhomework.databinding.FragmentSplashBinding
import com.example.onixloginhomework.fragments.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashFragment :
    BaseFragment<FragmentSplashBinding>(contentLayoutID = R.layout.fragment_splash) {
    private lateinit var animator: ViewPropertyAnimator
    private val viewModel: SplashViewModel by viewModel()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel

    }

    override fun onResume() {
        super.onResume()



        animator = binding.axeSplash.animate().apply {
            duration = Companion.duringAnimation.toLong()
            rotation(rotationByX)
        }.setListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) {

            }

            override fun onAnimationEnd(animation: Animator?) {
                findNavController().navigate(R.id.action_splashFragment_to_questionOneTestFragment)

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
        private const val duringAnimation = 3000
        private const val rotationByX = 1800f
    }
}
