package U4;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final U4.b Companion = new U4.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f10138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p162s8.d f10139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p070h6.p f10140c;

    public g(android.content.Context context, p162s8.d json) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(json, "json");
        this.f10138a = context;
        this.f10139b = json;
        this.f10140c = com.google.common.util.concurrent.D.B(new D5.C0261o(26, this));
    }

    public final java.lang.Long a(java.lang.String playlistId) {
        kotlin.jvm.internal.m.e(playlistId, "playlistId");
        java.io.File file = new java.io.File(c(playlistId), "cache_metadata.json");
        if (!file.exists()) {
            return null;
        }
        try {
            p162s8.d dVar = this.f10139b;
            java.lang.String strR = p160s6.k.R(file);
            dVar.getClass();
            return java.lang.Long.valueOf(((com.kiptv.core.local.cache.CacheMetadata) dVar.b(strR, com.kiptv.core.local.cache.CacheMetadata.INSTANCE.serializer())).f19595a);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0089 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(java.lang.String str, p117n6.c cVar) throws java.lang.Throwable {
        U4.c cVar2;
        U4.g gVar;
        U4.a aVar;
        T4.g gVar2;
        if (cVar instanceof U4.c) {
            cVar2 = (U4.c) cVar;
            int i3 = cVar2.f10128l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar2.f10128l = i3 - Integer.MIN_VALUE;
            } else {
                cVar2 = new U4.c(this, cVar);
            }
        } else {
            cVar2 = new U4.c(this, cVar);
        }
        java.lang.Object objB = cVar2.j;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = cVar2.f10128l;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objB);
            T4.g gVar3 = (T4.g) this.f10140c.getValue();
            cVar2.f10125h = this;
            cVar2.f10126i = str;
            cVar2.f10128l = 1;
            objB = gVar3.b(str, cVar2);
            if (objB != aVar2) {
                gVar = this;
            }
            return aVar2;
        }
        if (i9 == 1) {
            str = cVar2.f10126i;
            gVar = (U4.g) cVar2.f10125h;
            com.google.common.util.concurrent.P.u0(objB);
        } else {
            if (i9 != 2) {
                if (i9 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                U4.a aVar3 = (U4.a) cVar2.f10125h;
                com.google.common.util.concurrent.P.u0(objB);
                return aVar3;
            }
            str = cVar2.f10126i;
            gVar = (U4.g) cVar2.f10125h;
            com.google.common.util.concurrent.P.u0(objB);
        }
        aVar = (U4.a) objB;
        if (aVar == null) {
            return null;
        }
        gVar2 = (T4.g) gVar.f10140c.getValue();
        cVar2.f10125h = aVar;
        cVar2.f10126i = null;
        cVar2.f10128l = 3;
        if (gVar2.c(str, aVar, cVar2) != aVar2) {
            return aVar2;
        }
        return aVar;
        U4.a aVar4 = (U4.a) objB;
        if (aVar4 != null) {
            return aVar4;
        }
        cVar2.f10125h = gVar;
        cVar2.f10126i = str;
        cVar2.f10128l = 2;
        gVar.getClass();
        Z7.e eVar = S7.M.f9549a;
        objB = S7.C.K(Z7.d.f13044i, new U4.d(gVar, str, null), cVar2);
        if (objB != aVar2) {
            aVar = (U4.a) objB;
            if (aVar == null) {
                return null;
            }
            gVar2 = (T4.g) gVar.f10140c.getValue();
            cVar2.f10125h = aVar;
            cVar2.f10126i = null;
            cVar2.f10128l = 3;
            if (gVar2.c(str, aVar, cVar2) != aVar2) {
                return aVar;
            }
        }
        return aVar2;
    }

    public final java.io.File c(java.lang.String str) {
        return new java.io.File(new java.io.File(this.f10138a.getCacheDir(), "XtreamCache"), str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (S7.C.K(Z7.d.f13044i, new U4.f(r2, r6, r7, null), r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object d(java.lang.String str, U4.a aVar, p117n6.c cVar) {
        U4.e eVar;
        U4.g gVar;
        if (cVar instanceof U4.e) {
            eVar = (U4.e) cVar;
            int i3 = eVar.f10135m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eVar.f10135m = i3 - Integer.MIN_VALUE;
            } else {
                eVar = new U4.e(this, cVar);
            }
        } else {
            eVar = new U4.e(this, cVar);
        }
        java.lang.Object obj = eVar.f10133k;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = eVar.f10135m;
        if (i9 != 0) {
            if (i9 == 1) {
                aVar = eVar.j;
                str = eVar.f10132i;
                gVar = eVar.f10131h;
                com.google.common.util.concurrent.P.u0(obj);
            } else {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
            return p070h6.A.f22523a;
        }
        com.google.common.util.concurrent.P.u0(obj);
        T4.g gVar2 = (T4.g) this.f10140c.getValue();
        eVar.f10131h = this;
        eVar.f10132i = str;
        eVar.j = aVar;
        eVar.f10135m = 1;
        if (gVar2.c(str, aVar, eVar) != aVar2) {
            gVar = this;
        }
        return aVar2;
        eVar.f10131h = null;
        eVar.f10132i = null;
        eVar.j = null;
        eVar.f10135m = 2;
        gVar.getClass();
        Z7.e eVar2 = S7.M.f9549a;
    }
}
