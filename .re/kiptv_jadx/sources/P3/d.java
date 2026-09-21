package P3;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static java.lang.Boolean f8109c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static java.lang.String f8110d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f8111e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f8112f = -1;
    public static java.lang.Boolean g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static P3.h f8115k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static P3.i f8116l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f8117a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.lang.ThreadLocal f8113h = new java.lang.ThreadLocal();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final B4.a f8114i = new B4.a(7);
    public static final B3.o j = new B3.o(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B3.o f8108b = new B3.o(21);

    public d(android.content.Context context) {
        this.f8117a = context;
    }

    public static int a(android.content.Context context, java.lang.String str) {
        try {
            java.lang.ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            java.lang.Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            java.lang.reflect.Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            java.lang.reflect.Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (H3.q.j(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            java.lang.String strValueOf = java.lang.String.valueOf(declaredField.get(null));
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(strValueOf.length() + 50 + str.length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            android.util.Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (java.lang.ClassNotFoundException unused) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(str.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            android.util.Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (java.lang.Exception e6) {
            android.util.Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(java.lang.String.valueOf(e6.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0234 A[Catch: all -> 0x0151, b -> 0x0154, RemoteException -> 0x0157, TryCatch #7 {b -> 0x0154, RemoteException -> 0x0157, all -> 0x0151, blocks: (B:34:0x00db, B:40:0x00e7, B:42:0x00ee, B:43:0x0110, B:47:0x0116, B:49:0x011e, B:51:0x0122, B:52:0x0130, B:59:0x013b, B:67:0x016f, B:69:0x0177, B:70:0x017e, B:71:0x0185, B:66:0x015a, B:74:0x0188, B:75:0x0189, B:76:0x0190, B:77:0x0191, B:78:0x0198, B:81:0x019b, B:82:0x019c, B:84:0x01c2, B:86:0x01d5, B:88:0x01dd, B:95:0x021d, B:97:0x0223, B:98:0x022c, B:99:0x0233, B:89:0x01f0, B:90:0x01f7, B:93:0x01fc, B:94:0x020d, B:100:0x0234, B:101:0x023b, B:102:0x023c, B:103:0x0243, B:109:0x024f), top: B:158:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:102:0x023c A[Catch: all -> 0x0151, b -> 0x0154, RemoteException -> 0x0157, TryCatch #7 {b -> 0x0154, RemoteException -> 0x0157, all -> 0x0151, blocks: (B:34:0x00db, B:40:0x00e7, B:42:0x00ee, B:43:0x0110, B:47:0x0116, B:49:0x011e, B:51:0x0122, B:52:0x0130, B:59:0x013b, B:67:0x016f, B:69:0x0177, B:70:0x017e, B:71:0x0185, B:66:0x015a, B:74:0x0188, B:75:0x0189, B:76:0x0190, B:77:0x0191, B:78:0x0198, B:81:0x019b, B:82:0x019c, B:84:0x01c2, B:86:0x01d5, B:88:0x01dd, B:95:0x021d, B:97:0x0223, B:98:0x022c, B:99:0x0233, B:89:0x01f0, B:90:0x01f7, B:93:0x01fc, B:94:0x020d, B:100:0x0234, B:101:0x023b, B:102:0x023c, B:103:0x0243, B:109:0x024f), top: B:158:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0246 A[Catch: all -> 0x0244, TRY_ENTER, TryCatch #3 {, blocks: (B:35:0x00dc, B:37:0x00e2, B:38:0x00e4, B:106:0x0246, B:107:0x024d), top: B:152:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:127:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:128:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d2 A[Catch: all -> 0x00a0, TryCatch #1 {all -> 0x00a0, blocks: (B:5:0x0038, B:9:0x0099, B:16:0x00a5, B:19:0x00ab, B:32:0x00d7, B:110:0x0250, B:111:0x0257, B:114:0x025a, B:115:0x025b, B:116:0x0262, B:117:0x0263, B:119:0x028b, B:121:0x0296, B:122:0x0298, B:124:0x029c, B:134:0x02ca, B:135:0x02d1, B:136:0x02d2, B:137:0x02f2, B:138:0x02f3, B:139:0x0335), top: B:151:0x0038, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00ab A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #1 {all -> 0x00a0, blocks: (B:5:0x0038, B:9:0x0099, B:16:0x00a5, B:19:0x00ab, B:32:0x00d7, B:110:0x0250, B:111:0x0257, B:114:0x025a, B:115:0x025b, B:116:0x0262, B:117:0x0263, B:119:0x028b, B:121:0x0296, B:122:0x0298, B:124:0x029c, B:134:0x02ca, B:135:0x02d1, B:136:0x02d2, B:137:0x02f2, B:138:0x02f3, B:139:0x0335), top: B:151:0x0038, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:26:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e2 A[Catch: all -> 0x0244, TryCatch #3 {, blocks: (B:35:0x00dc, B:37:0x00e2, B:38:0x00e4, B:106:0x0246, B:107:0x024d), top: B:152:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e7 A[Catch: all -> 0x0151, b -> 0x0154, RemoteException -> 0x0157, TRY_ENTER, TryCatch #7 {b -> 0x0154, RemoteException -> 0x0157, all -> 0x0151, blocks: (B:34:0x00db, B:40:0x00e7, B:42:0x00ee, B:43:0x0110, B:47:0x0116, B:49:0x011e, B:51:0x0122, B:52:0x0130, B:59:0x013b, B:67:0x016f, B:69:0x0177, B:70:0x017e, B:71:0x0185, B:66:0x015a, B:74:0x0188, B:75:0x0189, B:76:0x0190, B:77:0x0191, B:78:0x0198, B:81:0x019b, B:82:0x019c, B:84:0x01c2, B:86:0x01d5, B:88:0x01dd, B:95:0x021d, B:97:0x0223, B:98:0x022c, B:99:0x0233, B:89:0x01f0, B:90:0x01f7, B:93:0x01fc, B:94:0x020d, B:100:0x0234, B:101:0x023b, B:102:0x023c, B:103:0x0243, B:109:0x024f), top: B:158:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ee A[Catch: all -> 0x0151, b -> 0x0154, RemoteException -> 0x0157, TryCatch #7 {b -> 0x0154, RemoteException -> 0x0157, all -> 0x0151, blocks: (B:34:0x00db, B:40:0x00e7, B:42:0x00ee, B:43:0x0110, B:47:0x0116, B:49:0x011e, B:51:0x0122, B:52:0x0130, B:59:0x013b, B:67:0x016f, B:69:0x0177, B:70:0x017e, B:71:0x0185, B:66:0x015a, B:74:0x0188, B:75:0x0189, B:76:0x0190, B:77:0x0191, B:78:0x0198, B:81:0x019b, B:82:0x019c, B:84:0x01c2, B:86:0x01d5, B:88:0x01dd, B:95:0x021d, B:97:0x0223, B:98:0x022c, B:99:0x0233, B:89:0x01f0, B:90:0x01f7, B:93:0x01fc, B:94:0x020d, B:100:0x0234, B:101:0x023b, B:102:0x023c, B:103:0x0243, B:109:0x024f), top: B:158:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0116 A[Catch: all -> 0x0151, b -> 0x0154, RemoteException -> 0x0157, TRY_ENTER, TryCatch #7 {b -> 0x0154, RemoteException -> 0x0157, all -> 0x0151, blocks: (B:34:0x00db, B:40:0x00e7, B:42:0x00ee, B:43:0x0110, B:47:0x0116, B:49:0x011e, B:51:0x0122, B:52:0x0130, B:59:0x013b, B:67:0x016f, B:69:0x0177, B:70:0x017e, B:71:0x0185, B:66:0x015a, B:74:0x0188, B:75:0x0189, B:76:0x0190, B:77:0x0191, B:78:0x0198, B:81:0x019b, B:82:0x019c, B:84:0x01c2, B:86:0x01d5, B:88:0x01dd, B:95:0x021d, B:97:0x0223, B:98:0x022c, B:99:0x0233, B:89:0x01f0, B:90:0x01f7, B:93:0x01fc, B:94:0x020d, B:100:0x0234, B:101:0x023b, B:102:0x023c, B:103:0x0243, B:109:0x024f), top: B:158:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0191 A[Catch: all -> 0x0151, b -> 0x0154, RemoteException -> 0x0157, TryCatch #7 {b -> 0x0154, RemoteException -> 0x0157, all -> 0x0151, blocks: (B:34:0x00db, B:40:0x00e7, B:42:0x00ee, B:43:0x0110, B:47:0x0116, B:49:0x011e, B:51:0x0122, B:52:0x0130, B:59:0x013b, B:67:0x016f, B:69:0x0177, B:70:0x017e, B:71:0x0185, B:66:0x015a, B:74:0x0188, B:75:0x0189, B:76:0x0190, B:77:0x0191, B:78:0x0198, B:81:0x019b, B:82:0x019c, B:84:0x01c2, B:86:0x01d5, B:88:0x01dd, B:95:0x021d, B:97:0x0223, B:98:0x022c, B:99:0x0233, B:89:0x01f0, B:90:0x01f7, B:93:0x01fc, B:94:0x020d, B:100:0x0234, B:101:0x023b, B:102:0x023c, B:103:0x0243, B:109:0x024f), top: B:158:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:82:0x019c A[Catch: all -> 0x0151, b -> 0x0154, RemoteException -> 0x0157, TryCatch #7 {b -> 0x0154, RemoteException -> 0x0157, all -> 0x0151, blocks: (B:34:0x00db, B:40:0x00e7, B:42:0x00ee, B:43:0x0110, B:47:0x0116, B:49:0x011e, B:51:0x0122, B:52:0x0130, B:59:0x013b, B:67:0x016f, B:69:0x0177, B:70:0x017e, B:71:0x0185, B:66:0x015a, B:74:0x0188, B:75:0x0189, B:76:0x0190, B:77:0x0191, B:78:0x0198, B:81:0x019b, B:82:0x019c, B:84:0x01c2, B:86:0x01d5, B:88:0x01dd, B:95:0x021d, B:97:0x0223, B:98:0x022c, B:99:0x0233, B:89:0x01f0, B:90:0x01f7, B:93:0x01fc, B:94:0x020d, B:100:0x0234, B:101:0x023b, B:102:0x023c, B:103:0x0243, B:109:0x024f), top: B:158:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01c2 A[Catch: all -> 0x0151, b -> 0x0154, RemoteException -> 0x0157, TryCatch #7 {b -> 0x0154, RemoteException -> 0x0157, all -> 0x0151, blocks: (B:34:0x00db, B:40:0x00e7, B:42:0x00ee, B:43:0x0110, B:47:0x0116, B:49:0x011e, B:51:0x0122, B:52:0x0130, B:59:0x013b, B:67:0x016f, B:69:0x0177, B:70:0x017e, B:71:0x0185, B:66:0x015a, B:74:0x0188, B:75:0x0189, B:76:0x0190, B:77:0x0191, B:78:0x0198, B:81:0x019b, B:82:0x019c, B:84:0x01c2, B:86:0x01d5, B:88:0x01dd, B:95:0x021d, B:97:0x0223, B:98:0x022c, B:99:0x0233, B:89:0x01f0, B:90:0x01f7, B:93:0x01fc, B:94:0x020d, B:100:0x0234, B:101:0x023b, B:102:0x023c, B:103:0x0243, B:109:0x024f), top: B:158:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01d5 A[Catch: all -> 0x0151, b -> 0x0154, RemoteException -> 0x0157, TryCatch #7 {b -> 0x0154, RemoteException -> 0x0157, all -> 0x0151, blocks: (B:34:0x00db, B:40:0x00e7, B:42:0x00ee, B:43:0x0110, B:47:0x0116, B:49:0x011e, B:51:0x0122, B:52:0x0130, B:59:0x013b, B:67:0x016f, B:69:0x0177, B:70:0x017e, B:71:0x0185, B:66:0x015a, B:74:0x0188, B:75:0x0189, B:76:0x0190, B:77:0x0191, B:78:0x0198, B:81:0x019b, B:82:0x019c, B:84:0x01c2, B:86:0x01d5, B:88:0x01dd, B:95:0x021d, B:97:0x0223, B:98:0x022c, B:99:0x0233, B:89:0x01f0, B:90:0x01f7, B:93:0x01fc, B:94:0x020d, B:100:0x0234, B:101:0x023b, B:102:0x023c, B:103:0x0243, B:109:0x024f), top: B:158:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01dd A[Catch: all -> 0x0151, b -> 0x0154, RemoteException -> 0x0157, TryCatch #7 {b -> 0x0154, RemoteException -> 0x0157, all -> 0x0151, blocks: (B:34:0x00db, B:40:0x00e7, B:42:0x00ee, B:43:0x0110, B:47:0x0116, B:49:0x011e, B:51:0x0122, B:52:0x0130, B:59:0x013b, B:67:0x016f, B:69:0x0177, B:70:0x017e, B:71:0x0185, B:66:0x015a, B:74:0x0188, B:75:0x0189, B:76:0x0190, B:77:0x0191, B:78:0x0198, B:81:0x019b, B:82:0x019c, B:84:0x01c2, B:86:0x01d5, B:88:0x01dd, B:95:0x021d, B:97:0x0223, B:98:0x022c, B:99:0x0233, B:89:0x01f0, B:90:0x01f7, B:93:0x01fc, B:94:0x020d, B:100:0x0234, B:101:0x023b, B:102:0x023c, B:103:0x0243, B:109:0x024f), top: B:158:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01f0 A[Catch: all -> 0x0151, b -> 0x0154, RemoteException -> 0x0157, TryCatch #7 {b -> 0x0154, RemoteException -> 0x0157, all -> 0x0151, blocks: (B:34:0x00db, B:40:0x00e7, B:42:0x00ee, B:43:0x0110, B:47:0x0116, B:49:0x011e, B:51:0x0122, B:52:0x0130, B:59:0x013b, B:67:0x016f, B:69:0x0177, B:70:0x017e, B:71:0x0185, B:66:0x015a, B:74:0x0188, B:75:0x0189, B:76:0x0190, B:77:0x0191, B:78:0x0198, B:81:0x019b, B:82:0x019c, B:84:0x01c2, B:86:0x01d5, B:88:0x01dd, B:95:0x021d, B:97:0x0223, B:98:0x022c, B:99:0x0233, B:89:0x01f0, B:90:0x01f7, B:93:0x01fc, B:94:0x020d, B:100:0x0234, B:101:0x023b, B:102:0x023c, B:103:0x0243, B:109:0x024f), top: B:158:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fc A[Catch: all -> 0x0151, b -> 0x0154, RemoteException -> 0x0157, TryCatch #7 {b -> 0x0154, RemoteException -> 0x0157, all -> 0x0151, blocks: (B:34:0x00db, B:40:0x00e7, B:42:0x00ee, B:43:0x0110, B:47:0x0116, B:49:0x011e, B:51:0x0122, B:52:0x0130, B:59:0x013b, B:67:0x016f, B:69:0x0177, B:70:0x017e, B:71:0x0185, B:66:0x015a, B:74:0x0188, B:75:0x0189, B:76:0x0190, B:77:0x0191, B:78:0x0198, B:81:0x019b, B:82:0x019c, B:84:0x01c2, B:86:0x01d5, B:88:0x01dd, B:95:0x021d, B:97:0x0223, B:98:0x022c, B:99:0x0233, B:89:0x01f0, B:90:0x01f7, B:93:0x01fc, B:94:0x020d, B:100:0x0234, B:101:0x023b, B:102:0x023c, B:103:0x0243, B:109:0x024f), top: B:158:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:94:0x020d A[Catch: all -> 0x0151, b -> 0x0154, RemoteException -> 0x0157, TryCatch #7 {b -> 0x0154, RemoteException -> 0x0157, all -> 0x0151, blocks: (B:34:0x00db, B:40:0x00e7, B:42:0x00ee, B:43:0x0110, B:47:0x0116, B:49:0x011e, B:51:0x0122, B:52:0x0130, B:59:0x013b, B:67:0x016f, B:69:0x0177, B:70:0x017e, B:71:0x0185, B:66:0x015a, B:74:0x0188, B:75:0x0189, B:76:0x0190, B:77:0x0191, B:78:0x0198, B:81:0x019b, B:82:0x019c, B:84:0x01c2, B:86:0x01d5, B:88:0x01dd, B:95:0x021d, B:97:0x0223, B:98:0x022c, B:99:0x0233, B:89:0x01f0, B:90:0x01f7, B:93:0x01fc, B:94:0x020d, B:100:0x0234, B:101:0x023b, B:102:0x023c, B:103:0x0243, B:109:0x024f), top: B:158:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0223 A[Catch: all -> 0x0151, b -> 0x0154, RemoteException -> 0x0157, TryCatch #7 {b -> 0x0154, RemoteException -> 0x0157, all -> 0x0151, blocks: (B:34:0x00db, B:40:0x00e7, B:42:0x00ee, B:43:0x0110, B:47:0x0116, B:49:0x011e, B:51:0x0122, B:52:0x0130, B:59:0x013b, B:67:0x016f, B:69:0x0177, B:70:0x017e, B:71:0x0185, B:66:0x015a, B:74:0x0188, B:75:0x0189, B:76:0x0190, B:77:0x0191, B:78:0x0198, B:81:0x019b, B:82:0x019c, B:84:0x01c2, B:86:0x01d5, B:88:0x01dd, B:95:0x021d, B:97:0x0223, B:98:0x022c, B:99:0x0233, B:89:0x01f0, B:90:0x01f7, B:93:0x01fc, B:94:0x020d, B:100:0x0234, B:101:0x023b, B:102:0x023c, B:103:0x0243, B:109:0x024f), top: B:158:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:98:0x022c A[Catch: all -> 0x0151, b -> 0x0154, RemoteException -> 0x0157, TryCatch #7 {b -> 0x0154, RemoteException -> 0x0157, all -> 0x0151, blocks: (B:34:0x00db, B:40:0x00e7, B:42:0x00ee, B:43:0x0110, B:47:0x0116, B:49:0x011e, B:51:0x0122, B:52:0x0130, B:59:0x013b, B:67:0x016f, B:69:0x0177, B:70:0x017e, B:71:0x0185, B:66:0x015a, B:74:0x0188, B:75:0x0189, B:76:0x0190, B:77:0x0191, B:78:0x0198, B:81:0x019b, B:82:0x019c, B:84:0x01c2, B:86:0x01d5, B:88:0x01dd, B:95:0x021d, B:97:0x0223, B:98:0x022c, B:99:0x0233, B:89:0x01f0, B:90:0x01f7, B:93:0x01fc, B:94:0x020d, B:100:0x0234, B:101:0x023b, B:102:0x023c, B:103:0x0243, B:109:0x024f), top: B:158:0x00db }] */
    public static P3.d b(android.content.Context context, B3.o oVar) throws P3.b {
        P3.d dVar;
        android.database.Cursor cursor;
        int i3;
        java.lang.Boolean bool;
        P3.h hVarF;
        int i9;
        O3.a aVarF0;
        java.lang.Object objE0;
        P3.g gVar;
        P3.i iVar;
        P3.g gVar2;
        boolean z6;
        O3.a aVarF1;
        android.database.Cursor cursor2;
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new P3.b("null application Context");
        }
        java.lang.ThreadLocal threadLocal = f8113h;
        P3.g gVar3 = (P3.g) threadLocal.get();
        P3.g gVar4 = new P3.g();
        threadLocal.set(gVar4);
        B4.a aVar = f8114i;
        java.lang.Long l2 = (java.lang.Long) aVar.get();
        long jLongValue = l2.longValue();
        try {
            aVar.set(java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis()));
            P3.c cVarS = oVar.s(context, j);
            int i10 = cVarS.f8105a;
            int i11 = cVarS.f8106b;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(46 + 26 + java.lang.String.valueOf(i10).length() + 19 + 46 + 1 + java.lang.String.valueOf(i11).length());
            sb.append("Considering local module com.google.android.gms.cast.framework.dynamite:");
            sb.append(i10);
            sb.append(" and remote module com.google.android.gms.cast.framework.dynamite:");
            sb.append(i11);
            android.util.Log.i("DynamiteModule", sb.toString());
            int i12 = cVarS.f8107c;
            if (i12 != 0) {
                if (i12 != -1) {
                    if (i12 == 1 || cVarS.f8106b != 0) {
                        if (i12 == -1) {
                            android.util.Log.i("DynamiteModule", "Selected local version of ".concat("com.google.android.gms.cast.framework.dynamite"));
                            P3.d dVar2 = new P3.d(applicationContext);
                            if (jLongValue == 0) {
                                aVar.remove();
                            } else {
                                aVar.set(l2);
                            }
                            cursor2 = gVar4.f8129a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(gVar3);
                            return dVar2;
                        }
                        if (i12 == 1) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i12).length() + 36);
                            sb2.append("VersionPolicy returned invalid code:");
                            sb2.append(i12);
                            throw new P3.b(sb2.toString());
                        }
                        try {
                            i3 = cVarS.f8106b;
                            try {
                                synchronized (P3.d.class) {
                                    if (c(context)) {
                                        throw new P3.b("Remote loading disabled");
                                    }
                                    bool = f8109c;
                                }
                                if (bool != null) {
                                    throw new P3.b("Failed to determine which loading route to use.");
                                }
                                if (bool.booleanValue()) {
                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(46 + 40 + java.lang.String.valueOf(i3).length());
                                    sb3.append("Selected remote version of com.google.android.gms.cast.framework.dynamite, version >= ");
                                    sb3.append(i3);
                                    android.util.Log.i("DynamiteModule", sb3.toString());
                                    synchronized (P3.d.class) {
                                        iVar = f8116l;
                                    }
                                    if (iVar != null) {
                                        throw new P3.b("DynamiteLoaderV2 was not cached.");
                                    }
                                    gVar2 = (P3.g) threadLocal.get();
                                    if (gVar2 != null || gVar2.f8129a == null) {
                                        throw new P3.b("No result cursor");
                                    }
                                    android.content.Context applicationContext2 = context.getApplicationContext();
                                    android.database.Cursor cursor3 = gVar2.f8129a;
                                    new O3.b(null);
                                    synchronized (P3.d.class) {
                                        z6 = f8112f >= 2;
                                    }
                                    if (z6) {
                                        android.util.Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                        aVarF1 = iVar.g0(new O3.b(applicationContext2), i3, new O3.b(cursor3));
                                    } else {
                                        android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                        aVarF1 = iVar.f0(new O3.b(applicationContext2), i3, new O3.b(cursor3));
                                    }
                                    android.content.Context context2 = (android.content.Context) O3.b.e0(aVarF1);
                                    if (context2 == null) {
                                        throw new P3.b("Failed to get module context");
                                    }
                                    dVar = new P3.d(context2);
                                } else {
                                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder(46 + 40 + java.lang.String.valueOf(i3).length());
                                    sb4.append("Selected remote version of com.google.android.gms.cast.framework.dynamite, version >= ");
                                    sb4.append(i3);
                                    android.util.Log.i("DynamiteModule", sb4.toString());
                                    hVarF = f(context);
                                    if (hVarF != null) {
                                        throw new P3.b("Failed to create IDynamiteLoader.");
                                    }
                                    android.os.Parcel parcelX = hVarF.X(hVarF.Y(), 6);
                                    i9 = parcelX.readInt();
                                    parcelX.recycle();
                                    if (i9 >= 3) {
                                        gVar = (P3.g) threadLocal.get();
                                        if (gVar != null) {
                                            throw new P3.b("No cached result cursor holder");
                                        }
                                        aVarF0 = hVarF.i0(new O3.b(context), i3, new O3.b(gVar.f8129a));
                                    } else if (i9 == 2) {
                                        android.util.Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        aVarF0 = hVarF.g0(new O3.b(context), i3);
                                    } else {
                                        android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        aVarF0 = hVarF.f0(new O3.b(context), i3);
                                    }
                                    objE0 = O3.b.e0(aVarF0);
                                    if (objE0 != null) {
                                        throw new P3.b("Failed to load remote module.");
                                    }
                                    dVar = new P3.d((android.content.Context) objE0);
                                }
                                if (jLongValue == 0) {
                                    f8114i.remove();
                                } else {
                                    f8114i.set(l2);
                                }
                                cursor = gVar4.f8129a;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                f8113h.set(gVar3);
                                return dVar;
                            } catch (P3.b e6) {
                                throw e6;
                            } catch (android.os.RemoteException e9) {
                                throw new P3.b("Failed to load remote module.", e9);
                            } catch (java.lang.Throwable th) {
                                throw new P3.b("Failed to load remote module.", th);
                            }
                        } catch (P3.b e10) {
                            java.lang.String message = e10.getMessage();
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + 30);
                            sb5.append("Failed to load remote module: ");
                            sb5.append(message);
                            android.util.Log.w("DynamiteModule", sb5.toString());
                            int i13 = cVarS.f8105a;
                            if (i13 != 0) {
                                P3.c cVar = new P3.c();
                                cVar.f8106b = 0;
                                cVar.f8105a = i13;
                                if (i13 != 0) {
                                    cVar.f8107c = -1;
                                }
                                if (cVar.f8107c == -1) {
                                    android.util.Log.i("DynamiteModule", "Selected local version of ".concat("com.google.android.gms.cast.framework.dynamite"));
                                    dVar = new P3.d(applicationContext);
                                }
                            }
                            throw new P3.b("Remote load failed. No local fallback found.", e10);
                        }
                    }
                } else if (cVarS.f8105a != 0) {
                    i12 = -1;
                    if (i12 == 1) {
                    }
                    if (i12 == -1) {
                        android.util.Log.i("DynamiteModule", "Selected local version of ".concat("com.google.android.gms.cast.framework.dynamite"));
                        P3.d dVar3 = new P3.d(applicationContext);
                        if (jLongValue == 0) {
                            aVar.remove();
                        } else {
                            aVar.set(l2);
                        }
                        cursor2 = gVar4.f8129a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(gVar3);
                        return dVar3;
                    }
                    if (i12 == 1) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(i12).length() + 36);
                        sb6.append("VersionPolicy returned invalid code:");
                        sb6.append(i12);
                        throw new P3.b(sb6.toString());
                    }
                    i3 = cVarS.f8106b;
                    synchronized (P3.d.class) {
                        if (c(context)) {
                            throw new P3.b("Remote loading disabled");
                        }
                        bool = f8109c;
                        if (bool != null) {
                            throw new P3.b("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(46 + 40 + java.lang.String.valueOf(i3).length());
                            sb7.append("Selected remote version of com.google.android.gms.cast.framework.dynamite, version >= ");
                            sb7.append(i3);
                            android.util.Log.i("DynamiteModule", sb7.toString());
                            synchronized (P3.d.class) {
                                iVar = f8116l;
                                if (iVar != null) {
                                    throw new P3.b("DynamiteLoaderV2 was not cached.");
                                }
                                gVar2 = (P3.g) threadLocal.get();
                                if (gVar2 != null) {
                                }
                                throw new P3.b("No result cursor");
                            }
                        }
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(46 + 40 + java.lang.String.valueOf(i3).length());
                        sb8.append("Selected remote version of com.google.android.gms.cast.framework.dynamite, version >= ");
                        sb8.append(i3);
                        android.util.Log.i("DynamiteModule", sb8.toString());
                        hVarF = f(context);
                        if (hVarF != null) {
                            throw new P3.b("Failed to create IDynamiteLoader.");
                        }
                        android.os.Parcel parcelX2 = hVarF.X(hVarF.Y(), 6);
                        i9 = parcelX2.readInt();
                        parcelX2.recycle();
                        if (i9 >= 3) {
                            gVar = (P3.g) threadLocal.get();
                            if (gVar != null) {
                                throw new P3.b("No cached result cursor holder");
                            }
                            aVarF0 = hVarF.i0(new O3.b(context), i3, new O3.b(gVar.f8129a));
                        } else if (i9 == 2) {
                            android.util.Log.w("DynamiteModule", "IDynamite loader version = 2");
                            aVarF0 = hVarF.g0(new O3.b(context), i3);
                        } else {
                            android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            aVarF0 = hVarF.f0(new O3.b(context), i3);
                        }
                        objE0 = O3.b.e0(aVarF0);
                        if (objE0 != null) {
                            throw new P3.b("Failed to load remote module.");
                        }
                        dVar = new P3.d((android.content.Context) objE0);
                        if (jLongValue == 0) {
                            f8114i.remove();
                        } else {
                            f8114i.set(l2);
                        }
                        cursor = gVar4.f8129a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f8113h.set(gVar3);
                        return dVar;
                    }
                }
            }
            int i14 = cVarS.f8105a;
            int i15 = cVarS.f8106b;
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder(46 + 46 + java.lang.String.valueOf(i14).length() + 23 + java.lang.String.valueOf(i15).length() + 1);
            sb9.append("No acceptable module com.google.android.gms.cast.framework.dynamite found. Local version is ");
            sb9.append(i14);
            sb9.append(" and remote version is ");
            sb9.append(i15);
            sb9.append(".");
            throw new P3.b(sb9.toString());
        } catch (java.lang.Throwable th2) {
            if (jLongValue == 0) {
                f8114i.remove();
            } else {
                f8114i.set(l2);
            }
            android.database.Cursor cursor4 = gVar4.f8129a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f8113h.set(gVar3);
            throw th2;
        }
    }

    public static boolean c(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (bool.equals(null) || bool.equals(g)) {
            return true;
        }
        boolean z6 = false;
        if (g == null) {
            android.content.pm.ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", android.os.Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (D3.f.f2108b.b(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z6 = true;
            }
            g = java.lang.Boolean.valueOf(z6);
            if (z6 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_AC3) == 0) {
                android.util.Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f8111e = true;
            }
        }
        if (!z6) {
            android.util.Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z6;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x013a A[PHI: r14
  0x013a: PHI (r14v10 boolean) = (r14v6 boolean), (r14v14 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    public static int d(android.content.Context context, boolean z6, boolean z9) throws java.lang.Throwable {
        java.lang.Exception exc;
        java.lang.Throwable th;
        android.database.MatrixCursor matrixCursor;
        boolean z10;
        android.database.MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z11 = true;
                android.net.Uri uriBuild = new android.net.Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z6 ? "api" : "api_force_staging").appendPath("com.google.android.gms.cast.framework.dynamite").appendQueryParameter("requestStartUptime", java.lang.String.valueOf(((java.lang.Long) f8114i.get()).longValue())).build();
                android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z12 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        android.database.Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new android.database.MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i3 = 0; i3 < count; i3++) {
                                    if (!cursorQuery.moveToPosition(i3)) {
                                        throw new android.os.RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    java.lang.Object[] objArr = new java.lang.Object[columnCount];
                                    for (int i9 = 0; i9 < columnCount; i9++) {
                                        int type = cursorQuery.getType(i9);
                                        if (type == 0) {
                                            objArr[i9] = null;
                                        } else if (type == 1) {
                                            objArr[i9] = java.lang.Long.valueOf(cursorQuery.getLong(i9));
                                        } else if (type == 2) {
                                            objArr[i9] = java.lang.Double.valueOf(cursorQuery.getDouble(i9));
                                        } else if (type == 3) {
                                            objArr[i9] = cursorQuery.getString(i9);
                                        } else {
                                            if (type != 4) {
                                                throw new android.os.RemoteException("Unknown column type");
                                            }
                                            objArr[i9] = cursorQuery.getBlob(i9);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (java.lang.Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (java.lang.Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (android.os.RemoteException unused) {
                    } catch (java.lang.Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i10 = matrixCursor.getInt(0);
                            if (i10 > 0) {
                                synchronized (P3.d.class) {
                                    try {
                                        f8110d = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f8112f = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z10 = matrixCursor.getInt(columnIndex2) != 0;
                                            f8111e = z10;
                                        } else {
                                            z10 = false;
                                        }
                                    } catch (java.lang.Throwable th5) {
                                        throw th5;
                                    }
                                }
                                P3.g gVar = (P3.g) f8113h.get();
                                if (gVar == null || gVar.f8129a != null) {
                                    z11 = false;
                                } else {
                                    gVar.f8129a = matrixCursor;
                                }
                                z12 = z10;
                                matrixCursor2 = z11 ? null : matrixCursor;
                            }
                            if (z9 && z12) {
                                throw new P3.b("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i10;
                        }
                    } catch (java.lang.Exception e6) {
                        exc = e6;
                        if (exc instanceof P3.b) {
                            throw exc;
                        }
                        java.lang.String message = exc.getMessage();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + 25);
                        sb.append("V2 version check failed: ");
                        sb.append(message);
                        throw new P3.b(sb.toString(), exc);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th;
                        }
                        matrixCursor2.close();
                        throw th;
                    }
                }
                android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new P3.b("Failed to connect to dynamite module ContentResolver.");
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        } catch (java.lang.Exception e9) {
            exc = e9;
        }
    }

    public static void e(java.lang.ClassLoader classLoader) throws P3.b {
        try {
            P3.i iVar = null;
            android.os.IBinder iBinder = (android.os.IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (iInterfaceQueryLocalInterface instanceof P3.i) {
                    iVar = (P3.i) iInterfaceQueryLocalInterface;
                } else {
                    try {
                        iVar = new P3.i(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 2);
                    } catch (java.lang.IllegalAccessException e6) {
                        e = e6;
                        throw new P3.b("Failed to instantiate dynamite loader", e);
                    } catch (java.lang.InstantiationException e9) {
                        e = e9;
                        throw new P3.b("Failed to instantiate dynamite loader", e);
                    } catch (java.lang.NoSuchMethodException e10) {
                        e = e10;
                        throw new P3.b("Failed to instantiate dynamite loader", e);
                    } catch (java.lang.reflect.InvocationTargetException e11) {
                        e = e11;
                        throw new P3.b("Failed to instantiate dynamite loader", e);
                    }
                }
            }
            f8116l = iVar;
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e12) {
            e = e12;
        }
    }

    public static P3.h f(android.content.Context context) {
        P3.h hVar;
        synchronized (P3.d.class) {
            P3.h hVar2 = f8115k;
            if (hVar2 != null) {
                return hVar2;
            }
            try {
                android.os.IBinder iBinder = (android.os.IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    hVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    hVar = iInterfaceQueryLocalInterface instanceof P3.h ? (P3.h) iInterfaceQueryLocalInterface : new P3.h(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 2);
                }
                if (hVar != null) {
                    f8115k = hVar;
                    return hVar;
                }
            } catch (java.lang.Exception e6) {
                java.lang.String message = e6.getMessage();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                android.util.Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }
}
