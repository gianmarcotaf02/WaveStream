package J5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t2 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6568h;

    public /* synthetic */ t2(int i3) {
        this.f6568h = i3;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x02b5  */
    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        p070h6.A a2 = p070h6.A.f22523a;
        boolean z6 = true;
        switch (this.f6568h) {
            case 0:
                com.kiptv.core.model.Playlist it = (com.kiptv.core.model.Playlist) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return it.f20033a;
            case 1:
                android.content.Context context = (android.content.Context) obj;
                java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new android.content.Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                java.util.ArrayList arrayList = new java.util.ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                for (int i3 = 0; i3 < size; i3++) {
                    android.content.pm.ResolveInfo resolveInfo = listQueryIntentActivities.get(i3);
                    android.content.pm.ResolveInfo resolveInfo2 = resolveInfo;
                    if (context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    } else {
                        android.content.pm.ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                return arrayList;
            case 2:
                N7.m it2 = (N7.m) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                return it2.iterator();
            case 3:
                java.lang.Iterable it3 = (java.lang.Iterable) obj;
                kotlin.jvm.internal.m.e(it3, "it");
                return it3.iterator();
            case 4:
                return java.lang.Boolean.valueOf(obj == null);
            case 5:
                N8.g entry = (N8.g) obj;
                kotlin.jvm.internal.m.e(entry, "entry");
                M8.A a9 = N8.f.f7484m;
                return java.lang.Boolean.valueOf(B3.o.e(entry.f7487a));
            case 6:
                kotlin.jvm.internal.m.e((N8.g) obj, "it");
                return java.lang.Boolean.TRUE;
            case 7:
                p162s8.h Json = (p162s8.h) obj;
                kotlin.jvm.internal.m.e(Json, "$this$Json");
                Json.f27399c = true;
                Json.f27400d = true;
                return a2;
            case 8:
                p162s8.h Json2 = (p162s8.h) obj;
                kotlin.jvm.internal.m.e(Json2, "$this$Json");
                Json2.f27399c = true;
                Json2.f27402f = true;
                Json2.f27400d = true;
                Json2.f27397a = true;
                Json2.f27398b = false;
                return a2;
            case 9:
                return a2;
            case 10:
                return a2;
            case 11:
                O7.j it4 = (O7.j) obj;
                kotlin.jvm.internal.m.e(it4, "it");
                return "H26" + ((O7.k) ((O7.m) it4).a()).get(1);
            case 12:
                com.kiptv.core.model.XtreamCategory it5 = (com.kiptv.core.model.XtreamCategory) obj;
                kotlin.jvm.internal.m.e(it5, "it");
                return it5.f20649a;
            case 13:
                p078i6.z zVar = (p078i6.z) obj;
                kotlin.jvm.internal.m.e(zVar, "<destruct>");
                return java.lang.Integer.valueOf(zVar.f23208a);
            case 14:
                java.lang.String s9 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(s9, "s");
                S4.K k9 = S4.K.f9329a;
                java.util.Iterator it6 = S4.K.f9330b.iterator();
                while (it6.hasNext()) {
                    if (O7.x.x0(s9, (java.lang.String) it6.next(), true)) {
                        return java.lang.Boolean.valueOf(z6);
                    }
                }
                z6 = false;
                return java.lang.Boolean.valueOf(z6);
            case 15:
                java.lang.String s10 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(s10, "s");
                S4.K k10 = S4.K.f9329a;
                java.util.Iterator it7 = S4.K.f9330b.iterator();
                while (it7.hasNext()) {
                    if (O7.x.q0(s10, (java.lang.String) it7.next(), true)) {
                        return java.lang.Boolean.valueOf(z6);
                    }
                }
                z6 = false;
                return java.lang.Boolean.valueOf(z6);
            case 16:
                java.lang.String s11 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(s11, "s");
                S4.K k11 = S4.K.f9329a;
                java.util.Iterator it8 = S4.K.f9331c.iterator();
                while (it8.hasNext()) {
                    if (O7.x.q0(s11, (java.lang.String) it8.next(), true)) {
                        return java.lang.Boolean.valueOf(z6);
                    }
                }
                z6 = false;
                return java.lang.Boolean.valueOf(z6);
            case 17:
                java.lang.String s12 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(s12, "s");
                return java.lang.Boolean.valueOf(O7.q.F0(s12, ']'));
            case 18:
                java.lang.String s13 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(s13, "s");
                S4.K k12 = S4.K.f9329a;
                return java.lang.Boolean.valueOf(s13.length() > 0 && java.lang.Character.isDigit(O7.q.O0(s13)) && O7.q.K0(s13, '-', 0, 6) >= 0);
            case 19:
                java.lang.String s14 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(s14, "s");
                return java.lang.Boolean.valueOf(O7.q.F0(s14, ')'));
            case 20:
                java.lang.String s15 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(s15, "s");
                return java.lang.Boolean.valueOf(O7.q.F0(s15, ')'));
            case 21:
                java.lang.String s16 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(s16, "s");
                S4.K k13 = S4.K.f9329a;
                java.util.Iterator it9 = S4.K.f9331c.iterator();
                while (it9.hasNext()) {
                    if (O7.x.x0(s16, (java.lang.String) it9.next(), true)) {
                        return java.lang.Boolean.valueOf(z6);
                    }
                }
                z6 = false;
                return java.lang.Boolean.valueOf(z6);
            case 22:
                java.lang.String s17 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(s17, "s");
                return java.lang.Boolean.valueOf(O7.q.f1(s17, '['));
            case 23:
                java.lang.String s18 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(s18, "s");
                return java.lang.Boolean.valueOf(s18.length() >= 4 && java.lang.Character.isDigit(s18.charAt(0)) && java.lang.Character.isDigit(s18.charAt(1)) && java.lang.Character.isDigit(s18.charAt(2)) && java.lang.Character.isDigit(s18.charAt(3)));
            case 24:
                java.lang.String s19 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(s19, "s");
                if (!O7.q.F0(s19, ')') && !O7.x.q0(s19, "4K", false)) {
                    z6 = false;
                }
                return java.lang.Boolean.valueOf(z6);
            case 25:
                java.lang.String s20 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(s20, "s");
                return java.lang.Boolean.valueOf(O7.x.q0(s20, "4K", false));
            case 26:
                java.lang.String s21 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(s21, "s");
                return java.lang.Boolean.valueOf(O7.x.q0(s21, "4K", false));
            case 27:
                p100l6.f fVar = (p100l6.f) obj;
                if (fVar instanceof S7.AbstractC0906w) {
                    return (S7.AbstractC0906w) fVar;
                }
                return null;
            case 28:
                p181w0.a aVar = (p181w0.a) obj;
                long j = aVar.f29744a;
                return (9223372034707292159L & j) != 9205357640488583168L ? new p163t.C2771o(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & aVar.f29744a))) : U.Q.f9933a;
            default:
                p163t.C2771o c2771o = (p163t.C2771o) obj;
                return new p181w0.a((((long) java.lang.Float.floatToRawIntBits(c2771o.f27655b)) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(c2771o.f27654a)) << 32));
        }
    }
}
