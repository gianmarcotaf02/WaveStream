package H3;

/* JADX INFO: renamed from: H3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0375d extends I3.a {
    public static final android.os.Parcelable.Creator<H3.C0375d> CREATOR = new B3.e(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Scope[] f3949v = new com.google.android.gms.common.api.Scope[0];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final D3.d[] f3950w = new D3.d[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3952i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.String f3953k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public android.os.IBinder f3954l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.google.android.gms.common.api.Scope[] f3955m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public android.os.Bundle f3956n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public android.accounts.Account f3957o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public D3.d[] f3958p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public D3.d[] f3959q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f3960r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f3961s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3962t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final java.lang.String f3963u;

    public C0375d(int i3, int i9, int i10, java.lang.String str, android.os.IBinder iBinder, com.google.android.gms.common.api.Scope[] scopeArr, android.os.Bundle bundle, android.accounts.Account account, D3.d[] dVarArr, D3.d[] dVarArr2, boolean z6, int i11, boolean z9, java.lang.String str2) {
        com.google.android.gms.common.api.Scope[] scopeArr2 = scopeArr == null ? f3949v : scopeArr;
        android.os.Bundle bundle2 = bundle == null ? new android.os.Bundle() : bundle;
        D3.d[] dVarArr3 = f3950w;
        D3.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f3951h = i3;
        this.f3952i = i9;
        this.j = i10;
        if ("com.google.android.gms".equals(str)) {
            this.f3953k = "com.google.android.gms";
        } else {
            this.f3953k = str;
        }
        if (i3 < 2) {
            android.accounts.Account account2 = null;
            if (iBinder != null) {
                int i12 = H3.AbstractBinderC0372a.f3943d;
                android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                H3.InterfaceC0376e e6 = iInterfaceQueryLocalInterface instanceof H3.InterfaceC0376e ? (H3.InterfaceC0376e) iInterfaceQueryLocalInterface : new H3.E(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                if (e6 != null) {
                    long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
                    try {
                        try {
                            H3.E e9 = (H3.E) e6;
                            android.os.Parcel parcelX = e9.X(e9.Y(), 2);
                            android.accounts.Account account3 = (android.accounts.Account) p004a4.h.a(parcelX, android.accounts.Account.CREATOR);
                            parcelX.recycle();
                            android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
                            account2 = account3;
                        } catch (android.os.RemoteException unused) {
                            android.util.Log.w("AccountAccessor", "Remote account accessor probably died");
                            android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    } catch (java.lang.Throwable th) {
                        android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.f3957o = account2;
        } else {
            this.f3954l = iBinder;
            this.f3957o = account;
        }
        this.f3955m = scopeArr2;
        this.f3956n = bundle2;
        this.f3958p = dVarArr4;
        this.f3959q = dVarArr3;
        this.f3960r = z6;
        this.f3961s = i11;
        this.f3962t = z9;
        this.f3963u = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        B3.e.a(this, parcel, i3);
    }
}
