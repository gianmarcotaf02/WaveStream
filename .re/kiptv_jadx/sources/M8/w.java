package M8;

/* JADX INFO: loaded from: classes4.dex */
public class w extends M8.q {
    @Override // M8.q
    public final M8.v B(M8.A a2) {
        return new M8.v(false, new java.io.RandomAccessFile(a2.f(), "r"));
    }

    @Override // M8.q
    public final M8.I G(M8.A file, boolean z6) throws java.io.IOException {
        kotlin.jvm.internal.m.e(file, "file");
        if (!z6 || !t(file)) {
            java.io.File fileF = file.f();
            java.util.logging.Logger logger = M8.y.f7290a;
            return new M8.C0676d(new java.io.FileOutputStream(fileF, false), new M8.M(), 1);
        }
        throw new java.io.IOException(file + " already exists.");
    }

    @Override // M8.q
    public final M8.K N(M8.A file) {
        kotlin.jvm.internal.m.e(file, "file");
        java.io.File fileF = file.f();
        java.util.logging.Logger logger = M8.y.f7290a;
        return new M8.C0677e(new java.io.FileInputStream(fileF), M8.M.f7231d);
    }

    public void P(M8.A source, M8.A target) throws java.io.IOException {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(target, "target");
        if (source.f().renameTo(target.f())) {
            return;
        }
        throw new java.io.IOException("failed to move " + source + " to " + target);
    }

    @Override // M8.q
    public final void e(M8.A dir) throws java.io.IOException {
        kotlin.jvm.internal.m.e(dir, "dir");
        if (dir.f().mkdir()) {
            return;
        }
        M8.p pVarZ = z(dir);
        if (pVarZ == null || !pVarZ.f7269b) {
            throw new java.io.IOException("failed to create directory: " + dir);
        }
    }

    @Override // M8.q
    public final void i(M8.A path) throws java.io.IOException {
        kotlin.jvm.internal.m.e(path, "path");
        if (java.lang.Thread.interrupted()) {
            throw new java.io.InterruptedIOException("interrupted");
        }
        java.io.File fileF = path.f();
        if (fileF.delete() || !fileF.exists()) {
            return;
        }
        throw new java.io.IOException("failed to delete " + path);
    }

    public java.lang.String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // M8.q
    public final java.util.List u(M8.A a2) throws java.io.IOException {
        java.io.File fileF = a2.f();
        java.lang.String[] list = fileF.list();
        if (list == null) {
            if (fileF.exists()) {
                throw new java.io.IOException("failed to list " + a2);
            }
            throw new java.io.FileNotFoundException("no such file: " + a2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : list) {
            kotlin.jvm.internal.m.b(str);
            arrayList.add(a2.e(str));
        }
        p078i6.t.K0(arrayList);
        return arrayList;
    }

    @Override // M8.q
    public M8.p z(M8.A path) {
        kotlin.jvm.internal.m.e(path, "path");
        java.io.File fileF = path.f();
        boolean zIsFile = fileF.isFile();
        boolean zIsDirectory = fileF.isDirectory();
        long jLastModified = fileF.lastModified();
        long length = fileF.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !fileF.exists()) {
            return null;
        }
        return new M8.p(zIsFile, zIsDirectory, null, java.lang.Long.valueOf(length), null, java.lang.Long.valueOf(jLastModified), null);
    }
}
