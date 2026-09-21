package I5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s2 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedHashMap f5356i;

    public /* synthetic */ s2(java.util.LinkedHashMap linkedHashMap, int i3) {
        this.f5355h = i3;
        this.f5356i = linkedHashMap;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Integer numZ0;
        java.lang.Integer num;
        switch (this.f5355h) {
            case 0:
                com.kiptv.core.model.WatchProgress watchProgress = (com.kiptv.core.model.WatchProgress) obj;
                java.lang.String str = watchProgress.g;
                if (str == null || (numZ0 = O7.x.z0(str)) == null) {
                    numZ0 = O7.x.z0(watchProgress.f20613d);
                }
                if (numZ0 != null) {
                    return (com.kiptv.core.model.XtreamSeries) this.f5356i.get(java.lang.Integer.valueOf(numZ0.intValue()));
                }
                return null;
            case 1:
                java.lang.Integer numZ1 = O7.x.z0(((com.kiptv.core.model.MyListItem) obj).f19875d);
                if (numZ1 != null) {
                    return (com.kiptv.core.model.XtreamSeries) this.f5356i.get(java.lang.Integer.valueOf(numZ1.intValue()));
                }
                return null;
            case 2:
                p078i6.z zVar = (p078i6.z) obj;
                kotlin.jvm.internal.m.e(zVar, "<destruct>");
                java.util.Iterator it = ((S4.p) zVar.f23209b).f9431c.iterator();
                if (it.hasNext()) {
                    java.lang.String strValueOf = java.lang.String.valueOf(((S4.C0867f) it.next()).f9387a.f20657d);
                    java.util.LinkedHashMap linkedHashMap = this.f5356i;
                    java.lang.Integer num2 = (java.lang.Integer) linkedHashMap.get(strValueOf);
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                    while (it.hasNext()) {
                        java.lang.Integer num3 = (java.lang.Integer) linkedHashMap.get(java.lang.String.valueOf(((S4.C0867f) it.next()).f9387a.f20657d));
                        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(num3 != null ? num3.intValue() : Integer.MAX_VALUE);
                        if (numValueOf.compareTo(numValueOf2) > 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    num = numValueOf;
                } else {
                    num = null;
                }
                return num != null ? num : java.lang.Integer.valueOf(androidx.media3.common.util.Log.LOG_LEVEL_OFF);
            case 3:
                java.lang.Integer num4 = (java.lang.Integer) obj;
                num4.getClass();
                S4.p pVar = (S4.p) this.f5356i.get(num4);
                if (pVar != null) {
                    return pVar.e();
                }
                return null;
            default:
                java.lang.Integer numZ2 = O7.x.z0(((com.kiptv.core.model.MyListItem) obj).f19875d);
                if (numZ2 != null) {
                    return (com.kiptv.core.model.XtreamVODStream) this.f5356i.get(java.lang.Integer.valueOf(numZ2.intValue()));
                }
                return null;
        }
    }
}
