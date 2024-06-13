package com.cometexpress.overuniverse.common;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002Ja\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020&0%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020&0%2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110,\u00a2\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020&0+J@\u00100\u001a\u0004\u0018\u00010\u001d2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020,2\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00020\n2\u0006\u00107\u001a\u00020#2\u0006\u00108\u001a\u000209R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/cometexpress/overuniverse/common/ExoPlayerUtil;", "", "()V", "DEFAULT_MAX_INITIAL_BITRATE", "", "PAUSE", "", "PLAY", "STOP", "VOLUME_MUTE", "", "currentPlaybackPosition", "getCurrentPlaybackPosition", "()J", "setCurrentPlaybackPosition", "(J)V", "currentPlayingWindow", "", "getCurrentPlayingWindow", "()I", "setCurrentPlayingWindow", "(I)V", "currentVideoDetailNo", "getCurrentVideoDetailNo", "setCurrentVideoDetailNo", "currentVideoNo", "getCurrentVideoNo", "setCurrentVideoNo", "exoPlayer", "Landroidx/media3/exoplayer/ExoPlayer;", "getExoPlayer", "()Landroidx/media3/exoplayer/ExoPlayer;", "setExoPlayer", "(Landroidx/media3/exoplayer/ExoPlayer;)V", "playbackStateListener", "Landroidx/media3/common/Player$Listener;", "ready", "Lkotlin/Function0;", "", "end", "buffering", "idle", "isPlayingChanged", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isPlaying", "prepare", "context", "Landroid/content/Context;", "videoPath", "playWhenReady", "seekTime", "volume", "playerListener", "playerView", "Landroidx/media3/ui/PlayerView;", "app_debug"})
public final class ExoPlayerUtil {
    public static final float VOLUME_MUTE = 0.0F;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAY = "play";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAUSE = "pause";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STOP = "stop";
    private static int currentVideoNo = 0;
    private static int currentVideoDetailNo = 0;
    private static int currentPlayingWindow = 0;
    private static long currentPlaybackPosition = 0L;
    @org.jetbrains.annotations.Nullable()
    private static androidx.media3.exoplayer.ExoPlayer exoPlayer;
    @org.jetbrains.annotations.Nullable()
    private static androidx.media3.common.Player.Listener playbackStateListener;
    private static final long DEFAULT_MAX_INITIAL_BITRATE = 2147483647L;
    @org.jetbrains.annotations.NotNull()
    public static final com.cometexpress.overuniverse.common.ExoPlayerUtil INSTANCE = null;
    
    private ExoPlayerUtil() {
        super();
    }
    
    public final int getCurrentVideoNo() {
        return 0;
    }
    
    public final void setCurrentVideoNo(int p0) {
    }
    
    public final int getCurrentVideoDetailNo() {
        return 0;
    }
    
    public final void setCurrentVideoDetailNo(int p0) {
    }
    
    public final int getCurrentPlayingWindow() {
        return 0;
    }
    
    public final void setCurrentPlayingWindow(int p0) {
    }
    
    public final long getCurrentPlaybackPosition() {
        return 0L;
    }
    
    public final void setCurrentPlaybackPosition(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.media3.exoplayer.ExoPlayer getExoPlayer() {
        return null;
    }
    
    public final void setExoPlayer(@org.jetbrains.annotations.Nullable()
    androidx.media3.exoplayer.ExoPlayer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.media3.exoplayer.ExoPlayer prepare(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String videoPath, boolean playWhenReady, long seekTime, float volume, @org.jetbrains.annotations.NotNull()
    androidx.media3.common.Player.Listener playerListener, @org.jetbrains.annotations.NotNull()
    androidx.media3.ui.PlayerView playerView) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.media3.common.Player.Listener playbackStateListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> ready, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> end, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> buffering, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> idle, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> isPlayingChanged) {
        return null;
    }
}