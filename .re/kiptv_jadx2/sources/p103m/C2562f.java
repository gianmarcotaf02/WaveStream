package p103m;

import android.content.Context;
import android.view.View;
import com.kiptv.tv.R;
import p008a8.c;
import p095l.D;
import p095l.l;
import p095l.t;
import p095l.v;

public final class C2562f extends v {

    public final int f25038l = 0;

    public final C2570j f25039m;

    public C2562f(C2570j c2570j, Context context, l lVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, lVar, true);
        this.f25039m = c2570j;
        this.f24703f = 8388613;
        c cVar = c2570j.f25052D;
        this.f24704h = cVar;
        t tVar = this.f24705i;
        if (tVar != null) {
            tVar.g(cVar);
        }
    }

    @Override
    public final void c() {
        switch (this.f25038l) {
            case 0:
                C2570j c2570j = this.f25039m;
                c2570j.f25049A = null;
                c2570j.getClass();
                super.c();
                break;
            default:
                C2570j c2570j2 = this.f25039m;
                l lVar = c2570j2.j;
                if (lVar != null) {
                    lVar.c(true);
                }
                c2570j2.f25069z = null;
                super.c();
                break;
        }
    }

    public C2562f(C2570j c2570j, Context context, D d4, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, d4, false);
        this.f25039m = c2570j;
        if ((d4.f24577A.f24684x & 32) != 32) {
            View view2 = c2570j.f25060p;
            this.f24702e = view2 == null ? (View) c2570j.f25059o : view2;
        }
        c cVar = c2570j.f25052D;
        this.f24704h = cVar;
        t tVar = this.f24705i;
        if (tVar != null) {
            tVar.g(cVar);
        }
    }
}
