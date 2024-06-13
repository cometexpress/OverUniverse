package com.cometexpress.overuniverse.data.remote.dto.heroes;

@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0012\b\u0001\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010\u0013J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u0013\u00108\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H\u00c6\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0098\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\b\u0003\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00c6\u0001\u00a2\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010E\u001a\u00020\bH\u00d6\u0001J\t\u0010F\u001a\u00020\u0003H\u00d6\u0001R$\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001e\"\u0004\b(\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104\u00a8\u0006G"}, d2 = {"Lcom/cometexpress/overuniverse/data/remote/dto/heroes/HeroInfoDTO;", "", "key", "", "abilities", "", "Lcom/cometexpress/overuniverse/data/remote/dto/heroes/HeroInfoAbility;", "age", "", "birthday", "description", "hitpoints", "Lcom/cometexpress/overuniverse/data/remote/dto/heroes/HeroInfoHitpoints;", "location", "name", "portrait", "role", "story", "Lcom/cometexpress/overuniverse/data/remote/dto/heroes/HeroInfoStory;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/cometexpress/overuniverse/data/remote/dto/heroes/HeroInfoHitpoints;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cometexpress/overuniverse/data/remote/dto/heroes/HeroInfoStory;)V", "getAbilities", "()Ljava/util/List;", "setAbilities", "(Ljava/util/List;)V", "getAge", "()Ljava/lang/Integer;", "setAge", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getBirthday", "()Ljava/lang/String;", "setBirthday", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getHitpoints", "()Lcom/cometexpress/overuniverse/data/remote/dto/heroes/HeroInfoHitpoints;", "setHitpoints", "(Lcom/cometexpress/overuniverse/data/remote/dto/heroes/HeroInfoHitpoints;)V", "getKey", "setKey", "getLocation", "setLocation", "getName", "setName", "getPortrait", "setPortrait", "getRole", "setRole", "getStory", "()Lcom/cometexpress/overuniverse/data/remote/dto/heroes/HeroInfoStory;", "setStory", "(Lcom/cometexpress/overuniverse/data/remote/dto/heroes/HeroInfoStory;)V", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/cometexpress/overuniverse/data/remote/dto/heroes/HeroInfoHitpoints;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cometexpress/overuniverse/data/remote/dto/heroes/HeroInfoStory;)Lcom/cometexpress/overuniverse/data/remote/dto/heroes/HeroInfoDTO;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class HeroInfoDTO {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String key;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoAbility> abilities;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer age;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String birthday;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable()
    private com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoHitpoints hitpoints;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String location;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String portrait;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String role;
    @org.jetbrains.annotations.Nullable()
    private com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoStory story;
    
    public HeroInfoDTO(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @com.squareup.moshi.Json(name = "abilities")
    @org.jetbrains.annotations.Nullable()
    java.util.List<com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoAbility> abilities, @com.squareup.moshi.Json(name = "age")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer age, @com.squareup.moshi.Json(name = "birthday")
    @org.jetbrains.annotations.Nullable()
    java.lang.String birthday, @com.squareup.moshi.Json(name = "description")
    @org.jetbrains.annotations.Nullable()
    java.lang.String description, @com.squareup.moshi.Json(name = "hitpoints")
    @org.jetbrains.annotations.Nullable()
    com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoHitpoints hitpoints, @com.squareup.moshi.Json(name = "location")
    @org.jetbrains.annotations.Nullable()
    java.lang.String location, @com.squareup.moshi.Json(name = "name")
    @org.jetbrains.annotations.Nullable()
    java.lang.String name, @com.squareup.moshi.Json(name = "portrait")
    @org.jetbrains.annotations.Nullable()
    java.lang.String portrait, @com.squareup.moshi.Json(name = "role")
    @org.jetbrains.annotations.Nullable()
    java.lang.String role, @com.squareup.moshi.Json(name = "story")
    @org.jetbrains.annotations.Nullable()
    com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoStory story) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKey() {
        return null;
    }
    
    public final void setKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoAbility> getAbilities() {
        return null;
    }
    
    public final void setAbilities(@org.jetbrains.annotations.Nullable()
    java.util.List<com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoAbility> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAge() {
        return null;
    }
    
    public final void setAge(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBirthday() {
        return null;
    }
    
    public final void setBirthday(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoHitpoints getHitpoints() {
        return null;
    }
    
    public final void setHitpoints(@org.jetbrains.annotations.Nullable()
    com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoHitpoints p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPortrait() {
        return null;
    }
    
    public final void setPortrait(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRole() {
        return null;
    }
    
    public final void setRole(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoStory getStory() {
        return null;
    }
    
    public final void setStory(@org.jetbrains.annotations.Nullable()
    com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoStory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoStory component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoAbility> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoHitpoints component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoDTO copy(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @com.squareup.moshi.Json(name = "abilities")
    @org.jetbrains.annotations.Nullable()
    java.util.List<com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoAbility> abilities, @com.squareup.moshi.Json(name = "age")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer age, @com.squareup.moshi.Json(name = "birthday")
    @org.jetbrains.annotations.Nullable()
    java.lang.String birthday, @com.squareup.moshi.Json(name = "description")
    @org.jetbrains.annotations.Nullable()
    java.lang.String description, @com.squareup.moshi.Json(name = "hitpoints")
    @org.jetbrains.annotations.Nullable()
    com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoHitpoints hitpoints, @com.squareup.moshi.Json(name = "location")
    @org.jetbrains.annotations.Nullable()
    java.lang.String location, @com.squareup.moshi.Json(name = "name")
    @org.jetbrains.annotations.Nullable()
    java.lang.String name, @com.squareup.moshi.Json(name = "portrait")
    @org.jetbrains.annotations.Nullable()
    java.lang.String portrait, @com.squareup.moshi.Json(name = "role")
    @org.jetbrains.annotations.Nullable()
    java.lang.String role, @com.squareup.moshi.Json(name = "story")
    @org.jetbrains.annotations.Nullable()
    com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoStory story) {
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