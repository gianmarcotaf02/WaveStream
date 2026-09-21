package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class Z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p005a5.C1451x5 f14160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p132p5.a f14161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f14162c;

    public Z1(p005a5.C1451x5 tmdbRepository, p132p5.a appConfig) {
        kotlin.jvm.internal.m.e(tmdbRepository, "tmdbRepository");
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
        this.f14160a = tmdbRepository;
        this.f14161b = appConfig;
        this.f14162c = new java.util.concurrent.ConcurrentHashMap();
    }

    public static java.lang.String a(java.lang.String str) {
        java.lang.String lowerCase = O7.q.r1(str).toString().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile("\\s+");
        kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
        java.lang.String strReplaceAll = patternCompile.matcher(lowerCase).replaceAll(io.ktor.sse.ServerSentEventKt.SPACE);
        kotlin.jvm.internal.m.d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final java.lang.Object b(java.lang.String str, java.lang.String str2, boolean z6, p117n6.i iVar) {
        return e("m:".concat(a(str)), z6, new p005a5.V1(this, str, str2, z6, null), iVar);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [a5.Z1] */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final java.lang.Object c(int i3, boolean z6, p117n6.c cVar) {
        p005a5.W1 w6;
        java.lang.Object objT;
        ?? r9;
        ?? r10;
        boolean z9;
        java.lang.String str;
        java.lang.String str2;
        p005a5.Z1 z10;
        java.lang.String str3;
        p005a5.Z1 z11;
        if (cVar instanceof p005a5.W1) {
            w6 = (p005a5.W1) cVar;
            int i9 = w6.f14054l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                w6.f14054l = i9 - Integer.MIN_VALUE;
            } else {
                w6 = new p005a5.W1(this, cVar);
            }
        } else {
            w6 = new p005a5.W1(this, cVar);
        }
        java.lang.Object obj = w6.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = w6.f14054l;
        java.lang.String strB = null;
        try {
            if (i10 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                java.lang.String str4 = (z6 != 0 ? "om:" : "os:") + ((int) i3);
                p005a5.U1 u1 = (p005a5.U1) this.f14162c.get(str4);
                if (u1 != null) {
                    return u1.f13960a;
                }
                p005a5.C1451x5 c1451x5 = this.f14160a;
                if (c1451x5.D()) {
                    try {
                        if (z6 != 0) {
                            w6.f14051h = this;
                            w6.f14052i = str4;
                            w6.f14054l = 1;
                            java.lang.Object objP = c1451x5.p(i3, w6);
                            if (objP != aVar) {
                                obj = objP;
                                str3 = str4;
                                z11 = this;
                                objT = ((com.kiptv.core.model.TMDBMovieDetail) obj).f20200f;
                                r10 = str3;
                                r9 = z11;
                                z9 = objT instanceof p070h6.m;
                                if (!z9) {
                                    if (z9) {
                                        objT = null;
                                    }
                                    str = (java.lang.String) objT;
                                    if (str != null) {
                                        Y4.A a2 = Y4.Q0.Companion;
                                        r9.f14161b.getClass();
                                        a2.getClass();
                                        strB = Y4.A.b(str, "w500", "https://image.tmdb.org/t/p");
                                    }
                                    r9.f14162c.put(r10, new p005a5.U1(strB));
                                    return strB;
                                }
                            }
                        } else {
                            w6.f14051h = this;
                            w6.f14052i = str4;
                            w6.f14054l = 2;
                            java.lang.Object objW = c1451x5.w(i3, w6);
                            if (objW != aVar) {
                                obj = objW;
                                str2 = str4;
                                z10 = this;
                                objT = ((com.kiptv.core.model.TMDBSeriesDetail) obj).f20318e;
                                r10 = str2;
                                r9 = z10;
                                z9 = objT instanceof p070h6.m;
                                if (!z9) {
                                    if (z9) {
                                        objT = null;
                                    }
                                    str = (java.lang.String) objT;
                                    if (str != null) {
                                        Y4.A a9 = Y4.Q0.Companion;
                                        r9.f14161b.getClass();
                                        a9.getClass();
                                        strB = Y4.A.b(str, "w500", "https://image.tmdb.org/t/p");
                                    }
                                    r9.f14162c.put(r10, new p005a5.U1(strB));
                                    return strB;
                                }
                            }
                        }
                        return aVar;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        i3 = str4;
                        z6 = this;
                        objT = com.google.common.util.concurrent.P.T(th);
                        r10 = i3;
                        r9 = z6;
                    }
                }
            } else if (i10 == 1) {
                java.lang.String str5 = w6.f14052i;
                p005a5.Z1 z12 = w6.f14051h;
                com.google.common.util.concurrent.P.u0(obj);
                str3 = str5;
                z11 = z12;
                objT = ((com.kiptv.core.model.TMDBMovieDetail) obj).f20200f;
                r10 = str3;
                r9 = z11;
                z9 = objT instanceof p070h6.m;
                if (!z9) {
                    if (z9) {
                        objT = null;
                    }
                    str = (java.lang.String) objT;
                    if (str != null) {
                        Y4.A a10 = Y4.Q0.Companion;
                        r9.f14161b.getClass();
                        a10.getClass();
                        strB = Y4.A.b(str, "w500", "https://image.tmdb.org/t/p");
                    }
                    r9.f14162c.put(r10, new p005a5.U1(strB));
                    return strB;
                }
            } else {
                if (i10 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.String str6 = w6.f14052i;
                p005a5.Z1 z13 = w6.f14051h;
                com.google.common.util.concurrent.P.u0(obj);
                str2 = str6;
                z10 = z13;
                objT = ((com.kiptv.core.model.TMDBSeriesDetail) obj).f20318e;
                r10 = str2;
                r9 = z10;
                z9 = objT instanceof p070h6.m;
                if (!z9) {
                    if (z9) {
                        objT = null;
                    }
                    str = (java.lang.String) objT;
                    if (str != null) {
                        Y4.A a11 = Y4.Q0.Companion;
                        r9.f14161b.getClass();
                        a11.getClass();
                        strB = Y4.A.b(str, "w500", "https://image.tmdb.org/t/p");
                    }
                    r9.f14162c.put(r10, new p005a5.U1(strB));
                    return strB;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        return null;
    }

    public final java.lang.Object d(java.lang.String str, java.lang.String str2, boolean z6, p117n6.i iVar) {
        return e("s:".concat(a(str)), z6, new p005a5.X1(this, str, str2, z6, null), iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(java.lang.String str, boolean z6, p194x6.j jVar, p117n6.c cVar) {
        p005a5.Y1 y9;
        p005a5.Z1 z9;
        java.lang.Object objT;
        if (cVar instanceof p005a5.Y1) {
            y9 = (p005a5.Y1) cVar;
            int i3 = y9.f14118m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                y9.f14118m = i3 - Integer.MIN_VALUE;
            } else {
                y9 = new p005a5.Y1(this, cVar);
            }
        } else {
            y9 = new p005a5.Y1(this, cVar);
        }
        java.lang.Object objInvoke = y9.f14116k;
        java.lang.Object obj = p109m6.a.f25430h;
        int i9 = y9.f14118m;
        java.lang.String strB = null;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objInvoke);
            p005a5.U1 u1 = (p005a5.U1) this.f14162c.get(str);
            if (u1 != null) {
                return u1.f13960a;
            }
            if (this.f14160a.D()) {
                try {
                    y9.f14114h = this;
                    y9.f14115i = str;
                    y9.j = z6;
                    y9.f14118m = 1;
                    objInvoke = jVar.invoke(y9);
                    if (objInvoke == obj) {
                        return obj;
                    }
                    z9 = this;
                } catch (java.lang.Throwable th) {
                    th = th;
                    z9 = this;
                    objT = com.google.common.util.concurrent.P.T(th);
                }
            }
            return null;
        }
        if (i9 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z6 = y9.j;
        str = y9.f14115i;
        z9 = y9.f14114h;
        try {
            com.google.common.util.concurrent.P.u0(objInvoke);
        } catch (java.lang.Throwable th2) {
            th = th2;
            objT = com.google.common.util.concurrent.P.T(th);
        }
        objT = (java.lang.String) objInvoke;
        boolean z10 = objT instanceof p070h6.m;
        if (!z10) {
            if (z10) {
                objT = null;
            }
            java.lang.String str2 = (java.lang.String) objT;
            if (str2 != null) {
                Y4.A a2 = Y4.Q0.Companion;
                z9.f14161b.getClass();
                a2.getClass();
                strB = Y4.A.b(str2, "w500", "https://image.tmdb.org/t/p");
            }
            if (strB != null || !z6) {
                z9.f14162c.put(str, new p005a5.U1(strB));
            }
            return strB;
        }
        return null;
    }
}
