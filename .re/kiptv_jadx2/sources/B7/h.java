package B7;

import kotlin.jvm.functions.Function0;

public class h implements Function0 {

    public final m f831h;

    public final Function0 f832i;
    public volatile Object j;

    public h(m mVar, Function0 function0) {
        if (mVar == null) {
            a(0);
            throw null;
        }
        this.j = k.f836h;
        this.f831h = mVar;
        this.f832i = function0;
    }

    public static void a(int i3) {
        String str = (i3 == 2 || i3 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i3 == 2 || i3 == 3) ? 2 : 3];
        if (i3 == 1) {
            objArr[0] = "computable";
        } else if (i3 == 2 || i3 == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i3 == 2) {
            objArr[1] = "recursionDetected";
        } else if (i3 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i3 != 2 && i3 != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i3 != 2 && i3 != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public l d(boolean z6) {
        l lVarD = this.f831h.d(null, "in a lazy value");
        if (lVarD != null) {
            return lVarD;
        }
        a(2);
        throw null;
    }

    @Override
    public Object invoke() throws Throwable {
        l lVarD;
        Object obj = this.j;
        if (!(obj instanceof k)) {
            L7.k.j(obj);
            return obj;
        }
        this.f831h.f843a.lock();
        try {
            Object objInvoke = this.j;
            if (objInvoke instanceof k) {
                k kVar = k.f837i;
                k kVar2 = k.j;
                if (objInvoke == kVar) {
                    this.j = kVar2;
                    l lVarD2 = d(true);
                    if (!lVarD2.f840i) {
                        objInvoke = lVarD2.j;
                    } else if (objInvoke == kVar2) {
                        lVarD = d(false);
                        if (lVarD.f840i) {
                            this.j = kVar;
                            try {
                                objInvoke = this.f832i.invoke();
                                c(objInvoke);
                                this.j = objInvoke;
                            } catch (Throwable th) {
                                if (L7.k.h(th)) {
                                    this.j = k.f836h;
                                    throw th;
                                }
                                if (this.j == kVar) {
                                    this.j = new L7.j(th);
                                }
                                this.f831h.f844b.getClass();
                                throw th;
                            }
                        } else {
                            objInvoke = lVarD.j;
                        }
                    } else {
                        this.j = kVar;
                        objInvoke = this.f832i.invoke();
                        c(objInvoke);
                        this.j = objInvoke;
                    }
                } else if (objInvoke == kVar2) {
                    lVarD = d(false);
                    if (lVarD.f840i) {
                        objInvoke = lVarD.j;
                    } else {
                        this.j = kVar;
                        objInvoke = this.f832i.invoke();
                        c(objInvoke);
                        this.j = objInvoke;
                    }
                } else {
                    this.j = kVar;
                    objInvoke = this.f832i.invoke();
                    c(objInvoke);
                    this.j = objInvoke;
                }
            } else {
                L7.k.j(objInvoke);
            }
            this.f831h.f843a.unlock();
            return objInvoke;
        } catch (Throwable th2) {
            this.f831h.f843a.unlock();
            throw th2;
        }
    }

    public void c(Object obj) {
    }
}
