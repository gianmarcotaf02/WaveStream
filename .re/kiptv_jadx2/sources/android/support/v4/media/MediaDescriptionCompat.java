package android.support.v4.media;

import T3.G;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new G(24);

    public final String f15550h;

    public final CharSequence f15551i;
    public final CharSequence j;

    public final CharSequence f15552k;

    public final Bitmap f15553l;

    public final Uri f15554m;

    public final Bundle f15555n;

    public final Uri f15556o;

    public MediaDescription f15557p;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f15550h = str;
        this.f15551i = charSequence;
        this.j = charSequence2;
        this.f15552k = charSequence3;
        this.f15553l = bitmap;
        this.f15554m = uri;
        this.f15555n = bundle;
        this.f15556o = uri2;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f15551i) + ", " + ((Object) this.j) + ", " + ((Object) this.f15552k);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        MediaDescription mediaDescriptionA = this.f15557p;
        if (mediaDescriptionA == null) {
            MediaDescription.Builder builderB = a.b();
            a.n(builderB, this.f15550h);
            a.p(builderB, this.f15551i);
            a.o(builderB, this.j);
            a.j(builderB, this.f15552k);
            a.l(builderB, this.f15553l);
            a.m(builderB, this.f15554m);
            a.k(builderB, this.f15555n);
            b.b(builderB, this.f15556o);
            mediaDescriptionA = a.a(builderB);
            this.f15557p = mediaDescriptionA;
        }
        mediaDescriptionA.writeToParcel(parcel, i3);
    }
}
