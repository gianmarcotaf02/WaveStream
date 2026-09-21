package E1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    public final int f2743a;

    public final f f2744b;

    public final int f2745c;

    public a(int i3, f fVar, int i9) {
        this.f2743a = i3;
        this.f2744b = fVar;
        this.f2745c = i9;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2743a);
        this.f2744b.f2755a.performAction(this.f2745c, bundle);
    }
}
