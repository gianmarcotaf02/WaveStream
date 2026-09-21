package Y1;

/* JADX INFO: renamed from: Y1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1017b implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<Y1.C1017b> CREATOR = new T3.G(18);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f11246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f11247i;
    public final int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f11248k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f11249l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.String f11250m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f11251n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f11252o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.lang.CharSequence f11253p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f11254q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.lang.CharSequence f11255r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f11256s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f11257t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f11258u;

    public C1017b(Y1.C1016a c1016a) {
        int size = c1016a.f11230a.size();
        this.f11246h = new int[size * 6];
        if (!c1016a.g) {
            throw new java.lang.IllegalStateException("Not on back stack");
        }
        this.f11247i = new java.util.ArrayList(size);
        this.j = new int[size];
        this.f11248k = new int[size];
        int i3 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            Y1.K k9 = (Y1.K) c1016a.f11230a.get(i9);
            int i10 = i3 + 1;
            this.f11246h[i3] = k9.f11220a;
            java.util.ArrayList arrayList = this.f11247i;
            Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n = k9.f11221b;
            arrayList.add(abstractComponentCallbacksC1029n != null ? abstractComponentCallbacksC1029n.f11318l : null);
            int[] iArr = this.f11246h;
            iArr[i10] = k9.f11222c ? 1 : 0;
            iArr[i3 + 2] = k9.f11223d;
            iArr[i3 + 3] = k9.f11224e;
            int i11 = i3 + 5;
            iArr[i3 + 4] = k9.f11225f;
            i3 += 6;
            iArr[i11] = k9.g;
            this.j[i9] = k9.f11226h.ordinal();
            this.f11248k[i9] = k9.f11227i.ordinal();
        }
        this.f11249l = c1016a.f11235f;
        this.f11250m = c1016a.f11236h;
        this.f11251n = c1016a.f11245r;
        this.f11252o = c1016a.f11237i;
        this.f11253p = c1016a.j;
        this.f11254q = c1016a.f11238k;
        this.f11255r = c1016a.f11239l;
        this.f11256s = c1016a.f11240m;
        this.f11257t = c1016a.f11241n;
        this.f11258u = c1016a.f11242o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeIntArray(this.f11246h);
        parcel.writeStringList(this.f11247i);
        parcel.writeIntArray(this.j);
        parcel.writeIntArray(this.f11248k);
        parcel.writeInt(this.f11249l);
        parcel.writeString(this.f11250m);
        parcel.writeInt(this.f11251n);
        parcel.writeInt(this.f11252o);
        android.text.TextUtils.writeToParcel(this.f11253p, parcel, 0);
        parcel.writeInt(this.f11254q);
        android.text.TextUtils.writeToParcel(this.f11255r, parcel, 0);
        parcel.writeStringList(this.f11256s);
        parcel.writeStringList(this.f11257t);
        parcel.writeInt(this.f11258u ? 1 : 0);
    }

    public C1017b(android.os.Parcel parcel) {
        this.f11246h = parcel.createIntArray();
        this.f11247i = parcel.createStringArrayList();
        this.j = parcel.createIntArray();
        this.f11248k = parcel.createIntArray();
        this.f11249l = parcel.readInt();
        this.f11250m = parcel.readString();
        this.f11251n = parcel.readInt();
        this.f11252o = parcel.readInt();
        android.os.Parcelable.Creator creator = android.text.TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f11253p = (java.lang.CharSequence) creator.createFromParcel(parcel);
        this.f11254q = parcel.readInt();
        this.f11255r = (java.lang.CharSequence) creator.createFromParcel(parcel);
        this.f11256s = parcel.createStringArrayList();
        this.f11257t = parcel.createStringArrayList();
        this.f11258u = parcel.readInt() != 0;
    }
}
