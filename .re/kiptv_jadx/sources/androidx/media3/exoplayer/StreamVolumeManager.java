package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
final class StreamVolumeManager {
    private static final java.lang.String TAG = "StreamVolumeManager";
    private static final java.lang.String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    private final android.content.Context applicationContext;
    private android.media.AudioManager audioManager;
    private final androidx.media3.exoplayer.StreamVolumeManager.Listener listener;
    private androidx.media3.exoplayer.StreamVolumeManager.VolumeChangeReceiver receiver;
    private final androidx.media3.common.util.BackgroundThreadStateHandler<androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState> stateHandler;
    private int volumeBeforeMute;

    public interface Listener {
        void onStreamTypeChanged(int i3);

        void onStreamVolumeChanged(int i3, boolean z6);
    }

    public static final class StreamVolumeState {
        public final int maxVolume;
        public final int minVolume;
        public final boolean muted;
        public final int streamType;
        public final int volume;

        public StreamVolumeState(int i3, int i9, boolean z6, int i10, int i11) {
            this.streamType = i3;
            this.volume = i9;
            this.muted = z6;
            this.minVolume = i10;
            this.maxVolume = i11;
        }
    }

    public final class VolumeChangeReceiver extends android.content.BroadcastReceiver {
        private VolumeChangeReceiver() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceive$0() {
            if (androidx.media3.exoplayer.StreamVolumeManager.this.receiver == null) {
                return;
            }
            androidx.media3.exoplayer.StreamVolumeManager.this.stateHandler.setStateInBackground(androidx.media3.exoplayer.StreamVolumeManager.this.generateState(((androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState) androidx.media3.exoplayer.StreamVolumeManager.this.stateHandler.get()).streamType));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            androidx.media3.exoplayer.StreamVolumeManager.this.stateHandler.runInBackground(new androidx.media3.exoplayer.RunnableC1546a(3, this));
        }
    }

    public StreamVolumeManager(android.content.Context context, androidx.media3.exoplayer.StreamVolumeManager.Listener listener, int i3, android.os.Looper looper, android.os.Looper looper2, androidx.media3.common.util.Clock clock) {
        this.applicationContext = context.getApplicationContext();
        this.listener = listener;
        androidx.media3.common.util.BackgroundThreadStateHandler<androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState> backgroundThreadStateHandler = new androidx.media3.common.util.BackgroundThreadStateHandler<>(new androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState(i3, 0, false, 0, 0), looper, looper2, clock, new androidx.media3.exoplayer.C1560o(10, this));
        this.stateHandler = backgroundThreadStateHandler;
        backgroundThreadStateHandler.runInBackground(new androidx.media3.exoplayer.C(this, i3, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState generateState(int i3) {
        this.audioManager.getClass();
        return new androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState(i3, androidx.media3.common.audio.AudioManagerCompat.getStreamVolume(this.audioManager, i3), androidx.media3.common.audio.AudioManagerCompat.isStreamMute(this.audioManager, i3), androidx.media3.common.audio.AudioManagerCompat.getStreamMinVolume(this.audioManager, i3), androidx.media3.common.audio.AudioManagerCompat.getStreamMaxVolume(this.audioManager, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState lambda$decreaseVolume$7(androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState streamVolumeState) {
        int i3 = streamVolumeState.streamType;
        int i9 = streamVolumeState.volume;
        int i10 = streamVolumeState.minVolume;
        return new androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState(i3, i9 > i10 ? i9 - 1 : i10, i9 <= 1, i10, streamVolumeState.maxVolume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState lambda$decreaseVolume$8(int i3, androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState streamVolumeState) {
        if (streamVolumeState.volume <= streamVolumeState.minVolume) {
            return streamVolumeState;
        }
        android.media.AudioManager audioManager = this.audioManager;
        audioManager.getClass();
        audioManager.adjustStreamVolume(streamVolumeState.streamType, -1, i3);
        return generateState(streamVolumeState.streamType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState lambda$increaseVolume$5(androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState streamVolumeState) {
        int i3 = streamVolumeState.streamType;
        int i9 = streamVolumeState.volume;
        int i10 = streamVolumeState.maxVolume;
        return new androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState(i3, i9 < i10 ? i9 + 1 : i10, false, streamVolumeState.minVolume, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState lambda$increaseVolume$6(int i3, androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState streamVolumeState) {
        if (streamVolumeState.volume >= streamVolumeState.maxVolume) {
            return streamVolumeState;
        }
        android.media.AudioManager audioManager = this.audioManager;
        audioManager.getClass();
        audioManager.adjustStreamVolume(streamVolumeState.streamType, 1, i3);
        return generateState(streamVolumeState.streamType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$0(int i3) {
        android.media.AudioManager audioManager = (android.media.AudioManager) this.applicationContext.getSystemService("audio");
        audioManager.getClass();
        this.audioManager = audioManager;
        androidx.media3.exoplayer.StreamVolumeManager.VolumeChangeReceiver volumeChangeReceiver = new androidx.media3.exoplayer.StreamVolumeManager.VolumeChangeReceiver();
        try {
            this.applicationContext.registerReceiver(volumeChangeReceiver, new android.content.IntentFilter(VOLUME_CHANGED_ACTION));
            this.receiver = volumeChangeReceiver;
        } catch (java.lang.RuntimeException e6) {
            androidx.media3.common.util.Log.w(TAG, "Error registering stream volume receiver", e6);
        }
        this.stateHandler.setStateInBackground(generateState(i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState lambda$release$11(androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState streamVolumeState) {
        return streamVolumeState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState lambda$release$12(androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState streamVolumeState) {
        androidx.media3.exoplayer.StreamVolumeManager.VolumeChangeReceiver volumeChangeReceiver = this.receiver;
        if (volumeChangeReceiver != null) {
            try {
                this.applicationContext.unregisterReceiver(volumeChangeReceiver);
            } catch (java.lang.RuntimeException e6) {
                androidx.media3.common.util.Log.w(TAG, "Error unregistering stream volume receiver", e6);
            }
            this.receiver = null;
        }
        return streamVolumeState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState lambda$setMuted$10(boolean z6, int i3, androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState streamVolumeState) {
        if (streamVolumeState.muted == z6) {
            return streamVolumeState;
        }
        this.audioManager.getClass();
        this.audioManager.adjustStreamVolume(streamVolumeState.streamType, z6 ? -100 : 100, i3);
        return generateState(streamVolumeState.streamType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState lambda$setMuted$9(boolean z6, androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState streamVolumeState) {
        int i3;
        int i9 = streamVolumeState.streamType;
        if (streamVolumeState.muted == z6) {
            i3 = streamVolumeState.volume;
        } else {
            i3 = z6 ? 0 : this.volumeBeforeMute;
        }
        return new androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState(i9, i3, z6, streamVolumeState.minVolume, streamVolumeState.maxVolume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState lambda$setStreamType$1(int i3, androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState streamVolumeState) {
        return new androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState(i3, streamVolumeState.volume, streamVolumeState.muted, streamVolumeState.minVolume, streamVolumeState.maxVolume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState lambda$setStreamType$2(int i3, androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState streamVolumeState) {
        return streamVolumeState.streamType == i3 ? streamVolumeState : generateState(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState lambda$setVolume$3(int i3, androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState streamVolumeState) {
        int i9 = streamVolumeState.streamType;
        int i10 = streamVolumeState.minVolume;
        return new androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState(i9, (i3 < i10 || i3 > streamVolumeState.maxVolume) ? streamVolumeState.volume : i3, i3 == 0, i10, streamVolumeState.maxVolume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState lambda$setVolume$4(int i3, int i9, androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState streamVolumeState) {
        if (i3 == streamVolumeState.volume || i3 < streamVolumeState.minVolume || i3 > streamVolumeState.maxVolume) {
            return streamVolumeState;
        }
        android.media.AudioManager audioManager = this.audioManager;
        audioManager.getClass();
        audioManager.setStreamVolume(streamVolumeState.streamType, i3, i9);
        return generateState(streamVolumeState.streamType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStreamVolumeStateChanged(androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState streamVolumeState, androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState streamVolumeState2) {
        boolean z6 = streamVolumeState.muted;
        if (!z6 && streamVolumeState2.muted) {
            this.volumeBeforeMute = streamVolumeState.volume;
        }
        int i3 = streamVolumeState.volume;
        int i9 = streamVolumeState2.volume;
        if (i3 != i9 || z6 != streamVolumeState2.muted) {
            this.listener.onStreamVolumeChanged(i9, streamVolumeState2.muted);
        }
        int i10 = streamVolumeState.streamType;
        int i11 = streamVolumeState2.streamType;
        if (i10 == i11 && streamVolumeState.minVolume == streamVolumeState2.minVolume && streamVolumeState.maxVolume == streamVolumeState2.maxVolume) {
            return;
        }
        this.listener.onStreamTypeChanged(i11);
    }

    public void decreaseVolume(int i3) {
        this.stateHandler.updateStateAsync(new androidx.media3.exoplayer.P(2), new androidx.media3.exoplayer.Q(this, i3, 1));
    }

    public int getMaxVolume() {
        return this.stateHandler.get().maxVolume;
    }

    public int getMinVolume() {
        return this.stateHandler.get().minVolume;
    }

    public int getVolume() {
        return this.stateHandler.get().volume;
    }

    public void increaseVolume(int i3) {
        this.stateHandler.updateStateAsync(new androidx.media3.exoplayer.P(1), new androidx.media3.exoplayer.Q(this, i3, 0));
    }

    public boolean isMuted() {
        return this.stateHandler.get().muted;
    }

    public void release() {
        this.stateHandler.updateStateAsync(new androidx.media3.exoplayer.P(0), new androidx.media3.exoplayer.C1552g(2, this));
    }

    public void setMuted(final boolean z6, final int i3) {
        this.stateHandler.updateStateAsync(new p068h4.j() { // from class: androidx.media3.exoplayer.T
            @Override // p068h4.j
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f16517a.lambda$setMuted$9(z6, (androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState) obj);
            }
        }, new p068h4.j() { // from class: androidx.media3.exoplayer.U
            @Override // p068h4.j
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f16519a.lambda$setMuted$10(z6, i3, (androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }

    public void setStreamType(int i3) {
        this.stateHandler.updateStateAsync(new androidx.media3.exoplayer.C1565t(i3, 4), new androidx.media3.exoplayer.Q(this, i3, 2));
    }

    public void setVolume(final int i3, final int i9) {
        this.stateHandler.updateStateAsync(new androidx.media3.exoplayer.C1565t(i3, 3), new p068h4.j() { // from class: androidx.media3.exoplayer.S
            @Override // p068h4.j
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f16514a.lambda$setVolume$4(i3, i9, (androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }
}
