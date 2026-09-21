package p005a5;

import C5.C0138p0;
import E6.y;
import O7.q;
import R8.i;
import S7.C;
import S7.M;
import S7.w0;
import V7.InterfaceC0981g;
import V7.V;
import V7.a0;
import V7.n0;
import V7.r;
import X7.c;
import Y6.f;
import Z7.d;
import Z7.e;
import android.util.Log;
import com.google.common.util.concurrent.P;
import com.kiptv.core.model.DailyUsageResponse;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.SupabaseSerializer;
import io.github.jan.supabase.auth.user.UserInfo;
import io.github.jan.supabase.postgrest.Postgrest;
import io.github.jan.supabase.postgrest.PostgrestKt;
import io.github.jan.supabase.postgrest.result.PostgrestResult;
import io.github.jan.supabase.realtime.PostgresAction;
import io.github.jan.supabase.realtime.Realtime;
import io.github.jan.supabase.realtime.RealtimeChannel;
import io.github.jan.supabase.realtime.RealtimeChannelBuilder;
import io.github.jan.supabase.realtime.RealtimeKt;
import io.github.jan.supabase.realtime.RealtimeTopic;
import io.ktor.client.utils.CacheControl;
import java.util.List;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.m;
import p070h6.A;
import p070h6.k;
import p078i6.D;
import p078i6.o;
import p109m6.a;
import p162s8.l;

public final class C1455y {
    public static final C1376q Companion = new C1376q();

    public static final long[] f15334i = {500, 1000, 2000};

    public final SupabaseClient f15335a;

    public final C1296i f15336b;

    public final c f15337c;

    public final n0 f15338d;

    public final a0 f15339e;

    public final V f15340f;
    public RealtimeChannel g;

    public w0 f15341h;

    public C1455y(SupabaseClient supabaseClient, C1296i authRepository) {
        m.e(supabaseClient, "supabaseClient");
        m.e(authRepository, "authRepository");
        this.f15335a = supabaseClient;
        this.f15336b = authRepository;
        e eVar = M.f9549a;
        this.f15337c = C.c(d.f13044i.plus(C.e()));
        this.f15338d = r.b(null);
        a0 a0VarA = r.a(1, 5, null);
        this.f15339e = a0VarA;
        this.f15340f = new V(a0VarA);
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(p117n6.c cVar) {
        C1395s c1395s;
        String id;
        int i3;
        C1455y c1455y;
        C1395s c1395s2;
        String str;
        C1455y c1455y2;
        String str2;
        C1455y c1455y3;
        if (cVar instanceof C1395s) {
            c1395s = (C1395s) cVar;
            int i9 = c1395s.f15046m;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1395s.f15046m = i9 - Integer.MIN_VALUE;
            } else {
                c1395s = new C1395s(this, cVar);
            }
        } else {
            c1395s = new C1395s(this, cVar);
        }
        Object objRpc$default = c1395s.f15044k;
        a aVar = a.f25430h;
        int i10 = c1395s.f15046m;
        if (i10 == 0) {
            P.u0(objRpc$default);
            UserInfo userInfoE = this.f15336b.e();
            if (userInfoE != null && (id = userInfoE.getId()) != null) {
                i3 = 0;
                c1455y = this;
                c1395s2 = c1395s;
                str = id;
                if (i3 < 3) {
                    kotlinx.serialization.json.c cVar2 = new kotlinx.serialization.json.c(D.J0(new k("user_uuid", l.c(str))));
                    Postgrest postgrest = PostgrestKt.getPostgrest(c1455y.f15335a);
                    c1395s2.f15042h = c1455y;
                    c1395s2.f15043i = str;
                    c1395s2.j = i3;
                    c1395s2.f15046m = 1;
                    c1455y3 = c1455y;
                    objRpc$default = Postgrest.DefaultImpls.rpc$default(postgrest, "get_daily_usage", cVar2, null, c1395s2, 4, null);
                    if (objRpc$default != aVar) {
                        str2 = str;
                        c1395s = c1395s2;
                        c1455y2 = c1455y3;
                        PostgrestResult postgrestResult = (PostgrestResult) objRpc$default;
                        SupabaseSerializer serializer = postgrestResult.getPostgrest().getSerializer();
                        String data = postgrestResult.getData();
                        y yVar = y.f3222c;
                        DailyUsageResponse dailyUsageResponse = (DailyUsageResponse) o.j1((List) serializer.decode(B.b(List.class, i.v(B.a(DailyUsageResponse.class))), data));
                        c1455y2.f15338d.h(dailyUsageResponse);
                        return dailyUsageResponse;
                    }
                    return aVar;
                }
                Log.d("DailyUsageRepo", "getDailyUsage failed after 3 attempts");
            }
            return null;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c1395s.j;
            str2 = c1395s.f15043i;
            c1455y2 = c1395s.f15042h;
            P.u0(objRpc$default);
            c1395s2 = c1395s;
            str = str2;
            c1455y = c1455y2;
            i3++;
            if (i3 < 3) {
                Log.d("DailyUsageRepo", "getDailyUsage failed after 3 attempts");
                return null;
            }
            kotlinx.serialization.json.c cVar3 = new kotlinx.serialization.json.c(D.J0(new k("user_uuid", l.c(str))));
            Postgrest postgrest2 = PostgrestKt.getPostgrest(c1455y.f15335a);
            c1395s2.f15042h = c1455y;
            c1395s2.f15043i = str;
            c1395s2.j = i3;
            c1395s2.f15046m = 1;
            c1455y3 = c1455y;
            objRpc$default = Postgrest.DefaultImpls.rpc$default(postgrest2, "get_daily_usage", cVar3, null, c1395s2, 4, null);
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
            P.u0(objRpc$default);
        } catch (Exception e6) {
            Exception e9 = e6;
            Log.d("DailyUsageRepo", "getDailyUsage attempt " + (i3 + 1) + " failed: " + e9);
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
                Log.d("DailyUsageRepo", "getDailyUsage failed after 3 attempts");
                return null;
            }
            kotlinx.serialization.json.c cVar4 = new kotlinx.serialization.json.c(D.J0(new k("user_uuid", l.c(str))));
            Postgrest postgrest3 = PostgrestKt.getPostgrest(c1455y.f15335a);
            c1395s2.f15042h = c1455y;
            c1395s2.f15043i = str;
            c1395s2.j = i3;
            c1395s2.f15046m = 1;
            c1455y3 = c1455y;
            objRpc$default = Postgrest.DefaultImpls.rpc$default(postgrest3, "get_daily_usage", cVar4, null, c1395s2, 4, null);
            if (objRpc$default != aVar) {
                str2 = str;
                c1395s = c1395s2;
                c1455y2 = c1455y3;
            }
            return aVar;
        }
        PostgrestResult postgrestResult2 = (PostgrestResult) objRpc$default;
        SupabaseSerializer serializer2 = postgrestResult2.getPostgrest().getSerializer();
        String data2 = postgrestResult2.getData();
        y yVar2 = y.f3222c;
        DailyUsageResponse dailyUsageResponse2 = (DailyUsageResponse) o.j1((List) serializer2.decode(B.b(List.class, i.v(B.a(DailyUsageResponse.class))), data2));
        c1455y2.f15338d.h(dailyUsageResponse2);
        return dailyUsageResponse2;
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i3, p117n6.c cVar) {
        C1405t c1405t;
        String id;
        C1455y c1455y;
        C1405t c1405t2;
        int i9;
        int i10;
        String str;
        C1455y c1455y2;
        String str2;
        int i11;
        int i12;
        C1455y c1455y3;
        C1455y c1455y4;
        kotlinx.serialization.json.c cVar2;
        Postgrest postgrest;
        if (cVar instanceof C1405t) {
            c1405t = (C1405t) cVar;
            int i13 = c1405t.f15092n;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1405t.f15092n = i13 - Integer.MIN_VALUE;
            } else {
                c1405t = new C1405t(this, cVar);
            }
        } else {
            c1405t = new C1405t(this, cVar);
        }
        Object objA = c1405t.f15090l;
        a aVar = a.f25430h;
        int i14 = c1405t.f15092n;
        if (i14 == 0) {
            P.u0(objA);
            UserInfo userInfoE = this.f15336b.e();
            if (userInfoE == null || (id = userInfoE.getId()) == null) {
                return null;
            }
            c1455y = this;
            c1405t2 = c1405t;
            i9 = 0;
            i10 = i3;
            str = id;
            if (i9 < 2) {
                cVar2 = new kotlinx.serialization.json.c(p078i6.C.N0(new k("user_uuid", l.c(str)), new k("seconds_to_add", l.b(new Integer(i10)))));
                postgrest = PostgrestKt.getPostgrest(c1455y.f15335a);
                c1405t2.f15087h = c1455y;
                c1405t2.f15088i = str;
                c1405t2.j = i10;
                c1405t2.f15089k = i9;
                c1405t2.f15092n = 1;
                c1455y4 = c1455y;
                if (Postgrest.DefaultImpls.rpc$default(postgrest, "increment_daily_usage", cVar2, null, c1405t2, 4, null) != aVar) {
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
                P.u0(objA);
            } catch (Exception e6) {
                Exception e9 = e6;
                Log.d("DailyUsageRepo", "incrementUsage attempt " + (i12 + 1) + " failed: " + e9);
                if (i12 == 1) {
                    Log.d("DailyUsageRepo", "incrementUsage failed after 2 attempts");
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
                P.u0(objA);
                c1405t2 = c1405t;
                i10 = i11;
                i9 = i12 + 1;
                str = str2;
                c1455y = c1455y2;
                if (i9 < 2) {
                    cVar2 = new kotlinx.serialization.json.c(p078i6.C.N0(new k("user_uuid", l.c(str)), new k("seconds_to_add", l.b(new Integer(i10)))));
                    postgrest = PostgrestKt.getPostgrest(c1455y.f15335a);
                    c1405t2.f15087h = c1455y;
                    c1405t2.f15088i = str;
                    c1405t2.j = i10;
                    c1405t2.f15089k = i9;
                    c1405t2.f15092n = 1;
                    c1455y4 = c1455y;
                    if (Postgrest.DefaultImpls.rpc$default(postgrest, "increment_daily_usage", cVar2, null, c1405t2, 4, null) != aVar) {
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
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1455y3 = c1405t.f15087h;
            P.u0(objA);
        }
        DailyUsageResponse dailyUsageResponse = (DailyUsageResponse) objA;
        c1455y3.f15339e.o(A.f22523a);
        return dailyUsageResponse;
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i3, p117n6.c cVar) {
        C1415u c1415u;
        String id;
        C1455y c1455y;
        C1415u c1415u2;
        int i9;
        int i10;
        String str;
        C1455y c1455y2;
        String str2;
        int i11;
        int i12;
        Exception e6;
        kotlinx.serialization.json.c cVar2;
        Postgrest postgrest;
        if (cVar instanceof C1415u) {
            c1415u = (C1415u) cVar;
            int i13 = c1415u.f15120n;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1415u.f15120n = i13 - Integer.MIN_VALUE;
            } else {
                c1415u = new C1415u(this, cVar);
            }
        } else {
            c1415u = new C1415u(this, cVar);
        }
        Object obj = c1415u.f15118l;
        a aVar = a.f25430h;
        int i14 = c1415u.f15120n;
        A a2 = A.f22523a;
        if (i14 != 0) {
            if (i14 == 1) {
                i12 = c1415u.f15117k;
                i11 = c1415u.j;
                str2 = c1415u.f15116i;
                c1455y2 = c1415u.f15115h;
                try {
                    P.u0(obj);
                    return a2;
                } catch (Exception e9) {
                    e6 = e9;
                }
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i12 = c1415u.f15117k;
                i11 = c1415u.j;
                str2 = c1415u.f15116i;
                c1455y2 = c1415u.f15115h;
                P.u0(obj);
                c1415u2 = c1415u;
                i10 = i11;
                i9 = i12 + 1;
                str = str2;
                c1455y = c1455y2;
                if (i9 < 2) {
                    cVar2 = new kotlinx.serialization.json.c(p078i6.C.N0(new k("user_uuid", l.c(str)), new k("seconds_to_add", l.b(new Integer(i10)))));
                    postgrest = PostgrestKt.getPostgrest(c1455y.f15335a);
                    c1415u2.f15115h = c1455y;
                    c1415u2.f15116i = str;
                    c1415u2.j = i10;
                    c1415u2.f15117k = i9;
                    c1415u2.f15120n = 1;
                    C1455y c1455y3 = c1455y;
                    if (Postgrest.DefaultImpls.rpc$default(postgrest, "increment_daily_usage", cVar2, null, c1415u2, 4, null) == aVar) {
                        return aVar;
                    }
                } else {
                    Log.d("DailyUsageRepo", "recordWatchTime failed after 2 attempts");
                }
            }
            Log.d("DailyUsageRepo", "recordWatchTime attempt " + (i12 + 1) + " failed: " + e6);
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
                cVar2 = new kotlinx.serialization.json.c(p078i6.C.N0(new k("user_uuid", l.c(str)), new k("seconds_to_add", l.b(new Integer(i10)))));
                postgrest = PostgrestKt.getPostgrest(c1455y.f15335a);
                c1415u2.f15115h = c1455y;
                c1415u2.f15116i = str;
                c1415u2.j = i10;
                c1415u2.f15117k = i9;
                c1415u2.f15120n = 1;
                C1455y c1455y4 = c1455y;
                if (Postgrest.DefaultImpls.rpc$default(postgrest, "increment_daily_usage", cVar2, null, c1415u2, 4, null) == aVar) {
                    return aVar;
                }
            } else {
                Log.d("DailyUsageRepo", "recordWatchTime failed after 2 attempts");
            }
        } else {
            P.u0(obj);
            UserInfo userInfoE = this.f15336b.e();
            if (userInfoE != null && (id = userInfoE.getId()) != null) {
                c1455y = this;
                c1415u2 = c1415u;
                i9 = 0;
                i10 = i3;
                str = id;
                if (i9 < 2) {
                    cVar2 = new kotlinx.serialization.json.c(p078i6.C.N0(new k("user_uuid", l.c(str)), new k("seconds_to_add", l.b(new Integer(i10)))));
                    postgrest = PostgrestKt.getPostgrest(c1455y.f15335a);
                    c1415u2.f15115h = c1455y;
                    c1415u2.f15116i = str;
                    c1415u2.j = i10;
                    c1415u2.f15117k = i9;
                    c1415u2.f15120n = 1;
                    C1455y c1455y5 = c1455y;
                    if (Postgrest.DefaultImpls.rpc$default(postgrest, "increment_daily_usage", cVar2, null, c1415u2, 4, null) == aVar) {
                        return aVar;
                    }
                } else {
                    Log.d("DailyUsageRepo", "recordWatchTime failed after 2 attempts");
                }
            }
        }
        return a2;
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, p117n6.c cVar) {
        C1425v c1425v;
        C1455y c1455y;
        if (cVar instanceof C1425v) {
            c1425v = (C1425v) cVar;
            int i3 = c1425v.f15163l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1425v.f15163l = i3 - Integer.MIN_VALUE;
            } else {
                c1425v = new C1425v(this, cVar);
            }
        } else {
            c1425v = new C1425v(this, cVar);
        }
        Object obj = c1425v.j;
        a aVar = a.f25430h;
        int i9 = c1425v.f15163l;
        try {
            if (i9 == 0) {
                P.u0(obj);
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
                P.u0(obj);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P.u0(obj);
            }
            return A.f22523a;
            Realtime realtime = RealtimeKt.getRealtime(c1455y.f15335a);
            String strConcat = "daily_usage_".concat(q.p1(8, str));
            RealtimeChannel realtimeChannelChannel = realtime.channel(strConcat, new RealtimeChannelBuilder(RealtimeTopic.INSTANCE.withChannelId(strConcat)));
            InterfaceC0981g interfaceC0981gPostgresChangeFlowInternal = realtimeChannelChannel.postgresChangeFlowInternal(realtimeChannelChannel, B.f24540a.b(PostgresAction.class), CacheControl.PUBLIC, new C0138p0(str, 20));
            c1455y.g = realtimeChannelChannel;
            c1455y.f15341h = C.A(c1455y.f15337c, null, new C1435w(interfaceC0981gPostgresChangeFlowInternal, c1455y, null), 3);
            c1425v.f15160h = null;
            c1425v.f15161i = null;
            c1425v.f15163l = 2;
        } catch (Exception e6) {
            f.u(e6, "startRealtimeSync failed: ", "DailyUsageRepo");
        }
    }

    public final Object e(p117n6.c cVar) {
        C1445x c1445x;
        C1455y c1455y;
        if (cVar instanceof C1445x) {
            c1445x = (C1445x) cVar;
            int i3 = c1445x.f15280k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1445x.f15280k = i3 - Integer.MIN_VALUE;
            } else {
                c1445x = new C1445x(this, cVar);
            }
        } else {
            c1445x = new C1445x(this, cVar);
        }
        Object obj = c1445x.f15279i;
        a aVar = a.f25430h;
        int i9 = c1445x.f15280k;
        if (i9 == 0) {
            P.u0(obj);
            w0 w0Var = this.f15341h;
            if (w0Var != null) {
                w0Var.e(null);
            }
            this.f15341h = null;
            RealtimeChannel realtimeChannel = this.g;
            if (realtimeChannel != null) {
                try {
                    Realtime realtime = RealtimeKt.getRealtime(this.f15335a);
                    c1445x.f15278h = this;
                    c1445x.f15280k = 1;
                    if (realtime.removeChannel(realtimeChannel, c1445x) == aVar) {
                        return aVar;
                    }
                } catch (Exception unused) {
                }
            }
            c1455y = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1455y = c1445x.f15278h;
            try {
                P.u0(obj);
            } catch (Exception unused2) {
            }
        }
        c1455y.g = null;
        return A.f22523a;
    }
}
