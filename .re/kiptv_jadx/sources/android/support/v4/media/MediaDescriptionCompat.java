package android.support.v4.media;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.MediaDescriptionCompat> CREATOR = new T3.G(24);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f15550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.CharSequence f15551i;
    public final java.lang.CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.CharSequence f15552k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final android.graphics.Bitmap f15553l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final android.net.Uri f15554m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final android.os.Bundle f15555n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final android.net.Uri f15556o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public android.media.MediaDescription f15557p;

    public MediaDescriptionCompat(java.lang.String str, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, android.graphics.Bitmap bitmap, android.net.Uri uri, android.os.Bundle bundle, android.net.Uri uri2) {
        this.f15550h = str;
        this.f15551i = charSequence;
        this.j = charSequence2;
        this.f15552k = charSequence3;
        this.f15553l = bitmap;
        this.f15554m = uri;
        this.f15555n = bundle;
        this.f15556o = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        return ((java.lang.Object) this.f15551i) + ", " + ((java.lang.Object) this.j) + ", " + ((java.lang.Object) this.f15552k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        android.media.MediaDescription mediaDescriptionA = this.f15557p;
        if (mediaDescriptionA == null) {
            android.media.MediaDescription.Builder builderB = android.support.v4.media.a.b();
            android.support.v4.media.a.n(builderB, this.f15550h);
            android.support.v4.media.a.p(builderB, this.f15551i);
            android.support.v4.media.a.o(builderB, this.j);
            android.support.v4.media.a.j(builderB, this.f15552k);
            android.support.v4.media.a.l(builderB, this.f15553l);
            android.support.v4.media.a.m(builderB, this.f15554m);
            android.support.v4.media.a.k(builderB, this.f15555n);
            android.support.v4.media.b.b(builderB, this.f15556o);
            mediaDescriptionA = android.support.v4.media.a.a(builderB);
            this.f15557p = mediaDescriptionA;
        }
        mediaDescriptionA.writeToParcel(parcel, i3);
    }
}
