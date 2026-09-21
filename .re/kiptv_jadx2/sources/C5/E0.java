package C5;

import android.view.View;

public final class E0 implements p020c0.H {

    public final View f937a;

    public final boolean f938b;

    public E0(View view, boolean z6) {
        this.f937a = view;
        this.f938b = z6;
    }

    @Override
    public final void dispose() {
        this.f937a.setKeepScreenOn(this.f938b);
    }
}
