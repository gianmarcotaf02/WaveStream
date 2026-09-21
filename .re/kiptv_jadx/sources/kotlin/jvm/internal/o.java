package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o implements kotlin.jvm.internal.InterfaceC2543h, java.io.Serializable {
    private final int arity;

    public o(int i3) {
        this.arity = i3;
    }

    @Override // kotlin.jvm.internal.InterfaceC2543h
    public int getArity() {
        return this.arity;
    }

    public java.lang.String toString() {
        java.lang.String strJ = kotlin.jvm.internal.B.f24540a.j(this);
        kotlin.jvm.internal.m.d(strJ, "renderLambdaToString(...)");
        return strJ;
    }
}
