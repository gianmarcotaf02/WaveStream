package p072i;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k3.h;
import p007a7.z;
import p105m2.AbstractC2621t;
import p105m2.C2608f;
import p105m2.C2617o;
import p105m2.C2618p;
import p105m2.T;
import p105m2.U;
import p105m2.V;
import p105m2.W;
import p105m2.Y;
import p105m2.a0;
import p105m2.r;

public final class d extends Handler {

    public final int f22614a = 0;

    public WeakReference f22615b;

    public d() {
    }

    @Override
    public final void handleMessage(Message message) {
        r rVar;
        h hVar;
        AbstractC2621t abstractC2621t;
        C2608f c2608f;
        switch (this.f22614a) {
            case 0:
                int i3 = message.what;
                if (i3 == -3 || i3 == -2 || i3 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f22615b.get(), message.what);
                    break;
                } else if (i3 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            default:
                T t9 = (T) this.f22615b.get();
                if (t9 != null) {
                    int i9 = message.what;
                    int i10 = message.arg1;
                    int i11 = message.arg2;
                    Object obj = message.obj;
                    Bundle bundlePeekData = message.peekData();
                    SparseArray sparseArray = t9.f25240h;
                    Y y = t9.f25241i;
                    U u6 = null;
                    U u7 = null;
                    ArrayList<U> arrayList = y.f25258r;
                    switch (i9) {
                        case 0:
                            if (i10 == t9.g) {
                                t9.g = 0;
                                if (y.f25261u == t9) {
                                    y.l();
                                }
                            }
                            if (((V) sparseArray.get(i10)) != null) {
                                sparseArray.remove(i10);
                                V.a(null, null);
                            }
                            break;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (t9.f25239f == 0 && i10 == t9.g && i11 >= 1) {
                                    t9.g = 0;
                                    t9.f25239f = i11;
                                    z zVarA = z.a(bundle);
                                    if (y.f25261u == t9) {
                                        y.g(zVarA);
                                    }
                                    if (y.f25261u == t9) {
                                        y.f25262v = true;
                                        int size = arrayList.size();
                                        for (int i12 = 0; i12 < size; i12++) {
                                            ((U) arrayList.get(i12)).a(y.f25261u);
                                        }
                                        C2618p c2618p = y.f25366l;
                                        if (c2618p != null) {
                                            T t10 = y.f25261u;
                                            int i13 = t10.f25237d;
                                            t10.f25237d = 1 + i13;
                                            t10.b(10, i13, 0, c2618p.f25350a, null);
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                V v6 = (V) sparseArray.get(i10);
                                if (v6 != null) {
                                    sparseArray.remove(i10);
                                    v6.b(bundle2);
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                String string = bundlePeekData != null ? bundlePeekData.getString("error") : null;
                                Bundle bundle3 = (Bundle) obj;
                                if (((V) sparseArray.get(i10)) != null) {
                                    sparseArray.remove(i10);
                                    V.a(string, bundle3);
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (t9.f25239f != 0) {
                                    z zVarA2 = z.a(bundle4);
                                    if (y.f25261u == t9) {
                                        y.g(zVarA2);
                                    }
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                V v9 = (V) sparseArray.get(i10);
                                if (bundle5 == null || !bundle5.containsKey("routeId")) {
                                    v9.getClass();
                                    V.a("DynamicGroupRouteController is created without valid route id.", bundle5);
                                } else {
                                    sparseArray.remove(i10);
                                    v9.b(bundle5);
                                }
                            } else {
                                Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                            }
                            break;
                        case 7:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj;
                                if (t9.f25239f != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    C2617o c2617o = bundle7 != null ? new C2617o(bundle7) : null;
                                    ArrayList<Bundle> parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Bundle bundle8 : parcelableArrayList) {
                                        if (bundle8 == null) {
                                            rVar = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            C2617o c2617o2 = bundle9 != null ? new C2617o(bundle9) : null;
                                            int i14 = bundle8.getInt("selectionState", 1);
                                            bundle8.getBoolean("isUnselectable", false);
                                            bundle8.getBoolean("isGroupable", false);
                                            bundle8.getBoolean("isTransferable", false);
                                            rVar = new r(c2617o2, i14);
                                        }
                                        arrayList2.add(rVar);
                                    }
                                    if (y.f25261u == t9) {
                                        for (U u8 : arrayList) {
                                            if (u8.b() == i11) {
                                                u7 = u8;
                                                if (u7 instanceof W) {
                                                    ((W) u7).j(c2617o, arrayList2);
                                                }
                                                break;
                                            }
                                        }
                                        if (u7 instanceof W) {
                                            ((W) u7).j(c2617o, arrayList2);
                                        }
                                    }
                                }
                            }
                            break;
                        case 8:
                            if (y.f25261u == t9) {
                                for (U u9 : arrayList) {
                                    if (u9.b() == i11) {
                                        u6 = u9;
                                        hVar = y.f25263w;
                                        if (hVar != null && (u6 instanceof AbstractC2621t)) {
                                            abstractC2621t = (AbstractC2621t) u6;
                                            c2608f = (C2608f) ((a0) hVar.f24458i).f25266c;
                                            if (c2608f.f25305t == abstractC2621t) {
                                                c2608f.i(c2608f.c(), 2);
                                            }
                                        }
                                        arrayList.remove(u6);
                                        u6.c();
                                        y.m();
                                        break;
                                    }
                                }
                                hVar = y.f25263w;
                                if (hVar != null) {
                                    abstractC2621t = (AbstractC2621t) u6;
                                    c2608f = (C2608f) ((a0) hVar.f24458i).f25266c;
                                    if (c2608f.f25305t == abstractC2621t) {
                                        c2608f.i(c2608f.c(), 2);
                                    }
                                }
                                arrayList.remove(u6);
                                u6.c();
                                y.m();
                            }
                            break;
                    }
                    int i15 = Y.f25255x;
                }
                break;
        }
    }

    public d(T t9) {
        this.f22615b = new WeakReference(t9);
    }
}
