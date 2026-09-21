package p072i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends android.os.Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22614a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f22615b;

    public /* synthetic */ d() {
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f6  */
    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        p105m2.r rVar;
        k3.h hVar;
        p105m2.AbstractC2621t abstractC2621t;
        p105m2.C2608f c2608f;
        switch (this.f22614a) {
            case 0:
                int i3 = message.what;
                if (i3 == -3 || i3 == -2 || i3 == -1) {
                    ((android.content.DialogInterface.OnClickListener) message.obj).onClick((android.content.DialogInterface) this.f22615b.get(), message.what);
                    break;
                } else if (i3 == 1) {
                    ((android.content.DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            default:
                p105m2.T t9 = (p105m2.T) this.f22615b.get();
                if (t9 != null) {
                    int i9 = message.what;
                    int i10 = message.arg1;
                    int i11 = message.arg2;
                    java.lang.Object obj = message.obj;
                    android.os.Bundle bundlePeekData = message.peekData();
                    android.util.SparseArray sparseArray = t9.f25240h;
                    p105m2.Y y = t9.f25241i;
                    p105m2.U u6 = null;
                    p105m2.U u7 = null;
                    java.util.ArrayList<p105m2.U> arrayList = y.f25258r;
                    switch (i9) {
                        case 0:
                            if (i10 == t9.g) {
                                t9.g = 0;
                                if (y.f25261u == t9) {
                                    y.l();
                                }
                            }
                            if (((p105m2.V) sparseArray.get(i10)) != null) {
                                sparseArray.remove(i10);
                                p105m2.V.a(null, null);
                            }
                            break;
                        case 2:
                            if (obj == null || (obj instanceof android.os.Bundle)) {
                                android.os.Bundle bundle = (android.os.Bundle) obj;
                                if (t9.f25239f == 0 && i10 == t9.g && i11 >= 1) {
                                    t9.g = 0;
                                    t9.f25239f = i11;
                                    p007a7.z zVarA = p007a7.z.a(bundle);
                                    if (y.f25261u == t9) {
                                        y.g(zVarA);
                                    }
                                    if (y.f25261u == t9) {
                                        y.f25262v = true;
                                        int size = arrayList.size();
                                        for (int i12 = 0; i12 < size; i12++) {
                                            ((p105m2.U) arrayList.get(i12)).a(y.f25261u);
                                        }
                                        p105m2.C2618p c2618p = y.f25366l;
                                        if (c2618p != null) {
                                            p105m2.T t10 = y.f25261u;
                                            int i13 = t10.f25237d;
                                            t10.f25237d = 1 + i13;
                                            t10.b(10, i13, 0, c2618p.f25350a, null);
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            if (obj == null || (obj instanceof android.os.Bundle)) {
                                android.os.Bundle bundle2 = (android.os.Bundle) obj;
                                p105m2.V v6 = (p105m2.V) sparseArray.get(i10);
                                if (v6 != null) {
                                    sparseArray.remove(i10);
                                    v6.b(bundle2);
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof android.os.Bundle)) {
                                java.lang.String string = bundlePeekData != null ? bundlePeekData.getString("error") : null;
                                android.os.Bundle bundle3 = (android.os.Bundle) obj;
                                if (((p105m2.V) sparseArray.get(i10)) != null) {
                                    sparseArray.remove(i10);
                                    p105m2.V.a(string, bundle3);
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof android.os.Bundle)) {
                                android.os.Bundle bundle4 = (android.os.Bundle) obj;
                                if (t9.f25239f != 0) {
                                    p007a7.z zVarA2 = p007a7.z.a(bundle4);
                                    if (y.f25261u == t9) {
                                        y.g(zVarA2);
                                    }
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof android.os.Bundle) {
                                android.os.Bundle bundle5 = (android.os.Bundle) obj;
                                p105m2.V v9 = (p105m2.V) sparseArray.get(i10);
                                if (bundle5 == null || !bundle5.containsKey("routeId")) {
                                    v9.getClass();
                                    p105m2.V.a("DynamicGroupRouteController is created without valid route id.", bundle5);
                                } else {
                                    sparseArray.remove(i10);
                                    v9.b(bundle5);
                                }
                            } else {
                                android.util.Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                            }
                            break;
                        case 7:
                            if (obj == null || (obj instanceof android.os.Bundle)) {
                                android.os.Bundle bundle6 = (android.os.Bundle) obj;
                                if (t9.f25239f != 0) {
                                    android.os.Bundle bundle7 = (android.os.Bundle) bundle6.getParcelable("groupRoute");
                                    p105m2.C2617o c2617o = bundle7 != null ? new p105m2.C2617o(bundle7) : null;
                                    java.util.ArrayList<android.os.Bundle> parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    for (android.os.Bundle bundle8 : parcelableArrayList) {
                                        if (bundle8 == null) {
                                            rVar = null;
                                        } else {
                                            android.os.Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            p105m2.C2617o c2617o2 = bundle9 != null ? new p105m2.C2617o(bundle9) : null;
                                            int i14 = bundle8.getInt("selectionState", 1);
                                            bundle8.getBoolean("isUnselectable", false);
                                            bundle8.getBoolean("isGroupable", false);
                                            bundle8.getBoolean("isTransferable", false);
                                            rVar = new p105m2.r(c2617o2, i14);
                                        }
                                        arrayList2.add(rVar);
                                    }
                                    if (y.f25261u == t9) {
                                        for (p105m2.U u8 : arrayList) {
                                            if (u8.b() == i11) {
                                                u7 = u8;
                                                if (u7 instanceof p105m2.W) {
                                                    ((p105m2.W) u7).j(c2617o, arrayList2);
                                                }
                                                break;
                                            }
                                        }
                                        if (u7 instanceof p105m2.W) {
                                            ((p105m2.W) u7).j(c2617o, arrayList2);
                                        }
                                    }
                                }
                            }
                            break;
                        case 8:
                            if (y.f25261u == t9) {
                                for (p105m2.U u9 : arrayList) {
                                    if (u9.b() == i11) {
                                        u6 = u9;
                                        hVar = y.f25263w;
                                        if (hVar != null && (u6 instanceof p105m2.AbstractC2621t)) {
                                            abstractC2621t = (p105m2.AbstractC2621t) u6;
                                            c2608f = (p105m2.C2608f) ((p105m2.a0) hVar.f24458i).f25266c;
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
                                    abstractC2621t = (p105m2.AbstractC2621t) u6;
                                    c2608f = (p105m2.C2608f) ((p105m2.a0) hVar.f24458i).f25266c;
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
                    int i15 = p105m2.Y.f25255x;
                }
                break;
        }
    }

    public d(p105m2.T t9) {
        this.f22615b = new java.lang.ref.WeakReference(t9);
    }
}
