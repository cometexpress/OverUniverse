package com.cometexpress.overuniverse.data.local.di;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;

@OriginatingElement(
    topLevelClass = DatabaseModule.class
)
@InstallIn(SingletonComponent.class)
@Module(
    includes = DatabaseModule.class
)
public final class HiltWrapper_DatabaseModule {
}
