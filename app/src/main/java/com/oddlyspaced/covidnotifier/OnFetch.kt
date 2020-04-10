package com.oddlyspaced.covidnotifier

interface OnFetch {
    fun onFetch(totalCase:Int, todayCase: Int)
}