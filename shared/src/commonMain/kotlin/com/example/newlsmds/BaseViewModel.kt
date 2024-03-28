package com.example.newlsmds

import kotlinx.coroutines.CoroutineScope


expect open class BaseViewModel() {

    val scope: CoroutineScope
}