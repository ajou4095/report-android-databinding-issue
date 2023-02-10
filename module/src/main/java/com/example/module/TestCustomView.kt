package com.example.module

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.cardview.widget.CardView
import com.example.module.databinding.ViewTestBinding

class TestCustomView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyle: Int = 0
) : CardView(context, attributeSet, defStyle) {
    private val binding = ViewTestBinding.inflate(LayoutInflater.from(context), this, true)
}
