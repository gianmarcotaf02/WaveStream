package p005a5;

/* JADX INFO: renamed from: a5.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1455y {
    public static final p005a5.C1376q Companion = new p005a5.C1376q();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long[] f15334i = {500, 1000, 2000};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.github.jan.supabase.SupabaseClient f15335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.C1296i f15336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X7.c f15337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V7.n0 f15338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V7.a0 f15339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final V7.V f15340f;
    public io.github.jan.supabase.realtime.RealtimeChannel g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public S7.w0 f15341h;

    public C1455y(io.github.jan.supabase.SupabaseClient supabaseClient, p005a5.C1296i authRepository) {
        kotlin.jvm.internal.m.e(supabaseClient, "supabaseClient");
        kotlin.jvm.internal.m.e(authRepository, "authRepository");
        this.f15335a = supabaseClient;
        this.f15336b = authRepository;
        Z7.e eVar = S7.M.f9549a;
        this.f15337c = S7.C.c(Z7.d.f13044i.plus(S7.C.e()));
        this.f15338d = V7.r.b(null);
        V7.a0 a0VarA = V7.r.a(1, 5, null);
        this.f15339e = a0VarA;
        this.f15340f = new V7.V(a0VarA);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:52|28|29|48|30|(1:33)|44) */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:46:0x010f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d0, code lost:
    
        r9 = r3;
        r3 = r13;
        r10 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d6, code lost:
    
        r16 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0106, code lost:
    
        if (S7.C.n(r11, r3) == r4) goto L44;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f4 -> B:45:0x0109). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0106 -> B:45:0x0109). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(p117n6.c cVar) {
        p005a5.C1395s c1395s;
        java.lang.String id;
        int i3;
        p005a5.C1455y c1455y;
        p005a5.C1395s c1395s2;
        java.lang.String str;
        p005a5.C1455y c1455y2;
        java.lang.String str2;
        p005a5.C1455y c1455y3;
        if (cVar instanceof p005a5.C1395s) {
            c1395s = (p005a5.C1395s) cVar;
            int i9 = c1395s.f15046m;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1395s.f15046m = i9 - Integer.MIN_VALUE;
            } else {
                c1395s = new p005a5.C1395s(this, cVar);
            }
        } else {
            c1395s = new p005a5.C1395s(this, cVar);
        }
        java.lang.Object objRpc$default = c1395s.f15044k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = c1395s.f15046m;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(objRpc$default);
            io.github.jan.supabase.auth.user.UserInfo userInfoE = this.f15336b.e();
            if (userInfoE != null && (id = userInfoE.getId()) != null) {
                i3 = 0;
                c1455y = this;
                c1395s2 = c1395s;
                str = id;
                if (i3 < 3) {
                    kotlinx.serialization.json.c cVar2 = new kotlinx.serialization.json.c(p078i6.D.J0(new p070h6.k("user_uuid", p162s8.l.c(str))));
                    io.github.jan.supabase.postgrest.Postgrest postgrest = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(c1455y.f15335a);
                    c1395s2.f15042h = c1455y;
                    c1395s2.f15043i = str;
                    c1395s2.j = i3;
                    c1395s2.f15046m = 1;
                    c1455y3 = c1455y;
                    objRpc$default = io.github.jan.supabase.postgrest.Postgrest.DefaultImpls.rpc$default(postgrest, "get_daily_usage", cVar2, null, c1395s2, 4, null);
                    if (objRpc$default != aVar) {
                        str2 = str;
                        c1395s = c1395s2;
                        c1455y2 = c1455y3;
                        io.github.jan.supabase.postgrest.result.PostgrestResult postgrestResult = (io.github.jan.supabase.postgrest.result.PostgrestResult) objRpc$default;
                        io.github.jan.supabase.SupabaseSerializer serializer = postgrestResult.getPostgrest().getSerializer();
                        java.lang.String data = postgrestResult.getData();
                        E6.y yVar = E6.y.f3222c;
                        com.kiptv.core.model.DailyUsageResponse dailyUsageResponse = (com.kiptv.core.model.DailyUsageResponse) p078i6.o.j1((java.util.List) serializer.decode(kotlin.jvm.internal.B.b(java.util.List.class, R8.i.v(kotlin.jvm.internal.B.a(com.kiptv.core.model.DailyUsageResponse.class))), data));
                        c1455y2.f15338d.h(dailyUsageResponse);
                        return dailyUsageResponse;
                    }
                    return aVar;
                }
                android.util.Log.d("DailyUsageRepo", "getDailyUsage failed after 3 attempts");
            }
            return null;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c1395s.j;
            str2 = c1395s.f15043i;
            c1455y2 = c1395s.f15042h;
            com.google.common.util.concurrent.P.u0(objRpc$default);
            c1395s2 = c1395s;
            str = str2;
            c1455y = c1455y2;
            i3++;
            if (i3 < 3) {
                android.util.Log.d("DailyUsageRepo", "getDailyUsage failed after 3 attempts");
                return null;
            }
            kotlinx.serialization.json.c cVar3 = new kotlinx.serialization.json.c(p078i6.D.J0(new p070h6.k("user_uuid", p162s8.l.c(str))));
            io.github.jan.supabase.postgrest.Postgrest postgrest2 = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(c1455y.f15335a);
            c1395s2.f15042h = c1455y;
            c1395s2.f15043i = str;
            c1395s2.j = i3;
            c1395s2.f15046m = 1;
            c1455y3 = c1455y;
            objRpc$default = io.github.jan.supabase.postgrest.Postgrest.DefaultImpls.rpc$default(postgrest2, "get_daily_usage", cVar3, null, c1395s2, 4, null);
            if (objRpc$default != aVar) {
                str2 = str;
                c1395s = c1395s2;
                c1455y2 = c1455y3;
            }
            return aVar;
        }
        i3 = c1395s.j;
        str2 = c1395s.f15043i;
        c1455y2 = c1395s.f15042h;
        try {
            com.google.common.util.concurrent.P.u0(objRpc$default);
        } catch (java.lang.Exception e6) {
            java.lang.Exception e9 = e6;
            android.util.Log.d("DailyUsageRepo", "getDailyUsage attempt " + (i3 + 1) + " failed: " + e9);
            if (i3 < 2) {
                long j = f15334i[i3];
                c1395s.f15042h = c1455y2;
                c1395s.f15043i = str2;
                c1395s.j = i3;
                c1395s.f15046m = 2;
            }
            c1395s2 = c1395s;
            str = str2;
            c1455y = c1455y2;
            i3++;
            if (i3 < 3) {
                android.util.Log.d("DailyUsageRepo", "getDailyUsage failed after 3 attempts");
                return null;
            }
            kotlinx.serialization.json.c cVar4 = new kotlinx.serialization.json.c(p078i6.D.J0(new p070h6.k("user_uuid", p162s8.l.c(str))));
            io.github.jan.supabase.postgrest.Postgrest postgrest3 = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(c1455y.f15335a);
            c1395s2.f15042h = c1455y;
            c1395s2.f15043i = str;
            c1395s2.j = i3;
            c1395s2.f15046m = 1;
            c1455y3 = c1455y;
            objRpc$default = io.github.jan.supabase.postgrest.Postgrest.DefaultImpls.rpc$default(postgrest3, "get_daily_usage", cVar4, null, c1395s2, 4, null);
            if (objRpc$default != aVar) {
                str2 = str;
                c1395s = c1395s2;
                c1455y2 = c1455y3;
            }
            return aVar;
        }
        io.github.jan.supabase.postgrest.result.PostgrestResult postgrestResult2 = (io.github.jan.supabase.postgrest.result.PostgrestResult) objRpc$default;
        io.github.jan.supabase.SupabaseSerializer serializer2 = postgrestResult2.getPostgrest().getSerializer();
        java.lang.String data2 = postgrestResult2.getData();
        E6.y yVar2 = E6.y.f3222c;
        com.kiptv.core.model.DailyUsageResponse dailyUsageResponse2 = (com.kiptv.core.model.DailyUsageResponse) p078i6.o.j1((java.util.List) serializer2.decode(kotlin.jvm.internal.B.b(java.util.List.class, R8.i.v(kotlin.jvm.internal.B.a(com.kiptv.core.model.DailyUsageResponse.class))), data2));
        c1455y2.f15338d.h(dailyUsageResponse2);
        return dailyUsageResponse2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:60|30|31|56|32|(3:35|36|50)) */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:49:0x0118  */
    /* JADX WARN: Code duplicated, block: B:60:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:
    
        r9 = r2;
        r10 = r4;
        r2 = r13;
        r4 = r9;
        r11 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d5, code lost:
    
        r17 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010f, code lost:
    
        if (S7.C.n(500, r2) == r3) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0126, code lost:
    
        if (r0 == r3) goto L52;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x010f -> B:17:0x0048). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(int i3, p117n6.c cVar) {
        p005a5.C1405t c1405t;
        java.lang.String id;
        p005a5.C1455y c1455y;
        p005a5.C1405t c1405t2;
        int i9;
        int i10;
        java.lang.String str;
        p005a5.C1455y c1455y2;
        java.lang.String str2;
        int i11;
        int i12;
        p005a5.C1455y c1455y3;
        p005a5.C1455y c1455y4;
        kotlinx.serialization.json.c cVar2;
        io.github.jan.supabase.postgrest.Postgrest postgrest;
        if (cVar instanceof p005a5.C1405t) {
            c1405t = (p005a5.C1405t) cVar;
            int i13 = c1405t.f15092n;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1405t.f15092n = i13 - Integer.MIN_VALUE;
            } else {
                c1405t = new p005a5.C1405t(this, cVar);
            }
        } else {
            c1405t = new p005a5.C1405t(this, cVar);
        }
        java.lang.Object objA = c1405t.f15090l;
        p109m6.a aVar = p109m6.a.f25430h;
        int i14 = c1405t.f15092n;
        if (i14 == 0) {
            com.google.common.util.concurrent.P.u0(objA);
            io.github.jan.supabase.auth.user.UserInfo userInfoE = this.f15336b.e();
            if (userInfoE == null || (id = userInfoE.getId()) == null) {
                return null;
            }
            c1455y = this;
            c1405t2 = c1405t;
            i9 = 0;
            i10 = i3;
            str = id;
            if (i9 < 2) {
                cVar2 = new kotlinx.serialization.json.c(p078i6.C.N0(new p070h6.k("user_uuid", p162s8.l.c(str)), new p070h6.k("seconds_to_add", p162s8.l.b(new java.lang.Integer(i10)))));
                postgrest = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(c1455y.f15335a);
                c1405t2.f15087h = c1455y;
                c1405t2.f15088i = str;
                c1405t2.j = i10;
                c1405t2.f15089k = i9;
                c1405t2.f15092n = 1;
                c1455y4 = c1455y;
                if (io.github.jan.supabase.postgrest.Postgrest.DefaultImpls.rpc$default(postgrest, "increment_daily_usage", cVar2, null, c1405t2, 4, null) != aVar) {
                    c1405t = c1405t2;
                    c1455y2 = c1455y4;
                    c1405t2 = c1405t;
                    c1455y3 = c1455y2;
                    c1405t2.f15087h = c1455y3;
                    c1405t2.f15088i = null;
                    c1405t2.f15092n = 3;
                    objA = c1455y3.a(c1405t2);
                }
            } else {
                c1455y3 = c1455y;
                c1405t2.f15087h = c1455y3;
                c1405t2.f15088i = null;
                c1405t2.f15092n = 3;
                objA = c1455y3.a(c1405t2);
            }
            return aVar;
        }
        if (i14 == 1) {
            i12 = c1405t.f15089k;
            i11 = c1405t.j;
            str2 = c1405t.f15088i;
            c1455y2 = c1405t.f15087h;
            try {
                com.google.common.util.concurrent.P.u0(objA);
            } catch (java.lang.Exception e6) {
                java.lang.Exception e9 = e6;
                android.util.Log.d("DailyUsageRepo", "incrementUsage attempt " + (i12 + 1) + " failed: " + e9);
                if (i12 == 1) {
                    android.util.Log.d("DailyUsageRepo", "incrementUsage failed after 2 attempts");
                    return null;
                }
                c1405t.f15087h = c1455y2;
                c1405t.f15088i = str2;
                c1405t.j = i11;
                c1405t.f15089k = i12;
                c1405t.f15092n = 2;
            }
            c1405t2 = c1405t;
            c1455y3 = c1455y2;
            c1405t2.f15087h = c1455y3;
            c1405t2.f15088i = null;
            c1405t2.f15092n = 3;
            objA = c1455y3.a(c1405t2);
        } else {
            if (i14 == 2) {
                i12 = c1405t.f15089k;
                i11 = c1405t.j;
                str2 = c1405t.f15088i;
                c1455y2 = c1405t.f15087h;
                com.google.common.util.concurrent.P.u0(objA);
                c1405t2 = c1405t;
                i10 = i11;
                i9 = i12 + 1;
                str = str2;
                c1455y = c1455y2;
                if (i9 < 2) {
                    cVar2 = new kotlinx.serialization.json.c(p078i6.C.N0(new p070h6.k("user_uuid", p162s8.l.c(str)), new p070h6.k("seconds_to_add", p162s8.l.b(new java.lang.Integer(i10)))));
                    postgrest = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(c1455y.f15335a);
                    c1405t2.f15087h = c1455y;
                    c1405t2.f15088i = str;
                    c1405t2.j = i10;
                    c1405t2.f15089k = i9;
                    c1405t2.f15092n = 1;
                    c1455y4 = c1455y;
                    if (io.github.jan.supabase.postgrest.Postgrest.DefaultImpls.rpc$default(postgrest, "increment_daily_usage", cVar2, null, c1405t2, 4, null) != aVar) {
                        c1405t = c1405t2;
                        c1455y2 = c1455y4;
                        c1405t2 = c1405t;
                        c1455y3 = c1455y2;
                        c1405t2.f15087h = c1455y3;
                        c1405t2.f15088i = null;
                        c1405t2.f15092n = 3;
                        objA = c1455y3.a(c1405t2);
                    }
                } else {
                    c1455y3 = c1455y;
                    c1405t2.f15087h = c1455y3;
                    c1405t2.f15088i = null;
                    c1405t2.f15092n = 3;
                    objA = c1455y3.a(c1405t2);
                }
                return aVar;
            }
            if (i14 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1455y3 = c1405t.f15087h;
            com.google.common.util.concurrent.P.u0(objA);
        }
        com.kiptv.core.model.DailyUsageResponse dailyUsageResponse = (com.kiptv.core.model.DailyUsageResponse) objA;
        c1455y3.f15339e.o(p070h6.A.f22523a);
        return dailyUsageResponse;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:48|27|28|46|29|(1:40)) */
    /* JADX WARN: Code duplicated, block: B:38:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0101  */
    /* JADX WARN: Code duplicated, block: B:48:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
    
        r9 = r2;
        r10 = r4;
        r2 = r13;
        r4 = r9;
        r11 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c4, code lost:
    
        r17 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f6, code lost:
    
        if (S7.C.n(500, r2) == r3) goto L40;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e4 -> B:41:0x00f9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f6 -> B:41:0x00f9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(int i3, p117n6.c cVar) {
        p005a5.C1415u c1415u;
        java.lang.String id;
        p005a5.C1455y c1455y;
        p005a5.C1415u c1415u2;
        int i9;
        int i10;
        java.lang.String str;
        p005a5.C1455y c1455y2;
        java.lang.String str2;
        int i11;
        int i12;
        java.lang.Exception e6;
        kotlinx.serialization.json.c cVar2;
        io.github.jan.supabase.postgrest.Postgrest postgrest;
        if (cVar instanceof p005a5.C1415u) {
            c1415u = (p005a5.C1415u) cVar;
            int i13 = c1415u.f15120n;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1415u.f15120n = i13 - Integer.MIN_VALUE;
            } else {
                c1415u = new p005a5.C1415u(this, cVar);
            }
        } else {
            c1415u = new p005a5.C1415u(this, cVar);
        }
        java.lang.Object obj = c1415u.f15118l;
        p109m6.a aVar = p109m6.a.f25430h;
        int i14 = c1415u.f15120n;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i14 != 0) {
            if (i14 == 1) {
                i12 = c1415u.f15117k;
                i11 = c1415u.j;
                str2 = c1415u.f15116i;
                c1455y2 = c1415u.f15115h;
                try {
                    com.google.common.util.concurrent.P.u0(obj);
                    return a2;
                } catch (java.lang.Exception e9) {
                    e6 = e9;
                }
            } else {
                if (i14 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i12 = c1415u.f15117k;
                i11 = c1415u.j;
                str2 = c1415u.f15116i;
                c1455y2 = c1415u.f15115h;
                com.google.common.util.concurrent.P.u0(obj);
                c1415u2 = c1415u;
                i10 = i11;
                i9 = i12 + 1;
                str = str2;
                c1455y = c1455y2;
                if (i9 < 2) {
                    cVar2 = new kotlinx.serialization.json.c(p078i6.C.N0(new p070h6.k("user_uuid", p162s8.l.c(str)), new p070h6.k("seconds_to_add", p162s8.l.b(new java.lang.Integer(i10)))));
                    postgrest = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(c1455y.f15335a);
                    c1415u2.f15115h = c1455y;
                    c1415u2.f15116i = str;
                    c1415u2.j = i10;
                    c1415u2.f15117k = i9;
                    c1415u2.f15120n = 1;
                    p005a5.C1455y c1455y3 = c1455y;
                    if (io.github.jan.supabase.postgrest.Postgrest.DefaultImpls.rpc$default(postgrest, "increment_daily_usage", cVar2, null, c1415u2, 4, null) == aVar) {
                        return aVar;
                    }
                } else {
                    android.util.Log.d("DailyUsageRepo", "recordWatchTime failed after 2 attempts");
                }
            }
            android.util.Log.d("DailyUsageRepo", "recordWatchTime attempt " + (i12 + 1) + " failed: " + e6);
            if (i12 == 0) {
                c1415u.f15115h = c1455y2;
                c1415u.f15116i = str2;
                c1415u.j = i11;
                c1415u.f15117k = i12;
                c1415u.f15120n = 2;
            }
            c1415u2 = c1415u;
            i10 = i11;
            i9 = i12 + 1;
            str = str2;
            c1455y = c1455y2;
            if (i9 < 2) {
                cVar2 = new kotlinx.serialization.json.c(p078i6.C.N0(new p070h6.k("user_uuid", p162s8.l.c(str)), new p070h6.k("seconds_to_add", p162s8.l.b(new java.lang.Integer(i10)))));
                postgrest = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(c1455y.f15335a);
                c1415u2.f15115h = c1455y;
                c1415u2.f15116i = str;
                c1415u2.j = i10;
                c1415u2.f15117k = i9;
                c1415u2.f15120n = 1;
                p005a5.C1455y c1455y4 = c1455y;
                if (io.github.jan.supabase.postgrest.Postgrest.DefaultImpls.rpc$default(postgrest, "increment_daily_usage", cVar2, null, c1415u2, 4, null) == aVar) {
                    return aVar;
                }
            } else {
                android.util.Log.d("DailyUsageRepo", "recordWatchTime failed after 2 attempts");
            }
        } else {
            com.google.common.util.concurrent.P.u0(obj);
            io.github.jan.supabase.auth.user.UserInfo userInfoE = this.f15336b.e();
            if (userInfoE != null && (id = userInfoE.getId()) != null) {
                c1455y = this;
                c1415u2 = c1415u;
                i9 = 0;
                i10 = i3;
                str = id;
                if (i9 < 2) {
                    cVar2 = new kotlinx.serialization.json.c(p078i6.C.N0(new p070h6.k("user_uuid", p162s8.l.c(str)), new p070h6.k("seconds_to_add", p162s8.l.b(new java.lang.Integer(i10)))));
                    postgrest = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(c1455y.f15335a);
                    c1415u2.f15115h = c1455y;
                    c1415u2.f15116i = str;
                    c1415u2.j = i10;
                    c1415u2.f15117k = i9;
                    c1415u2.f15120n = 1;
                    p005a5.C1455y c1455y5 = c1455y;
                    if (io.github.jan.supabase.postgrest.Postgrest.DefaultImpls.rpc$default(postgrest, "increment_daily_usage", cVar2, null, c1415u2, 4, null) == aVar) {
                        return aVar;
                    }
                } else {
                    android.util.Log.d("DailyUsageRepo", "recordWatchTime failed after 2 attempts");
                }
            }
        }
        return a2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
    
        if (io.github.jan.supabase.realtime.RealtimeChannel.DefaultImpls.subscribe$default(r10, false, r1, 1, null) == r2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object d(java.lang.String str, p117n6.c cVar) {
        p005a5.C1425v c1425v;
        p005a5.C1455y c1455y;
        if (cVar instanceof p005a5.C1425v) {
            c1425v = (p005a5.C1425v) cVar;
            int i3 = c1425v.f15163l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1425v.f15163l = i3 - Integer.MIN_VALUE;
            } else {
                c1425v = new p005a5.C1425v(this, cVar);
            }
        } else {
            c1425v = new p005a5.C1425v(this, cVar);
        }
        java.lang.Object obj = c1425v.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1425v.f15163l;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                c1425v.f15160h = this;
                c1425v.f15161i = str;
                c1425v.f15163l = 1;
                if (e(c1425v) != aVar) {
                    c1455y = this;
                }
                return aVar;
            }
            if (i9 == 1) {
                str = c1425v.f15161i;
                c1455y = c1425v.f15160h;
                com.google.common.util.concurrent.P.u0(obj);
            } else {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
            return p070h6.A.f22523a;
            io.github.jan.supabase.realtime.Realtime realtime = io.github.jan.supabase.realtime.RealtimeKt.getRealtime(c1455y.f15335a);
            java.lang.String strConcat = "daily_usage_".concat(O7.q.p1(8, str));
            io.github.jan.supabase.realtime.RealtimeChannel realtimeChannelChannel = realtime.channel(strConcat, new io.github.jan.supabase.realtime.RealtimeChannelBuilder(io.github.jan.supabase.realtime.RealtimeTopic.INSTANCE.withChannelId(strConcat)));
            V7.InterfaceC0981g interfaceC0981gPostgresChangeFlowInternal = realtimeChannelChannel.postgresChangeFlowInternal(realtimeChannelChannel, kotlin.jvm.internal.B.f24540a.b(io.github.jan.supabase.realtime.PostgresAction.class), io.ktor.client.utils.CacheControl.PUBLIC, new C5.C0138p0(str, 20));
            c1455y.g = realtimeChannelChannel;
            c1455y.f15341h = S7.C.A(c1455y.f15337c, null, new p005a5.C1435w(interfaceC0981gPostgresChangeFlowInternal, c1455y, null), 3);
            c1425v.f15160h = null;
            c1425v.f15161i = null;
            c1425v.f15163l = 2;
        } catch (java.lang.Exception e6) {
            Y6.f.u(e6, "startRealtimeSync failed: ", "DailyUsageRepo");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(p117n6.c cVar) {
        p005a5.C1445x c1445x;
        p005a5.C1455y c1455y;
        if (cVar instanceof p005a5.C1445x) {
            c1445x = (p005a5.C1445x) cVar;
            int i3 = c1445x.f15280k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1445x.f15280k = i3 - Integer.MIN_VALUE;
            } else {
                c1445x = new p005a5.C1445x(this, cVar);
            }
        } else {
            c1445x = new p005a5.C1445x(this, cVar);
        }
        java.lang.Object obj = c1445x.f15279i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1445x.f15280k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            S7.w0 w0Var = this.f15341h;
            if (w0Var != null) {
                w0Var.e(null);
            }
            this.f15341h = null;
            io.github.jan.supabase.realtime.RealtimeChannel realtimeChannel = this.g;
            if (realtimeChannel != null) {
                try {
                    io.github.jan.supabase.realtime.Realtime realtime = io.github.jan.supabase.realtime.RealtimeKt.getRealtime(this.f15335a);
                    c1445x.f15278h = this;
                    c1445x.f15280k = 1;
                    if (realtime.removeChannel(realtimeChannel, c1445x) == aVar) {
                        return aVar;
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            c1455y = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1455y = c1445x.f15278h;
            try {
                com.google.common.util.concurrent.P.u0(obj);
            } catch (java.lang.Exception unused2) {
            }
        }
        c1455y.g = null;
        return p070h6.A.f22523a;
    }
}
