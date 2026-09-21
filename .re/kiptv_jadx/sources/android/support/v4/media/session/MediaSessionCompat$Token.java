package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionCompat$Token implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat$Token> CREATOR = new android.support.v4.media.session.p(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f15567i;
    public android.support.v4.media.session.d j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f15566h = new java.lang.Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C2.d f15568k = null;

    public MediaSessionCompat$Token(java.lang.Object obj, android.support.v4.media.session.l lVar) {
        this.f15567i = obj;
        this.j = lVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof android.support.v4.media.session.MediaSessionCompat$Token)) {
            return false;
        }
        android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token = (android.support.v4.media.session.MediaSessionCompat$Token) obj;
        java.lang.Object obj2 = this.f15567i;
        if (obj2 == null) {
            return mediaSessionCompat$Token.f15567i == null;
        }
        java.lang.Object obj3 = mediaSessionCompat$Token.f15567i;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f15567i;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeParcelable((android.os.Parcelable) this.f15567i, i3);
    }
}
