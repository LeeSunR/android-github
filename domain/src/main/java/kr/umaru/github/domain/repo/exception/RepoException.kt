package kr.umaru.github.domain.repo.exception

class RepoException:Exception {
    constructor(message: String) : super(message)
    constructor(message: String, cause: Throwable) : super(message, cause)
}