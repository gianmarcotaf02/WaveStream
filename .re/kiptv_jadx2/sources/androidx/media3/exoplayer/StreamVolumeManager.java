package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Log;

final class StreamVolumeManager {
    private static final String TAG = "StreamVolumeManager";
    private static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    private final Context applicationContext;
    private AudioManager audioManager;
    private final Listener listener;
    private VolumeChangeReceiver receiver;
    private final BackgroundThreadStateHandler<StreamVolumeState> stateHandler;
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

    public final class VolumeChangeReceiver extends BroadcastReceiver {
        private VolumeChangeReceiver() {
        }

        public void lambda$onReceive$0() {
            if (StreamVolumeManager.this.receiver == null) {
                return;
            }
            StreamVolumeManager.this.stateHandler.setStateInBackground(StreamVolumeManager.this.generateState(((StreamVolumeState) StreamVolumeManager.this.stateHandler.get()).streamType));
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            StreamVolumeManager.this.stateHandler.runInBackground(new RunnableC1546a(3, this));
        }
    }

    public StreamVolumeManager(Context context, Listener listener, int i3, Looper looper, Looper looper2, Clock clock) {
        this.applicationContext = context.getApplicationContext();
        this.listener = listener;
        BackgroundThreadStateHandler<StreamVolumeState> backgroundThreadStateHandler = new BackgroundThreadStateHandler<>(new StreamVolumeState(i3, 0, false, 0, 0), looper, looper2, clock, new C1560o(10, this));
        this.stateHandler = backgroundThreadStateHandler;
        backgroundThreadStateHandler.runInBackground(new C(this, i3, 1));
    }

    public StreamVolumeState generateState(int i3) {
        this.audioManager.getClass();
        return new StreamVolumeState(i3, AudioManagerCompat.getStreamVolume(this.audioManager, i3), AudioManagerCompat.isStreamMute(this.audioManager, i3), AudioManagerCompat.getStreamMinVolume(this.audioManager, i3), AudioManagerCompat.getStreamMaxVolume(this.audioManager, i3));
    }

    public static StreamVolumeState lambda$decreaseVolume$7(StreamVolumeState streamVolumeState) {
        int i3 = streamVolumeState.streamType;
        int i9 = streamVolumeState.volume;
        int i10 = streamVolumeState.minVolume;
        return new StreamVolumeState(i3, i9 > i10 ? i9 - 1 : i10, i9 <= 1, i10, streamVolumeState.maxVolume);
    }

    public StreamVolumeState lambda$decreaseVolume$8(int i3, StreamVolumeState streamVolumeState) {
        if (streamVolumeState.volume <= streamVolumeState.minVolume) {
            return streamVolumeState;
        }
        AudioManager audioManager = this.audioManager;
        audioManager.getClass();
        audioManager.adjustStreamVolume(streamVolumeState.streamType, -1, i3);
        return generateState(streamVolumeState.streamType);
    }

    public static StreamVolumeState lambda$increaseVolume$5(StreamVolumeState streamVolumeState) {
        int i3 = streamVolumeState.streamType;
        int i9 = streamVolumeState.volume;
        int i10 = streamVolumeState.maxVolume;
        return new StreamVolumeState(i3, i9 < i10 ? i9 + 1 : i10, false, streamVolumeState.minVolume, i10);
    }

    public StreamVolumeState lambda$increaseVolume$6(int i3, StreamVolumeState streamVolumeState) {
        if (streamVolumeState.volume >= streamVolumeState.maxVolume) {
            return streamVolumeState;
        }
        AudioManager audioManager = this.audioManager;
        audioManager.getClass();
        audioManager.adjustStreamVolume(streamVolumeState.streamType, 1, i3);
        return generateState(streamVolumeState.streamType);
    }

    public void lambda$new$0(int i3) {
        AudioManager audioManager = (AudioManager) this.applicationContext.getSystemService("audio");
        audioManager.getClass();
        this.audioManager = audioManager;
        VolumeChangeReceiver volumeChangeReceiver = new VolumeChangeReceiver();
        try {
            this.applicationContext.registerReceiver(volumeChangeReceiver, new IntentFilter(VOLUME_CHANGED_ACTION));
            this.receiver = volumeChangeReceiver;
        } catch (RuntimeException e6) {
            Log.w(TAG, "Error registering stream volume receiver", e6);
        }
        this.stateHandler.setStateInBackground(generateState(i3));
    }

    public static StreamVolumeState lambda$release$11(StreamVolumeState streamVolumeState) {
        return streamVolumeState;
    }

    public StreamVolumeState lambda$release$12(StreamVolumeState streamVolumeState) {
        VolumeChangeReceiver volumeChangeReceiver = this.receiver;
        if (volumeChangeReceiver != null) {
            try {
                this.applicationContext.unregisterReceiver(volumeChangeReceiver);
            } catch (RuntimeException e6) {
                Log.w(TAG, "Error unregistering stream volume receiver", e6);
            }
            this.receiver = null;
        }
        return streamVolumeState;
    }

    public StreamVolumeState lambda$setMuted$10(boolean z6, int i3, StreamVolumeState streamVolumeState) {
        if (streamVolumeState.muted == z6) {
            return streamVolumeState;
        }
        this.audioManager.getClass();
        this.audioManager.adjustStreamVolume(streamVolumeState.streamType, z6 ? -100 : 100, i3);
        return generateState(streamVolumeState.streamType);
    }

    public StreamVolumeState lambda$setMuted$9(boolean z6, StreamVolumeState streamVolumeState) {
        int i3;
        int i9 = streamVolumeState.streamType;
        if (streamVolumeState.muted == z6) {
            i3 = streamVolumeState.volume;
        } else {
            i3 = z6 ? 0 : this.volumeBeforeMute;
        }
        return new StreamVolumeState(i9, i3, z6, streamVolumeState.minVolume, streamVolumeState.maxVolume);
    }

    public static StreamVolumeState lambda$setStreamType$1(int i3, StreamVolumeState streamVolumeState) {
        return new StreamVolumeState(i3, streamVolumeState.volume, streamVolumeState.muted, streamVolumeState.minVolume, streamVolumeState.maxVolume);
    }

    public StreamVolumeState lambda$setStreamType$2(int i3, StreamVolumeState streamVolumeState) {
        return streamVolumeState.streamType == i3 ? streamVolumeState : generateState(i3);
    }

    public static StreamVolumeState lambda$setVolume$3(int i3, StreamVolumeState streamVolumeState) {
        int i9 = streamVolumeState.streamType;
        int i10 = streamVolumeState.minVolume;
        return new StreamVolumeState(i9, (i3 < i10 || i3 > streamVolumeState.maxVolume) ? streamVolumeState.volume : i3, i3 == 0, i10, streamVolumeState.maxVolume);
    }

    public StreamVolumeState lambda$setVolume$4(int i3, int i9, StreamVolumeState streamVolumeState) {
        if (i3 == streamVolumeState.volume || i3 < streamVolumeState.minVolume || i3 > streamVolumeState.maxVolume) {
            return streamVolumeState;
        }
        AudioManager audioManager = this.audioManager;
        audioManager.getClass();
        audioManager.setStreamVolume(streamVolumeState.streamType, i3, i9);
        return generateState(streamVolumeState.streamType);
    }

    public void onStreamVolumeStateChanged(StreamVolumeState streamVolumeState, StreamVolumeState streamVolumeState2) {
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
        this.stateHandler.updateStateAsync(new P(2), new Q(this, i3, 1));
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
        this.stateHandler.updateStateAsync(new P(1), new Q(this, i3, 0));
    }

    public boolean isMuted() {
        return this.stateHandler.get().muted;
    }

    public void release() {
        this.stateHandler.updateStateAsync(new P(0), new C1552g(2, this));
    }

    public void setMuted(final boolean z6, final int i3) {
        this.stateHandler.updateStateAsync(new p068h4.j() {
            @Override
            public final Object apply(Object obj) {
                return this.f16517a.lambda$setMuted$9(z6, (StreamVolumeManager.StreamVolumeState) obj);
            }
        }, new p068h4.j() {
            @Override
            public final Object apply(Object obj) {
                return this.f16519a.lambda$setMuted$10(z6, i3, (StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }

    public void setStreamType(int i3) {
        this.stateHandler.updateStateAsync(new C1565t(i3, 4), new Q(this, i3, 2));
    }

    public void setVolume(final int i3, final int i9) {
        this.stateHandler.updateStateAsync(new C1565t(i3, 3), new p068h4.j() {
            @Override
            public final Object apply(Object obj) {
                return this.f16514a.lambda$setVolume$4(i3, i9, (StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }
}
