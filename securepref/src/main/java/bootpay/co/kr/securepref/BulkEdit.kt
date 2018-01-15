package bootpay.co.kr.securepref

import bootpay.co.kr.securepref.model.PrefModel

inline fun <T: PrefModel> T.bulk(block: T.() -> Unit) {
    beginBulkEdit()
    try {
        block()
    } catch (e: Exception) {
        cancelBulkEdit()
        throw e
    }
    commitBulkEdit()
}

inline fun <T: PrefModel> T.blockingBulk(block: T.() -> Unit) {
    beginBulkEdit()
    try {
        block()
    } catch (e: Exception) {
        cancelBulkEdit()
        throw e
    }
    blockingCommitBulkEdit()
}
