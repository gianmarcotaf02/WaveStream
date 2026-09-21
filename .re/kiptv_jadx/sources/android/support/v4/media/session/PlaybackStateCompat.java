package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.session.PlaybackStateCompat> CREATOR = new android.support.v4.media.session.p(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f15574i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f15575k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f15576l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f15577m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.CharSequence f15578n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f15579o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f15580p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f15581q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final android.os.Bundle f15582r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public android.media.session.PlaybackState f15583s;

    public PlaybackStateCompat(int i3, long j, long j9, float f9, long j10, int i9, java.lang.CharSequence charSequence, long j11, java.util.ArrayList arrayList, long j12, android.os.Bundle bundle) {
        this.f15573h = i3;
        this.f15574i = j;
        this.j = j9;
        this.f15575k = f9;
        this.f15576l = j10;
        this.f15577m = i9;
        this.f15578n = charSequence;
        this.f15579o = j11;
        this.f15580p = new java.util.ArrayList(arrayList);
        this.f15581q = j12;
        this.f15582r = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlaybackState {state=");
        sb.append(this.f15573h);
        sb.append(", position=");
        sb.append(this.f15574i);
        sb.append(", buffered position=");
        sb.append(this.j);
        sb.append(", speed=");
        sb.append(this.f15575k);
        sb.append(", updated=");
        sb.append(this.f15579o);
        sb.append(", actions=");
        sb.append(this.f15576l);
        sb.append(", error code=");
        sb.append(this.f15577m);
        sb.append(", error message=");
        sb.append(this.f15578n);
        sb.append(", custom actions=");
        sb.append(this.f15580p);
        sb.append(", active item id=");
        return Y6.f.g(this.f15581q, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeInt(this.f15573h);
        parcel.writeLong(this.f15574i);
        parcel.writeFloat(this.f15575k);
        parcel.writeLong(this.f15579o);
        parcel.writeLong(this.j);
        parcel.writeLong(this.f15576l);
        android.text.TextUtils.writeToParcel(this.f15578n, parcel, i3);
        parcel.writeTypedList(this.f15580p);
        parcel.writeLong(this.f15581q);
        parcel.writeBundle(this.f15582r);
        parcel.writeInt(this.f15577m);
    }

    public static final class CustomAction implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.support.v4.media.session.PlaybackStateCompat.CustomAction> CREATOR = new android.support.v4.media.session.u();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final java.lang.String f15584h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final java.lang.CharSequence f15585i;
        public final int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final android.os.Bundle f15586k;

        public CustomAction(java.lang.String str, java.lang.CharSequence charSequence, int i3) {
            this.f15584h = str;
            this.f15585i = charSequence;
            this.j = i3;
            this.f15586k = null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final java.lang.String toString() {
            return "Action:mName='" + ((java.lang.Object) this.f15585i) + ", mIcon=" + this.j + ", mExtras=" + this.f15586k;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i3) {
            parcel.writeString(this.f15584h);
            android.text.TextUtils.writeToParcel(this.f15585i, parcel, i3);
            parcel.writeInt(this.j);
            parcel.writeBundle(this.f15586k);
        }

        public CustomAction(android.os.Parcel parcel) {
            this.f15584h = parcel.readString();
            this.f15585i = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.j = parcel.readInt();
            this.f15586k = parcel.readBundle(android.support.v4.media.session.q.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(android.os.Parcel parcel) {
        this.f15573h = parcel.readInt();
        this.f15574i = parcel.readLong();
        this.f15575k = parcel.readFloat();
        this.f15579o = parcel.readLong();
        this.j = parcel.readLong();
        this.f15576l = parcel.readLong();
        this.f15578n = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f15580p = parcel.createTypedArrayList(android.support.v4.media.session.PlaybackStateCompat.CustomAction.CREATOR);
        this.f15581q = parcel.readLong();
        this.f15582r = parcel.readBundle(android.support.v4.media.session.q.class.getClassLoader());
        this.f15577m = parcel.readInt();
    }
}
