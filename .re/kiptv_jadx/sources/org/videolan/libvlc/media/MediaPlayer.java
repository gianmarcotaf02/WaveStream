package org.videolan.libvlc.media;

/* JADX INFO: loaded from: classes4.dex */
public class MediaPlayer {
    public static final int MEDIA_ERROR_IO = -1004;
    public static final int MEDIA_ERROR_MALFORMED = -1007;
    public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 200;
    public static final int MEDIA_ERROR_SERVER_DIED = 100;
    public static final int MEDIA_ERROR_TIMED_OUT = -110;
    public static final int MEDIA_ERROR_UNKNOWN = 1;
    public static final int MEDIA_ERROR_UNSUPPORTED = -1010;
    public static final int MEDIA_INFO_BAD_INTERLEAVING = 800;
    public static final int MEDIA_INFO_BUFFERING_END = 702;
    public static final int MEDIA_INFO_BUFFERING_START = 701;
    public static final int MEDIA_INFO_EXTERNAL_METADATA_UPDATE = 803;
    public static final int MEDIA_INFO_METADATA_UPDATE = 802;
    public static final int MEDIA_INFO_NOT_SEEKABLE = 801;
    public static final int MEDIA_INFO_STARTED_AS_NEXT = 2;
    public static final int MEDIA_INFO_SUBTITLE_TIMED_OUT = 902;
    public static final int MEDIA_INFO_TIMED_TEXT_ERROR = 900;
    public static final int MEDIA_INFO_UNKNOWN = 1;
    public static final int MEDIA_INFO_UNSUPPORTED_SUBTITLE = 901;
    public static final int MEDIA_INFO_VIDEO_RENDERING_START = 3;
    public static final int MEDIA_INFO_VIDEO_TRACK_LAGGING = 700;
    public static final java.lang.String MEDIA_MIMETYPE_TEXT_SUBRIP = "application/x-subrip";
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT = 1;
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING = 2;
    private org.videolan.libvlc.interfaces.IMedia mCurrentMedia = null;
    private final org.videolan.libvlc.interfaces.ILibVLC mILibVLC;
    private org.videolan.libvlc.MediaPlayer mMediaPlayer;

    public interface OnBufferingUpdateListener {
        void onBufferingUpdate(org.videolan.libvlc.media.MediaPlayer mediaPlayer, int i3);
    }

    public interface OnCompletionListener {
        void onCompletion(org.videolan.libvlc.media.MediaPlayer mediaPlayer);
    }

    public interface OnErrorListener {
        boolean onError(org.videolan.libvlc.media.MediaPlayer mediaPlayer, int i3, int i9);
    }

    public interface OnInfoListener {
        boolean onInfo(org.videolan.libvlc.media.MediaPlayer mediaPlayer, int i3, int i9);
    }

    public interface OnPreparedListener {
        void onPrepared(org.videolan.libvlc.media.MediaPlayer mediaPlayer);
    }

    public interface OnSeekCompleteListener {
        void onSeekComplete(org.videolan.libvlc.media.MediaPlayer mediaPlayer);
    }

    public interface OnTimedTextListener {
        void onTimedText(org.videolan.libvlc.media.MediaPlayer mediaPlayer, android.media.TimedText timedText);
    }

    public interface OnVideoSizeChangedListener {
        void onVideoSizeChanged(org.videolan.libvlc.media.MediaPlayer mediaPlayer, int i3, int i9);
    }

    public static class TrackInfo implements android.os.Parcelable {
        public static final int MEDIA_TRACK_TYPE_AUDIO = 2;
        public static final int MEDIA_TRACK_TYPE_SUBTITLE = 4;
        public static final int MEDIA_TRACK_TYPE_TIMEDTEXT = 3;
        public static final int MEDIA_TRACK_TYPE_UNKNOWN = 0;
        public static final int MEDIA_TRACK_TYPE_VIDEO = 1;

        public TrackInfo(android.os.Parcel parcel) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public android.media.MediaFormat getFormat() {
            return null;
        }

        public java.lang.String getLanguage() {
            return androidx.media3.common.C.LANGUAGE_UNDETERMINED;
        }

        public int getTrackType() {
            return 0;
        }

        public java.lang.String toString() {
            return "";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i3) {
        }
    }

    public MediaPlayer() {
        org.videolan.libvlc.LibVLC libVLC = new org.videolan.libvlc.LibVLC(null);
        this.mILibVLC = libVLC;
        this.mMediaPlayer = new org.videolan.libvlc.MediaPlayer(libVLC);
    }

    public static org.videolan.libvlc.media.MediaPlayer create(android.content.Context context, int i3, android.media.AudioAttributes audioAttributes, int i9) {
        return null;
    }

    public void addTimedTextSource(java.io.FileDescriptor fileDescriptor, long j, long j9, java.lang.String str) {
    }

    public void attachAuxEffect(int i3) {
    }

    public void deselectTrack(int i3) {
    }

    public void finalize() {
    }

    public int getAudioSessionId() {
        return 0;
    }

    public int getCurrentPosition() {
        return (int) this.mMediaPlayer.getTime();
    }

    public int getDuration() {
        return (int) this.mMediaPlayer.getLength();
    }

    public int getSelectedTrack(int i3) {
        return 0;
    }

    public org.videolan.libvlc.media.MediaPlayer.TrackInfo[] getTrackInfo() {
        return new org.videolan.libvlc.media.MediaPlayer.TrackInfo[1];
    }

    public int getVideoHeight() {
        return -1;
    }

    public int getVideoWidth() {
        return -1;
    }

    public boolean isLooping() {
        return false;
    }

    public boolean isPlaying() {
        return this.mMediaPlayer.isPlaying();
    }

    public void pause() {
        this.mMediaPlayer.pause();
    }

    public void prepare() {
    }

    public void prepareAsync() {
        this.mCurrentMedia.addOption(":video-paused");
        this.mMediaPlayer.play();
    }

    public void release() {
        this.mMediaPlayer.release();
    }

    public void reset() {
    }

    public void seekTo(int i3) {
    }

    public void selectTrack(int i3) {
    }

    public void setAudioAttributes(android.media.AudioAttributes audioAttributes) {
    }

    public void setAudioSessionId(int i3) {
    }

    public void setAudioStreamType(int i3) {
    }

    public void setAuxEffectSendLevel(float f9) {
    }

    public void setDataSource(android.content.Context context, android.net.Uri uri) {
        setDataSource(context, uri, (java.util.Map<java.lang.String, java.lang.String>) null);
    }

    public void setDisplay(android.view.SurfaceHolder surfaceHolder) {
        this.mMediaPlayer.getVLCVout().setVideoSurface(surfaceHolder.getSurface(), surfaceHolder);
    }

    public void setLooping(boolean z6) {
    }

    public void setNextMediaPlayer(org.videolan.libvlc.media.MediaPlayer mediaPlayer) {
    }

    public void setOnBufferingUpdateListener(org.videolan.libvlc.media.MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
    }

    public void setOnCompletionListener(org.videolan.libvlc.media.MediaPlayer.OnCompletionListener onCompletionListener) {
    }

    public void setOnErrorListener(org.videolan.libvlc.media.MediaPlayer.OnErrorListener onErrorListener) {
    }

    public void setOnInfoListener(org.videolan.libvlc.media.MediaPlayer.OnInfoListener onInfoListener) {
    }

    public void setOnPreparedListener(org.videolan.libvlc.media.MediaPlayer.OnPreparedListener onPreparedListener) {
    }

    public void setOnSeekCompleteListener(org.videolan.libvlc.media.MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
    }

    public void setOnTimedTextListener(org.videolan.libvlc.media.MediaPlayer.OnTimedTextListener onTimedTextListener) {
    }

    public void setOnVideoSizeChangedListener(org.videolan.libvlc.media.MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
    }

    public void setScreenOnWhilePlaying(boolean z6) {
    }

    public void setSurface(android.view.Surface surface) {
        this.mMediaPlayer.getVLCVout().setVideoSurface(surface, null);
    }

    public void setVideoScalingMode(int i3) {
    }

    public void setVolume(float f9, float f10) {
        this.mMediaPlayer.setVolume((int) (((f9 + f10) * 100.0f) / 2.0f));
    }

    public void setWakeMode(android.content.Context context, int i3) {
    }

    public void start() {
        this.mMediaPlayer.play();
    }

    public void stop() {
        this.mMediaPlayer.stop();
    }

    public static org.videolan.libvlc.media.MediaPlayer create(android.content.Context context, android.net.Uri uri) {
        return create(context, uri, null);
    }

    public void addTimedTextSource(java.io.FileDescriptor fileDescriptor, java.lang.String str) {
    }

    public void setDataSource(android.content.Context context, android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> map) {
        org.videolan.libvlc.Media media = new org.videolan.libvlc.Media(this.mILibVLC, uri);
        this.mCurrentMedia = media;
        this.mMediaPlayer.setMedia(media);
    }

    public static org.videolan.libvlc.media.MediaPlayer create(android.content.Context context, android.net.Uri uri, android.view.SurfaceHolder surfaceHolder) {
        return create(context, uri, surfaceHolder, null, 0);
    }

    public void addTimedTextSource(java.lang.String str, java.lang.String str2) {
        this.mMediaPlayer.addSlave(0, str, false);
    }

    public static org.videolan.libvlc.media.MediaPlayer create(android.content.Context context, android.net.Uri uri, android.view.SurfaceHolder surfaceHolder, android.media.AudioAttributes audioAttributes, int i3) {
        return new org.videolan.libvlc.media.MediaPlayer();
    }

    public void addTimedTextSource(android.content.Context context, android.net.Uri uri, java.lang.String str) {
        this.mMediaPlayer.addSlave(0, uri, false);
    }

    public void setDataSource(java.lang.String str) {
        org.videolan.libvlc.Media media = new org.videolan.libvlc.Media(this.mILibVLC, str);
        this.mCurrentMedia = media;
        this.mMediaPlayer.setMedia(media);
    }

    public static org.videolan.libvlc.media.MediaPlayer create(android.content.Context context, int i3) {
        return create(context, i3, null, 0);
    }

    public void setDataSource(java.io.FileDescriptor fileDescriptor) {
        org.videolan.libvlc.Media media = new org.videolan.libvlc.Media(this.mILibVLC, fileDescriptor);
        this.mCurrentMedia = media;
        this.mMediaPlayer.setMedia(media);
    }

    public void setDataSource(java.io.FileDescriptor fileDescriptor, long j, long j9) {
        setDataSource(fileDescriptor);
    }
}
