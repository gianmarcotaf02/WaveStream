package androidx.media3.common.audio;

/* JADX INFO: loaded from: classes.dex */
public final class AudioManagerCompat {
    public static final int AUDIOFOCUS_GAIN = 1;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    public static final int AUDIOFOCUS_NONE = 0;
    private static final java.lang.String TAG = "AudioManagerCompat";
    private static android.content.Context applicationContext;
    private static android.media.AudioManager audioManager;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AudioFocusGain {
    }

    private AudioManagerCompat() {
    }

    public static int abandonAudioFocusRequest(android.media.AudioManager audioManager2, androidx.media3.common.audio.AudioFocusRequestCompat audioFocusRequestCompat) {
        return android.os.Build.VERSION.SDK_INT >= 26 ? audioManager2.abandonAudioFocusRequest(audioFocusRequestCompat.getAudioFocusRequest()) : audioManager2.abandonAudioFocus(audioFocusRequestCompat.getOnAudioFocusChangeListener());
    }

    public static synchronized android.media.AudioManager getAudioManager(android.content.Context context) {
        try {
            android.content.Context applicationContext2 = context.getApplicationContext();
            if (applicationContext != applicationContext2) {
                audioManager = null;
            }
            android.media.AudioManager audioManager2 = audioManager;
            if (audioManager2 != null) {
                return audioManager2;
            }
            android.os.Looper looperMyLooper = android.os.Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != android.os.Looper.getMainLooper()) {
                androidx.media3.common.util.ConditionVariable conditionVariable = new androidx.media3.common.util.ConditionVariable();
                androidx.media3.common.util.BackgroundExecutor.get().execute(new T7.d(applicationContext2, conditionVariable, 3));
                conditionVariable.blockUninterruptible();
                android.media.AudioManager audioManager3 = audioManager;
                audioManager3.getClass();
                return audioManager3;
            }
            android.media.AudioManager audioManager4 = (android.media.AudioManager) applicationContext2.getSystemService("audio");
            audioManager = audioManager4;
            audioManager4.getClass();
            return audioManager4;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public static int getStreamMaxVolume(android.media.AudioManager audioManager2, int i3) {
        return audioManager2.getStreamMaxVolume(i3);
    }

    public static int getStreamMinVolume(android.media.AudioManager audioManager2, int i3) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return audioManager2.getStreamMinVolume(i3);
        }
        return 0;
    }

    public static int getStreamVolume(android.media.AudioManager audioManager2, int i3) {
        try {
            return audioManager2.getStreamVolume(i3);
        } catch (java.lang.RuntimeException e6) {
            androidx.media3.common.util.Log.w(TAG, "Could not retrieve stream volume for stream type " + i3, e6);
            return audioManager2.getStreamMaxVolume(i3);
        }
    }

    public static boolean isStreamMute(android.media.AudioManager audioManager2, int i3) {
        return audioManager2.isStreamMute(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getAudioManager$0(android.content.Context context, androidx.media3.common.util.ConditionVariable conditionVariable) {
        audioManager = (android.media.AudioManager) context.getSystemService("audio");
        conditionVariable.open();
    }

    public static int requestAudioFocus(android.media.AudioManager audioManager2, androidx.media3.common.audio.AudioFocusRequestCompat audioFocusRequestCompat) {
        return android.os.Build.VERSION.SDK_INT >= 26 ? audioManager2.requestAudioFocus(audioFocusRequestCompat.getAudioFocusRequest()) : audioManager2.requestAudioFocus(audioFocusRequestCompat.getOnAudioFocusChangeListener(), audioFocusRequestCompat.getAudioAttributes().getVolumeControlStream(), audioFocusRequestCompat.getFocusGain());
    }
}
