package C2;

/* JADX INFO: loaded from: classes.dex */
public final class c extends C2.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.util.SparseIntArray f880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.os.Parcel f881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f882f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f884i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f885k;

    public c(android.os.Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new p136q.C2661e(0), new p136q.C2661e(0), new p136q.C2661e(0));
    }

    @Override // C2.b
    public final C2.c a() {
        android.os.Parcel parcel = this.f881e;
        int iDataPosition = parcel.dataPosition();
        int i3 = this.j;
        if (i3 == this.f882f) {
            i3 = this.g;
        }
        return new C2.c(parcel, iDataPosition, i3, Y6.f.m(new java.lang.StringBuilder(), this.f883h, "  "), this.f877a, this.f878b, this.f879c);
    }

    @Override // C2.b
    public final boolean e(int i3) {
        while (this.j < this.g) {
            int i9 = this.f885k;
            if (i9 == i3) {
                return true;
            }
            if (java.lang.String.valueOf(i9).compareTo(java.lang.String.valueOf(i3)) > 0) {
                return false;
            }
            int i10 = this.j;
            android.os.Parcel parcel = this.f881e;
            parcel.setDataPosition(i10);
            int i11 = parcel.readInt();
            this.f885k = parcel.readInt();
            this.j += i11;
        }
        return this.f885k == i3;
    }

    @Override // C2.b
    public final void i(int i3) {
        int i9 = this.f884i;
        android.util.SparseIntArray sparseIntArray = this.f880d;
        android.os.Parcel parcel = this.f881e;
        if (i9 >= 0) {
            int i10 = sparseIntArray.get(i9);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i10);
            parcel.writeInt(iDataPosition - i10);
            parcel.setDataPosition(iDataPosition);
        }
        this.f884i = i3;
        sparseIntArray.put(i3, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i3);
    }

    public c(android.os.Parcel parcel, int i3, int i9, java.lang.String str, p136q.C2661e c2661e, p136q.C2661e c2661e2, p136q.C2661e c2661e3) {
        super(c2661e, c2661e2, c2661e3);
        this.f880d = new android.util.SparseIntArray();
        this.f884i = -1;
        this.f885k = -1;
        this.f881e = parcel;
        this.f882f = i3;
        this.g = i9;
        this.j = i3;
        this.f883h = str;
    }
}
