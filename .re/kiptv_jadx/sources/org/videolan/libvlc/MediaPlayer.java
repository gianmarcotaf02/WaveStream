package org.videolan.libvlc;

/* JADX INFO: loaded from: classes4.dex */
public class MediaPlayer extends org.videolan.libvlc.VLCObject<org.videolan.libvlc.MediaPlayer.Event> {
    public static final int SURFACE_SCALES_COUNT = org.videolan.libvlc.MediaPlayer.ScaleType.values().length;
    private android.content.res.AssetFileDescriptor mAfd;
    private final android.media.AudioDeviceCallback mAudioDeviceCallback;
    private boolean mAudioDigitalOutputEnabled;
    private java.lang.String mAudioOutput;
    private java.lang.String mAudioOutputDevice;
    private java.lang.String mAudioPlugOutputDevice;
    private final android.content.BroadcastReceiver mAudioPlugReceiver;
    private boolean mAudioPlugRegistered;
    private boolean mCanDoPassthrough;
    android.os.Handler mHandlerMainThread;
    private boolean mListenAudioPlug;
    private org.videolan.libvlc.interfaces.IMedia mMedia;
    private boolean mPlayRequested;
    private boolean mPlaying;
    private org.videolan.libvlc.RendererItem mRenderer;
    private java.lang.Boolean mUseOrientationFromBounds;
    private org.videolan.libvlc.VideoHelper mVideoHelper;
    private int mVoutCount;
    private final org.videolan.libvlc.AWindow mWindow;

    public static class Chapter {
        public final long duration;
        public final java.lang.String name;
        public final long timeOffset;

        private Chapter(long j, long j9, java.lang.String str) {
            this.timeOffset = j;
            this.duration = j9;
            this.name = str;
        }
    }

    public static class Event extends org.videolan.libvlc.interfaces.AbstractVLCEvent {
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

        public java.lang.String getRecordPath() {
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

        public Event(int i3, long j, java.lang.String str) {
            super(i3, j, str);
        }
    }

    public interface EventListener extends org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener<org.videolan.libvlc.MediaPlayer.Event> {
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
        SURFACE_16_9(java.lang.Float.valueOf(1.7777778f)),
        SURFACE_4_3(java.lang.Float.valueOf(1.3333334f)),
        SURFACE_16_10(java.lang.Float.valueOf(1.6f)),
        SURFACE_2_1(java.lang.Float.valueOf(2.0f)),
        SURFACE_221_1(java.lang.Float.valueOf(2.21f)),
        SURFACE_235_1(java.lang.Float.valueOf(2.35f)),
        SURFACE_239_1(java.lang.Float.valueOf(2.39f)),
        SURFACE_5_4(java.lang.Float.valueOf(1.25f)),
        SURFACE_ORIGINAL(null);

        private final java.lang.Float ratio;

        ScaleType(java.lang.Float f9) {
            this.ratio = f9;
        }

        public static org.videolan.libvlc.MediaPlayer.ScaleType[] getMainScaleTypes() {
            return new org.videolan.libvlc.MediaPlayer.ScaleType[]{SURFACE_BEST_FIT, SURFACE_FIT_SCREEN, SURFACE_FILL, SURFACE_16_9, SURFACE_4_3, SURFACE_ORIGINAL};
        }

        public java.lang.Float getRatio() {
            return this.ratio;
        }
    }

    public static class Title {
        public final long duration;
        private final int flags;
        public final java.lang.String name;

        public static class Flags {
            public static final int INTERACTIVE = 2;
            public static final int MENU = 1;

            private Flags() {
            }
        }

        public Title(long j, java.lang.String str, int i3) {
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

    public MediaPlayer(org.videolan.libvlc.interfaces.ILibVLC iLibVLC) {
        super(iLibVLC);
        this.mUseOrientationFromBounds = java.lang.Boolean.FALSE;
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
        org.videolan.libvlc.AWindow aWindow = new org.videolan.libvlc.AWindow(new org.videolan.libvlc.AWindow.SurfaceCallback() { // from class: org.videolan.libvlc.MediaPlayer.1
            @Override // org.videolan.libvlc.AWindow.SurfaceCallback
            public void onSurfacesCreated(org.videolan.libvlc.AWindow aWindow2) {
                boolean z6;
                boolean z9;
                synchronized (org.videolan.libvlc.MediaPlayer.this) {
                    try {
                        z6 = false;
                        if (org.videolan.libvlc.MediaPlayer.this.mPlaying || !org.videolan.libvlc.MediaPlayer.this.mPlayRequested) {
                            z9 = org.videolan.libvlc.MediaPlayer.this.mVoutCount == 0;
                        } else {
                            z9 = false;
                            z6 = true;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                if (z6) {
                    org.videolan.libvlc.MediaPlayer.this.play();
                } else if (z9) {
                    org.videolan.libvlc.MediaPlayer.this.setVideoTrackEnabled(true);
                }
            }

            @Override // org.videolan.libvlc.AWindow.SurfaceCallback
            public void onSurfacesDestroyed(org.videolan.libvlc.AWindow aWindow2) {
                boolean z6;
                synchronized (org.videolan.libvlc.MediaPlayer.this) {
                    z6 = org.videolan.libvlc.MediaPlayer.this.mVoutCount > 0;
                }
                if (z6) {
                    org.videolan.libvlc.MediaPlayer.this.setVideoTrackEnabled(false);
                }
            }
        });
        this.mWindow = aWindow;
        boolean z6 = org.videolan.libvlc.util.AndroidUtil.isMarshMallowOrLater;
        this.mAudioPlugReceiver = !z6 ? createAudioPlugReceiver() : null;
        this.mAudioDeviceCallback = z6 ? createAudioDeviceCallback() : null;
        this.mHandlerMainThread = new android.os.Handler(android.os.Looper.getMainLooper());
        nativeNewFromLibVlc(iLibVLC, aWindow);
    }

    private android.media.AudioDeviceCallback createAudioDeviceCallback() {
        return new android.media.AudioDeviceCallback() { // from class: org.videolan.libvlc.MediaPlayer.3
            private android.util.SparseArray<java.lang.Long> mEncodedDevices = new android.util.SparseArray<>();

            private void onAudioDevicesChanged() {
                long jLongValue = 0;
                for (int i3 = 0; i3 < this.mEncodedDevices.size(); i3++) {
                    jLongValue |= this.mEncodedDevices.valueAt(i3).longValue();
                }
                org.videolan.libvlc.MediaPlayer.this.updateAudioOutputDevice(jLongValue, jLongValue == 0 ? "stereo" : "pcm");
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
                for (android.media.AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    if (audioDeviceInfo.isSink()) {
                        long encodingFlags = org.videolan.libvlc.MediaPlayer.this.getEncodingFlags(audioDeviceInfo.getEncodings());
                        if (encodingFlags != 0) {
                            this.mEncodedDevices.put(audioDeviceInfo.getId(), java.lang.Long.valueOf(encodingFlags));
                        }
                    }
                }
                onAudioDevicesChanged();
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
                for (android.media.AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    if (audioDeviceInfo.isSink()) {
                        this.mEncodedDevices.remove(audioDeviceInfo.getId());
                    }
                }
                onAudioDevicesChanged();
            }
        };
    }

    private android.content.BroadcastReceiver createAudioPlugReceiver() {
        return new android.content.BroadcastReceiver() { // from class: org.videolan.libvlc.MediaPlayer.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                java.lang.String action = intent.getAction();
                if (action != null && action.equalsIgnoreCase("android.media.action.HDMI_AUDIO_PLUG")) {
                    org.videolan.libvlc.MediaPlayer.this.updateAudioOutputDevice(intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1 ? org.videolan.libvlc.MediaPlayer.this.getEncodingFlags(intent.getIntArrayExtra("android.media.extra.ENCODINGS")) : 0L, "stereo");
                }
            }
        };
    }

    private static org.videolan.libvlc.MediaPlayer.Chapter createChapterFromNative(long j, long j9, java.lang.String str) {
        return new org.videolan.libvlc.MediaPlayer.Chapter(j, j9, str);
    }

    private static org.videolan.libvlc.MediaPlayer.Title createTitleFromNative(long j, java.lang.String str, int i3) {
        return new org.videolan.libvlc.MediaPlayer.Title(j, str, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
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
        java.lang.String str = this.mAudioOutput;
        return str == null || str.contains("audiotrack");
    }

    private boolean isEncoded(int i3) {
        return i3 == 5 || i3 == 6 || i3 == 7 || i3 == 8 || i3 == 14;
    }

    private native boolean nativeAddSlave(int i3, java.lang.String str, boolean z6);

    private native java.lang.String nativeGetAspectRatio();

    private native long nativeGetAudioDelay();

    private native org.videolan.libvlc.MediaPlayer.Chapter[] nativeGetChapters(int i3);

    private native float nativeGetScale();

    private native org.videolan.libvlc.interfaces.IMedia.Track nativeGetSelectedTrack(int i3);

    private native long nativeGetSpuDelay();

    private native int nativeGetTeletext();

    private native boolean nativeGetTeletextTransparency();

    private native org.videolan.libvlc.MediaPlayer.Title[] nativeGetTitles();

    private native org.videolan.libvlc.interfaces.IMedia.Track nativeGetTrackFromID(java.lang.String str);

    private native org.videolan.libvlc.interfaces.IMedia.Track[] nativeGetTracks(int i3, boolean z6);

    private native void nativeNewFromLibVlc(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, org.videolan.libvlc.AWindow aWindow);

    private native void nativeNewFromMedia(org.videolan.libvlc.interfaces.IMedia iMedia, org.videolan.libvlc.AWindow aWindow);

    private native void nativePlay();

    private native boolean nativeRecord(java.lang.String str, boolean z6);

    private native void nativeRelease();

    private native boolean nativeSelectTrack(java.lang.String str);

    private native void nativeSelectTracks(int i3, java.lang.String str);

    private native void nativeSetAspectRatio(java.lang.String str);

    private native boolean nativeSetAudioDelay(long j);

    private native boolean nativeSetAudioOutput(java.lang.String str);

    private native boolean nativeSetAudioOutputDevice(java.lang.String str);

    private native boolean nativeSetEqualizer(org.videolan.libvlc.MediaPlayer.Equalizer equalizer);

    private native void nativeSetMedia(org.videolan.libvlc.interfaces.IMedia iMedia);

    private native int nativeSetRenderer(org.videolan.libvlc.RendererItem rendererItem);

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
        android.content.Intent intentRegisterReceiver = this.mILibVLC.getAppContext().registerReceiver(this.mAudioPlugReceiver, new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        if (intentRegisterReceiver != null) {
            this.mAudioPlugReceiver.onReceive(this.mILibVLC.getAppContext(), intentRegisterReceiver);
        }
    }

    private void registerAudioPlugV23(boolean z6) {
        android.media.AudioManager audioManager = (android.media.AudioManager) this.mILibVLC.getAppContext().getSystemService(android.media.AudioManager.class);
        if (!z6) {
            audioManager.unregisterAudioDeviceCallback(this.mAudioDeviceCallback);
        } else {
            this.mAudioDeviceCallback.onAudioDevicesAdded(audioManager.getDevices(2));
            audioManager.registerAudioDeviceCallback(this.mAudioDeviceCallback, null);
        }
    }

    private synchronized boolean setAudioOutputDeviceInternal(java.lang.String str, boolean z6) {
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
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return zNativeSetAudioOutputDevice;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void updateAudioOutputDevice(long j, java.lang.String str) {
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
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public boolean addSlave(int i3, android.net.Uri uri, boolean z6) {
        return nativeAddSlave(i3, org.videolan.libvlc.util.VLCUtil.encodeVLCUri(uri), z6);
    }

    public void attachViews(org.videolan.libvlc.util.VLCVideoLayout vLCVideoLayout, org.videolan.libvlc.util.DisplayManager displayManager, boolean z6, boolean z9) {
        org.videolan.libvlc.VideoHelper videoHelper = new org.videolan.libvlc.VideoHelper(this, vLCVideoLayout, displayManager, z6, z9);
        this.mVideoHelper = videoHelper;
        videoHelper.attachViews();
    }

    public boolean canDoPassthrough() {
        return this.mCanDoPassthrough;
    }

    public void detachViews() {
        org.videolan.libvlc.VideoHelper videoHelper = this.mVideoHelper;
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
                java.lang.String str = "encoded:" + getEncodingFlags(iArr);
                if (!str.equals(this.mAudioPlugOutputDevice)) {
                    this.mAudioPlugOutputDevice = str;
                    setAudioOutputDeviceInternal(str, true);
                }
            }
            return true;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public java.lang.String getAspectRatio() {
        return nativeGetAspectRatio();
    }

    public long getAudioDelay() {
        return nativeGetAudioDelay();
    }

    public native int getChapter();

    public org.videolan.libvlc.MediaPlayer.Chapter[] getChapters(int i3) {
        return nativeGetChapters(i3);
    }

    @Override // org.videolan.libvlc.VLCObject
    public /* bridge */ /* synthetic */ long getInstance() {
        return super.getInstance();
    }

    public native long getLength();

    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public /* bridge */ /* synthetic */ org.videolan.libvlc.interfaces.ILibVLC getLibVLC() {
        return super.getLibVLC();
    }

    public synchronized org.videolan.libvlc.interfaces.IMedia getMedia() {
        try {
            org.videolan.libvlc.interfaces.IMedia iMedia = this.mMedia;
            if (iMedia != null) {
                iMedia.retain();
            }
        } catch (java.lang.Throwable th) {
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

    public org.videolan.libvlc.interfaces.IMedia.Track getSelectedTrack(int i3) {
        return nativeGetSelectedTrack(i3);
    }

    public org.videolan.libvlc.interfaces.IMedia.Track[] getSelectedTracks(int i3) {
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

    public org.videolan.libvlc.MediaPlayer.Title[] getTitles() {
        return nativeGetTitles();
    }

    public org.videolan.libvlc.interfaces.IMedia.Track getTrackFromID(java.lang.String str) {
        return nativeGetTrackFromID(str);
    }

    public org.videolan.libvlc.interfaces.IMedia.Track[] getTracks(int i3) {
        return nativeGetTracks(i3, false);
    }

    public org.videolan.libvlc.interfaces.IVLCVout getVLCVout() {
        return this.mWindow;
    }

    public org.videolan.libvlc.MediaPlayer.ScaleType getVideoScale() {
        org.videolan.libvlc.VideoHelper videoHelper = this.mVideoHelper;
        return videoHelper != null ? videoHelper.getVideoScale() : org.videolan.libvlc.MediaPlayer.ScaleType.SURFACE_BEST_FIT;
    }

    public native int getVolume();

    public synchronized boolean hasMedia() {
        return this.mMedia != null;
    }

    public native boolean isPlaying();

    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public /* bridge */ /* synthetic */ boolean isReleased() {
        return super.isReleased();
    }

    public native boolean isSeekable();

    public native void nativeSetPosition(float f9, boolean z6);

    public native long nativeSetTime(long j, boolean z6);

    public native void navigate(int i3);

    public native int nextChapter();

    @Override // org.videolan.libvlc.VLCObject
    public void onReleaseNative() {
        detachViews();
        this.mWindow.detachViews();
        registerAudioPlug(false);
        org.videolan.libvlc.interfaces.IMedia iMedia = this.mMedia;
        if (iMedia != null) {
            iMedia.release();
        }
        org.videolan.libvlc.RendererItem rendererItem = this.mRenderer;
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
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void playAsset(android.content.Context context, java.lang.String str) throws java.io.IOException {
        android.content.res.AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(str);
        this.mAfd = assetFileDescriptorOpenFd;
        play(assetFileDescriptorOpenFd);
    }

    public native int previousChapter();

    public boolean record(java.lang.String str, boolean z6) {
        return nativeRecord(str, z6);
    }

    public boolean selectTrack(java.lang.String str) {
        return nativeSelectTrack(str);
    }

    public void selectTracks(int i3, java.lang.String str) {
        nativeSelectTracks(i3, str);
    }

    public void setAspectRatio(java.lang.String str) {
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

    public synchronized boolean setAudioOutput(java.lang.String str) {
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
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return zNativeSetAudioOutput;
    }

    public boolean setAudioOutputDevice(java.lang.String str) {
        return setAudioOutputDeviceInternal(str, true);
    }

    public native void setChapter(int i3);

    public boolean setEqualizer(org.videolan.libvlc.MediaPlayer.Equalizer equalizer) {
        return nativeSetEqualizer(equalizer);
    }

    public synchronized void setEventListener(org.videolan.libvlc.MediaPlayer.EventListener eventListener) {
        super.setEventListener((org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener) eventListener);
    }

    public void setMedia(org.videolan.libvlc.interfaces.IMedia iMedia) {
        if (iMedia != null) {
            if (iMedia.isReleased()) {
                throw new java.lang.IllegalArgumentException("Media is released");
            }
            iMedia.setDefaultMediaPlayerOptions();
        }
        nativeSetMedia(iMedia);
        synchronized (this) {
            try {
                org.videolan.libvlc.interfaces.IMedia iMedia2 = this.mMedia;
                if (iMedia2 != null) {
                    iMedia2.release();
                }
                if (iMedia != null) {
                    iMedia.retain();
                }
                this.mMedia = iMedia;
            } catch (java.lang.Throwable th) {
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

    public int setRenderer(org.videolan.libvlc.RendererItem rendererItem) {
        org.videolan.libvlc.RendererItem rendererItem2 = this.mRenderer;
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

    public void setUseOrientationFromBounds(java.lang.Boolean bool) {
        this.mUseOrientationFromBounds = bool;
    }

    public void setVideoScale(org.videolan.libvlc.MediaPlayer.ScaleType scaleType) {
        org.videolan.libvlc.VideoHelper videoHelper = this.mVideoHelper;
        if (videoHelper != null) {
            videoHelper.setVideoScale(scaleType);
        }
    }

    public void setVideoTitleDisplay(int i3, int i9) {
        nativeSetVideoTitleDisplay(i3, i9);
    }

    public void setVideoTrackEnabled(boolean z6) {
        org.videolan.libvlc.interfaces.IMedia.Track[] tracks;
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
        android.content.res.AssetFileDescriptor assetFileDescriptor = this.mAfd;
        if (assetFileDescriptor != null) {
            try {
                assetFileDescriptor.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public void unselectTrackType(int i3) {
        nativeUnselectTrackType(i3);
    }

    public void updateVideoSurfaces() {
        org.videolan.libvlc.VideoHelper videoHelper = this.mVideoHelper;
        if (videoHelper != null) {
            videoHelper.updateVideoSurfaces();
        }
    }

    public boolean updateViewpoint(float f9, float f10, float f11, float f12, boolean z6) {
        return nativeUpdateViewpoint(f9, f10, f11, f12, z6);
    }

    public java.lang.Boolean useOrientationFromBounds() {
        return this.mUseOrientationFromBounds;
    }

    public static class Equalizer {
        private long mInstance;

        private Equalizer() {
            nativeNew();
        }

        public static org.videolan.libvlc.MediaPlayer.Equalizer create() {
            return new org.videolan.libvlc.MediaPlayer.Equalizer();
        }

        public static org.videolan.libvlc.MediaPlayer.Equalizer createFromPreset(int i3) {
            return new org.videolan.libvlc.MediaPlayer.Equalizer(i3);
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

        public static java.lang.String getPresetName(int i3) {
            return nativeGetPresetName(i3);
        }

        private native float nativeGetAmp(int i3);

        private static native int nativeGetBandCount();

        private static native float nativeGetBandFrequency(int i3);

        private native float nativeGetPreAmp();

        private static native int nativeGetPresetCount();

        private static native java.lang.String nativeGetPresetName(int i3);

        private native void nativeNew();

        private native void nativeNewFromPreset(int i3);

        private native void nativeRelease();

        private native boolean nativeSetAmp(int i3, float f9);

        private native boolean nativeSetPreAmp(float f9);

        public void finalize() throws java.lang.Throwable {
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

    public boolean addSlave(int i3, java.lang.String str, boolean z6) {
        return addSlave(i3, android.net.Uri.fromFile(new java.io.File(str)), z6);
    }

    @Override // org.videolan.libvlc.VLCObject
    public synchronized org.videolan.libvlc.MediaPlayer.Event onEventNative(int i3, long j, long j9, float f9, java.lang.String str) {
        try {
            if (i3 != 256) {
                if (i3 == 286) {
                    return new org.videolan.libvlc.MediaPlayer.Event(i3, j, str);
                }
                if (i3 == 273) {
                    return new org.videolan.libvlc.MediaPlayer.Event(i3, j);
                }
                if (i3 == 274) {
                    this.mVoutCount = (int) j;
                    notify();
                    this.mHandlerMainThread.post(new java.lang.Runnable() { // from class: org.videolan.libvlc.MediaPlayer.4
                        @Override // java.lang.Runnable
                        public void run() {
                            org.videolan.libvlc.MediaPlayer.this.updateVideoSurfaces();
                        }
                    });
                    return new org.videolan.libvlc.MediaPlayer.Event(i3, j);
                }
                switch (i3) {
                    case org.videolan.libvlc.MediaPlayer.Event.Opening /* 258 */:
                    case org.videolan.libvlc.MediaPlayer.Event.Buffering /* 259 */:
                        i3 = i3;
                        return new org.videolan.libvlc.MediaPlayer.Event(i3, f9);
                    case org.videolan.libvlc.MediaPlayer.Event.Playing /* 260 */:
                    case org.videolan.libvlc.MediaPlayer.Event.Paused /* 261 */:
                        return new org.videolan.libvlc.MediaPlayer.Event(i3);
                    case org.videolan.libvlc.MediaPlayer.Event.Stopped /* 262 */:
                        break;
                    default:
                        switch (i3) {
                            case org.videolan.libvlc.MediaPlayer.Event.EndReached /* 265 */:
                            case org.videolan.libvlc.MediaPlayer.Event.EncounteredError /* 266 */:
                                break;
                            case org.videolan.libvlc.MediaPlayer.Event.TimeChanged /* 267 */:
                                return new org.videolan.libvlc.MediaPlayer.Event(i3, j);
                            case org.videolan.libvlc.MediaPlayer.Event.PositionChanged /* 268 */:
                                return new org.videolan.libvlc.MediaPlayer.Event(i3, f9);
                            case org.videolan.libvlc.MediaPlayer.Event.SeekableChanged /* 269 */:
                            case org.videolan.libvlc.MediaPlayer.Event.PausableChanged /* 270 */:
                                return new org.videolan.libvlc.MediaPlayer.Event(i3, j);
                            default:
                                switch (i3) {
                                    case org.videolan.libvlc.MediaPlayer.Event.ESAdded /* 276 */:
                                    case org.videolan.libvlc.MediaPlayer.Event.ESDeleted /* 277 */:
                                    case org.videolan.libvlc.MediaPlayer.Event.ESSelected /* 278 */:
                                        return new org.videolan.libvlc.MediaPlayer.Event(i3, j, j9);
                                    default:
                                        return null;
                                }
                        }
                        break;
                }
            }
            this.mVoutCount = 0;
            notify();
            return new org.videolan.libvlc.MediaPlayer.Event(i3, f9);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public void setPosition(float f9) {
        nativeSetPosition(f9, false);
    }

    public long setTime(long j) {
        return nativeSetTime(j, false);
    }

    public void play(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        play(new org.videolan.libvlc.Media(this.mILibVLC, assetFileDescriptor));
    }

    public void play(java.lang.String str) {
        play(new org.videolan.libvlc.Media(this.mILibVLC, str));
    }

    public void play(android.net.Uri uri) {
        play(new org.videolan.libvlc.Media(this.mILibVLC, uri));
    }

    public void play(org.videolan.libvlc.interfaces.IMedia iMedia) {
        setMedia(iMedia);
        iMedia.release();
        play();
    }

    public MediaPlayer(org.videolan.libvlc.interfaces.IMedia iMedia) {
        super(iMedia);
        this.mUseOrientationFromBounds = java.lang.Boolean.FALSE;
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
        org.videolan.libvlc.AWindow aWindow = new org.videolan.libvlc.AWindow(new org.videolan.libvlc.AWindow.SurfaceCallback() { // from class: org.videolan.libvlc.MediaPlayer.1
            @Override // org.videolan.libvlc.AWindow.SurfaceCallback
            public void onSurfacesCreated(org.videolan.libvlc.AWindow aWindow2) {
                boolean z6;
                boolean z9;
                synchronized (org.videolan.libvlc.MediaPlayer.this) {
                    try {
                        z6 = false;
                        if (org.videolan.libvlc.MediaPlayer.this.mPlaying || !org.videolan.libvlc.MediaPlayer.this.mPlayRequested) {
                            z9 = org.videolan.libvlc.MediaPlayer.this.mVoutCount == 0;
                        } else {
                            z9 = false;
                            z6 = true;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                if (z6) {
                    org.videolan.libvlc.MediaPlayer.this.play();
                } else if (z9) {
                    org.videolan.libvlc.MediaPlayer.this.setVideoTrackEnabled(true);
                }
            }

            @Override // org.videolan.libvlc.AWindow.SurfaceCallback
            public void onSurfacesDestroyed(org.videolan.libvlc.AWindow aWindow2) {
                boolean z6;
                synchronized (org.videolan.libvlc.MediaPlayer.this) {
                    z6 = org.videolan.libvlc.MediaPlayer.this.mVoutCount > 0;
                }
                if (z6) {
                    org.videolan.libvlc.MediaPlayer.this.setVideoTrackEnabled(false);
                }
            }
        });
        this.mWindow = aWindow;
        boolean z6 = org.videolan.libvlc.util.AndroidUtil.isMarshMallowOrLater;
        this.mAudioPlugReceiver = !z6 ? createAudioPlugReceiver() : null;
        this.mAudioDeviceCallback = z6 ? createAudioDeviceCallback() : null;
        this.mHandlerMainThread = new android.os.Handler(android.os.Looper.getMainLooper());
        if (iMedia != null && !iMedia.isReleased()) {
            this.mMedia = iMedia;
            iMedia.retain();
            nativeNewFromMedia(this.mMedia, aWindow);
            return;
        }
        throw new java.lang.IllegalArgumentException("Media is null or released");
    }
}
