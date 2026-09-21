package androidx.media3.exoplayer;

import androidx.media3.common.util.BackgroundThreadStateHandler;

public final class C1547b implements BackgroundThreadStateHandler.StateChangeListener {

    public final int f16610h;

    public final SuitableOutputChecker.Callback f16611i;

    public C1547b(SuitableOutputChecker.Callback callback, int i3) {
        this.f16610h = i3;
        this.f16611i = callback;
    }

    @Override
    public final void onStateChanged(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f16610h) {
            case 0:
                DefaultSuitableOutputChecker.ImplApi23.lambda$enable$0(this.f16611i, bool, bool2);
                break;
            default:
                DefaultSuitableOutputChecker.ImplApi35.lambda$enable$0(this.f16611i, bool, bool2);
                break;
        }
    }
}
