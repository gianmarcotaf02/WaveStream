package p046f;

/* JADX INFO: loaded from: classes.dex */
public final class a implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p046f.a> CREATOR = new androidx.recyclerview.widget.d0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final android.content.Intent f21607i;

    public a(android.content.Intent intent, int i3) {
        this.f21606h = i3;
        this.f21607i = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityResult{resultCode=");
        int i3 = this.f21606h;
        if (i3 != -1) {
            strValueOf = i3 != 0 ? java.lang.String.valueOf(i3) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        sb.append(strValueOf);
        sb.append(", data=");
        sb.append(this.f21607i);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int i3) {
        kotlin.jvm.internal.m.e(dest, "dest");
        dest.writeInt(this.f21606h);
        android.content.Intent intent = this.f21607i;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i3);
        }
    }
}
