package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K3 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f13578i;
    public final /* synthetic */ java.lang.String j;

    public /* synthetic */ K3(java.lang.String str, java.lang.String str2, int i3) {
        this.f13577h = i3;
        this.f13578i = str;
        this.j = str2;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f13577h) {
            case 0:
                com.kiptv.core.model.ContentTypeSettings settings = (com.kiptv.core.model.ContentTypeSettings) obj;
                kotlin.jvm.internal.m.e(settings, "settings");
                java.util.LinkedHashMap linkedHashMapZ0 = p078i6.C.Z0(settings.f19695h);
                java.lang.String str = this.f13578i;
                java.lang.String str2 = this.j;
                if (str == null || O7.q.N0(str)) {
                    linkedHashMapZ0.remove(str2);
                } else {
                    linkedHashMapZ0.put(str2, O7.q.r1(str).toString());
                }
                return com.kiptv.core.model.ContentTypeSettings.a(settings, null, null, null, null, null, null, null, linkedHashMapZ0, null, null, null, null, null, null, 16255);
            case 1:
                com.kiptv.core.model.ContentTypeSettings settings2 = (com.kiptv.core.model.ContentTypeSettings) obj;
                kotlin.jvm.internal.m.e(settings2, "settings");
                java.util.LinkedHashMap linkedHashMapZ1 = p078i6.C.Z0(settings2.f19698l);
                java.lang.String str3 = this.f13578i;
                java.lang.String str4 = this.j;
                if (str3 == null || O7.q.N0(str3)) {
                    linkedHashMapZ1.remove(str4);
                } else {
                    linkedHashMapZ1.put(str4, str3);
                }
                return com.kiptv.core.model.ContentTypeSettings.a(settings2, null, null, null, null, null, null, null, null, null, null, null, linkedHashMapZ1, null, null, 14335);
            case 2:
                io.github.jan.supabase.realtime.PostgresChangeFilter postgresChangeFlow = (io.github.jan.supabase.realtime.PostgresChangeFilter) obj;
                kotlin.jvm.internal.m.e(postgresChangeFlow, "$this$postgresChangeFlow");
                postgresChangeFlow.setTable(this.f13578i);
                postgresChangeFlow.filter(io.sentry.TraceContext.JsonKeys.USER_ID, io.github.jan.supabase.postgrest.query.filter.FilterOperator.EQ, this.j);
                return p070h6.A.f22523a;
            case 3:
                com.kiptv.core.model.ContentTypeSettings settings3 = (com.kiptv.core.model.ContentTypeSettings) obj;
                kotlin.jvm.internal.m.e(settings3, "settings");
                java.util.LinkedHashMap linkedHashMapZ2 = p078i6.C.Z0(settings3.f19697k);
                java.lang.String str5 = this.f13578i;
                java.lang.String str6 = this.j;
                if (str5 == null || O7.q.N0(str5)) {
                    linkedHashMapZ2.remove(str6);
                } else {
                    linkedHashMapZ2.put(str6, str5);
                }
                return com.kiptv.core.model.ContentTypeSettings.a(settings3, null, null, null, null, null, null, null, null, null, null, linkedHashMapZ2, null, null, null, 15359);
            case 4:
                return io.github.jan.supabase.auth.AuthImpl.resendEmail$lambda$17(this.f13578i, this.j, (p162s8.v) obj);
            default:
                return io.github.jan.supabase.auth.AuthImpl.resendPhone$lambda$19(this.f13578i, this.j, (p162s8.v) obj);
        }
    }
}
