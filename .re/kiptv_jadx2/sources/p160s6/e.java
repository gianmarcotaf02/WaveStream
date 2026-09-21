package p160s6;

import java.io.File;
import kotlin.jvm.internal.m;

public final class e extends d {

    public boolean f27361b;

    public File[] f27362c;

    public int f27363d;

    public boolean f27364e;

    public final h f27365f;

    public e(h hVar, File rootDir) {
        super(rootDir);
        m.e(rootDir, "rootDir");
        this.f27365f = hVar;
    }

    @Override
    public final File a() {
        boolean z6 = this.f27364e;
        File file = this.f27372a;
        h hVar = this.f27365f;
        if (!z6 && this.f27362c == null) {
            hVar.f27371k.getClass();
            File[] fileArrListFiles = file.listFiles();
            this.f27362c = fileArrListFiles;
            if (fileArrListFiles == null) {
                hVar.f27371k.getClass();
                this.f27364e = true;
            }
        }
        File[] fileArr = this.f27362c;
        if (fileArr != null && this.f27363d < fileArr.length) {
            m.b(fileArr);
            int i3 = this.f27363d;
            this.f27363d = i3 + 1;
            return fileArr[i3];
        }
        if (this.f27361b) {
            hVar.f27371k.getClass();
            return null;
        }
        this.f27361b = true;
        return file;
    }
}
