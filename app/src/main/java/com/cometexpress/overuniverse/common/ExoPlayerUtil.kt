package com.cometexpress.overuniverse.common

import android.content.Context
import androidx.media3.common.MediaItem
import androidx.media3.common.MimeTypes
import androidx.media3.common.Player
import androidx.media3.exoplayer.DefaultLoadControl
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter
import androidx.media3.ui.PlayerView
import com.orhanobut.logger.Logger

object ExoPlayerUtil {

    const val VOLUME_MUTE = 0f // 음소거
    const val PLAY = "play"
    const val PAUSE = "pause"
    const val STOP = "stop"

    var currentVideoNo = 0
    var currentVideoDetailNo = 0
    var currentPlayingWindow = 0
    var currentPlaybackPosition = 0L

    var exoPlayer: ExoPlayer? = null
    private var playbackStateListener: Player.Listener? = null

    private const val DEFAULT_MAX_INITIAL_BITRATE = Int.MAX_VALUE.toLong()

    fun prepare(
        context: Context,
        videoPath: String,
        playWhenReady: Boolean,
        seekTime: Long,
        volume: Float,
        playerListener: Player.Listener,
        playerView: PlayerView,
    ): ExoPlayer? {

        val defaultBandwidthMeter = DefaultBandwidthMeter.Builder(context)
            .setInitialBitrateEstimate(DEFAULT_MAX_INITIAL_BITRATE)
            .build()

        exoPlayer = ExoPlayer.Builder(context)
            .setTrackSelector(DefaultTrackSelector(context))
            .setBandwidthMeter(defaultBandwidthMeter)
            .setLoadControl(
                DefaultLoadControl.Builder()
                    .setPrioritizeTimeOverSizeThresholds(false)
                    .build()
            )
            .build()

        exoPlayer?.also {
            playerView.player = it
            this.playbackStateListener = playerListener
            val mediaItem = MediaItem.Builder()
                .setUri(videoPath)
                .setMimeType(MimeTypes.APPLICATION_MP4)
                .build()
            it.setMediaItem(mediaItem)
            it.playWhenReady = playWhenReady
            it.seekTo(seekTime)
            it.volume = volume
            it.addListener(playerListener)
            it.prepare()
        }
        return exoPlayer
    }

    fun playbackStateListener(
        ready: () -> Unit,
        end: () -> Unit,
        buffering: () -> Unit,
        idle: () -> Unit,
        isPlayingChanged: (isPlaying: Boolean) -> Unit,
    ) = object : Player.Listener {
        override fun onPlaybackStateChanged(playbackState: Int) {
            super.onPlaybackStateChanged(playbackState)
            when (playbackState) {
                Player.STATE_READY -> {
                    // playWhenReady == true 이면 미디어 재생이 시작
                    // playWhenReady == false 이면 미디어 일시중지
                    // 즉시 재생 불가능, 준비만 된 상태
                    Logger.i("Player.STATE_READY")
                    ready()
                }

                Player.STATE_ENDED -> {
                    // 재생 완료
                    Logger.i("Player.STATE_ENDED")
                    end()
                }

                Player.STATE_BUFFERING -> {
                    Logger.i("Player.STATE_BUFFERING")
                    buffering()
                }

                Player.STATE_IDLE -> {
                    Logger.i("Player.STATE_IDLE")
                    idle()
                }

                else -> {
//                    playerView.hideController()
                }
            }
        }

        override fun onIsPlayingChanged(isPlaying: Boolean) {
            super.onIsPlayingChanged(isPlaying)
            // 실제로 미디어 재생하는지 여부를 알 수 있음
            if (isPlaying) {
                Logger.i("Player 재생")
            } else {
                Logger.i("Player 일시정지")
            }
            isPlayingChanged(isPlaying)
        }
    }
}