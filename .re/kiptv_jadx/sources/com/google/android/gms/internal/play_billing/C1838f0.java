package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1838f0 implements com.google.android.gms.internal.play_billing.InterfaceC1881x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.C1838f0 f19323b = new com.google.android.gms.internal.play_billing.C1838f0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.C1838f0 f19324c = new com.google.android.gms.internal.play_billing.C1838f0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.C1838f0 f19325d = new com.google.android.gms.internal.play_billing.C1838f0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.C1838f0 f19326e = new com.google.android.gms.internal.play_billing.C1838f0(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.C1838f0 f19327f = new com.google.android.gms.internal.play_billing.C1838f0(4);
    public static final com.google.android.gms.internal.play_billing.C1838f0 g = new com.google.android.gms.internal.play_billing.C1838f0(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.C1838f0 f19328h = new com.google.android.gms.internal.play_billing.C1838f0(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.C1838f0 f19329i = new com.google.android.gms.internal.play_billing.C1838f0(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19330a;

    public /* synthetic */ C1838f0(int i3) {
        this.f19330a = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1881x0
    public final boolean a(int i3) {
        com.google.android.gms.internal.play_billing.o1 o1Var;
        switch (this.f19330a) {
            case 0:
                switch (i3) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        return true;
                    default:
                        return false;
                }
            case 1:
                switch (i3) {
                    default:
                        switch (i3) {
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                                break;
                            default:
                                return false;
                        }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        return true;
                }
                break;
            case 2:
                return com.google.android.gms.internal.play_billing.M0.a(i3) != 0;
            case 3:
                if (i3 == 0) {
                    o1Var = com.google.android.gms.internal.play_billing.o1.BROADCAST_ACTION_UNSPECIFIED;
                } else if (i3 == 1) {
                    o1Var = com.google.android.gms.internal.play_billing.o1.PURCHASES_UPDATED_ACTION;
                } else if (i3 != 2) {
                    o1Var = i3 != 3 ? null : com.google.android.gms.internal.play_billing.o1.ALTERNATIVE_BILLING_ACTION;
                } else {
                    o1Var = com.google.android.gms.internal.play_billing.o1.LOCAL_PURCHASES_UPDATED_ACTION;
                }
                return o1Var != null;
            case 4:
                return i3 == 0 || i3 == 1 || i3 == 2 || i3 == 3;
            case 5:
                switch (i3) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        return true;
                    case 14:
                    case 15:
                    case 16:
                    default:
                        return false;
                }
            case 6:
                switch (i3) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            default:
                return i3 == 0 || i3 == 1;
        }
    }
}
