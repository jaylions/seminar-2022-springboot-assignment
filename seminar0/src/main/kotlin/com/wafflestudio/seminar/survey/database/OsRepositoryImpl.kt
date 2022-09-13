package com.wafflestudio.seminar.survey.database

import com.wafflestudio.seminar.survey.domain.OperatingSystem

class OsRepositoryImpl(private val memoryDB: MemoryDB):OsRepository {
    override fun findAll(): List<OperatingSystem> {
        return memoryDB.getOperatingSystems()
    }

    override fun findById(id: Long): OperatingSystem {
        var os=memoryDB.getOperatingSystems()
        os=os.filter { it.id==id }
        return os[0]
    }
}