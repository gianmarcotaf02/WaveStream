package androidx.media3.session;

import android.os.Bundle;

public final class C1582h0 implements p068h4.j {

    public final int f17038a;

    public final MediaControllerStub f17039b;

    public C1582h0(MediaControllerStub mediaControllerStub, int i3) {
        this.f17038a = i3;
        this.f17039b = mediaControllerStub;
    }

    @Override
    public final Object apply(Object obj) {
        switch (this.f17038a) {
            case 0:
                return this.f17039b.lambda$onSetMediaButtonPreferences$4((Bundle) obj);
            default:
                return this.f17039b.lambda$onSetCustomLayout$2((Bundle) obj);
        }
    }
}
