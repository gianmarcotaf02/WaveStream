package p184w3;

/* JADX INFO: loaded from: classes.dex */
public final class i extends I3.a {
    public static final android.os.Parcelable.Creator<p184w3.i> CREATOR = new androidx.recyclerview.widget.d0(29);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f29853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f29854i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p184w3.h f29855k;

    public i(boolean z6, java.lang.String str, boolean z9, p184w3.h hVar) {
        this.f29853h = z6;
        this.f29854i = str;
        this.j = z9;
        this.f29855k = hVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p184w3.i)) {
            return false;
        }
        p184w3.i iVar = (p184w3.i) obj;
        return this.f29853h == iVar.f29853h && B3.AbstractC0088a.e(this.f29854i, iVar.f29854i) && this.j == iVar.j && B3.AbstractC0088a.e(this.f29855k, iVar.f29855k);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Boolean.valueOf(this.f29853h), this.f29854i, java.lang.Boolean.valueOf(this.j), this.f29855k});
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LaunchOptions(relaunchIfRunning=");
        sb.append(this.f29853h);
        sb.append(", language=");
        sb.append(this.f29854i);
        sb.append(", androidReceiverCompatible: ");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.j, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.e0(parcel, 2, 4);
        parcel.writeInt(this.f29853h ? 1 : 0);
        E6.G.Z(parcel, 3, this.f29854i);
        E6.G.e0(parcel, 4, 4);
        parcel.writeInt(this.j ? 1 : 0);
        E6.G.Y(parcel, 5, this.f29855k, i3);
        E6.G.g0(parcel, iF0);
    }

    public i() {
        java.util.Locale locale = java.util.Locale.getDefault();
        java.util.regex.Pattern pattern = B3.AbstractC0088a.f615a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(20);
        sb.append(locale.getLanguage());
        java.lang.String country = locale.getCountry();
        if (!android.text.TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
        }
        java.lang.String variant = locale.getVariant();
        if (!android.text.TextUtils.isEmpty(variant)) {
            sb.append('-');
            sb.append(variant);
        }
        this(false, sb.toString(), false, null);
    }
}
