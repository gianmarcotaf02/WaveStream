package p019c;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.jvm.internal.m;

public final class r implements OnBackAnimationCallback {

    public final o f18081a;

    public final o f18082b;

    public final p f18083c;

    public final p f18084d;

    public r(o oVar, o oVar2, p pVar, p pVar2) {
        this.f18081a = oVar;
        this.f18082b = oVar2;
        this.f18083c = pVar;
        this.f18084d = pVar2;
    }

    public final void onBackCancelled() {
        this.f18084d.invoke();
    }

    public final void onBackInvoked() {
        this.f18083c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        m.e(backEvent, "backEvent");
        this.f18082b.invoke(new a(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        m.e(backEvent, "backEvent");
        this.f18081a.invoke(new a(backEvent));
    }
}
