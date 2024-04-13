package com.cometexpress.rxjavastudy.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.cometexpress.rxjavastudy.domain.entity.heroes.RoleEntity
import io.reactivex.Completable
import io.reactivex.Flowable

@Dao
interface RoleDao {
    @Query("SELECT * FROM RoleEntity")
    fun getAll(): Flowable<List<RoleEntity>>

    @Query("SELECT * FROM RoleEntity WHERE `key` IN (:role)")
    fun loadAllByRole(role: String): Flowable<List<RoleEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRoleList(list: List<RoleEntity>): Completable

//    @Query(
//        "SELECT * FROM user WHERE first_name LIKE :first AND " +
//                "last_name LIKE :last LIMIT 1"
//    )
//    fun findByName(first: String, last: String): User
//
//    @Delete
//    fun delete(user: User)
}