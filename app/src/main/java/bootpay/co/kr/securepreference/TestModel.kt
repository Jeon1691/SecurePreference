package bootpay.co.kr.securepreference

import bootpay.co.kr.securepref.model.PrefModel

object TestModel : PrefModel() {
    var test by pref("text")
    var number by pref(0)
}