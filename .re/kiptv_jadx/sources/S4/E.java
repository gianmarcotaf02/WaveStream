package S4;

/* JADX INFO: loaded from: classes.dex */
public final class E implements java.util.Comparator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedHashMap f9309i;

    public /* synthetic */ E(java.util.LinkedHashMap linkedHashMap, int i3) {
        this.f9308h = i3;
        this.f9309i = linkedHashMap;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f9308h) {
            case 0:
                java.lang.String str = ((com.kiptv.core.model.XtreamCategory) obj).f20649a;
                java.util.LinkedHashMap linkedHashMap = this.f9309i;
                java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(str);
                int iIntValue = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
                java.lang.Integer num2 = (java.lang.Integer) linkedHashMap.get(((com.kiptv.core.model.XtreamCategory) obj2).f20649a);
                if (num2 != null) {
                    iIntValue = num2.intValue();
                }
                return com.google.crypto.tink.shaded.protobuf.q0.o(numValueOf, java.lang.Integer.valueOf(iIntValue));
            default:
                java.lang.String str2 = ((com.kiptv.core.model.XtreamCategory) obj).f20649a;
                java.util.LinkedHashMap linkedHashMap2 = this.f9309i;
                java.lang.Integer num3 = (java.lang.Integer) linkedHashMap2.get(str2);
                int iIntValue2 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(num3 != null ? num3.intValue() : Integer.MAX_VALUE);
                java.lang.Integer num4 = (java.lang.Integer) linkedHashMap2.get(((com.kiptv.core.model.XtreamCategory) obj2).f20649a);
                if (num4 != null) {
                    iIntValue2 = num4.intValue();
                }
                return com.google.crypto.tink.shaded.protobuf.q0.o(numValueOf2, java.lang.Integer.valueOf(iIntValue2));
        }
    }
}
