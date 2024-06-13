package com.cometexpress.overuniverse.data.remote.di;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;

@OriginatingElement(
    topLevelClass = NetworkModule.class
)
@InstallIn(SingletonComponent.class)
@Module(
    includes = NetworkModule.class
)
public final class HiltWrapper_NetworkModule {
}
