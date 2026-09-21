package B7;

/* JADX INFO: loaded from: classes4.dex */
public class j implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f834i;
    public final java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f835k;

    public /* synthetic */ j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i3) {
        this.f833h = i3;
        this.f834i = obj;
        this.j = obj2;
        this.f835k = obj3;
    }

    public static /* synthetic */ void a(int i3) {
        java.lang.String str = (i3 == 3 || i3 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i3 == 3 || i3 == 4) ? 2 : 3];
        if (i3 == 1) {
            objArr[0] = "map";
        } else if (i3 == 2) {
            objArr[0] = "compute";
        } else if (i3 == 3 || i3 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i3 == 3) {
            objArr[1] = "recursionDetected";
        } else if (i3 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i3 != 3 && i3 != 4) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 3 && i3 != 4) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public java.lang.AssertionError c(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.AssertionError assertionError = new java.lang.AssertionError("Inconsistent key detected. " + B7.k.f837i + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + ((B7.m) this.f834i));
        B7.m.e(assertionError);
        return assertionError;
    }

    public java.lang.AssertionError d(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.AssertionError assertionError = new java.lang.AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + ((B7.m) this.f834i));
        B7.m.e(assertionError);
        return assertionError;
    }

    public java.lang.AssertionError f(java.lang.Object obj, java.lang.Throwable th) {
        java.lang.AssertionError assertionError = new java.lang.AssertionError("Unable to remove " + obj + " under " + ((B7.m) this.f834i), th);
        B7.m.e(assertionError);
        return assertionError;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x029d  */
    /* JADX WARN: Code duplicated, block: B:103:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:104:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:107:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:109:0x02b9 A[Catch: all -> 0x02be, TRY_ENTER, TryCatch #4 {all -> 0x02be, blocks: (B:101:0x029f, B:105:0x02ae, B:109:0x02b9, B:110:0x02bd), top: B:148:0x029f, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x029f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0283 A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:76:0x0260, B:79:0x026b, B:81:0x0271, B:83:0x0275, B:86:0x027d, B:87:0x0280, B:89:0x0283, B:91:0x0289, B:93:0x028d, B:94:0x0290, B:95:0x0293, B:97:0x0296, B:112:0x02bf, B:116:0x02cb, B:117:0x02cf, B:120:0x02d2, B:121:0x02d4, B:127:0x02df, B:129:0x02ea, B:130:0x02ee, B:131:0x02ef, B:132:0x02f2, B:134:0x02f6, B:135:0x02f9, B:137:0x02fb, B:138:0x02ff, B:123:0x02d6, B:124:0x02da, B:114:0x02c5, B:133:0x02f3, B:101:0x029f, B:105:0x02ae, B:109:0x02b9, B:110:0x02bd), top: B:141:0x0260, inners: #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0289 A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:76:0x0260, B:79:0x026b, B:81:0x0271, B:83:0x0275, B:86:0x027d, B:87:0x0280, B:89:0x0283, B:91:0x0289, B:93:0x028d, B:94:0x0290, B:95:0x0293, B:97:0x0296, B:112:0x02bf, B:116:0x02cb, B:117:0x02cf, B:120:0x02d2, B:121:0x02d4, B:127:0x02df, B:129:0x02ea, B:130:0x02ee, B:131:0x02ef, B:132:0x02f2, B:134:0x02f6, B:135:0x02f9, B:137:0x02fb, B:138:0x02ff, B:123:0x02d6, B:124:0x02da, B:114:0x02c5, B:133:0x02f3, B:101:0x029f, B:105:0x02ae, B:109:0x02b9, B:110:0x02bd), top: B:141:0x0260, inners: #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x028d A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:76:0x0260, B:79:0x026b, B:81:0x0271, B:83:0x0275, B:86:0x027d, B:87:0x0280, B:89:0x0283, B:91:0x0289, B:93:0x028d, B:94:0x0290, B:95:0x0293, B:97:0x0296, B:112:0x02bf, B:116:0x02cb, B:117:0x02cf, B:120:0x02d2, B:121:0x02d4, B:127:0x02df, B:129:0x02ea, B:130:0x02ee, B:131:0x02ef, B:132:0x02f2, B:134:0x02f6, B:135:0x02f9, B:137:0x02fb, B:138:0x02ff, B:123:0x02d6, B:124:0x02da, B:114:0x02c5, B:133:0x02f3, B:101:0x029f, B:105:0x02ae, B:109:0x02b9, B:110:0x02bd), top: B:141:0x0260, inners: #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0290 A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:76:0x0260, B:79:0x026b, B:81:0x0271, B:83:0x0275, B:86:0x027d, B:87:0x0280, B:89:0x0283, B:91:0x0289, B:93:0x028d, B:94:0x0290, B:95:0x0293, B:97:0x0296, B:112:0x02bf, B:116:0x02cb, B:117:0x02cf, B:120:0x02d2, B:121:0x02d4, B:127:0x02df, B:129:0x02ea, B:130:0x02ee, B:131:0x02ef, B:132:0x02f2, B:134:0x02f6, B:135:0x02f9, B:137:0x02fb, B:138:0x02ff, B:123:0x02d6, B:124:0x02da, B:114:0x02c5, B:133:0x02f3, B:101:0x029f, B:105:0x02ae, B:109:0x02b9, B:110:0x02bd), top: B:141:0x0260, inners: #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0294 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0296 A[Catch: all -> 0x02d0, TRY_LEAVE, TryCatch #0 {all -> 0x02d0, blocks: (B:76:0x0260, B:79:0x026b, B:81:0x0271, B:83:0x0275, B:86:0x027d, B:87:0x0280, B:89:0x0283, B:91:0x0289, B:93:0x028d, B:94:0x0290, B:95:0x0293, B:97:0x0296, B:112:0x02bf, B:116:0x02cb, B:117:0x02cf, B:120:0x02d2, B:121:0x02d4, B:127:0x02df, B:129:0x02ea, B:130:0x02ee, B:131:0x02ef, B:132:0x02f2, B:134:0x02f6, B:135:0x02f9, B:137:0x02fb, B:138:0x02ff, B:123:0x02d6, B:124:0x02da, B:114:0x02c5, B:133:0x02f3, B:101:0x029f, B:105:0x02ae, B:109:0x02b9, B:110:0x02bd), top: B:141:0x0260, inners: #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x029b  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v34 java.lang.Object, still in use, count: 2, list:
          (r1v34 java.lang.Object) from 0x00d7: PHI (r1 I:??) = (r1v30 java.lang.Object), (r1v34 java.lang.Object) binds: [B:23:0x00d6, B:151:0x00d7] A[DONT_GENERATE, DONT_INLINE]
          (r1v34 java.lang.Object) from 0x00cb: CHECK_CAST (com.kiptv.core.model.HomeSectionConfig) (r1v34 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // p194x6.j
    public java.lang.Object invoke(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B7.j.invoke(java.lang.Object):java.lang.Object");
    }

    public j(B7.m mVar, java.util.concurrent.ConcurrentHashMap concurrentHashMap, p194x6.j jVar) {
        this.f833h = 0;
        if (mVar == null) {
            a(0);
            throw null;
        }
        this.f834i = mVar;
        this.j = concurrentHashMap;
        this.f835k = jVar;
    }
}
