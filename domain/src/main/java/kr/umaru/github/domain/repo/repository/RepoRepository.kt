package kr.umaru.github.domain.repo.repository

import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import kr.umaru.github.domain.repo.entity.Repo

interface RepoRepository {
    fun getRepo(): Flow<PagingData<Repo>>
}