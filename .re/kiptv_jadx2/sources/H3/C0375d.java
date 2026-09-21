package H3;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

public final class C0375d extends I3.a {
    public static final Parcelable.Creator<C0375d> CREATOR = new B3.e(18);

    public static final Scope[] f3949v = new Scope[0];

    public static final D3.d[] f3950w = new D3.d[0];

    public final int f3951h;

    public final int f3952i;
    public final int j;

    public String f3953k;

    public IBinder f3954l;

    public Scope[] f3955m;

    public Bundle f3956n;

    public Account f3957o;

    public D3.d[] f3958p;

    public D3.d[] f3959q;

    public final boolean f3960r;

    public final int f3961s;

    public boolean f3962t;

    public final String f3963u;

    public C0375d(int i3, int i9, int i10, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, D3.d[] dVarArr, D3.d[] dVarArr2, boolean z6, int i11, boolean z9, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f3949v : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
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
            Account account2 = null;
            if (iBinder != null) {
                int i12 = AbstractBinderC0372a.f3943d;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                InterfaceC0376e e6 = iInterfaceQueryLocalInterface instanceof InterfaceC0376e ? (InterfaceC0376e) iInterfaceQueryLocalInterface : new E(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                if (e6 != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            E e9 = (E) e6;
                            Parcel parcelX = e9.X(e9.Y(), 2);
                            Account account3 = (Account) p004a4.h.a(parcelX, Account.CREATOR);
                            parcelX.recycle();
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
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

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        B3.e.a(this, parcel, i3);
    }
}
