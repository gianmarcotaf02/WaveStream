package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1577f implements p068h4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17017b;

    public /* synthetic */ C1577f(int i3, int i9) {
        this.f17016a = i9;
        this.f17017b = i3;
    }

    @Override // p068h4.j
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.f17016a) {
            case 0:
                return androidx.media3.session.ConnectionState.lambda$fromBundle$4(this.f17017b, (android.os.Bundle) obj);
            case 1:
                return androidx.media3.session.ConnectionState.lambda$fromBundle$5(this.f17017b, (android.os.Bundle) obj);
            case 2:
                return androidx.media3.session.ConnectionState.lambda$fromBundle$6(this.f17017b, (android.os.Bundle) obj);
            case 3:
                return androidx.media3.session.ConnectionState.lambda$toBundleForRemoteProcess$0(this.f17017b, (androidx.media3.session.CommandButton) obj);
            case 4:
                return androidx.media3.session.ConnectionState.lambda$toBundleForRemoteProcess$1(this.f17017b, (androidx.media3.session.CommandButton) obj);
            case 5:
                return androidx.media3.session.ConnectionState.lambda$toBundleForRemoteProcess$2(this.f17017b, (androidx.media3.session.CommandButton) obj);
            case 6:
                return androidx.media3.session.ConnectionState.lambda$toBundleForRemoteProcess$3(this.f17017b, (androidx.media3.session.CommandButton) obj);
            case 7:
                return androidx.media3.session.LibraryResult.lambda$fromBundle$1(this.f17017b, (android.os.Bundle) obj);
            default:
                return androidx.media3.session.LibraryResult.lambda$toBundle$0(this.f17017b, (androidx.media3.common.MediaItem) obj);
        }
    }
}
