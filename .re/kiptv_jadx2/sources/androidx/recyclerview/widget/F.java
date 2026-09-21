package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;

public abstract class F {

    public C1642y f17186a;

    public ArrayList f17187b;

    public long f17188c;

    public long f17189d;

    public long f17190e;

    public long f17191f;

    public static void b(X x9) {
        int i3 = x9.mFlags;
        if (!x9.isInvalid() && (i3 & 4) == 0) {
            x9.getOldPosition();
            x9.getAbsoluteAdapterPosition();
        }
    }

    public abstract boolean a(X x9, X x10, D1.r rVar, D1.r rVar2);

    public final void c(X x9) {
        C1642y c1642y = this.f17186a;
        if (c1642y != null) {
            boolean z6 = true;
            x9.setIsRecyclable(true);
            if (x9.mShadowedHolder != null && x9.mShadowingHolder == null) {
                x9.mShadowedHolder = null;
            }
            x9.mShadowingHolder = null;
            if (x9.shouldBeKeptAsChild()) {
                return;
            }
            View view = x9.itemView;
            RecyclerView recyclerView = c1642y.f17522a;
            recyclerView.b0();
            android.support.v4.media.session.q qVar = recyclerView.f17298m;
            C1642y c1642y2 = (C1642y) qVar.f15617i;
            int iIndexOfChild = c1642y2.f17522a.indexOfChild(view);
            if (iIndexOfChild == -1) {
                qVar.Q(view);
            } else {
                C8.a aVar = (C8.a) qVar.j;
                if (aVar.e(iIndexOfChild)) {
                    aVar.i(iIndexOfChild);
                    qVar.Q(view);
                    c1642y2.h(iIndexOfChild);
                } else {
                    z6 = false;
                }
            }
            if (z6) {
                X xG = RecyclerView.G(view);
                O o8 = recyclerView.j;
                o8.l(xG);
                o8.i(xG);
            }
            recyclerView.c0(!z6);
            if (z6 || !x9.isTmpDetached()) {
                return;
            }
            recyclerView.removeDetachedView(x9.itemView, false);
        }
    }

    public abstract void d(X x9);

    public abstract void e();

    public abstract boolean f();
}
