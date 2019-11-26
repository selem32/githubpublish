package com.selem.system

import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.util.AttributeSet
import android.view.View
import androidx.core.content.ContextCompat


class GreenView @JvmOverloads constructor(context: Context,
                attrs: AttributeSet? = null,
                defStyleAttr: Int = 0): View(context, attrs, defStyleAttr) {
    init {
        background = ColorDrawable(ContextCompat.getColor(context, android.R.color.holo_green_light))
    }
}