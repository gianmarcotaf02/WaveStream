package androidx.media3.common.audio;

import android.media.AudioManager;

public final class b implements AudioManager.OnAudioFocusChangeListener {

    public final AudioFocusManager f16394a;

    public b(AudioFocusManager audioFocusManager) {
        this.f16394a = audioFocusManager;
    }

    @Override
    public final void onAudioFocusChange(int i3) {
        this.f16394a.handlePlatformAudioFocusChange(i3);
    }
}
