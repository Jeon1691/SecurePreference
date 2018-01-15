package bootpay.co.kr.securepref

import android.annotation.SuppressLint
import android.content.Context

@SuppressLint("StaticFieldLeak")
object SecurePreference {
    internal lateinit var context: Context
        private set

    @JvmStatic
    fun init(context: Context) {
        this.context = context.applicationContext
    }
}
