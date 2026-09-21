package p014b4;

/* JADX INFO: loaded from: classes.dex */
public final class E implements android.os.IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.os.IBinder f17875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f17876d;

    public E(android.os.IBinder iBinder, java.lang.String str) {
        this.f17875c = iBinder;
        this.f17876d = str;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f17875c;
    }
}
