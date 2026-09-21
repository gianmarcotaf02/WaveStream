package org.videolan.libvlc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetFileDescriptor;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.io.File;
import java.io.IOException;
import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;
import org.videolan.libvlc.interfaces.IMedia;
import org.videolan.libvlc.interfaces.IVLCVout;
import org.videolan.libvlc.util.AndroidUtil;
import org.videolan.libvlc.util.DisplayManager;
import org.videolan.libvlc.util.VLCUtil;
import org.videolan.libvlc.util.VLCVideoLayout;

public class MediaPlayer extends VLCObject<Event> {
    public static final int SURFACE_SCALES_COUNT = ScaleType.values().length;
    private AssetFileDescriptor mAfd;
    private final AudioDeviceCallback mAudioDeviceCallback;
    private boolean mAudioDigitalOutputEnabled;
    private String mAudioOutput;
    private String mAudioOutputDevice;
    private String mAudioPlugOutputDevice;
    private final BroadcastReceiver mAudioPlugReceiver;
    private boolean mAudioPlugRegistered;
    private boolean mCanDoPassthrough;
    Handler mHandlerMainThread;
    private boolean mListenAudioPlug;
    private IMedia mMedia;
    private boolean mPlayRequested;
    private boolean mPlaying;
    private RendererItem mRenderer;
    private Boolean mUseOrientationFromBounds;
    private VideoHelper mVideoHelper;
    private int mVoutCount;
    private final AWindow mWindow;

    public static class Chapter {
        public final long duration;
        public final String name;
        public final long timeOffset;

        private Chapter(long j, long j9, String str) {
            this.timeOffset = j;
            this.duration = j9;
            this.name = str;
        }
    }

    public static class Event extends AbstractVLCEvent {
        public static final int Buffering = 259;
        public static final int ESAdded = 276;
        public static final int ESDeleted = 277;
        public static final int ESSelected = 278;
        public static final int EncounteredError = 266;
        public static final int EndReached = 265;
        public static final int LengthChanged = 273;
        public static final int MediaChanged = 256;
        public static final int Opening = 258;
        public static final int PausableChanged = 270;
        public static final int Paused = 261;
        public static final int Playing = 260;
        public static final int PositionChanged = 268;
        public static final int RecordChanged = 286;
        public static final int SeekableChanged = 269;
        public static final int Stopped = 262;
        public static final int TimeChanged = 267;
        public static final int Vout = 274;

        public Event(int i3) {
            super(i3);
        }

        public float getBuffering() {
            return this.argf1;
        }

        public int getEsChangedID() {
            return (int) this.arg2;
        }

        public int getEsChangedType() {
            return (int) this.arg1;
        }

        public long getLengthChanged() {
            return this.arg1;
        }

        public boolean getPausable() {
            return this.arg1 != 0;
        }

        public float getPositionChanged() {
            return this.argf1;
        }

        public String getRecordPath() {
            return this.args1;
        }

        public boolean getRecording() {
            return this.arg1 != 0;
        }

        public boolean getSeekable() {
            return this.arg1 != 0;
        }

        public long getTimeChanged() {
            return this.arg1;
        }

        public int getVoutCount() {
            return (int) this.arg1;
        }

        public Event(int i3, long j) {
            super(i3, j);
        }

        public Event(int i3, long j, long j9) {
            super(i3, j, j9);
        }

        public Event(int i3, float f9) {
            super(i3, f9);
        }

        public Event(int i3, long j, String str) {
            super(i3, j, str);
        }
    }

    public interface EventListener extends AbstractVLCEvent.Listener<Event> {
    }

    public static class Navigate {
        public static final int Activate = 0;
        public static final int Down = 2;
        public static final int Left = 3;
        public static final int Right = 4;
        public static final int Up = 1;
    }

    public static class Position {
        public static final int Bottom = 6;
        public static final int BottomLeft = 7;
        public static final int BottomRight = 8;
        public static final int Center = 0;
        public static final int Disable = -1;
        public static final int Left = 1;
        public static final int Right = 2;
        public static final int Top = 3;
        public static final int TopLeft = 4;
        public static final int TopRight = 5;
    }

    public enum ScaleType {
        SURFACE_BEST_FIT(null),
        SURFACE_FIT_SCREEN(null),
        SURFACE_FILL(null),
        SURFACE_16_9(Float.valueOf(1.7777778f)),
        SURFACE_4_3(Float.valueOf(1.3333334f)),
        SURFACE_16_10(Float.valueOf(1.6f)),
        SURFACE_2_1(Float.valueOf(2.0f)),
        SURFACE_221_1(Float.valueOf(2.21f)),
        SURFACE_235_1(Float.valueOf(2.35f)),
        SURFACE_239_1(Float.valueOf(2.39f)),
        SURFACE_5_4(Float.valueOf(1.25f)),
        SURFACE_ORIGINAL(null);

        private final Float ratio;

        ScaleType(Float f9) {
            this.ratio = f9;
        }

        public static ScaleType[] getMainScaleTypes() {
            return new ScaleType[]{SURFACE_BEST_FIT, SURFACE_FIT_SCREEN, SURFACE_FILL, SURFACE_16_9, SURFACE_4_3, SURFACE_ORIGINAL};
        }

        public Float getRatio() {
            return this.ratio;
        }
    }

    public static class Title {
        public final long duration;
        private final int flags;
        public final String name;

        public static class Flags {
            public static final int INTERACTIVE = 2;
            public static final int MENU = 1;

            private Flags() {
            }
        }

        public Title(long j, String str, int i3) {
            this.duration = j;
            this.name = str;
            this.flags = i3;
        }

        public boolean isInteractive() {
            return (this.flags & 2) != 0;
        }

        public boolean isMenu() {
            return (this.flags & 1) != 0;
        }
    }

    public MediaPlayer(ILibVLC iLibVLC) {
        super(iLibVLC);
        this.mUseOrientationFromBounds = Boolean.FALSE;
        this.mMedia = null;
        this.mRenderer = null;
        this.mAfd = null;
        this.mPlaying = false;
        this.mPlayRequested = false;
        this.mListenAudioPlug = true;
        this.mVoutCount = 0;
        this.mAudioOutput = null;
        this.mAudioOutputDevice = null;
        this.mAudioPlugRegistered = false;
        this.mAudioDigitalOutputEnabled = false;
        this.mAudioPlugOutputDevice = "stereo";
        this.mVideoHelper = null;
        AWindow aWindow = new AWindow(new AWindow.SurfaceCallback() {
            @Override
            public void onSurfacesCreated(AWindow aWindow2) {
                boolean z6;
                boolean z9;
                synchronized (MediaPlayer.this) {
                    try {
                        z6 = false;
                        if (MediaPlayer.this.mPlaying || !MediaPlayer.this.mPlayRequested) {
                            z9 = MediaPlayer.this.mVoutCount == 0;
                        } else {
                            z9 = false;
                            z6 = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z6) {
                    MediaPlayer.this.play();
                } else if (z9) {
                    MediaPlayer.this.setVideoTrackEnabled(true);
                }
            }

            @Override
            public void onSurfacesDestroyed(AWindow aWindow2) {
                boolean z6;
                synchronized (MediaPlayer.this) {
                    z6 = MediaPlayer.this.mVoutCount > 0;
                }
                if (z6) {
                    MediaPlayer.this.setVideoTrackEnabled(false);
                }
            }
        });
        this.mWindow = aWindow;
        boolean z6 = AndroidUtil.isMarshMallowOrLater;
        this.mAudioPlugReceiver = !z6 ? createAudioPlugReceiver() : null;
        this.mAudioDeviceCallback = z6 ? createAudioDeviceCallback() : null;
        this.mHandlerMainThread = new Handler(Looper.getMainLooper());
        nativeNewFromLibVlc(iLibVLC, aWindow);
    }

    private AudioDeviceCallback createAudioDeviceCallback() {
        return new AudioDeviceCallback() {
            private SparseArray<Long> mEncodedDevices = new SparseArray<>();

            private void onAudioDevicesChanged() {
                long jLongValue = 0;
                for (int i3 = 0; i3 < this.mEncodedDevices.size(); i3++) {
                    jLongValue |= this.mEncodedDevices.valueAt(i3).longValue();
                }
                MediaPlayer.this.updateAudioOutputDevice(jLongValue, jLongValue == 0 ? "stereo" : "pcm");
            }

            @Override
            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    if (audioDeviceInfo.isSink()) {
                        long encodingFlags = MediaPlayer.this.getEncodingFlags(audioDeviceInfo.getEncodings());
                        if (encodingFlags != 0) {
                            this.mEncodedDevices.put(audioDeviceInfo.getId(), Long.valueOf(encodingFlags));
                        }
                    }
                }
                onAudioDevicesChanged();
            }

            @Override
            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    if (audioDeviceInfo.isSink()) {
                        this.mEncodedDevices.remove(audioDeviceInfo.getId());
                    }
                }
                onAudioDevicesChanged();
            }
        };
    }

    private BroadcastReceiver createAudioPlugReceiver() {
        return new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if (action != null && action.equalsIgnoreCase("android.media.action.HDMI_AUDIO_PLUG")) {
                    MediaPlayer.this.updateAudioOutputDevice(intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1 ? MediaPlayer.this.getEncodingFlags(intent.getIntArrayExtra("android.media.extra.ENCODINGS")) : 0L, "stereo");
                }
            }
        };
    }

    private static Chapter createChapterFromNative(long j, long j9, String str) {
        return new Chapter(j, j9, str);
    }

    private static Title createTitleFromNative(long j, String str, int i3) {
        return new Title(j, str, i3);
    }

    public long getEncodingFlags(int[] iArr) {
        long j = 0;
        if (iArr == null) {
            return 0L;
        }
        for (int i3 : iArr) {
            if (isEncoded(i3)) {
                j |= (long) (1 << i3);
            }
        }
        return j;
    }

    private boolean isAudioDigitalOutputCapable() {
        String str = this.mAudioOutput;
        return str == null || str.contains("audiotrack");
    }

    private boolean isEncoded(int i3) {
        return i3 == 5 || i3 == 6 || i3 == 7 || i3 == 8 || i3 == 14;
    }

    private native boolean nativeAddSlave(int i3, String str, boolean z6);

    private native String nativeGetAspectRatio();

    private native long nativeGetAudioDelay();

    private native Chapter[] nativeGetChapters(int i3);

    private native float nativeGetScale();

    private native IMedia.Track nativeGetSelectedTrack(int i3);

    private native long nativeGetSpuDelay();

    private native int nativeGetTeletext();

    private native boolean nativeGetTeletextTransparency();

    private native Title[] nativeGetTitles();

    private native IMedia.Track nativeGetTrackFromID(String str);

    private native IMedia.Track[] nativeGetTracks(int i3, boolean z6);

    private native void nativeNewFromLibVlc(ILibVLC iLibVLC, AWindow aWindow);

    private native void nativeNewFromMedia(IMedia iMedia, AWindow aWindow);

    private native void nativePlay();

    private native boolean nativeRecord(String str, boolean z6);

    private native void nativeRelease();

    private native boolean nativeSelectTrack(String str);

    private native void nativeSelectTracks(int i3, String str);

    private native void nativeSetAspectRatio(String str);

    private native boolean nativeSetAudioDelay(long j);

    private native boolean nativeSetAudioOutput(String str);

    private native boolean nativeSetAudioOutputDevice(String str);

    private native boolean nativeSetEqualizer(Equalizer equalizer);

    private native void nativeSetMedia(IMedia iMedia);

    private native int nativeSetRenderer(RendererItem rendererItem);

    private native void nativeSetScale(float f9);

    private native boolean nativeSetSpuDelay(long j);

    private native void nativeSetTeletext(int i3);

    private native void nativeSetTeletextTransparency(boolean z6);

    private native void nativeSetVideoTitleDisplay(int i3, int i9);

    private native void nativeStop();

    private native void nativeUnselectTrackType(int i3);

    private native boolean nativeUpdateViewpoint(float f9, float f10, float f11, float f12, boolean z6);

    private void registerAudioPlug(boolean z6) {
        if (z6 == this.mAudioPlugRegistered) {
            return;
        }
        if (this.mAudioDeviceCallback != null) {
            registerAudioPlugV23(z6);
        } else if (this.mAudioPlugReceiver != null) {
            registerAudioPlugV21(z6);
        }
        this.mAudioPlugRegistered = z6;
    }

    private void registerAudioPlugV21(boolean z6) {
        if (!z6) {
            this.mILibVLC.getAppContext().unregisterReceiver(this.mAudioPlugReceiver);
            return;
        }
        Intent intentRegisterReceiver = this.mILibVLC.getAppContext().registerReceiver(this.mAudioPlugReceiver, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        if (intentRegisterReceiver != null) {
            this.mAudioPlugReceiver.onReceive(this.mILibVLC.getAppContext(), intentRegisterReceiver);
        }
    }

    private void registerAudioPlugV23(boolean z6) {
        AudioManager audioManager = (AudioManager) this.mILibVLC.getAppContext().getSystemService(AudioManager.class);
        if (!z6) {
            audioManager.unregisterAudioDeviceCallback(this.mAudioDeviceCallback);
        } else {
            this.mAudioDeviceCallback.onAudioDevicesAdded(audioManager.getDevices(2));
            audioManager.registerAudioDeviceCallback(this.mAudioDeviceCallback, null);
        }
    }

    private synchronized boolean setAudioOutputDeviceInternal(String str, boolean z6) {
        boolean zNativeSetAudioOutputDevice;
        try {
            this.mAudioOutputDevice = str;
            if (z6) {
                boolean z9 = str == null && isAudioDigitalOutputCapable();
                this.mListenAudioPlug = z9;
                if (!z9) {
                    registerAudioPlug(false);
                }
            }
            zNativeSetAudioOutputDevice = nativeSetAudioOutputDevice(str);
            if (!zNativeSetAudioOutputDevice) {
                this.mAudioOutputDevice = null;
                this.mListenAudioPlug = false;
            }
            if (this.mListenAudioPlug) {
                registerAudioPlug(true);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zNativeSetAudioOutputDevice;
    }

    public synchronized void updateAudioOutputDevice(long j, String str) {
        boolean z6 = j != 0;
        try {
            this.mCanDoPassthrough = z6;
            if (this.mAudioDigitalOutputEnabled && z6) {
                str = "encoded:" + j;
            }
            if (!str.equals(this.mAudioPlugOutputDevice)) {
                this.mAudioPlugOutputDevice = str;
                setAudioOutputDeviceInternal(str, false);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean addSlave(int i3, Uri uri, boolean z6) {
        return nativeAddSlave(i3, VLCUtil.encodeVLCUri(uri), z6);
    }

    public void attachViews(VLCVideoLayout vLCVideoLayout, DisplayManager displayManager, boolean z6, boolean z9) {
        VideoHelper videoHelper = new VideoHelper(this, vLCVideoLayout, displayManager, z6, z9);
        this.mVideoHelper = videoHelper;
        videoHelper.attachViews();
    }

    public boolean canDoPassthrough() {
        return this.mCanDoPassthrough;
    }

    public void detachViews() {
        VideoHelper videoHelper = this.mVideoHelper;
        if (videoHelper != null) {
            videoHelper.release();
            this.mVideoHelper = null;
        }
    }

    public synchronized boolean forceAudioDigitalEncodings(int[] iArr) {
        try {
            if (!isAudioDigitalOutputCapable()) {
                return false;
            }
            if (iArr.length == 0) {
                setAudioOutputDeviceInternal(null, true);
            } else {
                String str = "encoded:" + getEncodingFlags(iArr);
                if (!str.equals(this.mAudioPlugOutputDevice)) {
                    this.mAudioPlugOutputDevice = str;
                    setAudioOutputDeviceInternal(str, true);
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public String getAspectRatio() {
        return nativeGetAspectRatio();
    }

    public long getAudioDelay() {
        return nativeGetAudioDelay();
    }

    public native int getChapter();

    public Chapter[] getChapters(int i3) {
        return nativeGetChapters(i3);
    }

    @Override
    public long getInstance() {
        return super.getInstance();
    }

    public native long getLength();

    @Override
    public ILibVLC getLibVLC() {
        return super.getLibVLC();
    }

    public synchronized IMedia getMedia() {
        try {
            IMedia iMedia = this.mMedia;
            if (iMedia != null) {
                iMedia.retain();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.mMedia;
    }

    public native int getPlayerState();

    public native float getPosition();

    public native float getRate();

    public float getScale() {
        return nativeGetScale();
    }

    public IMedia.Track getSelectedTrack(int i3) {
        return nativeGetSelectedTrack(i3);
    }

    public IMedia.Track[] getSelectedTracks(int i3) {
        return nativeGetTracks(i3, true);
    }

    public long getSpuDelay() {
        return nativeGetSpuDelay();
    }

    public int getTeletext() {
        return nativeGetTeletext();
    }

    public boolean getTeletextTransparency() {
        return nativeGetTeletextTransparency();
    }

    public native long getTime();

    public native int getTitle();

    public Title[] getTitles() {
        return nativeGetTitles();
    }

    public IMedia.Track getTrackFromID(String str) {
        return nativeGetTrackFromID(str);
    }

    public IMedia.Track[] getTracks(int i3) {
        return nativeGetTracks(i3, false);
    }

    public IVLCVout getVLCVout() {
        return this.mWindow;
    }

    public ScaleType getVideoScale() {
        VideoHelper videoHelper = this.mVideoHelper;
        return videoHelper != null ? videoHelper.getVideoScale() : ScaleType.SURFACE_BEST_FIT;
    }

    public native int getVolume();

    public synchronized boolean hasMedia() {
        return this.mMedia != null;
    }

    public native boolean isPlaying();

    @Override
    public boolean isReleased() {
        return super.isReleased();
    }

    public native boolean isSeekable();

    public native void nativeSetPosition(float f9, boolean z6);

    public native long nativeSetTime(long j, boolean z6);

    public native void navigate(int i3);

    public native int nextChapter();

    @Override
    public void onReleaseNative() {
        detachViews();
        this.mWindow.detachViews();
        registerAudioPlug(false);
        IMedia iMedia = this.mMedia;
        if (iMedia != null) {
            iMedia.release();
        }
        RendererItem rendererItem = this.mRenderer;
        if (rendererItem != null) {
            rendererItem.release();
        }
        this.mVoutCount = 0;
        nativeRelease();
    }

    public native void pause();

    public void play() {
        synchronized (this) {
            try {
                if (!this.mPlaying) {
                    if (this.mListenAudioPlug) {
                        registerAudioPlug(true);
                    }
                    this.mPlayRequested = true;
                    if (this.mWindow.areSurfacesWaiting()) {
                        return;
                    }
                }
                this.mPlaying = true;
                nativePlay();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void playAsset(Context context, String str) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(str);
        this.mAfd = assetFileDescriptorOpenFd;
        play(assetFileDescriptorOpenFd);
    }

    public native int previousChapter();

    public boolean record(String str, boolean z6) {
        return nativeRecord(str, z6);
    }

    public boolean selectTrack(String str) {
        return nativeSelectTrack(str);
    }

    public void selectTracks(int i3, String str) {
        nativeSelectTracks(i3, str);
    }

    public void setAspectRatio(String str) {
        nativeSetAspectRatio(str);
    }

    public boolean setAudioDelay(long j) {
        return nativeSetAudioDelay(j);
    }

    public synchronized boolean setAudioDigitalOutputEnabled(boolean z6) {
        if (z6 == this.mAudioDigitalOutputEnabled) {
            return true;
        }
        if (this.mListenAudioPlug && isAudioDigitalOutputCapable()) {
            registerAudioPlug(false);
            this.mAudioDigitalOutputEnabled = z6;
            registerAudioPlug(true);
            return true;
        }
        return false;
    }

    public synchronized boolean setAudioOutput(String str) {
        boolean zNativeSetAudioOutput;
        try {
            this.mAudioOutput = str;
            boolean zIsAudioDigitalOutputCapable = isAudioDigitalOutputCapable();
            this.mListenAudioPlug = zIsAudioDigitalOutputCapable;
            if (!zIsAudioDigitalOutputCapable) {
                registerAudioPlug(false);
            }
            zNativeSetAudioOutput = nativeSetAudioOutput(str);
            if (!zNativeSetAudioOutput) {
                this.mAudioOutput = null;
                this.mListenAudioPlug = false;
            }
            if (this.mListenAudioPlug) {
                registerAudioPlug(true);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zNativeSetAudioOutput;
    }

    public boolean setAudioOutputDevice(String str) {
        return setAudioOutputDeviceInternal(str, true);
    }

    public native void setChapter(int i3);

    public boolean setEqualizer(Equalizer equalizer) {
        return nativeSetEqualizer(equalizer);
    }

    public synchronized void setEventListener(EventListener eventListener) {
        super.setEventListener((AbstractVLCEvent.Listener) eventListener);
    }

    public void setMedia(IMedia iMedia) {
        if (iMedia != null) {
            if (iMedia.isReleased()) {
                throw new IllegalArgumentException("Media is released");
            }
            iMedia.setDefaultMediaPlayerOptions();
        }
        nativeSetMedia(iMedia);
        synchronized (this) {
            try {
                IMedia iMedia2 = this.mMedia;
                if (iMedia2 != null) {
                    iMedia2.release();
                }
                if (iMedia != null) {
                    iMedia.retain();
                }
                this.mMedia = iMedia;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setNativeScale(float f9) {
        nativeSetScale(f9);
    }

    public void setPosition(float f9, boolean z6) {
        nativeSetPosition(f9, z6);
    }

    public native void setRate(float f9);

    public int setRenderer(RendererItem rendererItem) {
        RendererItem rendererItem2 = this.mRenderer;
        if (rendererItem2 != null) {
            rendererItem2.release();
        }
        if (rendererItem != null) {
            rendererItem.retain();
        }
        this.mRenderer = rendererItem;
        return nativeSetRenderer(rendererItem);
    }

    public void setScale(float f9) {
        this.mVideoHelper.setCustomScale(f9);
    }

    public boolean setSpuDelay(long j) {
        return nativeSetSpuDelay(j);
    }

    public void setTeletext(int i3) {
        nativeSetTeletext(i3);
    }

    public void setTeletextTransparency(boolean z6) {
        nativeSetTeletextTransparency(z6);
    }

    public long setTime(long j, boolean z6) {
        return nativeSetTime(j, z6);
    }

    public native void setTitle(int i3);

    public void setUseOrientationFromBounds(Boolean bool) {
        this.mUseOrientationFromBounds = bool;
    }

    public void setVideoScale(ScaleType scaleType) {
        VideoHelper videoHelper = this.mVideoHelper;
        if (videoHelper != null) {
            videoHelper.setVideoScale(scaleType);
        }
    }

    public void setVideoTitleDisplay(int i3, int i9) {
        nativeSetVideoTitleDisplay(i3, i9);
    }

    public void setVideoTrackEnabled(boolean z6) {
        IMedia.Track[] tracks;
        if (!z6) {
            unselectTrackType(1);
        } else {
            if (isReleased() || !hasMedia() || getSelectedTrack(1) != null || (tracks = getTracks(1)) == null) {
                return;
            }
            selectTrack(tracks[0].id);
        }
    }

    public native int setVolume(int i3);

    public void stop() {
        synchronized (this) {
            this.mPlayRequested = false;
            this.mPlaying = false;
        }
        nativeStop();
        AssetFileDescriptor assetFileDescriptor = this.mAfd;
        if (assetFileDescriptor != null) {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    public void unselectTrackType(int i3) {
        nativeUnselectTrackType(i3);
    }

    public void updateVideoSurfaces() {
        VideoHelper videoHelper = this.mVideoHelper;
        if (videoHelper != null) {
            videoHelper.updateVideoSurfaces();
        }
    }

    public boolean updateViewpoint(float f9, float f10, float f11, float f12, boolean z6) {
        return nativeUpdateViewpoint(f9, f10, f11, f12, z6);
    }

    public Boolean useOrientationFromBounds() {
        return this.mUseOrientationFromBounds;
    }

    public static class Equalizer {
        private long mInstance;

        private Equalizer() {
            nativeNew();
        }

        public static Equalizer create() {
            return new Equalizer();
        }

        public static Equalizer createFromPreset(int i3) {
            return new Equalizer(i3);
        }

        public static int getBandCount() {
            return nativeGetBandCount();
        }

        public static float getBandFrequency(int i3) {
            return nativeGetBandFrequency(i3);
        }

        public static int getPresetCount() {
            return nativeGetPresetCount();
        }

        public static String getPresetName(int i3) {
            return nativeGetPresetName(i3);
        }

        private native float nativeGetAmp(int i3);

        private static native int nativeGetBandCount();

        private static native float nativeGetBandFrequency(int i3);

        private native float nativeGetPreAmp();

        private static native int nativeGetPresetCount();

        private static native String nativeGetPresetName(int i3);

        private native void nativeNew();

        private native void nativeNewFromPreset(int i3);

        private native void nativeRelease();

        private native boolean nativeSetAmp(int i3, float f9);

        private native boolean nativeSetPreAmp(float f9);

        public void finalize() throws Throwable {
            try {
                nativeRelease();
            } finally {
                super.finalize();
            }
        }

        public float getAmp(int i3) {
            return nativeGetAmp(i3);
        }

        public float getPreAmp() {
            return nativeGetPreAmp();
        }

        public boolean setAmp(int i3, float f9) {
            return nativeSetAmp(i3, f9);
        }

        public boolean setPreAmp(float f9) {
            return nativeSetPreAmp(f9);
        }

        private Equalizer(int i3) {
            nativeNewFromPreset(i3);
        }
    }

    public boolean addSlave(int i3, String str, boolean z6) {
        return addSlave(i3, Uri.fromFile(new File(str)), z6);
    }

    @Override
    public synchronized Event onEventNative(int i3, long j, long j9, float f9, String str) {
        try {
            if (i3 != 256) {
                if (i3 == 286) {
                    return new Event(i3, j, str);
                }
                if (i3 == 273) {
                    return new Event(i3, j);
                }
                if (i3 == 274) {
                    this.mVoutCount = (int) j;
                    notify();
                    this.mHandlerMainThread.post(new Runnable() {
                        @Override
                        public void run() {
                            MediaPlayer.this.updateVideoSurfaces();
                        }
                    });
                    return new Event(i3, j);
                }
                switch (i3) {
                    case Event.Opening:
                    case Event.Buffering:
                        i3 = i3;
                        return new Event(i3, f9);
                    case Event.Playing:
                    case Event.Paused:
                        return new Event(i3);
                    case Event.Stopped:
                        break;
                    default:
                        switch (i3) {
                            case Event.EndReached:
                            case Event.EncounteredError:
                                break;
                            case Event.TimeChanged:
                                return new Event(i3, j);
                            case Event.PositionChanged:
                                return new Event(i3, f9);
                            case Event.SeekableChanged:
                            case Event.PausableChanged:
                                return new Event(i3, j);
                            default:
                                switch (i3) {
                                    case Event.ESAdded:
                                    case Event.ESDeleted:
                                    case Event.ESSelected:
                                        return new Event(i3, j, j9);
                                    default:
                                        return null;
                                }
                        }
                        break;
                }
            }
            this.mVoutCount = 0;
            notify();
            return new Event(i3, f9);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setPosition(float f9) {
        nativeSetPosition(f9, false);
    }

    public long setTime(long j) {
        return nativeSetTime(j, false);
    }

    public void play(AssetFileDescriptor assetFileDescriptor) {
        play(new Media(this.mILibVLC, assetFileDescriptor));
    }

    public void play(String str) {
        play(new Media(this.mILibVLC, str));
    }

    public void play(Uri uri) {
        play(new Media(this.mILibVLC, uri));
    }

    public void play(IMedia iMedia) {
        setMedia(iMedia);
        iMedia.release();
        play();
    }

    public MediaPlayer(IMedia iMedia) {
        super(iMedia);
        this.mUseOrientationFromBounds = Boolean.FALSE;
        this.mMedia = null;
        this.mRenderer = null;
        this.mAfd = null;
        this.mPlaying = false;
        this.mPlayRequested = false;
        this.mListenAudioPlug = true;
        this.mVoutCount = 0;
        this.mAudioOutput = null;
        this.mAudioOutputDevice = null;
        this.mAudioPlugRegistered = false;
        this.mAudioDigitalOutputEnabled = false;
        this.mAudioPlugOutputDevice = "stereo";
        this.mVideoHelper = null;
        AWindow aWindow = new AWindow(new AWindow.SurfaceCallback() {
            @Override
            public void onSurfacesCreated(AWindow aWindow2) {
                boolean z6;
                boolean z9;
                synchronized (MediaPlayer.this) {
                    try {
                        z6 = false;
                        if (MediaPlayer.this.mPlaying || !MediaPlayer.this.mPlayRequested) {
                            z9 = MediaPlayer.this.mVoutCount == 0;
                        } else {
                            z9 = false;
                            z6 = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z6) {
                    MediaPlayer.this.play();
                } else if (z9) {
                    MediaPlayer.this.setVideoTrackEnabled(true);
                }
            }

            @Override
            public void onSurfacesDestroyed(AWindow aWindow2) {
                boolean z6;
                synchronized (MediaPlayer.this) {
                    z6 = MediaPlayer.this.mVoutCount > 0;
                }
                if (z6) {
                    MediaPlayer.this.setVideoTrackEnabled(false);
                }
            }
        });
        this.mWindow = aWindow;
        boolean z6 = AndroidUtil.isMarshMallowOrLater;
        this.mAudioPlugReceiver = !z6 ? createAudioPlugReceiver() : null;
        this.mAudioDeviceCallback = z6 ? createAudioDeviceCallback() : null;
        this.mHandlerMainThread = new Handler(Looper.getMainLooper());
        if (iMedia != null && !iMedia.isReleased()) {
            this.mMedia = iMedia;
            iMedia.retain();
            nativeNewFromMedia(this.mMedia, aWindow);
            return;
        }
        throw new IllegalArgumentException("Media is null or released");
    }
}
