package D1;

/* JADX INFO: renamed from: D1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0230o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.view.ViewParent f2047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.view.ViewParent f2048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f2049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f2051e;

    public C0230o(android.view.ViewGroup viewGroup) {
        this.f2049c = viewGroup;
    }

    public final boolean a(float f9, float f10, boolean z6) {
        android.view.ViewParent viewParentE;
        if (this.f2050d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedFling(this.f2049c, f9, f10, z6);
            } catch (java.lang.AbstractMethodError e6) {
                android.util.Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e6);
            }
        }
        return false;
    }

    public final boolean b(float f9, float f10) {
        android.view.ViewParent viewParentE;
        if (this.f2050d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedPreFling(this.f2049c, f9, f10);
            } catch (java.lang.AbstractMethodError e6) {
                android.util.Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e6);
            }
        }
        return false;
    }

    public final boolean c(int i3, int i9, int i10, int[] iArr, int[] iArr2) {
        android.view.ViewParent viewParentE;
        int i11;
        int i12;
        if (!this.f2050d || (viewParentE = e(i10)) == null) {
            return false;
        }
        if (i3 == 0 && i9 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        android.view.ViewGroup viewGroup = this.f2049c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i11 = iArr2[0];
            i12 = iArr2[1];
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (iArr == null) {
            if (this.f2051e == null) {
                this.f2051e = new int[2];
            }
            iArr = this.f2051e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (viewParentE instanceof D1.InterfaceC0231p) {
            ((D1.InterfaceC0231p) viewParentE).f(i3, i9, i10, iArr);
        } else if (i10 == 0) {
            try {
                viewParentE.onNestedPreScroll(viewGroup, i3, i9, iArr);
            } catch (java.lang.AbstractMethodError e6) {
                android.util.Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e6);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i11;
            iArr2[1] = iArr2[1] - i12;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public final boolean d(int i3, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        android.view.ViewParent viewParentE;
        int i13;
        int i14;
        int[] iArr3;
        if (this.f2050d && (viewParentE = e(i12)) != null) {
            if (i3 != 0 || i9 != 0 || i10 != 0 || i11 != 0) {
                android.view.ViewGroup viewGroup = this.f2049c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i13 = iArr[0];
                    i14 = iArr[1];
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                if (iArr2 == null) {
                    if (this.f2051e == null) {
                        this.f2051e = new int[2];
                    }
                    int[] iArr4 = this.f2051e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentE instanceof D1.InterfaceC0232q) {
                    ((D1.InterfaceC0232q) viewParentE).c(viewGroup, i3, i9, i10, i11, i12, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i10;
                    iArr3[1] = iArr3[1] + i11;
                    if (viewParentE instanceof D1.InterfaceC0231p) {
                        ((D1.InterfaceC0231p) viewParentE).a(viewGroup, i3, i9, i10, i11, i12);
                    } else if (i12 == 0) {
                        try {
                            viewParentE.onNestedScroll(viewGroup, i3, i9, i10, i11);
                        } catch (java.lang.AbstractMethodError e6) {
                            android.util.Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e6);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i13;
                    iArr[1] = iArr[1] - i14;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final android.view.ViewParent e(int i3) {
        if (i3 == 0) {
            return this.f2047a;
        }
        if (i3 != 1) {
            return null;
        }
        return this.f2048b;
    }

    public final boolean f(int i3) {
        return e(i3) != null;
    }

    public final boolean g(int i3, int i9) {
        boolean zOnStartNestedScroll;
        if (!f(i9)) {
            if (this.f2050d) {
                android.view.View view = this.f2049c;
                android.view.View view2 = view;
                for (android.view.ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z6 = parent instanceof D1.InterfaceC0231p;
                    if (z6) {
                        zOnStartNestedScroll = ((D1.InterfaceC0231p) parent).g(view2, view, i3, i9);
                    } else if (i9 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i3);
                        } catch (java.lang.AbstractMethodError e6) {
                            android.util.Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e6);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i9 == 0) {
                            this.f2047a = parent;
                        } else if (i9 == 1) {
                            this.f2048b = parent;
                        }
                        if (z6) {
                            ((D1.InterfaceC0231p) parent).h(view2, view, i3, i9);
                        } else if (i9 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i3);
                            } catch (java.lang.AbstractMethodError e9) {
                                android.util.Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e9);
                            }
                        }
                    } else {
                        if (parent instanceof android.view.View) {
                            view2 = (android.view.View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i3) {
        android.view.ViewParent viewParentE = e(i3);
        if (viewParentE != null) {
            boolean z6 = viewParentE instanceof D1.InterfaceC0231p;
            android.view.ViewGroup viewGroup = this.f2049c;
            if (z6) {
                ((D1.InterfaceC0231p) viewParentE).e(i3, viewGroup);
            } else if (i3 == 0) {
                try {
                    viewParentE.onStopNestedScroll(viewGroup);
                } catch (java.lang.AbstractMethodError e6) {
                    android.util.Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e6);
                }
            }
            if (i3 == 0) {
                this.f2047a = null;
            } else {
                if (i3 != 1) {
                    return;
                }
                this.f2048b = null;
            }
        }
    }
}
