package kr.umaru.github.domain.repo.usecase

import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import kr.umaru.github.domain.repo.entity.Repo
import kr.umaru.github.domain.repo.repository.RepoRepository


class RepoUseCase(
    private val repoRepository: RepoRepository
) {
    suspend fun getRepository(): Flow<PagingData<Repo>> {
        return repoRepository.getRepo()
    }
}