package N6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7398h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7399i;
    public java.lang.Object j;

    public /* synthetic */ i0() {
    }

    public java.lang.Integer a(N6.i0 visibility) {
        kotlin.jvm.internal.m.e(visibility, "visibility");
        p086j6.e eVar = N6.h0.f7397a;
        if (this == visibility) {
            return 0;
        }
        p086j6.e eVar2 = N6.h0.f7397a;
        java.lang.Integer num = (java.lang.Integer) eVar2.get(this);
        java.lang.Integer num2 = (java.lang.Integer) eVar2.get(visibility);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return java.lang.Integer.valueOf(num.intValue() - num2.intValue());
    }

    public abstract void b();

    public abstract android.view.View c();

    public java.lang.String d() {
        return (java.lang.String) this.j;
    }

    public abstract p095l.l e();

    public abstract p088k.g f();

    public abstract java.lang.CharSequence g();

    public abstract java.lang.CharSequence h();

    public abstract void i();

    public abstract boolean j();

    public abstract void l(android.view.View view);

    public abstract void n(int i3);

    public abstract void o(java.lang.CharSequence charSequence);

    public abstract void p(int i3);

    public abstract void q(java.lang.CharSequence charSequence);

    public abstract void r(boolean z6);

    public java.lang.String toString() {
        switch (this.f7398h) {
            case 0:
                return d();
            default:
                return super.toString();
        }
    }

    public i0(java.lang.String str, boolean z6) {
        this.j = str;
        this.f7399i = z6;
    }

    public N6.i0 k() {
        return this;
    }
}
