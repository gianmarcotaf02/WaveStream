package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final class AudioCapabilitiesReceiver {
    private androidx.media3.common.AudioAttributes audioAttributes;
    private androidx.media3.exoplayer.audio.AudioCapabilities audioCapabilities;
    private final androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.AudioDeviceCallback audioDeviceCallback;
    private final android.content.Context context;
    private final androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver;
    private final android.os.Handler handler;
    private final android.content.BroadcastReceiver hdmiAudioPlugBroadcastReceiver;
    private final androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.Listener listener;
    private boolean registered;
    private android.media.AudioDeviceInfo routedDevice;
    private androidx.media3.exoplayer.util.SpatializerWrapper spatializer;

    public final class AudioDeviceCallback extends android.media.AudioDeviceCallback {
        private AudioDeviceCallback() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
            androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.this.updateCurrentAudioCapabilities();
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
            if (androidx.media3.common.util.Util.contains(audioDeviceInfoArr, androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.this.routedDevice)) {
                androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.this.routedDevice = null;
            }
            androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.this.updateCurrentAudioCapabilities();
        }
    }

    public final class ExternalSurroundSoundSettingObserver extends android.database.ContentObserver {
        private final android.content.ContentResolver resolver;
        private final android.net.Uri settingUri;

        public ExternalSurroundSoundSettingObserver(android.os.Handler handler, android.content.ContentResolver contentResolver, android.net.Uri uri) {
            super(handler);
            this.resolver = contentResolver;
            this.settingUri = uri;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z6) {
            androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.this.updateCurrentAudioCapabilities();
        }

        public void register() {
            this.resolver.registerContentObserver(this.settingUri, false, this);
        }

        public void unregister() {
            this.resolver.unregisterContentObserver(this);
        }
    }

    public final class HdmiAudioPlugBroadcastReceiver extends android.content.BroadcastReceiver {
        private HdmiAudioPlugBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            java.util.List spatializerChannelMasks = androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.this.getSpatializerChannelMasks();
            androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver audioCapabilitiesReceiver = androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.onNewAudioCapabilities(androidx.media3.exoplayer.audio.AudioCapabilities.getCapabilitiesInternal(context, intent, audioCapabilitiesReceiver.audioAttributes, androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.this.routedDevice, spatializerChannelMasks));
        }
    }

    public interface Listener {
        void onAudioCapabilitiesChanged(androidx.media3.exoplayer.audio.AudioCapabilities audioCapabilities);
    }

    @java.lang.Deprecated
    public AudioCapabilitiesReceiver(android.content.Context context, androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.Listener listener) {
        this(context, listener, androidx.media3.common.AudioAttributes.DEFAULT, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.List<java.lang.Integer> getSpatializerChannelMasks() {
        androidx.media3.exoplayer.util.SpatializerWrapper spatializerWrapper;
        if (android.os.Build.VERSION.SDK_INT >= 32 && (spatializerWrapper = this.spatializer) != null) {
            return spatializerWrapper.getSpatializedChannelMasks();
        }
        p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
        return p076i4.S0.f22832l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNewAudioCapabilities(androidx.media3.exoplayer.audio.AudioCapabilities audioCapabilities) {
        if (!this.registered || audioCapabilities.equals(this.audioCapabilities)) {
            return;
        }
        this.audioCapabilities = audioCapabilities;
        this.listener.onAudioCapabilitiesChanged(audioCapabilities);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCurrentAudioCapabilities() {
        onNewAudioCapabilities(androidx.media3.exoplayer.audio.AudioCapabilities.getCapabilitiesInternal(this.context, this.audioAttributes, this.routedDevice, getSpatializerChannelMasks()));
    }

    public void overrideCapabilities(androidx.media3.exoplayer.audio.AudioCapabilities audioCapabilities) {
        onNewAudioCapabilities(audioCapabilities);
    }

    public androidx.media3.exoplayer.audio.AudioCapabilities register() {
        if (this.registered) {
            androidx.media3.exoplayer.audio.AudioCapabilities audioCapabilities = this.audioCapabilities;
            audioCapabilities.getClass();
            return audioCapabilities;
        }
        this.registered = true;
        androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver = this.externalSurroundSoundSettingObserver;
        if (externalSurroundSoundSettingObserver != null) {
            externalSurroundSoundSettingObserver.register();
        }
        androidx.media3.common.audio.AudioManagerCompat.getAudioManager(this.context).registerAudioDeviceCallback(this.audioDeviceCallback, this.handler);
        if (android.os.Build.VERSION.SDK_INT >= 32 && this.spatializer == null) {
            this.spatializer = new androidx.media3.exoplayer.util.SpatializerWrapper(this.context, new androidx.media3.exoplayer.audio.a(0, this), java.lang.Boolean.valueOf(androidx.media3.common.util.Util.isTv(this.context)));
        }
        androidx.media3.exoplayer.audio.AudioCapabilities capabilitiesInternal = androidx.media3.exoplayer.audio.AudioCapabilities.getCapabilitiesInternal(this.context, this.context.registerReceiver(this.hdmiAudioPlugBroadcastReceiver, new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.handler), this.audioAttributes, this.routedDevice, getSpatializerChannelMasks());
        this.audioCapabilities = capabilitiesInternal;
        return capabilitiesInternal;
    }

    public void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes) {
        if (java.util.Objects.equals(audioAttributes, this.audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        onNewAudioCapabilities(androidx.media3.exoplayer.audio.AudioCapabilities.getCapabilitiesInternal(this.context, audioAttributes, this.routedDevice, getSpatializerChannelMasks()));
    }

    public void setRoutedDevice(android.media.AudioDeviceInfo audioDeviceInfo) {
        if (java.util.Objects.equals(audioDeviceInfo, this.routedDevice)) {
            return;
        }
        this.routedDevice = audioDeviceInfo;
        onNewAudioCapabilities(androidx.media3.exoplayer.audio.AudioCapabilities.getCapabilitiesInternal(this.context, this.audioAttributes, audioDeviceInfo, getSpatializerChannelMasks()));
    }

    public void unregister() {
        androidx.media3.exoplayer.util.SpatializerWrapper spatializerWrapper;
        if (this.registered) {
            this.audioCapabilities = null;
            androidx.media3.common.audio.AudioManagerCompat.getAudioManager(this.context).unregisterAudioDeviceCallback(this.audioDeviceCallback);
            if (android.os.Build.VERSION.SDK_INT >= 32 && (spatializerWrapper = this.spatializer) != null) {
                spatializerWrapper.release();
                this.spatializer = null;
            }
            this.context.unregisterReceiver(this.hdmiAudioPlugBroadcastReceiver);
            androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver = this.externalSurroundSoundSettingObserver;
            if (externalSurroundSoundSettingObserver != null) {
                externalSurroundSoundSettingObserver.unregister();
            }
            this.registered = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioCapabilitiesReceiver(android.content.Context context, androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.Listener listener, androidx.media3.common.AudioAttributes audioAttributes, android.media.AudioDeviceInfo audioDeviceInfo) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        listener.getClass();
        this.listener = listener;
        this.audioAttributes = audioAttributes;
        this.routedDevice = audioDeviceInfo;
        android.os.Handler handlerCreateHandlerForCurrentOrMainLooper = androidx.media3.common.util.Util.createHandlerForCurrentOrMainLooper();
        this.handler = handlerCreateHandlerForCurrentOrMainLooper;
        this.audioDeviceCallback = new androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.AudioDeviceCallback();
        this.hdmiAudioPlugBroadcastReceiver = new androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.HdmiAudioPlugBroadcastReceiver();
        android.net.Uri externalSurroundSoundGlobalSettingUri = androidx.media3.exoplayer.audio.AudioCapabilities.getExternalSurroundSoundGlobalSettingUri();
        this.externalSurroundSoundSettingObserver = externalSurroundSoundGlobalSettingUri != null ? new androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.ExternalSurroundSoundSettingObserver(handlerCreateHandlerForCurrentOrMainLooper, applicationContext.getContentResolver(), externalSurroundSoundGlobalSettingUri) : null;
    }
}
