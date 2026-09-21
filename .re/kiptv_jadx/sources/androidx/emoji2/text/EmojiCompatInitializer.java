package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements p190x2.b {
    @Override // p190x2.b
    public final java.lang.Object create(android.content.Context context) {
        java.lang.Object objB;
        T1.s sVar = new T1.s(new D3.j(context, 2));
        sVar.f9682a = 1;
        if (T1.j.f9685k == null) {
            synchronized (T1.j.j) {
                try {
                    if (T1.j.f9685k == null) {
                        T1.j.f9685k = new T1.j(sVar);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        p190x2.a aVarC = p190x2.a.c(context);
        aVarC.getClass();
        synchronized (p190x2.a.f31146e) {
            try {
                objB = aVarC.f31147a.get(androidx.lifecycle.ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(androidx.lifecycle.ProcessLifecycleInitializer.class, new java.util.HashSet());
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
        androidx.lifecycle.AbstractC1534p lifecycle = ((androidx.lifecycle.InterfaceC1540w) objB).getLifecycle();
        lifecycle.a(new T1.k(this, lifecycle));
        return java.lang.Boolean.TRUE;
    }

    @Override // p190x2.b
    public final java.util.List dependencies() {
        return java.util.Collections.singletonList(androidx.lifecycle.ProcessLifecycleInitializer.class);
    }
}
