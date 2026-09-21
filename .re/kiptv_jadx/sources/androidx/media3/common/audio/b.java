package androidx.media3.common.audio;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements android.media.AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.common.audio.AudioFocusManager f16394a;

    public /* synthetic */ b(androidx.media3.common.audio.AudioFocusManager audioFocusManager) {
        this.f16394a = audioFocusManager;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i3) {
        this.f16394a.handlePlatformAudioFocusChange(i3);
    }
}
