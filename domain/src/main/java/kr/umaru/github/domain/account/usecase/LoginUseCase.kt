package kr.umaru.github.domain.account.usecase

import kr.umaru.github.domain.account.repository.AccountRepository
import kr.umaru.github.domain.account.repository.TokenRepository

class LoginUseCase(
    private val accountRepository: AccountRepository,
    private val tokenRepository: TokenRepository
) {
    suspend fun login(token: String) {
        tokenRepository.saveAccessToken(token)
        accountRepository.getAccountInfo()
    }

    fun logout() {
        tokenRepository.deleteAccessToken()
    }
}