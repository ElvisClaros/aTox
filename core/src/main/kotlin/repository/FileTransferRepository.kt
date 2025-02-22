// SPDX-FileCopyrightText: 2019-2020 aTox contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package ltd.evilcorp.core.repository

import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow
import ltd.evilcorp.core.db.FileTransferDao
import ltd.evilcorp.core.vo.FileTransfer

@Singleton
class FileTransferRepository @Inject internal constructor(
    private val dao: FileTransferDao,
) {
    fun add(ft: FileTransfer): Long =
        dao.save(ft)

    fun delete(id: Int) =
        dao.delete(id)

    fun get(publicKey: String): Flow<List<FileTransfer>> =
        dao.load(publicKey)

    fun get(id: Int): Flow<FileTransfer> =
        dao.load(id)

    fun setDestination(id: Int, destination: String) =
        dao.setDestination(id, destination)

    fun updateProgress(id: Int, progress: Long) =
        dao.updateProgress(id, progress)

    fun resetTransientData() = dao.resetTransientData()
}
