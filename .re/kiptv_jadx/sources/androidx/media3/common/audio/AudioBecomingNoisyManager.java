package androidx.media3.common.audio;

/* JADX INFO: loaded from: classes.dex */
public final class AudioBecomingNoisyManager {
    private final androidx.media3.common.util.HandlerWrapper backgroundHandler;
    private final android.content.Context context;
    private boolean isEnabled;
    private final androidx.media3.common.audio.AudioBecomingNoisyManager.AudioBecomingNoisyReceiver receiver;

    public final class AudioBecomingNoisyReceiver extends android.content.BroadcastReceiver {
        private final androidx.media3.common.util.HandlerWrapper eventHandler;
        private final androidx.media3.common.audio.AudioBecomingNoisyManager.Listener listener;

        /* JADX INFO: Access modifiers changed from: private */
        public void callListenerIfEnabled() {
            if (androidx.media3.common.audio.AudioBecomingNoisyManager.this.isEnabled) {
                this.listener.onAudioBecomingNoisy();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.eventHandler.post(new androidx.media3.common.audio.a(2, this));
            }
        }

        private AudioBecomingNoisyReceiver(androidx.media3.common.util.HandlerWrapper handlerWrapper, androidx.media3.common.audio.AudioBecomingNoisyManager.Listener listener) {
            this.eventHandler = handlerWrapper;
            this.listener = listener;
        }
    }

    public interface Listener {
        void onAudioBecomingNoisy();
    }

    public AudioBecomingNoisyManager(android.content.Context context, android.os.Looper looper, android.os.Looper looper2, androidx.media3.common.audio.AudioBecomingNoisyManager.Listener listener, androidx.media3.common.util.Clock clock) {
        this.context = context.getApplicationContext();
        this.backgroundHandler = clock.createHandler(looper, null);
        this.receiver = new androidx.media3.common.audio.AudioBecomingNoisyManager.AudioBecomingNoisyReceiver(clock.createHandler(looper2, null), listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setEnabled$0() {
        this.context.registerReceiver(this.receiver, new android.content.IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setEnabled$1() {
        this.context.unregisterReceiver(this.receiver);
    }

    public void setEnabled(boolean z6) {
        if (z6 == this.isEnabled) {
            return;
        }
        if (z6) {
            this.backgroundHandler.post(new androidx.media3.common.audio.a(0, this));
            this.isEnabled = true;
        } else {
            this.backgroundHandler.post(new androidx.media3.common.audio.a(1, this));
            this.isEnabled = false;
        }
    }
}
