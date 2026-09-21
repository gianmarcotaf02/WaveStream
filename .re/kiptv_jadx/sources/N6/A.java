package N6;

/* JADX INFO: loaded from: classes4.dex */
public final class A implements T1.o, p068h4.t, p080i8.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f7359i;

    @Override // p080i8.f
    public java.lang.String a() {
        return Y6.f.l(new java.lang.StringBuilder("expected '"), this.f7359i, '\'');
    }

    @Override // T1.o
    public boolean c(java.lang.CharSequence charSequence, int i3, int i9, T1.w wVar) {
        if (!android.text.TextUtils.equals(charSequence.subSequence(i3, i9), this.f7359i)) {
            return true;
        }
        wVar.f9723c = (wVar.f9723c & 3) | 4;
        return false;
    }

    @Override // p068h4.t
    public java.util.Iterator l(p068h4.u uVar, java.lang.CharSequence charSequence) {
        return new p068h4.s(this, uVar, charSequence, 1);
    }

    public java.lang.String toString() {
        switch (this.f7358h) {
            case 0:
                return this.f7359i;
            case 1:
            default:
                return super.toString();
            case 2:
                return Y6.f.l(new java.lang.StringBuilder("<"), this.f7359i, '>');
        }
    }

    public /* synthetic */ A(java.lang.String str, int i3) {
        this.f7358h = i3;
        this.f7359i = str;
    }

    public A(java.lang.String expected) {
        this.f7358h = 5;
        kotlin.jvm.internal.m.e(expected, "expected");
        this.f7359i = expected;
    }

    @Override // T1.o
    public java.lang.Object e() {
        return this;
    }
}
