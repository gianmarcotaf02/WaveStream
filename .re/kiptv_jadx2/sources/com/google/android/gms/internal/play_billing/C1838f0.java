package com.google.android.gms.internal.play_billing;

import androidx.media3.extractor.ts.TsExtractor;

public final class C1838f0 implements InterfaceC1881x0 {

    public static final C1838f0 f19323b = new C1838f0(0);

    public static final C1838f0 f19324c = new C1838f0(1);

    public static final C1838f0 f19325d = new C1838f0(2);

    public static final C1838f0 f19326e = new C1838f0(3);

    public static final C1838f0 f19327f = new C1838f0(4);
    public static final C1838f0 g = new C1838f0(5);

    public static final C1838f0 f19328h = new C1838f0(6);

    public static final C1838f0 f19329i = new C1838f0(7);

    public final int f19330a;

    public C1838f0(int i3) {
        this.f19330a = i3;
    }

    @Override
    public final boolean a(int i3) {
        o1 o1Var;
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
                            case TsExtractor.TS_STREAM_TYPE_H265:
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
                return M0.a(i3) != 0;
            case 3:
                if (i3 == 0) {
                    o1Var = o1.BROADCAST_ACTION_UNSPECIFIED;
                } else if (i3 == 1) {
                    o1Var = o1.PURCHASES_UPDATED_ACTION;
                } else if (i3 != 2) {
                    o1Var = i3 != 3 ? null : o1.ALTERNATIVE_BILLING_ACTION;
                } else {
                    o1Var = o1.LOCAL_PURCHASES_UPDATED_ACTION;
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
