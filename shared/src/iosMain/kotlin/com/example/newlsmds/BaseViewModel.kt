package com.example.newlsmds

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.cancel

actual open class BaseViewModel {
    // Androidのライフサイクルとは違うので、ViewModelを継承しない
    // iosにはviewModelのがないので、自作する必要がある
    actual val scope: CoroutineScope = CoroutineScope(Dispatchers.IO)

    // Androidのようにライフサイクルを意識できないから必ず処理が終了したらclearすること
    fun clear() {
        scope.cancel()
    }
}