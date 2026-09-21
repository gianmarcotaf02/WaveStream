package B7;

/* JADX INFO: loaded from: classes4.dex */
public class h implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final B7.m f831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kotlin.jvm.functions.Function0 f832i;
    public volatile java.lang.Object j;

    public h(B7.m mVar, kotlin.jvm.functions.Function0 function0) {
        if (mVar == null) {
            a(0);
            throw null;
        }
        this.j = B7.k.f836h;
        this.f831h = mVar;
        this.f832i = function0;
    }

    public static /* synthetic */ void a(int i3) {
        java.lang.String str = (i3 == 2 || i3 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i3 == 2 || i3 == 3) ? 2 : 3];
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
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 2 && i3 != 3) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public B7.l d(boolean z6) {
        B7.l lVarD = this.f831h.d(null, "in a lazy value");
        if (lVarD != null) {
            return lVarD;
        }
        a(2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x003a A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:16:0x002a, B:18:0x0035, B:20:0x003a, B:22:0x0043, B:23:0x0046, B:27:0x0055, B:29:0x005b, B:31:0x005f, B:32:0x0066, B:33:0x006d, B:34:0x006e, B:35:0x0074, B:24:0x0048), top: B:38:0x0011, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0043 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:16:0x002a, B:18:0x0035, B:20:0x003a, B:22:0x0043, B:23:0x0046, B:27:0x0055, B:29:0x005b, B:31:0x005f, B:32:0x0066, B:33:0x006d, B:34:0x006e, B:35:0x0074, B:24:0x0048), top: B:38:0x0011, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:16:0x002a, B:18:0x0035, B:20:0x003a, B:22:0x0043, B:23:0x0046, B:27:0x0055, B:29:0x005b, B:31:0x005f, B:32:0x0066, B:33:0x006d, B:34:0x006e, B:35:0x0074, B:24:0x0048), top: B:38:0x0011, inners: #1 }] */
    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() throws java.lang.Throwable {
        B7.l lVarD;
        java.lang.Object obj = this.j;
        if (!(obj instanceof B7.k)) {
            L7.k.j(obj);
            return obj;
        }
        this.f831h.f843a.lock();
        try {
            java.lang.Object objInvoke = this.j;
            if (objInvoke instanceof B7.k) {
                B7.k kVar = B7.k.f837i;
                B7.k kVar2 = B7.k.j;
                if (objInvoke == kVar) {
                    this.j = kVar2;
                    B7.l lVarD2 = d(true);
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
                            } catch (java.lang.Throwable th) {
                                if (L7.k.h(th)) {
                                    this.j = B7.k.f836h;
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
        } catch (java.lang.Throwable th2) {
            this.f831h.f843a.unlock();
            throw th2;
        }
    }

    public void c(java.lang.Object obj) {
    }
}
