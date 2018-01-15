package bootpay.co.kr.securepreference

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.EditText
import bootpay.co.kr.securepref.SecurePreference
import java.io.UnsupportedEncodingException
import java.security.GeneralSecurityException

class MainActivity : AppCompatActivity() {

    private val main_edit by lazy { findViewById(R.id.main_edit) as EditText }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SecurePreference.init(this)
    }

    @Throws(UnsupportedEncodingException::class, GeneralSecurityException::class)
    fun onClick_encrypt(v: View) {
        TestModel.number = main_edit.text.toString().toInt()
    }

    @Throws(UnsupportedEncodingException::class, GeneralSecurityException::class)
    fun onClick_decrypt(v: View) {
        Log.d("pref", "${TestModel.number}")
    }
}
