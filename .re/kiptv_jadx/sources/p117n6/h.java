package p117n6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h extends p117n6.g implements kotlin.jvm.internal.InterfaceC2543h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f25834h;

    public h(int i3, p100l6.c cVar) {
        super(cVar);
        this.f25834h = i3;
    }

    @Override // kotlin.jvm.internal.InterfaceC2543h
    public final int getArity() {
        return this.f25834h;
    }

    @Override // p117n6.a
    public final java.lang.String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        java.lang.String strI = kotlin.jvm.internal.B.f24540a.i(this);
        kotlin.jvm.internal.m.d(strI, "renderLambdaToString(...)");
        return strI;
    }
}
