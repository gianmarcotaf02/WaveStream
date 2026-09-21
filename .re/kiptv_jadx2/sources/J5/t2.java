package J5;

import S7.AbstractC0906w;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.kiptv.core.model.Playlist;
import com.kiptv.core.model.XtreamCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p163t.C2771o;

public final class t2 implements p194x6.j {

    public final int f6568h;

    public t2(int i3) {
        this.f6568h = i3;
    }

    @Override
    public final Object invoke(Object obj) {
        String str;
        p070h6.A a2 = p070h6.A.f22523a;
        boolean z6 = true;
        switch (this.f6568h) {
            case 0:
                Playlist it = (Playlist) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return it.f20033a;
            case 1:
                Context context = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i3);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    } else {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
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
                Iterable it3 = (Iterable) obj;
                kotlin.jvm.internal.m.e(it3, "it");
                return it3.iterator();
            case 4:
                return Boolean.valueOf(obj == null);
            case 5:
                N8.g entry = (N8.g) obj;
                kotlin.jvm.internal.m.e(entry, "entry");
                M8.A a9 = N8.f.f7484m;
                return Boolean.valueOf(B3.o.e(entry.f7487a));
            case 6:
                kotlin.jvm.internal.m.e((N8.g) obj, "it");
                return Boolean.TRUE;
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
                XtreamCategory it5 = (XtreamCategory) obj;
                kotlin.jvm.internal.m.e(it5, "it");
                return it5.f20649a;
            case 13:
                p078i6.z zVar = (p078i6.z) obj;
                kotlin.jvm.internal.m.e(zVar, "<destruct>");
                return Integer.valueOf(zVar.f23208a);
            case 14:
                String s9 = (String) obj;
                kotlin.jvm.internal.m.e(s9, "s");
                S4.K k9 = S4.K.f9329a;
                Iterator it6 = S4.K.f9330b.iterator();
                while (it6.hasNext()) {
                    if (O7.x.x0(s9, (String) it6.next(), true)) {
                        return Boolean.valueOf(z6);
                    }
                }
                z6 = false;
                return Boolean.valueOf(z6);
            case 15:
                String s10 = (String) obj;
                kotlin.jvm.internal.m.e(s10, "s");
                S4.K k10 = S4.K.f9329a;
                Iterator it7 = S4.K.f9330b.iterator();
                while (it7.hasNext()) {
                    if (O7.x.q0(s10, (String) it7.next(), true)) {
                        return Boolean.valueOf(z6);
                    }
                }
                z6 = false;
                return Boolean.valueOf(z6);
            case 16:
                String s11 = (String) obj;
                kotlin.jvm.internal.m.e(s11, "s");
                S4.K k11 = S4.K.f9329a;
                Iterator it8 = S4.K.f9331c.iterator();
                while (it8.hasNext()) {
                    if (O7.x.q0(s11, (String) it8.next(), true)) {
                        return Boolean.valueOf(z6);
                    }
                }
                z6 = false;
                return Boolean.valueOf(z6);
            case 17:
                String s12 = (String) obj;
                kotlin.jvm.internal.m.e(s12, "s");
                return Boolean.valueOf(O7.q.F0(s12, ']'));
            case 18:
                String s13 = (String) obj;
                kotlin.jvm.internal.m.e(s13, "s");
                S4.K k12 = S4.K.f9329a;
                return Boolean.valueOf(s13.length() > 0 && Character.isDigit(O7.q.O0(s13)) && O7.q.K0(s13, '-', 0, 6) >= 0);
            case 19:
                String s14 = (String) obj;
                kotlin.jvm.internal.m.e(s14, "s");
                return Boolean.valueOf(O7.q.F0(s14, ')'));
            case 20:
                String s15 = (String) obj;
                kotlin.jvm.internal.m.e(s15, "s");
                return Boolean.valueOf(O7.q.F0(s15, ')'));
            case 21:
                String s16 = (String) obj;
                kotlin.jvm.internal.m.e(s16, "s");
                S4.K k13 = S4.K.f9329a;
                Iterator it9 = S4.K.f9331c.iterator();
                while (it9.hasNext()) {
                    if (O7.x.x0(s16, (String) it9.next(), true)) {
                        return Boolean.valueOf(z6);
                    }
                }
                z6 = false;
                return Boolean.valueOf(z6);
            case 22:
                String s17 = (String) obj;
                kotlin.jvm.internal.m.e(s17, "s");
                return Boolean.valueOf(O7.q.f1(s17, '['));
            case 23:
                String s18 = (String) obj;
                kotlin.jvm.internal.m.e(s18, "s");
                return Boolean.valueOf(s18.length() >= 4 && Character.isDigit(s18.charAt(0)) && Character.isDigit(s18.charAt(1)) && Character.isDigit(s18.charAt(2)) && Character.isDigit(s18.charAt(3)));
            case 24:
                String s19 = (String) obj;
                kotlin.jvm.internal.m.e(s19, "s");
                if (!O7.q.F0(s19, ')') && !O7.x.q0(s19, "4K", false)) {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 25:
                String s20 = (String) obj;
                kotlin.jvm.internal.m.e(s20, "s");
                return Boolean.valueOf(O7.x.q0(s20, "4K", false));
            case 26:
                String s21 = (String) obj;
                kotlin.jvm.internal.m.e(s21, "s");
                return Boolean.valueOf(O7.x.q0(s21, "4K", false));
            case 27:
                p100l6.f fVar = (p100l6.f) obj;
                if (fVar instanceof AbstractC0906w) {
                    return (AbstractC0906w) fVar;
                }
                return null;
            case 28:
                p181w0.a aVar = (p181w0.a) obj;
                long j = aVar.f29744a;
                return (9223372034707292159L & j) != 9205357640488583168L ? new C2771o(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & aVar.f29744a))) : U.Q.f9933a;
            default:
                C2771o c2771o = (C2771o) obj;
                return new p181w0.a((((long) Float.floatToRawIntBits(c2771o.f27655b)) & 4294967295L) | (((long) Float.floatToRawIntBits(c2771o.f27654a)) << 32));
        }
    }
}
