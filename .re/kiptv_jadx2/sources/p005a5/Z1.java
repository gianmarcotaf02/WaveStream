package p005a5;

import O7.q;
import Y4.A;
import Y4.Q0;
import com.google.common.util.concurrent.P;
import com.kiptv.core.model.TMDBMovieDetail;
import com.kiptv.core.model.TMDBSeriesDetail;
import io.ktor.sse.ServerSentEventKt;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import p117n6.c;
import p117n6.i;
import p132p5.a;
import p194x6.j;

public final class Z1 {

    public final C1451x5 f14160a;

    public final a f14161b;

    public final ConcurrentHashMap f14162c;

    public Z1(C1451x5 tmdbRepository, a appConfig) {
        m.e(tmdbRepository, "tmdbRepository");
        m.e(appConfig, "appConfig");
        this.f14160a = tmdbRepository;
        this.f14161b = appConfig;
        this.f14162c = new ConcurrentHashMap();
    }

    public static String a(String str) {
        String lowerCase = q.r1(str).toString().toLowerCase(Locale.ROOT);
        m.d(lowerCase, "toLowerCase(...)");
        Pattern patternCompile = Pattern.compile("\\s+");
        m.d(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(lowerCase).replaceAll(ServerSentEventKt.SPACE);
        m.d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final Object b(String str, String str2, boolean z6, i iVar) {
        return e("m:".concat(a(str)), z6, new V1(this, str, str2, z6, null), iVar);
    }

    public final Object c(int i3, boolean z6, c cVar) {
        W1 w6;
        Object objT;
        ?? r9;
        ?? r10;
        boolean z9;
        String str;
        String str2;
        Z1 z10;
        String str3;
        Z1 z11;
        if (cVar instanceof W1) {
            w6 = (W1) cVar;
            int i9 = w6.f14054l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                w6.f14054l = i9 - Integer.MIN_VALUE;
            } else {
                w6 = new W1(this, cVar);
            }
        } else {
            w6 = new W1(this, cVar);
        }
        Object obj = w6.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = w6.f14054l;
        String strB = null;
        try {
            if (i10 == 0) {
                P.u0(obj);
                String str4 = (z6 != 0 ? "om:" : "os:") + ((int) i3);
                U1 u1 = (U1) this.f14162c.get(str4);
                if (u1 != null) {
                    return u1.f13960a;
                }
                C1451x5 c1451x5 = this.f14160a;
                if (c1451x5.D()) {
                    try {
                        if (z6 != 0) {
                            w6.f14051h = this;
                            w6.f14052i = str4;
                            w6.f14054l = 1;
                            Object objP = c1451x5.p(i3, w6);
                            if (objP != aVar) {
                                obj = objP;
                                str3 = str4;
                                z11 = this;
                                objT = ((TMDBMovieDetail) obj).f20200f;
                                r10 = str3;
                                r9 = z11;
                                z9 = objT instanceof p070h6.m;
                                if (!z9) {
                                    if (z9) {
                                        objT = null;
                                    }
                                    str = (String) objT;
                                    if (str != null) {
                                        A a2 = Q0.Companion;
                                        r9.f14161b.getClass();
                                        a2.getClass();
                                        strB = A.b(str, "w500", "https://image.tmdb.org/t/p");
                                    }
                                    r9.f14162c.put(r10, new U1(strB));
                                    return strB;
                                }
                            }
                        } else {
                            w6.f14051h = this;
                            w6.f14052i = str4;
                            w6.f14054l = 2;
                            Object objW = c1451x5.w(i3, w6);
                            if (objW != aVar) {
                                obj = objW;
                                str2 = str4;
                                z10 = this;
                                objT = ((TMDBSeriesDetail) obj).f20318e;
                                r10 = str2;
                                r9 = z10;
                                z9 = objT instanceof p070h6.m;
                                if (!z9) {
                                    if (z9) {
                                        objT = null;
                                    }
                                    str = (String) objT;
                                    if (str != null) {
                                        A a9 = Q0.Companion;
                                        r9.f14161b.getClass();
                                        a9.getClass();
                                        strB = A.b(str, "w500", "https://image.tmdb.org/t/p");
                                    }
                                    r9.f14162c.put(r10, new U1(strB));
                                    return strB;
                                }
                            }
                        }
                        return aVar;
                    } catch (Throwable th) {
                        th = th;
                        i3 = str4;
                        z6 = this;
                        objT = P.T(th);
                        r10 = i3;
                        r9 = z6;
                    }
                }
            } else if (i10 == 1) {
                String str5 = w6.f14052i;
                Z1 z12 = w6.f14051h;
                P.u0(obj);
                str3 = str5;
                z11 = z12;
                objT = ((TMDBMovieDetail) obj).f20200f;
                r10 = str3;
                r9 = z11;
                z9 = objT instanceof p070h6.m;
                if (!z9) {
                    if (z9) {
                        objT = null;
                    }
                    str = (String) objT;
                    if (str != null) {
                        A a10 = Q0.Companion;
                        r9.f14161b.getClass();
                        a10.getClass();
                        strB = A.b(str, "w500", "https://image.tmdb.org/t/p");
                    }
                    r9.f14162c.put(r10, new U1(strB));
                    return strB;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str6 = w6.f14052i;
                Z1 z13 = w6.f14051h;
                P.u0(obj);
                str2 = str6;
                z10 = z13;
                objT = ((TMDBSeriesDetail) obj).f20318e;
                r10 = str2;
                r9 = z10;
                z9 = objT instanceof p070h6.m;
                if (!z9) {
                    if (z9) {
                        objT = null;
                    }
                    str = (String) objT;
                    if (str != null) {
                        A a11 = Q0.Companion;
                        r9.f14161b.getClass();
                        a11.getClass();
                        strB = A.b(str, "w500", "https://image.tmdb.org/t/p");
                    }
                    r9.f14162c.put(r10, new U1(strB));
                    return strB;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return null;
    }

    public final Object d(String str, String str2, boolean z6, i iVar) {
        return e("s:".concat(a(str)), z6, new X1(this, str, str2, z6, null), iVar);
    }

    public final Object e(String str, boolean z6, j jVar, c cVar) {
        Y1 y9;
        Z1 z9;
        Object objT;
        if (cVar instanceof Y1) {
            y9 = (Y1) cVar;
            int i3 = y9.f14118m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                y9.f14118m = i3 - Integer.MIN_VALUE;
            } else {
                y9 = new Y1(this, cVar);
            }
        } else {
            y9 = new Y1(this, cVar);
        }
        Object objInvoke = y9.f14116k;
        Object obj = p109m6.a.f25430h;
        int i9 = y9.f14118m;
        String strB = null;
        if (i9 == 0) {
            P.u0(objInvoke);
            U1 u1 = (U1) this.f14162c.get(str);
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
                } catch (Throwable th) {
                    th = th;
                    z9 = this;
                    objT = P.T(th);
                }
            }
            return null;
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z6 = y9.j;
        str = y9.f14115i;
        z9 = y9.f14114h;
        try {
            P.u0(objInvoke);
        } catch (Throwable th2) {
            th = th2;
            objT = P.T(th);
        }
        objT = (String) objInvoke;
        boolean z10 = objT instanceof p070h6.m;
        if (!z10) {
            if (z10) {
                objT = null;
            }
            String str2 = (String) objT;
            if (str2 != null) {
                A a2 = Q0.Companion;
                z9.f14161b.getClass();
                a2.getClass();
                strB = A.b(str2, "w500", "https://image.tmdb.org/t/p");
            }
            if (strB != null || !z6) {
                z9.f14162c.put(str, new U1(strB));
            }
            return strB;
        }
        return null;
    }
}
