package p117n6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i extends p117n6.c implements kotlin.jvm.internal.InterfaceC2543h {
    private final int arity;

    public i(int i3, p100l6.c cVar) {
        super(cVar);
        this.arity = i3;
    }

    @Override // kotlin.jvm.internal.InterfaceC2543h
    public int getArity() {
        return this.arity;
    }

    @Override // p117n6.a
    public java.lang.String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        java.lang.String strI = kotlin.jvm.internal.B.f24540a.i(this);
        kotlin.jvm.internal.m.d(strI, "renderLambdaToString(...)");
        return strI;
    }
}
