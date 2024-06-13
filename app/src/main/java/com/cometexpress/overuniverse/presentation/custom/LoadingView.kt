package com.cometexpress.overuniverse.presentation.custom

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.cometexpress.overuniverse.databinding.LayoutLoadingViewBinding

class LoadingView : ConstraintLayout {

    private lateinit var binding: LayoutLoadingViewBinding

    constructor(context: Context) : super(context) {
        initView(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        initView(context)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        initView(context)
    }

    private fun initView(context: Context) {
        binding = LayoutLoadingViewBinding.inflate(LayoutInflater.from(context), this, true)
        binding.root.setOnTouchListener { p0, p1 -> true }
    }
}