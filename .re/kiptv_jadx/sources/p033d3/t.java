package p033d3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final android.util.SparseArray f21224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ p033d3.t[] f21225i;

    /* JADX INFO: Fake field, exist only in values array */
    p033d3.t EF1;

    static {
        p033d3.t tVar = new p033d3.t("UNKNOWN_MOBILE_SUBTYPE", 0);
        p033d3.t tVar2 = new p033d3.t("GPRS", 1);
        p033d3.t tVar3 = new p033d3.t("EDGE", 2);
        p033d3.t tVar4 = new p033d3.t("UMTS", 3);
        p033d3.t tVar5 = new p033d3.t("CDMA", 4);
        p033d3.t tVar6 = new p033d3.t("EVDO_0", 5);
        p033d3.t tVar7 = new p033d3.t("EVDO_A", 6);
        p033d3.t tVar8 = new p033d3.t("RTT", 7);
        p033d3.t tVar9 = new p033d3.t("HSDPA", 8);
        p033d3.t tVar10 = new p033d3.t("HSUPA", 9);
        p033d3.t tVar11 = new p033d3.t("HSPA", 10);
        p033d3.t tVar12 = new p033d3.t("IDEN", 11);
        p033d3.t tVar13 = new p033d3.t("EVDO_B", 12);
        p033d3.t tVar14 = new p033d3.t("LTE", 13);
        p033d3.t tVar15 = new p033d3.t("EHRPD", 14);
        p033d3.t tVar16 = new p033d3.t("HSPAP", 15);
        p033d3.t tVar17 = new p033d3.t("GSM", 16);
        p033d3.t tVar18 = new p033d3.t("TD_SCDMA", 17);
        p033d3.t tVar19 = new p033d3.t("IWLAN", 18);
        p033d3.t tVar20 = new p033d3.t("LTE_CA", 19);
        f21225i = new p033d3.t[]{tVar, tVar2, tVar3, tVar4, tVar5, tVar6, tVar7, tVar8, tVar9, tVar10, tVar11, tVar12, tVar13, tVar14, tVar15, tVar16, tVar17, tVar18, tVar19, tVar20, new p033d3.t("COMBINED", 20)};
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        f21224h = sparseArray;
        sparseArray.put(0, tVar);
        sparseArray.put(1, tVar2);
        sparseArray.put(2, tVar3);
        sparseArray.put(3, tVar4);
        sparseArray.put(4, tVar5);
        sparseArray.put(5, tVar6);
        sparseArray.put(6, tVar7);
        sparseArray.put(7, tVar8);
        sparseArray.put(8, tVar9);
        sparseArray.put(9, tVar10);
        sparseArray.put(10, tVar11);
        sparseArray.put(11, tVar12);
        sparseArray.put(12, tVar13);
        sparseArray.put(13, tVar14);
        sparseArray.put(14, tVar15);
        sparseArray.put(15, tVar16);
        sparseArray.put(16, tVar17);
        sparseArray.put(17, tVar18);
        sparseArray.put(18, tVar19);
        sparseArray.put(19, tVar20);
    }

    public static p033d3.t valueOf(java.lang.String str) {
        return (p033d3.t) java.lang.Enum.valueOf(p033d3.t.class, str);
    }

    public static p033d3.t[] values() {
        return (p033d3.t[]) f21225i.clone();
    }
}
