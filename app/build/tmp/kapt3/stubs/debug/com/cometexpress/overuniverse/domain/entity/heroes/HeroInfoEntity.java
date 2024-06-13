package com.cometexpress.overuniverse.domain.entity.heroes;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0013H\u00c6\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\t\u00108\u001a\u00020\tH\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\rH\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J}\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u00c6\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010C\u001a\u00020\tH\u00d6\u0001J\t\u0010D\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001e\"\u0004\b!\u0010\u0004R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001e\"\u0004\b\'\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001e\"\u0004\b+\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001e\"\u0004\b-\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001e\"\u0004\b/\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103\u00a8\u0006E"}, d2 = {"Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroInfoEntity;", "", "key", "", "(Ljava/lang/String;)V", "abilities", "", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroInfoEntityAbility;", "age", "", "birthday", "description", "hitpoints", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroInfoEntityHitpoints;", "location", "name", "portrait", "role", "story", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroInfoEntityStory;", "(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroInfoEntityHitpoints;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroInfoEntityStory;)V", "getAbilities", "()Ljava/util/List;", "setAbilities", "(Ljava/util/List;)V", "getAge", "()I", "setAge", "(I)V", "getBirthday", "()Ljava/lang/String;", "setBirthday", "getDescription", "setDescription", "getHitpoints", "()Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroInfoEntityHitpoints;", "setHitpoints", "(Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroInfoEntityHitpoints;)V", "getKey", "setKey", "getLocation", "setLocation", "getName", "setName", "getPortrait", "setPortrait", "getRole", "setRole", "getStory", "()Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroInfoEntityStory;", "setStory", "(Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroInfoEntityStory;)V", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
@androidx.room.Entity()
public final class HeroInfoEntity {
    @androidx.room.PrimaryKey()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String key;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityAbility> abilities;
    private int age;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String birthday;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull()
    private com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityHitpoints hitpoints;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String location;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String portrait;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String role;
    @org.jetbrains.annotations.NotNull()
    private com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityStory story;
    
    public HeroInfoEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityAbility> abilities, int age, @org.jetbrains.annotations.NotNull()
    java.lang.String birthday, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityHitpoints hitpoints, @org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String portrait, @org.jetbrains.annotations.NotNull()
    java.lang.String role, @org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityStory story) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKey() {
        return null;
    }
    
    public final void setKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityAbility> getAbilities() {
        return null;
    }
    
    public final void setAbilities(@org.jetbrains.annotations.NotNull()
    java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityAbility> p0) {
    }
    
    public final int getAge() {
        return 0;
    }
    
    public final void setAge(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBirthday() {
        return null;
    }
    
    public final void setBirthday(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityHitpoints getHitpoints() {
        return null;
    }
    
    public final void setHitpoints(@org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityHitpoints p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPortrait() {
        return null;
    }
    
    public final void setPortrait(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRole() {
        return null;
    }
    
    public final void setRole(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityStory getStory() {
        return null;
    }
    
    public final void setStory(@org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityStory p0) {
    }
    
    public HeroInfoEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityStory component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityAbility> component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityHitpoints component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityAbility> abilities, int age, @org.jetbrains.annotations.NotNull()
    java.lang.String birthday, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityHitpoints hitpoints, @org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String portrait, @org.jetbrains.annotations.NotNull()
    java.lang.String role, @org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityStory story) {
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