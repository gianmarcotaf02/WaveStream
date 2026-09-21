package E2;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReference f2823a = new java.util.concurrent.atomic.AtomicReference(null);

    public static final E2.o a(android.content.Context context) {
        E2.o oVar;
        E2.o oVar2;
        java.util.concurrent.atomic.AtomicReference atomicReference = f2823a;
        java.lang.Object obj = atomicReference.get();
        E2.o oVar3 = obj instanceof E2.o ? (E2.o) obj : null;
        if (oVar3 != null) {
            return oVar3;
        }
        E2.o oVarA = null;
        while (true) {
            java.lang.Object obj2 = atomicReference.get();
            if (obj2 instanceof E2.o) {
                oVar = (E2.o) obj2;
                oVar2 = oVarA;
            } else {
                if (oVarA == null) {
                    E2.y yVar = obj2 instanceof E2.y ? (E2.y) obj2 : null;
                    if (yVar != null) {
                        oVarA = yVar.a(context);
                    } else {
                        java.lang.Object applicationContext = context.getApplicationContext();
                        E2.y yVar2 = applicationContext instanceof E2.y ? (E2.y) applicationContext : null;
                        oVarA = yVar2 != null ? yVar2.a(context) : E2.B.f2759a.a(context);
                    }
                }
                oVar = oVarA;
                oVar2 = oVar;
            }
            do {
                if (atomicReference.compareAndSet(obj2, oVar)) {
                    kotlin.jvm.internal.m.c(oVar, "null cannot be cast to non-null type coil3.ImageLoader");
                    return oVar;
                }
            } while (atomicReference.get() == obj2);
            oVarA = oVar2;
        }
    }
}
