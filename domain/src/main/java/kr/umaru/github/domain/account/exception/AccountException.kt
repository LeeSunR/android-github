package kr.umaru.github.domain.account.exception

class AccountException : Exception {
    constructor(message: String) : super(message)
    constructor(message: String, cause: Throwable) : super(message, cause)
}