package com.cometexpress.overuniverse.data.remote.dto.heroes;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0012\b\u0001\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0013\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u00c6\u0003J5\u0010\u0019\u001a\u00020\u00002\u0012\b\u0003\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\bH\u00d6\u0001R$\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006 "}, d2 = {"Lcom/cometexpress/overuniverse/data/remote/dto/heroes/HeroInfoStory;", "", "chapters", "", "Lcom/cometexpress/overuniverse/data/remote/dto/heroes/HeroInfoChapter;", "media", "Lcom/cometexpress/overuniverse/data/remote/dto/heroes/HeroInfoMedia;", "summary", "", "(Ljava/util/List;Lcom/cometexpress/overuniverse/data/remote/dto/heroes/HeroInfoMedia;Ljava/lang/String;)V", "getChapters", "()Ljava/util/List;", "setChapters", "(Ljava/util/List;)V", "getMedia", "()Lcom/cometexpress/overuniverse/data/remote/dto/heroes/HeroInfoMedia;", "setMedia", "(Lcom/cometexpress/overuniverse/data/remote/dto/heroes/HeroInfoMedia;)V", "getSummary", "()Ljava/lang/String;", "setSummary", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class HeroInfoStory {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoChapter> chapters;
    @org.jetbrains.annotations.Nullable()
    private com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoMedia media;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String summary;
    
    public HeroInfoStory(@com.squareup.moshi.Json(name = "chapters")
    @org.jetbrains.annotations.Nullable()
    java.util.List<com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoChapter> chapters, @com.squareup.moshi.Json(name = "media")
    @org.jetbrains.annotations.Nullable()
    com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoMedia media, @com.squareup.moshi.Json(name = "summary")
    @org.jetbrains.annotations.Nullable()
    java.lang.String summary) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoChapter> getChapters() {
        return null;
    }
    
    public final void setChapters(@org.jetbrains.annotations.Nullable()
    java.util.List<com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoChapter> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoMedia getMedia() {
        return null;
    }
    
    public final void setMedia(@org.jetbrains.annotations.Nullable()
    com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoMedia p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSummary() {
        return null;
    }
    
    public final void setSummary(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoChapter> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoMedia component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoStory copy(@com.squareup.moshi.Json(name = "chapters")
    @org.jetbrains.annotations.Nullable()
    java.util.List<com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoChapter> chapters, @com.squareup.moshi.Json(name = "media")
    @org.jetbrains.annotations.Nullable()
    com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoMedia media, @com.squareup.moshi.Json(name = "summary")
    @org.jetbrains.annotations.Nullable()
    java.lang.String summary) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}