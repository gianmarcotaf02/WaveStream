package com.kiptv.core.repository;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final p005a5.K6 Companion = new p005a5.K6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f20967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.ktor.client.HttpClient f20968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p162s8.d f20969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p132p5.a f20970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f20971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p028c8.d f20972f;
    public final p034d5.c g;

    public b(android.content.Context context, io.ktor.client.HttpClient httpClient, p162s8.d json, p132p5.a appConfig) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(httpClient, "httpClient");
        kotlin.jvm.internal.m.e(json, "json");
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
        this.f20967a = context;
        this.f20968b = httpClient;
        this.f20969c = json;
        this.f20970d = appConfig;
        this.f20971e = new java.util.HashMap();
        this.f20972f = new p028c8.d();
        this.g = new p034d5.c(60, 60000L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object a(com.kiptv.core.repository.b bVar, p005a5.L6 l9, java.lang.String str, p117n6.c cVar) {
        p005a5.M6 m8;
        if (cVar instanceof p005a5.M6) {
            m8 = (p005a5.M6) cVar;
            int i3 = m8.f13673m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m8.f13673m = i3 - Integer.MIN_VALUE;
            } else {
                m8 = new p005a5.M6(bVar, cVar);
            }
        } else {
            m8 = new p005a5.M6(bVar, cVar);
        }
        java.lang.Object objC = m8.f13671k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = m8.f13673m;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objC);
            java.lang.String strI = Y6.f.i("/", l9.f13626h, "/", str, "/ratings");
            java.util.Map mapJ0 = p078i6.D.J0(new p070h6.k("extended", androidx.media3.extractor.text.ttml.TtmlNode.COMBINE_ALL));
            m8.f13669h = bVar;
            m8.f13670i = l9;
            m8.j = str;
            m8.f13673m = 1;
            objC = bVar.c(strI, mapJ0, m8);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = m8.j;
            l9 = m8.f13670i;
            bVar = m8.f13669h;
            com.google.common.util.concurrent.P.u0(objC);
        }
        java.lang.String str2 = (java.lang.String) objC;
        if (str2 == null) {
            return null;
        }
        try {
            return (com.kiptv.core.model.TraktExternalRatings) bVar.f20969c.b(str2, com.kiptv.core.model.TraktExternalRatings.INSTANCE.serializer());
        } catch (java.lang.Exception e6) {
            java.lang.String str3 = l9.f13626h;
            java.lang.String message = e6.getMessage();
            java.lang.StringBuilder sbO = Y6.f.o("ratings decode failed for ", str3, "/", str, ": ");
            sbO.append(message);
            android.util.Log.w("TraktRatings", sbO.toString());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object b(com.kiptv.core.repository.b bVar, p005a5.L6 l9, java.lang.String str, java.lang.Integer num, p117n6.c cVar) {
        p005a5.Q6 q9;
        kotlinx.serialization.json.b bVar2;
        kotlinx.serialization.json.c cVarI;
        java.lang.String strD;
        if (cVar instanceof p005a5.Q6) {
            q9 = (p005a5.Q6) cVar;
            int i3 = q9.f13830k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q9.f13830k = i3 - Integer.MIN_VALUE;
            } else {
                q9 = new p005a5.Q6(bVar, cVar);
            }
        } else {
            q9 = new p005a5.Q6(bVar, cVar);
        }
        java.lang.Object objC = q9.f13829i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = q9.f13830k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objC);
            if (str != null && !O7.q.N0(str)) {
                return str;
            }
            if (num != null && num.intValue() > 0) {
                java.util.Map mapJ0 = p078i6.D.J0(new p070h6.k("type", l9.f13627i));
                q9.f13828h = bVar;
                q9.f13830k = 1;
                objC = bVar.c("/search/tmdb/" + num, mapJ0, q9);
                if (objC == aVar) {
                    return aVar;
                }
            }
            return null;
        }
        if (i9 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bVar = q9.f13828h;
        com.google.common.util.concurrent.P.u0(objC);
        java.lang.String str2 = (java.lang.String) objC;
        if (str2 != null) {
            try {
                kotlinx.serialization.json.b bVarE = bVar.f20969c.e(str2);
                kotlinx.serialization.json.a aVar2 = bVarE instanceof kotlinx.serialization.json.a ? (kotlinx.serialization.json.a) bVarE : null;
                if (aVar2 != null && (bVar2 = (kotlinx.serialization.json.b) p078i6.o.j1(aVar2)) != null) {
                    kotlinx.serialization.json.c cVarI2 = p162s8.l.i(bVar2);
                    kotlinx.serialization.json.b bVar3 = (kotlinx.serialization.json.b) cVarI2.get("movie");
                    if (bVar3 != null) {
                        cVarI = p162s8.l.i(bVar3);
                    } else {
                        kotlinx.serialization.json.b bVar4 = (kotlinx.serialization.json.b) cVarI2.get("show");
                        if (bVar4 != null) {
                            cVarI = p162s8.l.i(bVar4);
                        }
                    }
                    kotlinx.serialization.json.b bVar5 = (kotlinx.serialization.json.b) cVarI.get("ids");
                    if (bVar5 != null) {
                        kotlinx.serialization.json.c cVarI3 = p162s8.l.i(bVar5);
                        kotlinx.serialization.json.b bVar6 = (kotlinx.serialization.json.b) cVarI3.get("imdb");
                        if (bVar6 != null && (strD = p162s8.l.j(bVar6).d()) != null) {
                            if (O7.q.N0(strD) || strD.equals("null")) {
                                strD = null;
                            }
                            if (strD != null) {
                                return strD;
                            }
                        }
                        kotlinx.serialization.json.b bVar7 = (kotlinx.serialization.json.b) cVarI3.get("trakt");
                        if (bVar7 != null) {
                            return p162s8.l.j(bVar7).d();
                        }
                    }
                }
            } catch (java.lang.Exception e6) {
                B2.a.v("search decode failed: ", e6.getMessage(), "TraktRatings");
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00fc A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:13:0x0034, B:42:0x0127, B:20:0x0048, B:35:0x00ee, B:37:0x00fc, B:39:0x011c, B:30:0x00a6, B:32:0x00aa), top: B:46:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:39:0x011c A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:13:0x0034, B:42:0x0127, B:20:0x0048, B:35:0x00ee, B:37:0x00fc, B:39:0x011c, B:30:0x00a6, B:32:0x00aa), top: B:46:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0124, code lost:
    
        if (r2 == r5) goto L41;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x00fc, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(java.lang.String str, java.util.Map map, p117n6.c cVar) {
        p005a5.N6 n9;
        java.lang.String string;
        com.kiptv.core.repository.b bVar;
        io.ktor.client.statement.HttpResponse httpResponse;
        java.lang.String str2 = str;
        if (cVar instanceof p005a5.N6) {
            n9 = (p005a5.N6) cVar;
            int i3 = n9.f13704m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                n9.f13704m = i3 - Integer.MIN_VALUE;
            } else {
                n9 = new p005a5.N6(this, cVar);
            }
        } else {
            n9 = new p005a5.N6(this, cVar);
        }
        java.lang.Object objExecute = n9.f13702k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = n9.f13704m;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objExecute);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("https://api.trakt.tv");
                sb.append(str2);
                if (!map.isEmpty()) {
                    sb.append('?');
                    sb.append(p078i6.o.o1(map.entrySet(), "&", null, null, new p005a5.J6(0), 30));
                }
                string = sb.toString();
                n9.f13700h = this;
                n9.f13701i = str2;
                n9.j = string;
                n9.f13704m = 1;
                if (this.g.a(n9) != aVar) {
                    bVar = this;
                }
                return aVar;
            }
            if (i9 == 1) {
                java.lang.String str3 = n9.j;
                java.lang.String str4 = n9.f13701i;
                bVar = (com.kiptv.core.repository.b) n9.f13700h;
                com.google.common.util.concurrent.P.u0(objExecute);
                string = str3;
                str2 = str4;
            } else if (i9 == 2) {
                str2 = (java.lang.String) n9.f13700h;
                com.google.common.util.concurrent.P.u0(objExecute);
                httpResponse = (io.ktor.client.statement.HttpResponse) objExecute;
                if (httpResponse.getStatus().getValue() != 200) {
                    android.util.Log.w("TraktRatings", "HTTP " + httpResponse.getStatus().getValue() + " for " + str2);
                    return null;
                }
                n9.f13700h = null;
                n9.f13704m = 3;
                objExecute = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, n9, 1, null);
            } else {
                if (i9 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(objExecute);
            }
            return (java.lang.String) objExecute;
            io.ktor.client.HttpClient httpClient = bVar.f20968b;
            p132p5.a aVar2 = bVar.f20970d;
            io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
            io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, string);
            httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
            io.ktor.client.request.UtilsKt.header(httpRequestBuilder, "Content-Type", "application/json");
            io.ktor.client.request.UtilsKt.header(httpRequestBuilder, "trakt-api-version", "2");
            aVar2.getClass();
            io.ktor.client.request.UtilsKt.header(httpRequestBuilder, "trakt-api-key", "AStyUJy7MpiGCCRlcKySyBRnwJhyb8nWBrEnqebMnVc");
            io.ktor.client.request.UtilsKt.header(httpRequestBuilder, "User-Agent", "KIPTV/3.0 (Android TV)");
            io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
            n9.f13700h = str2;
            n9.f13701i = null;
            n9.j = null;
            n9.f13704m = 2;
            objExecute = httpStatement.execute(n9);
            if (objExecute != aVar) {
                httpResponse = (io.ktor.client.statement.HttpResponse) objExecute;
                if (httpResponse.getStatus().getValue() != 200) {
                    android.util.Log.w("TraktRatings", "HTTP " + httpResponse.getStatus().getValue() + " for " + str2);
                    return null;
                }
                n9.f13700h = null;
                n9.f13704m = 3;
                objExecute = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, n9, 1, null);
            }
            return aVar;
        } catch (java.lang.Exception e6) {
            B2.a.v("network: ", e6.getMessage(), "TraktRatings");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final java.lang.Object d(p005a5.L6 l9, java.lang.String str, java.lang.Integer num, p117n6.c cVar) throws java.lang.Throwable {
        p005a5.O6 o8;
        java.lang.String strP;
        java.lang.String str2;
        p028c8.d dVar;
        p005a5.L6 l10;
        com.kiptv.core.repository.b bVar;
        java.lang.String str3;
        java.lang.Integer num2;
        long j;
        java.lang.String str4;
        if (cVar instanceof p005a5.O6) {
            o8 = (p005a5.O6) cVar;
            int i3 = o8.f13747q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o8.f13747q = i3 - Integer.MIN_VALUE;
            } else {
                o8 = new p005a5.O6(this, cVar);
            }
        } else {
            o8 = new p005a5.O6(this, cVar);
        }
        java.lang.Object obj = o8.f13745o;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = o8.f13747q;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                this.f20970d.getClass();
                if (!O7.q.N0("AStyUJy7MpiGCCRlcKySyBRnwJhyb8nWBrEnqebMnVc")) {
                    if (str != null && !O7.q.N0(str)) {
                        strP = p121o0.p.p(l9.f13626h, "_", str);
                    } else if (num != null && num.intValue() > 0) {
                        strP = l9.f13626h + "_tmdb_" + num;
                    }
                    str2 = strP;
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    o8.f13739h = this;
                    o8.f13740i = l9;
                    o8.j = str;
                    o8.f13741k = num;
                    o8.f13742l = str2;
                    dVar = this.f20972f;
                    o8.f13743m = dVar;
                    o8.f13744n = jCurrentTimeMillis;
                    o8.f13747q = 1;
                    if (dVar.e(o8) != aVar) {
                        l10 = l9;
                        bVar = this;
                        str3 = str;
                        num2 = num;
                        j = jCurrentTimeMillis;
                    }
                }
                return null;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
                return obj;
            }
            long j9 = o8.f13744n;
            p028c8.d dVar2 = o8.f13743m;
            str2 = o8.f13742l;
            java.lang.Integer num3 = o8.f13741k;
            java.lang.String str5 = o8.j;
            p005a5.L6 l11 = o8.f13740i;
            com.kiptv.core.repository.b bVar2 = o8.f13739h;
            com.google.common.util.concurrent.P.u0(obj);
            dVar = dVar2;
            j = j9;
            num2 = num3;
            str3 = str5;
            l10 = l11;
            bVar = bVar2;
            p070h6.k kVar = (p070h6.k) bVar.f20971e.get(str4);
            dVar.g(null);
            if (kVar != null) {
                com.kiptv.core.model.TraktExternalRatings traktExternalRatings = (com.kiptv.core.model.TraktExternalRatings) kVar.f22539h;
                if (j - ((java.lang.Number) kVar.f22540i).longValue() < 86400000) {
                    return traktExternalRatings;
                }
            }
            Z7.e eVar = S7.M.f9549a;
            Z7.d dVar3 = Z7.d.f13044i;
            p005a5.P6 p9 = new p005a5.P6(bVar, str4, l10, str3, num2, j, null);
            o8.f13739h = null;
            o8.f13740i = null;
            o8.j = null;
            o8.f13741k = null;
            o8.f13742l = null;
            o8.f13743m = null;
            o8.f13747q = 2;
            java.lang.Object objK = S7.C.K(dVar3, p9, o8);
            return objK == aVar ? aVar : objK;
        } catch (java.lang.Throwable th) {
            dVar.g(null);
            throw th;
        }
        str4 = str2;
    }
}
