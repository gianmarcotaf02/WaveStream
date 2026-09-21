package p137q0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.o implements p194x6.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p137q0.i f26469h = new p137q0.i(2);

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        p137q0.n nVar = (p137q0.n) obj2;
        if (str.length() == 0) {
            return nVar.toString();
        }
        return str + ", " + nVar;
    }
}
