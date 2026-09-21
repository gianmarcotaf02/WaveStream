package p046f;

/* JADX INFO: loaded from: classes.dex */
public final class h implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p046f.h> CREATOR = new androidx.recyclerview.widget.d0(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.content.IntentSender f21619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final android.content.Intent f21620i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f21621k;

    public h(android.content.IntentSender intentSender, android.content.Intent intent, int i3, int i9) {
        kotlin.jvm.internal.m.e(intentSender, "intentSender");
        this.f21619h = intentSender;
        this.f21620i = intent;
        this.j = i3;
        this.f21621k = i9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int i3) {
        kotlin.jvm.internal.m.e(dest, "dest");
        dest.writeParcelable(this.f21619h, i3);
        dest.writeParcelable(this.f21620i, i3);
        dest.writeInt(this.j);
        dest.writeInt(this.f21621k);
    }
}
