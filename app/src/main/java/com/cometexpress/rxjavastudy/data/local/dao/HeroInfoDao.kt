package com.cometexpress.rxjavastudy.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroInfoEntity
import io.reactivex.Completable
import io.reactivex.Flowable

@Dao
interface HeroInfoDao {

    @Query("SELECT * FROM HeroInfoEntity WHERE `key` = :heroKey")
    fun loadByHeroKey(heroKey: String): Flowable<HeroInfoEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertHeroInfo(entity: HeroInfoEntity)

}