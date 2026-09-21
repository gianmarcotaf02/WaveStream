package p095l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.kiptv.tv.R;

public class v {

    public final Context f24698a;

    public final l f24699b;

    public final boolean f24700c;

    public final int f24701d;

    public View f24702e;
    public boolean g;

    public w f24704h;

    public t f24705i;
    public u j;

    public int f24703f = 8388611;

    public final u f24706k = new u(this);

    public v(int i3, Context context, View view, l lVar, boolean z6) {
        this.f24698a = context;
        this.f24699b = lVar;
        this.f24702e = view;
        this.f24700c = z6;
        this.f24701d = i3;
    }

    public final t a() {
        t c9;
        if (this.f24705i == null) {
            Context context = this.f24698a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                c9 = new f(context, this.f24702e, this.f24701d, this.f24700c);
            } else {
                View view = this.f24702e;
                Context context2 = this.f24698a;
                boolean z6 = this.f24700c;
                c9 = new C(this.f24701d, context2, view, this.f24699b, z6);
            }
            c9.l(this.f24699b);
            c9.r(this.f24706k);
            c9.n(this.f24702e);
            c9.g(this.f24704h);
            c9.o(this.g);
            c9.p(this.f24703f);
            this.f24705i = c9;
        }
        return this.f24705i;
    }

    public final boolean b() {
        t tVar = this.f24705i;
        return tVar != null && tVar.a();
    }

    public void c() {
        this.f24705i = null;
        u uVar = this.j;
        if (uVar != null) {
            uVar.onDismiss();
        }
    }

    public final void d(int i3, int i9, boolean z6, boolean z9) {
        t tVarA = a();
        tVarA.s(z9);
        if (z6) {
            if ((Gravity.getAbsoluteGravity(this.f24703f, this.f24702e.getLayoutDirection()) & 7) == 5) {
                i3 -= this.f24702e.getWidth();
            }
            tVarA.q(i3);
            tVarA.t(i9);
            int i10 = (int) ((this.f24698a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            tVarA.f24696h = new Rect(i3 - i10, i9 - i10, i3 + i10, i9 + i10);
        }
        tVarA.e();
    }
}
