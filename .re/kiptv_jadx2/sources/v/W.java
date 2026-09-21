package v;

import android.content.Context;
import android.widget.EdgeEffect;
import com.google.crypto.tink.shaded.protobuf.AbstractC1911f;

public final class W extends EdgeEffect {

    public final float f28904a;

    public float f28905b;

    public W(Context context) {
        super(context);
        this.f28904a = AbstractC1911f.a(context).f25550h * 1;
    }

    @Override
    public final void onAbsorb(int i3) {
        this.f28905b = 0.0f;
        super.onAbsorb(i3);
    }

    @Override
    public final void onPull(float f9, float f10) {
        this.f28905b = 0.0f;
        super.onPull(f9, f10);
    }

    @Override
    public final void onRelease() {
        this.f28905b = 0.0f;
        super.onRelease();
    }

    @Override
    public final void onPull(float f9) {
        this.f28905b = 0.0f;
        super.onPull(f9);
    }
}
