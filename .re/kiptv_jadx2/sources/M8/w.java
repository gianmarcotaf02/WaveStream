package M8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class w extends q {
    @Override
    public final v B(A a2) {
        return new v(false, new RandomAccessFile(a2.f(), "r"));
    }

    @Override
    public final I G(A file, boolean z6) throws IOException {
        kotlin.jvm.internal.m.e(file, "file");
        if (!z6 || !t(file)) {
            File fileF = file.f();
            Logger logger = y.f7290a;
            return new C0676d(new FileOutputStream(fileF, false), new M(), 1);
        }
        throw new IOException(file + " already exists.");
    }

    @Override
    public final K N(A file) {
        kotlin.jvm.internal.m.e(file, "file");
        File fileF = file.f();
        Logger logger = y.f7290a;
        return new C0677e(new FileInputStream(fileF), M.f7231d);
    }

    public void P(A source, A target) throws IOException {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(target, "target");
        if (source.f().renameTo(target.f())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override
    public final void e(A dir) throws IOException {
        kotlin.jvm.internal.m.e(dir, "dir");
        if (dir.f().mkdir()) {
            return;
        }
        p pVarZ = z(dir);
        if (pVarZ == null || !pVarZ.f7269b) {
            throw new IOException("failed to create directory: " + dir);
        }
    }

    @Override
    public final void i(A path) throws IOException {
        kotlin.jvm.internal.m.e(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File fileF = path.f();
        if (fileF.delete() || !fileF.exists()) {
            return;
        }
        throw new IOException("failed to delete " + path);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override
    public final List u(A a2) throws IOException {
        File fileF = a2.f();
        String[] list = fileF.list();
        if (list == null) {
            if (fileF.exists()) {
                throw new IOException("failed to list " + a2);
            }
            throw new FileNotFoundException("no such file: " + a2);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            kotlin.jvm.internal.m.b(str);
            arrayList.add(a2.e(str));
        }
        p078i6.t.K0(arrayList);
        return arrayList;
    }

    @Override
    public p z(A path) {
        kotlin.jvm.internal.m.e(path, "path");
        File fileF = path.f();
        boolean zIsFile = fileF.isFile();
        boolean zIsDirectory = fileF.isDirectory();
        long jLastModified = fileF.lastModified();
        long length = fileF.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !fileF.exists()) {
            return null;
        }
        return new p(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }
}
