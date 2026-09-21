package p160s6;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends p160s6.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f27367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.io.File[] f27368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p160s6.h f27370e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p160s6.h hVar, java.io.File rootDir) {
        super(rootDir);
        kotlin.jvm.internal.m.e(rootDir, "rootDir");
        this.f27370e = hVar;
    }

    @Override // p160s6.i
    public final java.io.File a() {
        boolean z6 = this.f27367b;
        java.io.File file = this.f27372a;
        p160s6.h hVar = this.f27370e;
        if (!z6) {
            hVar.f27371k.getClass();
            this.f27367b = true;
            return file;
        }
        java.io.File[] fileArr = this.f27368c;
        if (fileArr != null && this.f27369d >= fileArr.length) {
            hVar.f27371k.getClass();
            return null;
        }
        if (fileArr == null) {
            java.io.File[] fileArrListFiles = file.listFiles();
            this.f27368c = fileArrListFiles;
            if (fileArrListFiles == null) {
                hVar.f27371k.getClass();
            }
            java.io.File[] fileArr2 = this.f27368c;
            if (fileArr2 == null || fileArr2.length == 0) {
                hVar.f27371k.getClass();
                return null;
            }
        }
        java.io.File[] fileArr3 = this.f27368c;
        kotlin.jvm.internal.m.b(fileArr3);
        int i3 = this.f27369d;
        this.f27369d = i3 + 1;
        return fileArr3[i3];
    }
}
