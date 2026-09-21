package Y1;

/* JADX INFO: renamed from: Y1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC1025j extends Y1.AbstractComponentCallbacksC1029n implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final Y1.DialogInterfaceOnCancelListenerC1022g f11270Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Y1.DialogInterfaceOnDismissListenerC1023h f11271a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f11272b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f11273c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f11274d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f11275e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f11276f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f11277g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final p166t3.i f11278h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public android.app.Dialog f11279i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f11280j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f11281k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f11282l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f11283m0;

    public DialogInterfaceOnCancelListenerC1025j() {
        new B3.r(6, this);
        this.f11270Z = new Y1.DialogInterfaceOnCancelListenerC1022g(this);
        this.f11271a0 = new Y1.DialogInterfaceOnDismissListenerC1023h(this);
        this.f11272b0 = 0;
        this.f11273c0 = 0;
        this.f11274d0 = true;
        this.f11275e0 = true;
        this.f11276f0 = -1;
        this.f11278h0 = new p166t3.i(26, this);
        this.f11283m0 = false;
    }

    @Override // Y1.AbstractComponentCallbacksC1029n
    public final void B(android.os.Bundle bundle) {
        android.app.Dialog dialog = this.f11279i0;
        if (dialog != null) {
            android.os.Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i3 = this.f11272b0;
        if (i3 != 0) {
            bundle.putInt("android:style", i3);
        }
        int i9 = this.f11273c0;
        if (i9 != 0) {
            bundle.putInt("android:theme", i9);
        }
        boolean z6 = this.f11274d0;
        if (!z6) {
            bundle.putBoolean("android:cancelable", z6);
        }
        boolean z9 = this.f11275e0;
        if (!z9) {
            bundle.putBoolean("android:showsDialog", z9);
        }
        int i10 = this.f11276f0;
        if (i10 != -1) {
            bundle.putInt("android:backStackId", i10);
        }
    }

    @Override // Y1.AbstractComponentCallbacksC1029n
    public final void C() {
        this.f11303J = true;
        android.app.Dialog dialog = this.f11279i0;
        if (dialog != null) {
            this.f11280j0 = false;
            dialog.show();
            android.view.View decorView = this.f11279i0.getWindow().getDecorView();
            androidx.lifecycle.X.i(decorView, this);
            decorView.setTag(com.kiptv.tv.R.id.view_tree_view_model_store_owner, this);
            com.google.common.util.concurrent.AbstractC1903s.H(decorView, this);
        }
    }

    @Override // Y1.AbstractComponentCallbacksC1029n
    public final void D() {
        this.f11303J = true;
        android.app.Dialog dialog = this.f11279i0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // Y1.AbstractComponentCallbacksC1029n
    public final void E(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        super.E(layoutInflater, viewGroup, bundle);
        if (this.f11279i0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f11279i0.onRestoreInstanceState(bundle2);
    }

    public android.app.Dialog H() {
        if (Y1.D.G(3)) {
            android.util.Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new p019c.l(F(), this.f11273c0);
    }

    @Override // Y1.AbstractComponentCallbacksC1029n
    public final E8.l i() {
        return new Y1.C1024i(this, new Y1.C1027l(this));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        if (this.f11280j0) {
            return;
        }
        if (Y1.D.G(3)) {
            android.util.Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f11281k0) {
            return;
        }
        this.f11281k0 = true;
        this.f11282l0 = false;
        android.app.Dialog dialog = this.f11279i0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f11279i0.dismiss();
        }
        this.f11280j0 = true;
        if (this.f11276f0 >= 0) {
            Y1.D dN = n();
            int i3 = this.f11276f0;
            if (i3 < 0) {
                throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i3, "Bad id: "));
            }
            dN.w(new Y1.C(dN, i3), true);
            this.f11276f0 = -1;
            return;
        }
        Y1.C1016a c1016a = new Y1.C1016a(n());
        c1016a.f11242o = true;
        Y1.D d4 = this.y;
        if (d4 == null || d4 == c1016a.f11243p) {
            c1016a.b(new Y1.K(3, this));
            c1016a.d(true);
        } else {
            throw new java.lang.IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // Y1.AbstractComponentCallbacksC1029n
    public final void s() {
        this.f11303J = true;
    }

    @Override // Y1.AbstractComponentCallbacksC1029n
    public final void u(com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity) {
        super.u(signInHubActivity);
        this.f11313T.e(this.f11278h0);
        if (this.f11282l0) {
            return;
        }
        this.f11281k0 = false;
    }

    @Override // Y1.AbstractComponentCallbacksC1029n
    public final void v(android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        this.f11303J = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f11295A.R(parcelable);
            Y1.D d4 = this.f11295A;
            d4.f11158E = false;
            d4.f11159F = false;
            d4.f11164L.g = false;
            d4.t(1);
        }
        Y1.D d6 = this.f11295A;
        if (d6.f11182s < 1) {
            d6.f11158E = false;
            d6.f11159F = false;
            d6.f11164L.g = false;
            d6.t(1);
        }
        new android.os.Handler();
        this.f11275e0 = this.f11298D == 0;
        if (bundle != null) {
            this.f11272b0 = bundle.getInt("android:style", 0);
            this.f11273c0 = bundle.getInt("android:theme", 0);
            this.f11274d0 = bundle.getBoolean("android:cancelable", true);
            this.f11275e0 = bundle.getBoolean("android:showsDialog", this.f11275e0);
            this.f11276f0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // Y1.AbstractComponentCallbacksC1029n
    public final void x() {
        this.f11303J = true;
        android.app.Dialog dialog = this.f11279i0;
        if (dialog != null) {
            this.f11280j0 = true;
            dialog.setOnDismissListener(null);
            this.f11279i0.dismiss();
            if (!this.f11281k0) {
                onDismiss(this.f11279i0);
            }
            this.f11279i0 = null;
            this.f11283m0 = false;
        }
    }

    @Override // Y1.AbstractComponentCallbacksC1029n
    public final void y() {
        this.f11303J = true;
        if (!this.f11282l0 && !this.f11281k0) {
            this.f11281k0 = true;
        }
        this.f11313T.h(this.f11278h0);
    }

    @Override // Y1.AbstractComponentCallbacksC1029n
    public final android.view.LayoutInflater z(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterZ = super.z(bundle);
        boolean z6 = this.f11275e0;
        if (z6 && !this.f11277g0) {
            if (z6 && !this.f11283m0) {
                try {
                    this.f11277g0 = true;
                    android.app.Dialog dialogH = H();
                    this.f11279i0 = dialogH;
                    com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity = null;
                    if (this.f11275e0) {
                        int i3 = this.f11272b0;
                        if (i3 == 1 || i3 == 2) {
                            dialogH.requestWindowFeature(1);
                        } else if (i3 == 3) {
                            android.view.Window window = dialogH.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogH.requestWindowFeature(1);
                        }
                        Y1.q qVar = this.f11331z;
                        if (qVar != null) {
                            signInHubActivity = qVar.f11337s;
                        }
                        if (signInHubActivity != null) {
                            this.f11279i0.setOwnerActivity(signInHubActivity);
                        }
                        this.f11279i0.setCancelable(this.f11274d0);
                        this.f11279i0.setOnCancelListener(this.f11270Z);
                        this.f11279i0.setOnDismissListener(this.f11271a0);
                        this.f11283m0 = true;
                    } else {
                        this.f11279i0 = null;
                    }
                    this.f11277g0 = false;
                } catch (java.lang.Throwable th) {
                    this.f11277g0 = false;
                    throw th;
                }
            }
            if (Y1.D.G(2)) {
                android.util.Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            android.app.Dialog dialog = this.f11279i0;
            if (dialog != null) {
                return layoutInflaterZ.cloneInContext(dialog.getContext());
            }
        } else if (Y1.D.G(2)) {
            java.lang.String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f11275e0) {
                android.util.Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterZ;
            }
            android.util.Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterZ;
    }

    public void onCancel(android.content.DialogInterface dialogInterface) {
    }
}
