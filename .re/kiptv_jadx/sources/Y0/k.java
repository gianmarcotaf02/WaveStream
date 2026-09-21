package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.o implements p194x6.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Y0.k f11044i = new Y0.k(2, 0);
    public static final Y0.k j = new Y0.k(2, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Y0.k f11045k = new Y0.k(2, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Y0.k f11046l = new Y0.k(2, 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Y0.k f11047m = new Y0.k(2, 4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Y0.k f11048n = new Y0.k(2, 5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Y0.k f11049o = new Y0.k(2, 6);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Y0.k f11050p = new Y0.k(2, 7);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Y0.k f11051q = new Y0.k(2, 8);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Y0.k f11052r = new Y0.k(2, 9);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Y0.k f11053s = new Y0.k(2, 10);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Y0.k f11054t = new Y0.k(2, 11);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Y0.k f11055u = new Y0.k(2, 12);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Y0.k f11056v = new Y0.k(2, 13);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Y0.k f11057w = new Y0.k(2, 14);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Y0.k f11058x = new Y0.k(2, 15);
    public static final Y0.k y = new Y0.k(2, 16);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Y0.k f11059z = new Y0.k(2, 17);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Y0.k f11041A = new Y0.k(2, 18);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Y0.k f11042B = new Y0.k(2, 19);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Y0.k f11043C = new Y0.k(2, 20);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i3, int i9) {
        super(i3);
        this.f11060h = i9;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        p070h6.e eVar;
        switch (this.f11060h) {
            case 0:
                java.util.Collection collection = (java.util.List) obj;
                java.util.List list = (java.util.List) obj2;
                if (collection == null) {
                    collection = p078i6.w.f23205h;
                }
                return p078i6.o.A1(collection, list);
            case 1:
                return (p145r0.d) obj;
            case 2:
                java.util.List list2 = (java.util.List) obj;
                java.util.List list3 = (java.util.List) obj2;
                if (list2 == null) {
                    return list3;
                }
                java.util.ArrayList arrayListO1 = p078i6.o.O1(list2);
                arrayListO1.addAll(list3);
                return arrayListO1;
            case 3:
                return (p145r0.n) obj;
            case 4:
                return (p145r0.f) obj;
            case 5:
                return (p070h6.A) obj;
            case 6:
                return (p070h6.A) obj;
            case 7:
                throw new java.lang.IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 8:
                throw new java.lang.IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 9:
                return (p070h6.A) obj;
            case 10:
                throw new java.lang.IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 11:
                Y0.i iVar = (Y0.i) obj;
                int i3 = ((Y0.i) obj2).f11038a;
                return iVar;
            case 12:
                return (p188x0.O) obj;
            case 13:
                return (java.lang.String) obj;
            case 14:
                java.util.List list4 = (java.util.List) obj;
                java.util.List list5 = (java.util.List) obj2;
                if (list4 == null) {
                    return list5;
                }
                java.util.ArrayList arrayListO2 = p078i6.o.O1(list4);
                arrayListO2.addAll(list5);
                return arrayListO2;
            case 15:
                java.lang.Float f9 = (java.lang.Float) obj;
                ((java.lang.Number) obj2).floatValue();
                return f9;
            case 16:
                return (java.lang.String) obj;
            case 17:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                ((java.lang.Boolean) obj2).booleanValue();
                return bool;
            case 18:
                Y0.a aVar = (Y0.a) obj;
                Y0.a aVar2 = (Y0.a) obj2;
                if (aVar == null || (str = aVar.f11024a) == null) {
                    str = aVar2.f11024a;
                }
                if (aVar == null || (eVar = aVar.f11025b) == null) {
                    eVar = aVar2.f11025b;
                }
                return new Y0.a(str, eVar);
            case 19:
                return obj == null ? obj2 : obj;
            default:
                Y0.p pVar = (Y0.p) obj2;
                androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = ((Y0.p) obj).f11094d;
                Y0.w wVar = Y0.t.f11136t;
                java.lang.Object objG = semanticsConfiguration.f15960h.g(wVar);
                if (objG == null) {
                    objG = java.lang.Float.valueOf(0.0f);
                }
                float fFloatValue = ((java.lang.Number) objG).floatValue();
                java.lang.Object objG2 = pVar.f11094d.f15960h.g(wVar);
                if (objG2 == null) {
                    objG2 = java.lang.Float.valueOf(0.0f);
                }
                return java.lang.Integer.valueOf(java.lang.Float.compare(fFloatValue, ((java.lang.Number) objG2).floatValue()));
        }
    }
}
