package Y4;

/* JADX INFO: renamed from: Y4.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1118u1 {
    public static final Y4.W0 Companion = new Y4.W0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.ktor.client.HttpClient f12106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p162s8.d f12107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p132p5.a f12108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p034d5.c f12109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p034d5.c f12110e;

    public C1118u1(io.ktor.client.HttpClient httpClient, p162s8.d json, p132p5.a appConfig) {
        kotlin.jvm.internal.m.e(httpClient, "httpClient");
        kotlin.jvm.internal.m.e(json, "json");
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
        this.f12106a = httpClient;
        this.f12107b = json;
        this.f12108c = appConfig;
        this.f12109d = new p034d5.c(150, 60000L);
        this.f12110e = new p034d5.c(1, 1050L);
    }

    public static /* synthetic */ java.lang.Object l(Y4.C1118u1 c1118u1, java.lang.String str, java.lang.String str2, io.ktor.http.HttpMethod httpMethod, kotlinx.serialization.json.c cVar, java.lang.String str3, boolean z6, java.util.Map map, java.util.Set set, p117n6.c cVar2, int i3) {
        return c1118u1.k(str, str2, httpMethod, cVar, str3, z6, (i3 & 64) != 0 ? p078i6.x.f23206h : map, (i3 & 128) != 0 ? p078i6.y.f23207h : set, cVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(kotlinx.serialization.json.c cVar, java.lang.String str, p117n6.c cVar2) {
        Y4.Z0 z6;
        Y4.C1118u1 c1118u1;
        if (cVar2 instanceof Y4.Z0) {
            z6 = (Y4.Z0) cVar2;
            int i3 = z6.f11798k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z6.f11798k = i3 - Integer.MIN_VALUE;
            } else {
                z6 = new Y4.Z0(this, cVar2);
            }
        } else {
            z6 = new Y4.Z0(this, cVar2);
        }
        java.lang.Object objO = z6.f11797i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = z6.f11798k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objO);
            z6.f11796h = this;
            z6.f11798k = 1;
            objO = o("/sync/ratings", cVar, str, z6);
            if (objO == aVar) {
                return aVar;
            }
            c1118u1 = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1118u1 = z6.f11796h;
            com.google.common.util.concurrent.P.u0(objO);
        }
        return c1118u1.e((Y4.Y0) objO, com.kiptv.core.model.TraktSyncResult.INSTANCE.serializer());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(kotlinx.serialization.json.c cVar, java.lang.String str, p117n6.c cVar2) {
        Y4.C1053a1 c1053a1;
        Y4.C1118u1 c1118u1;
        if (cVar2 instanceof Y4.C1053a1) {
            c1053a1 = (Y4.C1053a1) cVar2;
            int i3 = c1053a1.f11807k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1053a1.f11807k = i3 - Integer.MIN_VALUE;
            } else {
                c1053a1 = new Y4.C1053a1(this, cVar2);
            }
        } else {
            c1053a1 = new Y4.C1053a1(this, cVar2);
        }
        java.lang.Object objO = c1053a1.f11806i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1053a1.f11807k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objO);
            c1053a1.f11805h = this;
            c1053a1.f11807k = 1;
            objO = o("/sync/history", cVar, str, c1053a1);
            if (objO == aVar) {
                return aVar;
            }
            c1118u1 = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1118u1 = c1053a1.f11805h;
            com.google.common.util.concurrent.P.u0(objO);
        }
        return c1118u1.e((Y4.Y0) objO, com.kiptv.core.model.TraktSyncResult.INSTANCE.serializer());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(kotlinx.serialization.json.c cVar, java.lang.String str, p117n6.c cVar2) {
        Y4.C1057b1 c1057b1;
        Y4.C1118u1 c1118u1;
        if (cVar2 instanceof Y4.C1057b1) {
            c1057b1 = (Y4.C1057b1) cVar2;
            int i3 = c1057b1.f11822k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1057b1.f11822k = i3 - Integer.MIN_VALUE;
            } else {
                c1057b1 = new Y4.C1057b1(this, cVar2);
            }
        } else {
            c1057b1 = new Y4.C1057b1(this, cVar2);
        }
        java.lang.Object objO = c1057b1.f11821i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1057b1.f11822k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objO);
            c1057b1.f11820h = this;
            c1057b1.f11822k = 1;
            objO = o("/sync/watchlist", cVar, str, c1057b1);
            if (objO == aVar) {
                return aVar;
            }
            c1118u1 = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1118u1 = c1057b1.f11820h;
            com.google.common.util.concurrent.P.u0(objO);
        }
        return c1118u1.e((Y4.Y0) objO, com.kiptv.core.model.TraktSyncResult.INSTANCE.serializer());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(java.lang.String str, p117n6.c cVar) {
        Y4.C1061c1 c1061c1;
        Y4.C1118u1 c1118u1;
        if (cVar instanceof Y4.C1061c1) {
            c1061c1 = (Y4.C1061c1) cVar;
            int i3 = c1061c1.f11837k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1061c1.f11837k = i3 - Integer.MIN_VALUE;
            } else {
                c1061c1 = new Y4.C1061c1(this, cVar);
            }
        } else {
            c1061c1 = new Y4.C1061c1(this, cVar);
        }
        java.lang.Object objF = c1061c1.f11836i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1061c1.f11837k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objF);
            java.util.Map mapJ0 = p078i6.D.J0(new p070h6.k("limit", "100"));
            c1061c1.f11835h = this;
            c1061c1.f11837k = 1;
            objF = f("/users/me/lists/collaborations", mapJ0, str, c1061c1);
            if (objF == aVar) {
                return aVar;
            }
            c1118u1 = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1118u1 = c1061c1.f11835h;
            com.google.common.util.concurrent.P.u0(objF);
        }
        return c1118u1.e((Y4.Y0) objF, com.google.android.gms.internal.play_billing.V0.a(com.kiptv.core.model.TraktListSummary.INSTANCE.serializer()));
    }

    public final java.lang.Object e(Y4.Y0 y9, kotlinx.serialization.KSerializer kSerializer) throws Y4.C1133z1 {
        try {
            return this.f12107b.b(y9.f11783b, kSerializer);
        } catch (java.lang.Exception e6) {
            android.util.Log.w("TraktApi", "decode failed: " + e6.getMessage());
            throw new Y4.C1133z1(p121o0.p.C("decoding: ", e6.getMessage()));
        }
    }

    public final java.lang.Object f(java.lang.String str, java.util.Map map, java.lang.String str2, p117n6.c cVar) {
        return l(this, "https://api.trakt.tv", str, io.ktor.http.HttpMethod.INSTANCE.getGet(), null, str2, false, map, null, cVar, 128);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final java.lang.Object g(java.lang.String str, java.util.Map map, java.lang.String str2, p153r8.C2691d c2691d, p100l6.c cVar) throws Y4.C1133z1 {
        Y4.C1065d1 c1065d1;
        kotlinx.serialization.KSerializer kSerializer;
        Y4.C1118u1 c1118u1;
        java.lang.Integer numZ0;
        java.lang.Integer numZ1;
        java.lang.Integer numZ2;
        if (cVar instanceof Y4.C1065d1) {
            c1065d1 = (Y4.C1065d1) cVar;
            int i3 = c1065d1.f11849l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1065d1.f11849l = i3 - Integer.MIN_VALUE;
            } else {
                c1065d1 = new Y4.C1065d1(this, cVar);
            }
        } else {
            c1065d1 = new Y4.C1065d1(this, cVar);
        }
        Y4.C1065d1 c1065d2 = c1065d1;
        java.lang.Object obj = c1065d2.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1065d2.f11849l;
        int iIntValue = 1;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            io.ktor.http.HttpMethod get = io.ktor.http.HttpMethod.INSTANCE.getGet();
            c1065d2.f11846h = this;
            c1065d2.f11847i = c2691d;
            c1065d2.f11849l = 1;
            java.lang.Object objL = l(this, "https://api.trakt.tv", str, get, null, str2, false, map, null, c1065d2, 128);
            if (objL == aVar) {
                return aVar;
            }
            obj = objL;
            kSerializer = c2691d;
            c1118u1 = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kSerializer = c1065d2.f11847i;
            c1118u1 = c1065d2.f11846h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        Y4.Y0 y9 = (Y4.Y0) obj;
        java.lang.Object objE = c1118u1.e(y9, kSerializer);
        java.lang.String strA = y9.a("X-Pagination-Page");
        int iIntValue2 = (strA == null || (numZ2 = O7.x.z0(strA)) == null) ? 1 : numZ2.intValue();
        java.lang.String strA2 = y9.a("X-Pagination-Page-Count");
        if (strA2 != null && (numZ1 = O7.x.z0(strA2)) != null) {
            iIntValue = numZ1.intValue();
        }
        java.lang.String strA3 = y9.a("X-Pagination-Item-Count");
        return new Y4.X0(iIntValue2, iIntValue, (strA3 == null || (numZ0 = O7.x.z0(strA3)) == null) ? 0 : numZ0.intValue(), objE);
    }

    public final boolean h() {
        p132p5.a aVar = this.f12108c;
        aVar.getClass();
        if (O7.q.N0("AStyUJy7MpiGCCRlcKySyBRnwJhyb8nWBrEnqebMnVc")) {
            return false;
        }
        aVar.getClass();
        return !O7.q.N0("VD_ugVNWEz3rDbOXyYqYnVpPtSuYVfXz3jkM4zSfNTs");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(java.lang.String str, p117n6.c cVar) {
        Y4.C1069e1 c1069e1;
        Y4.C1118u1 c1118u1;
        if (cVar instanceof Y4.C1069e1) {
            c1069e1 = (Y4.C1069e1) cVar;
            int i3 = c1069e1.f11867k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1069e1.f11867k = i3 - Integer.MIN_VALUE;
            } else {
                c1069e1 = new Y4.C1069e1(this, cVar);
            }
        } else {
            c1069e1 = new Y4.C1069e1(this, cVar);
        }
        java.lang.Object objF = c1069e1.f11866i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1069e1.f11867k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objF);
            c1069e1.f11865h = this;
            c1069e1.f11867k = 1;
            objF = f("/sync/last_activities", p078i6.x.f23206h, str, c1069e1);
            if (objF == aVar) {
                return aVar;
            }
            c1118u1 = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1118u1 = c1069e1.f11865h;
            com.google.common.util.concurrent.P.u0(objF);
        }
        return c1118u1.e((Y4.Y0) objF, com.kiptv.core.model.TraktLastActivities.INSTANCE.serializer());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(java.lang.String str, java.lang.String str2, java.lang.String str3, p117n6.c cVar) {
        Y4.C1073f1 c1073f1;
        Y4.C1118u1 c1118u1;
        if (cVar instanceof Y4.C1073f1) {
            c1073f1 = (Y4.C1073f1) cVar;
            int i3 = c1073f1.f11883k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1073f1.f11883k = i3 - Integer.MIN_VALUE;
            } else {
                c1073f1 = new Y4.C1073f1(this, cVar);
            }
        } else {
            c1073f1 = new Y4.C1073f1(this, cVar);
        }
        java.lang.Object objF = c1073f1.f11882i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1073f1.f11883k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objF);
            java.lang.String strM = str != null ? B2.a.m("/users/", str, "/lists/", str2) : p121o0.p.C("/lists/", str2);
            c1073f1.f11881h = this;
            c1073f1.f11883k = 1;
            objF = f(strM, p078i6.x.f23206h, str3, c1073f1);
            if (objF == aVar) {
                return aVar;
            }
            c1118u1 = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1118u1 = c1073f1.f11881h;
            com.google.common.util.concurrent.P.u0(objF);
        }
        return c1118u1.e((Y4.Y0) objF, com.kiptv.core.model.TraktListSummary.INSTANCE.serializer());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:110:0x034d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0351  */
    /* JADX WARN: Code duplicated, block: B:118:0x0364  */
    /* JADX WARN: Code duplicated, block: B:120:0x0367  */
    /* JADX WARN: Code duplicated, block: B:122:0x036a  */
    /* JADX WARN: Code duplicated, block: B:124:0x036d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0370  */
    /* JADX WARN: Code duplicated, block: B:128:0x0373  */
    /* JADX WARN: Code duplicated, block: B:140:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x017c A[Catch: Exception -> 0x009b, IOException -> 0x009e, TryCatch #2 {IOException -> 0x009e, Exception -> 0x009b, blocks: (B:42:0x0134, B:44:0x0138, B:46:0x017c, B:48:0x0194, B:49:0x01bb, B:53:0x01e7, B:20:0x0094), top: B:136:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0194 A[Catch: Exception -> 0x009b, IOException -> 0x009e, TryCatch #2 {IOException -> 0x009e, Exception -> 0x009b, blocks: (B:42:0x0134, B:44:0x0138, B:46:0x017c, B:48:0x0194, B:49:0x01bb, B:53:0x01e7, B:20:0x0094), top: B:136:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x01df  */
    /* JADX WARN: Code duplicated, block: B:52:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:56:0x0209  */
    /* JADX WARN: Code duplicated, block: B:60:0x0219  */
    /* JADX WARN: Code duplicated, block: B:62:0x0244  */
    /* JADX WARN: Code duplicated, block: B:67:0x0279  */
    /* JADX WARN: Code duplicated, block: B:70:0x0290  */
    /* JADX WARN: Code duplicated, block: B:73:0x0295  */
    /* JADX WARN: Code duplicated, block: B:78:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:82:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:84:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:86:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:88:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:90:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:92:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:95:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:97:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:98:0x02dc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x0337 -> B:15:0x0052). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:128:0x0373
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object k(java.lang.String r20, java.lang.String r21, io.ktor.http.HttpMethod r22, kotlinx.serialization.json.c r23, java.lang.String r24, boolean r25, java.util.Map r26, java.util.Set r27, p117n6.c r28) {
        /*
            Method dump skipped, instruction units count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.C1118u1.k(java.lang.String, java.lang.String, io.ktor.http.HttpMethod, kotlinx.serialization.json.c, java.lang.String, boolean, java.util.Map, java.util.Set, n6.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object m(java.lang.String str, p117n6.c cVar) {
        Y4.C1080h1 c1080h1;
        Y4.C1118u1 c1118u1;
        if (cVar instanceof Y4.C1080h1) {
            c1080h1 = (Y4.C1080h1) cVar;
            int i3 = c1080h1.f11926k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1080h1.f11926k = i3 - Integer.MIN_VALUE;
            } else {
                c1080h1 = new Y4.C1080h1(this, cVar);
            }
        } else {
            c1080h1 = new Y4.C1080h1(this, cVar);
        }
        java.lang.Object objF = c1080h1.f11925i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1080h1.f11926k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objF);
            java.util.Map mapJ0 = p078i6.D.J0(new p070h6.k("limit", "100"));
            c1080h1.f11924h = this;
            c1080h1.f11926k = 1;
            objF = f("/users/me/lists", mapJ0, str, c1080h1);
            if (objF == aVar) {
                return aVar;
            }
            c1118u1 = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1118u1 = c1080h1.f11924h;
            com.google.common.util.concurrent.P.u0(objF);
        }
        return c1118u1.e((Y4.Y0) objF, com.google.android.gms.internal.play_billing.V0.a(com.kiptv.core.model.TraktListSummary.INSTANCE.serializer()));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final java.lang.Object n(java.lang.String str, p117n6.c cVar) {
        Y4.C1083i1 c1083i1;
        int i3;
        int i9;
        Y4.C1118u1 c1118u1;
        java.lang.String string;
        if (cVar instanceof Y4.C1083i1) {
            c1083i1 = (Y4.C1083i1) cVar;
            int i10 = c1083i1.f11943k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1083i1.f11943k = i10 - Integer.MIN_VALUE;
            } else {
                c1083i1 = new Y4.C1083i1(this, cVar);
            }
        } else {
            c1083i1 = new Y4.C1083i1(this, cVar);
        }
        Y4.C1083i1 c1083i2 = c1083i1;
        java.lang.Object objL = c1083i2.f11942i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = c1083i2.f11943k;
        if (i11 == 0) {
            com.google.common.util.concurrent.P.u0(objL);
            p162s8.v vVar = new p162s8.v();
            com.google.common.util.concurrent.P.m0("code", str, vVar);
            this.f12108c.getClass();
            com.google.common.util.concurrent.P.m0("client_id", "AStyUJy7MpiGCCRlcKySyBRnwJhyb8nWBrEnqebMnVc", vVar);
            com.google.common.util.concurrent.P.m0("client_secret", "VD_ugVNWEz3rDbOXyYqYnVpPtSuYVfXz3jkM4zSfNTs", vVar);
            kotlinx.serialization.json.c cVarA = vVar.a();
            io.ktor.http.HttpMethod post = io.ktor.http.HttpMethod.INSTANCE.getPost();
            java.util.Set setF0 = p078i6.m.F0(new java.lang.Integer[]{new java.lang.Integer(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.BAD_REQUEST), new java.lang.Integer(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.NOT_FOUND), new java.lang.Integer(409), new java.lang.Integer(410), new java.lang.Integer(418), new java.lang.Integer(429)});
            c1083i2.f11941h = this;
            c1083i2.f11943k = 1;
            i3 = com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.NOT_FOUND;
            i9 = com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.BAD_REQUEST;
            objL = l(this, "https://auth.trakt.tv", "/oauth/device/token", post, cVarA, null, true, null, setF0, c1083i2, 64);
            if (objL == aVar) {
                return aVar;
            }
            c1118u1 = this;
        } else {
            if (i11 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Y4.C1118u1 c1118u2 = c1083i2.f11941h;
            com.google.common.util.concurrent.P.u0(objL);
            c1118u1 = c1118u2;
            i3 = 404;
            i9 = 400;
        }
        Y4.Y0 y9 = (Y4.Y0) objL;
        int i12 = y9.f11782a;
        if (200 <= i12 && i12 < 300) {
            return (com.kiptv.core.model.TraktToken) c1118u1.e(y9, com.kiptv.core.model.TraktToken.INSTANCE.serializer());
        }
        if (i12 == i9) {
            throw Y4.I1.f11627h;
        }
        if (i12 == i3) {
            throw Y4.H1.f11616h;
        }
        if (i12 == 409) {
            throw Y4.C1130y1.f12162h;
        }
        if (i12 == 410) {
            throw Y4.B1.f11544h;
        }
        if (i12 == 418) {
            throw Y4.A1.f11538h;
        }
        if (i12 != 429) {
            throw Y4.D1.f11574h;
        }
        java.lang.String strA = y9.a("Retry-After");
        java.lang.Integer numZ0 = (strA == null || (string = O7.q.r1(strA).toString()) == null) ? null : O7.x.z0(string);
        throw new Y4.J1(numZ0 != null ? numZ0.intValue() : 5);
    }

    public final java.lang.Object o(java.lang.String str, kotlinx.serialization.json.c cVar, java.lang.String str2, p117n6.c cVar2) {
        return l(this, "https://api.trakt.tv", str, io.ktor.http.HttpMethod.INSTANCE.getPost(), cVar, str2, true, null, null, cVar2, androidx.media3.extractor.ts.PsExtractor.AUDIO_STREAM);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final java.lang.Object p(java.lang.String str, p117n6.c cVar) {
        Y4.C1086j1 c1086j1;
        Y4.C1118u1 c1118u1;
        if (cVar instanceof Y4.C1086j1) {
            c1086j1 = (Y4.C1086j1) cVar;
            int i3 = c1086j1.f11950k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1086j1.f11950k = i3 - Integer.MIN_VALUE;
            } else {
                c1086j1 = new Y4.C1086j1(this, cVar);
            }
        } else {
            c1086j1 = new Y4.C1086j1(this, cVar);
        }
        Y4.C1086j1 c1086j2 = c1086j1;
        java.lang.Object objL = c1086j2.f11949i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1086j2.f11950k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objL);
            p162s8.v vVar = new p162s8.v();
            com.google.common.util.concurrent.P.m0("refresh_token", str, vVar);
            this.f12108c.getClass();
            com.google.common.util.concurrent.P.m0("client_id", "AStyUJy7MpiGCCRlcKySyBRnwJhyb8nWBrEnqebMnVc", vVar);
            com.google.common.util.concurrent.P.m0("client_secret", "VD_ugVNWEz3rDbOXyYqYnVpPtSuYVfXz3jkM4zSfNTs", vVar);
            com.google.common.util.concurrent.P.m0("redirect_uri", "urn:ietf:wg:oauth:2.0:oob", vVar);
            com.google.common.util.concurrent.P.m0("grant_type", "refresh_token", vVar);
            kotlinx.serialization.json.c cVarA = vVar.a();
            io.ktor.http.HttpMethod post = io.ktor.http.HttpMethod.INSTANCE.getPost();
            java.util.Set setF0 = p078i6.m.F0(new java.lang.Integer[]{new java.lang.Integer(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.BAD_REQUEST), new java.lang.Integer(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.UNAUTHORIZED)});
            c1086j2.f11948h = this;
            c1086j2.f11950k = 1;
            objL = l(this, "https://auth.trakt.tv", "/oauth/token", post, cVarA, null, true, null, setF0, c1086j2, 64);
            if (objL == aVar) {
                return aVar;
            }
            c1118u1 = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1118u1 = c1086j2.f11948h;
            com.google.common.util.concurrent.P.u0(objL);
        }
        Y4.Y0 y9 = (Y4.Y0) objL;
        int i10 = y9.f11782a;
        if (200 > i10 || i10 >= 300) {
            throw Y4.L1.f11659h;
        }
        return (com.kiptv.core.model.TraktToken) c1118u1.e(y9, com.kiptv.core.model.TraktToken.INSTANCE.serializer());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object q(kotlinx.serialization.json.c cVar, java.lang.String str, p117n6.c cVar2) {
        Y4.C1089k1 c1089k1;
        Y4.C1118u1 c1118u1;
        if (cVar2 instanceof Y4.C1089k1) {
            c1089k1 = (Y4.C1089k1) cVar2;
            int i3 = c1089k1.f11964k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1089k1.f11964k = i3 - Integer.MIN_VALUE;
            } else {
                c1089k1 = new Y4.C1089k1(this, cVar2);
            }
        } else {
            c1089k1 = new Y4.C1089k1(this, cVar2);
        }
        java.lang.Object objO = c1089k1.f11963i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1089k1.f11964k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objO);
            c1089k1.f11962h = this;
            c1089k1.f11964k = 1;
            objO = o("/sync/history/remove", cVar, str, c1089k1);
            if (objO == aVar) {
                return aVar;
            }
            c1118u1 = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1118u1 = c1089k1.f11962h;
            com.google.common.util.concurrent.P.u0(objO);
        }
        return c1118u1.e((Y4.Y0) objO, com.kiptv.core.model.TraktSyncResult.INSTANCE.serializer());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object r(kotlinx.serialization.json.c cVar, java.lang.String str, p117n6.c cVar2) {
        Y4.C1092l1 c1092l1;
        Y4.C1118u1 c1118u1;
        if (cVar2 instanceof Y4.C1092l1) {
            c1092l1 = (Y4.C1092l1) cVar2;
            int i3 = c1092l1.f11983k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1092l1.f11983k = i3 - Integer.MIN_VALUE;
            } else {
                c1092l1 = new Y4.C1092l1(this, cVar2);
            }
        } else {
            c1092l1 = new Y4.C1092l1(this, cVar2);
        }
        java.lang.Object objO = c1092l1.f11982i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1092l1.f11983k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objO);
            c1092l1.f11981h = this;
            c1092l1.f11983k = 1;
            objO = o("/sync/watchlist/remove", cVar, str, c1092l1);
            if (objO == aVar) {
                return aVar;
            }
            c1118u1 = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1118u1 = c1092l1.f11981h;
            com.google.common.util.concurrent.P.u0(objO);
        }
        return c1118u1.e((Y4.Y0) objO, com.kiptv.core.model.TraktSyncResult.INSTANCE.serializer());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final java.lang.Object s(p117n6.c cVar) {
        Y4.C1095m1 c1095m1;
        Y4.C1118u1 c1118u1;
        if (cVar instanceof Y4.C1095m1) {
            c1095m1 = (Y4.C1095m1) cVar;
            int i3 = c1095m1.f11994k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1095m1.f11994k = i3 - Integer.MIN_VALUE;
            } else {
                c1095m1 = new Y4.C1095m1(this, cVar);
            }
        } else {
            c1095m1 = new Y4.C1095m1(this, cVar);
        }
        Y4.C1095m1 c1095m2 = c1095m1;
        java.lang.Object objL = c1095m2.f11993i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1095m2.f11994k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objL);
            p162s8.v vVar = new p162s8.v();
            this.f12108c.getClass();
            com.google.common.util.concurrent.P.m0("client_id", "AStyUJy7MpiGCCRlcKySyBRnwJhyb8nWBrEnqebMnVc", vVar);
            kotlinx.serialization.json.c cVarA = vVar.a();
            io.ktor.http.HttpMethod post = io.ktor.http.HttpMethod.INSTANCE.getPost();
            c1095m2.f11992h = this;
            c1095m2.f11994k = 1;
            objL = l(this, "https://auth.trakt.tv", "/oauth/device/code", post, cVarA, null, true, null, null, c1095m2, androidx.media3.extractor.ts.PsExtractor.AUDIO_STREAM);
            if (objL == aVar) {
                return aVar;
            }
            c1118u1 = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1118u1 = c1095m2.f11992h;
            com.google.common.util.concurrent.P.u0(objL);
        }
        return c1118u1.e((Y4.Y0) objL, com.kiptv.core.model.TraktDeviceCode.INSTANCE.serializer());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final java.lang.Object t(java.lang.String str, p117n6.c cVar) {
        Y4.C1098n1 c1098n1;
        if (cVar instanceof Y4.C1098n1) {
            c1098n1 = (Y4.C1098n1) cVar;
            int i3 = c1098n1.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1098n1.j = i3 - Integer.MIN_VALUE;
            } else {
                c1098n1 = new Y4.C1098n1(this, cVar);
            }
        } else {
            c1098n1 = new Y4.C1098n1(this, cVar);
        }
        Y4.C1098n1 c1098n2 = c1098n1;
        java.lang.Object objL = c1098n2.f12004h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1098n2.j;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objL);
                p162s8.v vVar = new p162s8.v();
                com.google.common.util.concurrent.P.m0("token", str, vVar);
                this.f12108c.getClass();
                com.google.common.util.concurrent.P.m0("client_id", "AStyUJy7MpiGCCRlcKySyBRnwJhyb8nWBrEnqebMnVc", vVar);
                com.google.common.util.concurrent.P.m0("client_secret", "VD_ugVNWEz3rDbOXyYqYnVpPtSuYVfXz3jkM4zSfNTs", vVar);
                kotlinx.serialization.json.c cVarA = vVar.a();
                io.ktor.http.HttpMethod post = io.ktor.http.HttpMethod.INSTANCE.getPost();
                c1098n2.j = 1;
                objL = l(this, "https://auth.trakt.tv", "/oauth/revoke", post, cVarA, null, true, null, null, c1098n2, androidx.media3.extractor.ts.PsExtractor.AUDIO_STREAM);
                if (objL == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(objL);
            }
        } catch (java.lang.Throwable th) {
            com.google.common.util.concurrent.P.T(th);
        }
        return p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object u(java.lang.String str, kotlinx.serialization.json.c cVar, java.lang.String str2, p117n6.c cVar2) {
        Y4.C1101o1 c1101o1;
        Y4.C1118u1 c1118u1;
        if (cVar2 instanceof Y4.C1101o1) {
            c1101o1 = (Y4.C1101o1) cVar2;
            int i3 = c1101o1.f12021k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1101o1.f12021k = i3 - Integer.MIN_VALUE;
            } else {
                c1101o1 = new Y4.C1101o1(this, cVar2);
            }
        } else {
            c1101o1 = new Y4.C1101o1(this, cVar2);
        }
        java.lang.Object objO = c1101o1.f12020i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1101o1.f12021k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objO);
            c1101o1.f12019h = this;
            c1101o1.f12021k = 1;
            objO = o("/scrobble/" + str, cVar, str2, c1101o1);
            if (objO == aVar) {
                return aVar;
            }
            c1118u1 = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1118u1 = c1101o1.f12019h;
            com.google.common.util.concurrent.P.u0(objO);
        }
        return c1118u1.e((Y4.Y0) objO, com.kiptv.core.model.TraktScrobbleResponse.INSTANCE.serializer());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object v(int i3, java.lang.String str, java.lang.String str2, p117n6.c cVar) throws java.io.UnsupportedEncodingException {
        Y4.C1104p1 c1104p1;
        Y4.C1118u1 c1118u1;
        if (cVar instanceof Y4.C1104p1) {
            c1104p1 = (Y4.C1104p1) cVar;
            int i9 = c1104p1.f12036k;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1104p1.f12036k = i9 - Integer.MIN_VALUE;
            } else {
                c1104p1 = new Y4.C1104p1(this, cVar);
            }
        } else {
            c1104p1 = new Y4.C1104p1(this, cVar);
        }
        java.lang.Object objF = c1104p1.f12035i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = c1104p1.f12036k;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(objF);
            java.lang.String strEncode = java.net.URLEncoder.encode(str, "UTF-8");
            kotlin.jvm.internal.m.d(strEncode, "encode(...)");
            java.util.Map mapN0 = p078i6.C.N0(new p070h6.k("query", O7.x.w0(strEncode, "+", "%20")), new p070h6.k("limit", java.lang.String.valueOf(i3)));
            c1104p1.f12034h = this;
            c1104p1.f12036k = 1;
            objF = f("/search/list", mapN0, str2, c1104p1);
            if (objF == aVar) {
                return aVar;
            }
            c1118u1 = this;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1118u1 = c1104p1.f12034h;
            com.google.common.util.concurrent.P.u0(objF);
        }
        return c1118u1.e((Y4.Y0) objF, com.google.android.gms.internal.play_billing.V0.a(com.kiptv.core.model.TraktSearchListEntry.INSTANCE.serializer()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object w(java.lang.String str, java.lang.String str2, p117n6.c cVar) {
        Y4.C1107q1 c1107q1;
        Y4.C1118u1 c1118u1;
        if (cVar instanceof Y4.C1107q1) {
            c1107q1 = (Y4.C1107q1) cVar;
            int i3 = c1107q1.f12052k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1107q1.f12052k = i3 - Integer.MIN_VALUE;
            } else {
                c1107q1 = new Y4.C1107q1(this, cVar);
            }
        } else {
            c1107q1 = new Y4.C1107q1(this, cVar);
        }
        java.lang.Object objF = c1107q1.f12051i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1107q1.f12052k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objF);
            java.util.Map mapN0 = p078i6.C.N0(new p070h6.k("hidden", "false"), new p070h6.k("specials", "false"), new p070h6.k("count_specials", "false"));
            c1107q1.f12050h = this;
            c1107q1.f12052k = 1;
            objF = f("/shows/" + str + "/progress/watched", mapN0, str2, c1107q1);
            if (objF == aVar) {
                return aVar;
            }
            c1118u1 = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1118u1 = c1107q1.f12050h;
            com.google.common.util.concurrent.P.u0(objF);
        }
        return c1118u1.e((Y4.Y0) objF, com.kiptv.core.model.TraktShowWatchedProgress.INSTANCE.serializer());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object x(java.lang.String str, p117n6.c cVar) {
        Y4.C1109r1 c1109r1;
        Y4.C1118u1 c1118u1;
        if (cVar instanceof Y4.C1109r1) {
            c1109r1 = (Y4.C1109r1) cVar;
            int i3 = c1109r1.f12065k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1109r1.f12065k = i3 - Integer.MIN_VALUE;
            } else {
                c1109r1 = new Y4.C1109r1(this, cVar);
            }
        } else {
            c1109r1 = new Y4.C1109r1(this, cVar);
        }
        java.lang.Object objF = c1109r1.f12064i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1109r1.f12065k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objF);
            c1109r1.f12063h = this;
            c1109r1.f12065k = 1;
            objF = f("/users/settings", p078i6.x.f23206h, str, c1109r1);
            if (objF == aVar) {
                return aVar;
            }
            c1118u1 = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1118u1 = c1109r1.f12063h;
            com.google.common.util.concurrent.P.u0(objF);
        }
        return c1118u1.e((Y4.Y0) objF, com.kiptv.core.model.TraktUserSettings.INSTANCE.serializer());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object y(java.lang.String str, p117n6.c cVar) {
        Y4.C1112s1 c1112s1;
        Y4.C1118u1 c1118u1;
        if (cVar instanceof Y4.C1112s1) {
            c1112s1 = (Y4.C1112s1) cVar;
            int i3 = c1112s1.f12077k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1112s1.f12077k = i3 - Integer.MIN_VALUE;
            } else {
                c1112s1 = new Y4.C1112s1(this, cVar);
            }
        } else {
            c1112s1 = new Y4.C1112s1(this, cVar);
        }
        java.lang.Object objF = c1112s1.f12076i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1112s1.f12077k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objF);
            c1112s1.f12075h = this;
            c1112s1.f12077k = 1;
            objF = f("/sync/watched/movies", p078i6.x.f23206h, str, c1112s1);
            if (objF == aVar) {
                return aVar;
            }
            c1118u1 = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1118u1 = c1112s1.f12075h;
            com.google.common.util.concurrent.P.u0(objF);
        }
        return c1118u1.e((Y4.Y0) objF, com.google.android.gms.internal.play_billing.V0.a(com.kiptv.core.model.TraktWatchedMovie.INSTANCE.serializer()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object z(java.lang.String str, p117n6.c cVar) {
        Y4.C1115t1 c1115t1;
        Y4.C1118u1 c1118u1;
        if (cVar instanceof Y4.C1115t1) {
            c1115t1 = (Y4.C1115t1) cVar;
            int i3 = c1115t1.f12091k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1115t1.f12091k = i3 - Integer.MIN_VALUE;
            } else {
                c1115t1 = new Y4.C1115t1(this, cVar);
            }
        } else {
            c1115t1 = new Y4.C1115t1(this, cVar);
        }
        java.lang.Object objF = c1115t1.f12090i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1115t1.f12091k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objF);
            c1115t1.f12089h = this;
            c1115t1.f12091k = 1;
            objF = f("/sync/watched/shows", p078i6.x.f23206h, str, c1115t1);
            if (objF == aVar) {
                return aVar;
            }
            c1118u1 = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1118u1 = c1115t1.f12089h;
            com.google.common.util.concurrent.P.u0(objF);
        }
        return c1118u1.e((Y4.Y0) objF, com.google.android.gms.internal.play_billing.V0.a(com.kiptv.core.model.TraktWatchedShow.INSTANCE.serializer()));
    }
}
