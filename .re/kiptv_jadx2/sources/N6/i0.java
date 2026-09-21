package N6;

import android.view.View;

public abstract class i0 {

    public final int f7398h = 1;

    public boolean f7399i;
    public Object j;

    public i0() {
    }

    public Integer a(i0 visibility) {
        kotlin.jvm.internal.m.e(visibility, "visibility");
        p086j6.e eVar = h0.f7397a;
        if (this == visibility) {
            return 0;
        }
        p086j6.e eVar2 = h0.f7397a;
        Integer num = (Integer) eVar2.get(this);
        Integer num2 = (Integer) eVar2.get(visibility);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public abstract void b();

    public abstract View c();

    public String d() {
        return (String) this.j;
    }

    public abstract p095l.l e();

    public abstract p088k.g f();

    public abstract CharSequence g();

    public abstract CharSequence h();

    public abstract void i();

    public abstract boolean j();

    public abstract void l(View view);

    public abstract void n(int i3);

    public abstract void o(CharSequence charSequence);

    public abstract void p(int i3);

    public abstract void q(CharSequence charSequence);

    public abstract void r(boolean z6);

    public String toString() {
        switch (this.f7398h) {
            case 0:
                return d();
            default:
                return super.toString();
        }
    }

    public i0(String str, boolean z6) {
        this.j = str;
        this.f7399i = z6;
    }

    public i0 k() {
        return this;
    }
}
