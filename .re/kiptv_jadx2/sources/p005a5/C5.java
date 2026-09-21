package p005a5;

import E6.y;
import O7.q;
import O7.r;
import R8.i;
import U4.h;
import Y6.f;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import com.google.common.util.concurrent.P;
import com.kiptv.core.repository.TVPairingRepository$PairingInsert;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.SupabaseSerializer;
import io.github.jan.supabase.postgrest.Postgrest;
import io.github.jan.supabase.postgrest.PostgrestKt;
import io.github.jan.supabase.postgrest.UtilsKt;
import io.github.jan.supabase.postgrest.executor.RestRequestExecutor;
import io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder;
import io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder;
import io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder;
import io.github.jan.supabase.postgrest.query.request.InsertRequestBuilder;
import io.github.jan.supabase.postgrest.request.DeleteRequest;
import io.github.jan.supabase.postgrest.request.InsertRequest;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.m;
import kotlinx.serialization.json.b;
import p070h6.A;
import p078i6.o;
import p109m6.a;
import p117n6.c;
import p162s8.d;
import p162s8.l;

public final class C5 {
    public static final C1461y5 Companion = new C1461y5();

    public static final SimpleDateFormat f13257c;

    public final SupabaseClient f13258a;

    public final SharedPreferences f13259b;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        f13257c = simpleDateFormat;
    }

    public C5(Context context, SupabaseClient supabaseClient) {
        m.e(context, "context");
        m.e(supabaseClient, "supabaseClient");
        this.f13258a = supabaseClient;
        this.f13259b = context.getSharedPreferences("kip_tv_pairing", 0);
    }

    public final Object a(String str, c cVar) {
        C1471z5 c1471z5;
        if (cVar instanceof C1471z5) {
            c1471z5 = (C1471z5) cVar;
            int i3 = c1471z5.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1471z5.j = i3 - Integer.MIN_VALUE;
            } else {
                c1471z5 = new C1471z5(this, cVar);
            }
        } else {
            c1471z5 = new C1471z5(this, cVar);
        }
        Object obj = c1471z5.f15401h;
        a aVar = a.f25430h;
        int i9 = c1471z5.j;
        try {
            if (i9 == 0) {
                P.u0(obj);
                PostgrestQueryBuilder postgrestQueryBuilderFrom = PostgrestKt.getPostgrest(this.f13258a).from("device_pairing_codes");
                PostgrestRequestBuilder postgrestRequestBuilder = new PostgrestRequestBuilder(((Postgrest.Config) postgrestQueryBuilderFrom.getPostgrest().getConfig()).getPropertyConversionMethod());
                PostgrestFilterBuilder postgrestFilterBuilder = new PostgrestFilterBuilder(postgrestRequestBuilder.getPropertyConversionMethod(), postgrestRequestBuilder.getParams(), false, 4, null);
                postgrestFilterBuilder.eq("code", str);
                postgrestFilterBuilder.eq("device_id", c());
                DeleteRequest deleteRequest = new DeleteRequest(postgrestRequestBuilder.getReturning(), postgrestRequestBuilder.getCount(), UtilsKt.mapToFirstValue(postgrestRequestBuilder.getParams()), postgrestQueryBuilderFrom.getSchema(), postgrestRequestBuilder.getHeaders().build());
                RestRequestExecutor restRequestExecutor = RestRequestExecutor.INSTANCE;
                Postgrest postgrest = postgrestQueryBuilderFrom.getPostgrest();
                String table = postgrestQueryBuilderFrom.getTable();
                c1471z5.j = 1;
                if (restRequestExecutor.execute(postgrest, table, deleteRequest, c1471z5) == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P.u0(obj);
            }
        } catch (Exception e6) {
            f.u(e6, "cancel failed: ", "TVPairingRepository");
        }
        return A.f22523a;
    }

    public final Object b(c cVar) {
        A5 a9;
        C5 c9;
        String str;
        if (cVar instanceof A5) {
            a9 = (A5) cVar;
            int i3 = a9.f13131l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a9.f13131l = i3 - Integer.MIN_VALUE;
            } else {
                a9 = new A5(this, cVar);
            }
        } else {
            a9 = new A5(this, cVar);
        }
        Object obj = a9.j;
        a aVar = a.f25430h;
        int i9 = a9.f13131l;
        if (i9 == 0) {
            P.u0(obj);
            String strO1 = o.o1(r.W(0, 6), "", null, null, new h(29), 30);
            Date date = new Date(TimeUnit.MINUTES.toMillis(5L) + System.currentTimeMillis());
            String strC = c();
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "Android TV";
            }
            String string = q.r1(str2).toString();
            String str3 = string.length() != 0 ? string : "Android TV";
            String str4 = f13257c.format(date);
            m.d(str4, "format(...)");
            TVPairingRepository$PairingInsert tVPairingRepository$PairingInsert = new TVPairingRepository$PairingInsert(strO1, strC, str3, str4);
            PostgrestQueryBuilder postgrestQueryBuilderFrom = PostgrestKt.getPostgrest(this.f13258a).from("device_pairing_codes");
            List listI0 = P.i0(tVPairingRepository$PairingInsert);
            InsertRequestBuilder insertRequestBuilder = new InsertRequestBuilder(((Postgrest.Config) postgrestQueryBuilderFrom.getPostgrest().getConfig()).getPropertyConversionMethod());
            SupabaseSerializer serializer = postgrestQueryBuilderFrom.getPostgrest().getSerializer();
            p162s8.c cVar2 = d.f27387d;
            y yVar = y.f3222c;
            String strEncode = serializer.encode(B.b(List.class, i.v(B.a(TVPairingRepository$PairingInsert.class))), listI0);
            cVar2.getClass();
            kotlinx.serialization.json.a aVarH = l.h((b) cVar2.b(strEncode, b.Companion.serializer()));
            ArrayList arrayList = new ArrayList(p078i6.q.I0(aVarH, 10));
            Iterator it = aVarH.f24557h.iterator();
            while (it.hasNext()) {
                arrayList.add(l.i((b) it.next()).f24558h.keySet());
            }
            List listC1 = o.c1(p078i6.q.J0(arrayList));
            if (!listC1.isEmpty()) {
                insertRequestBuilder.getParams().put("columns", P.i0(o.o1(listC1, ",", null, null, null, 62)));
            }
            InsertRequest insertRequest = new InsertRequest(false, insertRequestBuilder.getReturning(), insertRequestBuilder.getCount(), false, insertRequestBuilder.getDefaultToNull(), aVarH, UtilsKt.mapToFirstValue(insertRequestBuilder.getParams()), postgrestQueryBuilderFrom.getSchema(), insertRequestBuilder.getHeaders().build(), 9, null);
            RestRequestExecutor restRequestExecutor = RestRequestExecutor.INSTANCE;
            Postgrest postgrest = postgrestQueryBuilderFrom.getPostgrest();
            String table = postgrestQueryBuilderFrom.getTable();
            a9.f13128h = this;
            a9.f13129i = strO1;
            a9.f13131l = 1;
            if (restRequestExecutor.execute(postgrest, table, insertRequest, a9) == aVar) {
                return aVar;
            }
            c9 = this;
            str = strO1;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = a9.f13129i;
            c9 = a9.f13128h;
            P.u0(obj);
        }
        Log.d("TVPairingRepository", "Inserted pairing code=" + str + " deviceId=" + q.p1(8, c9.c()));
        return str;
    }

    public final String c() {
        SharedPreferences sharedPreferences = this.f13259b;
        String string = sharedPreferences.getString("device_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        m.d(string2, "toString(...)");
        sharedPreferences.edit().putString("device_id", string2).apply();
        return string2;
    }
}
