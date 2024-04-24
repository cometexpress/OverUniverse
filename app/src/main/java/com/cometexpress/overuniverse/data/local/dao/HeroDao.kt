package com.cometexpress.overuniverse.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.cometexpress.overuniverse.domain.entity.heroes.HeroEntity
import io.reactivex.Flowable

@Dao
interface HeroDao {

    @Query("SELECT * FROM HeroEntity")
    fun getAll(): Flowable<List<HeroEntity>>

    @Query("SELECT * FROM HeroEntity WHERE role = :role")
    fun loadAllByRole(role: String): Flowable<List<HeroEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertHeroList(list: List<HeroEntity>)

}