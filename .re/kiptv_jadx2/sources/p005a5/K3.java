package p005a5;

import O7.q;
import com.kiptv.core.model.ContentTypeSettings;
import io.github.jan.supabase.auth.AuthImpl;
import io.github.jan.supabase.postgrest.query.filter.FilterOperator;
import io.github.jan.supabase.realtime.PostgresChangeFilter;
import io.sentry.TraceContext;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;
import p070h6.A;
import p078i6.C;
import p162s8.v;
import p194x6.j;

public final class K3 implements j {

    public final int f13577h;

    public final String f13578i;
    public final String j;

    public K3(String str, String str2, int i3) {
        this.f13577h = i3;
        this.f13578i = str;
        this.j = str2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f13577h) {
            case 0:
                ContentTypeSettings settings = (ContentTypeSettings) obj;
                m.e(settings, "settings");
                LinkedHashMap linkedHashMapZ0 = C.Z0(settings.f19695h);
                String str = this.f13578i;
                String str2 = this.j;
                if (str == null || q.N0(str)) {
                    linkedHashMapZ0.remove(str2);
                } else {
                    linkedHashMapZ0.put(str2, q.r1(str).toString());
                }
                return ContentTypeSettings.a(settings, null, null, null, null, null, null, null, linkedHashMapZ0, null, null, null, null, null, null, 16255);
            case 1:
                ContentTypeSettings settings2 = (ContentTypeSettings) obj;
                m.e(settings2, "settings");
                LinkedHashMap linkedHashMapZ1 = C.Z0(settings2.f19698l);
                String str3 = this.f13578i;
                String str4 = this.j;
                if (str3 == null || q.N0(str3)) {
                    linkedHashMapZ1.remove(str4);
                } else {
                    linkedHashMapZ1.put(str4, str3);
                }
                return ContentTypeSettings.a(settings2, null, null, null, null, null, null, null, null, null, null, null, linkedHashMapZ1, null, null, 14335);
            case 2:
                PostgresChangeFilter postgresChangeFlow = (PostgresChangeFilter) obj;
                m.e(postgresChangeFlow, "$this$postgresChangeFlow");
                postgresChangeFlow.setTable(this.f13578i);
                postgresChangeFlow.filter(TraceContext.JsonKeys.USER_ID, FilterOperator.EQ, this.j);
                return A.f22523a;
            case 3:
                ContentTypeSettings settings3 = (ContentTypeSettings) obj;
                m.e(settings3, "settings");
                LinkedHashMap linkedHashMapZ2 = C.Z0(settings3.f19697k);
                String str5 = this.f13578i;
                String str6 = this.j;
                if (str5 == null || q.N0(str5)) {
                    linkedHashMapZ2.remove(str6);
                } else {
                    linkedHashMapZ2.put(str6, str5);
                }
                return ContentTypeSettings.a(settings3, null, null, null, null, null, null, null, null, null, null, linkedHashMapZ2, null, null, null, 15359);
            case 4:
                return AuthImpl.resendEmail$lambda$17(this.f13578i, this.j, (v) obj);
            default:
                return AuthImpl.resendPhone$lambda$19(this.f13578i, this.j, (v) obj);
        }
    }
}
