package kr.umaru.github.domain.account.repository

interface TokenRepository {
    fun deleteAccessToken()
    suspend fun saveAccessToken(token:String)
    fun hasAccessToken():Boolean
}