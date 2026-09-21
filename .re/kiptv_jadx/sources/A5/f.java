package A5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f257i;

    public /* synthetic */ f(boolean z6, int i3) {
        this.f256h = i3;
        this.f257i = z6;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f256h) {
            case 0:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                if (!this.f257i) {
                    iIntValue = -iIntValue;
                }
                return java.lang.Integer.valueOf(iIntValue / 3);
            case 1:
                int iIntValue2 = ((java.lang.Integer) obj).intValue();
                if (this.f257i) {
                    iIntValue2 = -iIntValue2;
                }
                return java.lang.Integer.valueOf(iIntValue2 / 3);
            case 2:
                p175v0.r focusProperties = (p175v0.r) obj;
                kotlin.jvm.internal.m.e(focusProperties, "$this$focusProperties");
                focusProperties.e(!this.f257i);
                return p070h6.A.f22523a;
            case 3:
                int iIntValue3 = ((java.lang.Integer) obj).intValue();
                if (!this.f257i) {
                    iIntValue3 = -iIntValue3;
                }
                return java.lang.Integer.valueOf(iIntValue3 / 8);
            case 4:
                int iIntValue4 = ((java.lang.Integer) obj).intValue();
                if (this.f257i) {
                    iIntValue4 = -iIntValue4;
                }
                return java.lang.Integer.valueOf(iIntValue4 / 8);
            case 5:
                com.kiptv.core.model.PlaylistSettings it = (com.kiptv.core.model.PlaylistSettings) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return com.kiptv.core.model.PlaylistSettings.a(it, false, this.f257i, null, false, 0, 0, null, null, false, 131055);
            case 6:
                com.kiptv.core.model.PlaylistSettings it2 = (com.kiptv.core.model.PlaylistSettings) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                return com.kiptv.core.model.PlaylistSettings.a(it2, false, false, null, this.f257i, 0, 0, null, null, false, 130559);
            case 7:
                com.kiptv.core.model.PlaylistSettings it3 = (com.kiptv.core.model.PlaylistSettings) obj;
                kotlin.jvm.internal.m.e(it3, "it");
                return com.kiptv.core.model.PlaylistSettings.a(it3, false, false, null, false, 0, 0, null, null, this.f257i, 114687);
            case 8:
                com.kiptv.core.model.PlaylistSettings it4 = (com.kiptv.core.model.PlaylistSettings) obj;
                kotlin.jvm.internal.m.e(it4, "it");
                return com.kiptv.core.model.PlaylistSettings.a(it4, this.f257i, false, null, false, 0, 0, null, null, false, 131063);
            case 9:
                com.kiptv.core.model.UserSettings it5 = (com.kiptv.core.model.UserSettings) obj;
                kotlin.jvm.internal.m.e(it5, "it");
                it5.j = this.f257i;
                return it5;
            case 10:
                com.kiptv.core.model.UserSettings it6 = (com.kiptv.core.model.UserSettings) obj;
                kotlin.jvm.internal.m.e(it6, "it");
                it6.f20583f = this.f257i;
                return it6;
            case 11:
                com.kiptv.core.model.LocalDeviceSettings it7 = (com.kiptv.core.model.LocalDeviceSettings) obj;
                kotlin.jvm.internal.m.e(it7, "it");
                it7.f19825c = this.f257i;
                return it7;
            case 12:
                com.kiptv.core.model.LocalDeviceSettings it8 = (com.kiptv.core.model.LocalDeviceSettings) obj;
                kotlin.jvm.internal.m.e(it8, "it");
                it8.f19826d = this.f257i;
                return it8;
            case 13:
                com.kiptv.core.model.LocalDeviceSettings it9 = (com.kiptv.core.model.LocalDeviceSettings) obj;
                kotlin.jvm.internal.m.e(it9, "it");
                it9.f19841u = this.f257i;
                return it9;
            case 14:
                com.kiptv.core.model.LocalDeviceSettings it10 = (com.kiptv.core.model.LocalDeviceSettings) obj;
                kotlin.jvm.internal.m.e(it10, "it");
                it10.f19835o = this.f257i;
                return it10;
            case 15:
                com.kiptv.core.model.TraktAccountRow it11 = (com.kiptv.core.model.TraktAccountRow) obj;
                kotlin.jvm.internal.m.e(it11, "it");
                return com.kiptv.core.model.TraktAccountRow.a(it11, null, null, null, false, false, false, this.f257i, false, null, null, 31743);
            case 16:
                com.kiptv.core.model.TraktAccountRow it12 = (com.kiptv.core.model.TraktAccountRow) obj;
                kotlin.jvm.internal.m.e(it12, "it");
                return com.kiptv.core.model.TraktAccountRow.a(it12, null, null, null, false, this.f257i, false, false, false, null, null, 32511);
            case 17:
                com.kiptv.core.model.TraktAccountRow it13 = (com.kiptv.core.model.TraktAccountRow) obj;
                kotlin.jvm.internal.m.e(it13, "it");
                return com.kiptv.core.model.TraktAccountRow.a(it13, null, null, null, false, false, false, false, this.f257i, null, null, 30719);
            case 18:
                com.kiptv.core.model.TraktAccountRow it14 = (com.kiptv.core.model.TraktAccountRow) obj;
                kotlin.jvm.internal.m.e(it14, "it");
                return com.kiptv.core.model.TraktAccountRow.a(it14, null, null, null, this.f257i, false, false, false, false, null, null, 32639);
            case 19:
                com.kiptv.core.model.TraktAccountRow it15 = (com.kiptv.core.model.TraktAccountRow) obj;
                kotlin.jvm.internal.m.e(it15, "it");
                return com.kiptv.core.model.TraktAccountRow.a(it15, null, null, null, false, false, this.f257i, false, false, null, null, 32255);
            case 20:
                return io.github.jan.supabase.storage.BucketApiImpl.changePublicStatusTo$lambda$22(this.f257i, (io.github.jan.supabase.storage.BucketBuilder) obj);
            case 21:
                return java.lang.Boolean.valueOf(io.ktor.http.CookieKt.parseClientCookiesHeader$lambda$5(this.f257i, (p070h6.k) obj));
            case 22:
                p188x0.L graphicsLayer = (p188x0.L) obj;
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.b(this.f257i ? 0.5f : 1.0f);
                return p070h6.A.f22523a;
            case 23:
                int iIntValue5 = ((java.lang.Integer) obj).intValue();
                if (!this.f257i) {
                    iIntValue5 = -iIntValue5;
                }
                return java.lang.Integer.valueOf(iIntValue5);
            case 24:
                int iIntValue6 = ((java.lang.Integer) obj).intValue();
                if (!this.f257i) {
                    iIntValue6 = -iIntValue6;
                }
                return java.lang.Integer.valueOf(iIntValue6);
            case 25:
                int iIntValue7 = ((java.lang.Integer) obj).intValue();
                if (!this.f257i) {
                    iIntValue7 = -iIntValue7;
                }
                return java.lang.Integer.valueOf(iIntValue7);
            default:
                int iIntValue8 = ((java.lang.Integer) obj).intValue();
                if (!this.f257i) {
                    iIntValue8 = -iIntValue8;
                }
                return java.lang.Integer.valueOf(iIntValue8);
        }
    }
}
