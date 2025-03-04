package com.hoc081098.github_search_kmm.android.core_ui

import androidx.compose.ui.graphics.Color
import com.hoc081098.github_search_kmm.domain.model.ArgbColor

fun Color.Companion.fromArgbColor(argbColor: ArgbColor): Color? {
  val (red, green, blue, alpha) = argbColor.argb() ?: return null

  return Color(
    red = red,
    green = green,
    blue = blue,
    alpha = alpha
  )
}
