package p160s6;

import java.io.File;
import kotlin.jvm.internal.m;

public final class g extends d {

    public boolean f27367b;

    public File[] f27368c;

    public int f27369d;

    public final h f27370e;

    public g(h hVar, File rootDir) {
        super(rootDir);
        m.e(rootDir, "rootDir");
        this.f27370e = hVar;
    }

    @Override
    public final File a() {
        boolean z6 = this.f27367b;
        File file = this.f27372a;
        h hVar = this.f27370e;
        if (!z6) {
            hVar.f27371k.getClass();
            this.f27367b = true;
            return file;
        }
        File[] fileArr = this.f27368c;
        if (fileArr != null && this.f27369d >= fileArr.length) {
            hVar.f27371k.getClass();
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f27368c = fileArrListFiles;
            if (fileArrListFiles == null) {
                hVar.f27371k.getClass();
            }
            File[] fileArr2 = this.f27368c;
            if (fileArr2 == null || fileArr2.length == 0) {
                hVar.f27371k.getClass();
                return null;
            }
        }
        File[] fileArr3 = this.f27368c;
        m.b(fileArr3);
        int i3 = this.f27369d;
        this.f27369d = i3 + 1;
        return fileArr3[i3];
    }
}
