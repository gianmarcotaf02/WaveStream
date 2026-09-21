package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0019\u0010\u0002\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\b¨\u0006\t"}, d2 = {"Ljava/nio/file/Path;", "relativePath", "combineSafe", "(Ljava/nio/file/Path;Ljava/nio/file/Path;)Ljava/nio/file/Path;", "normalizeAndRelativize", "(Ljava/nio/file/Path;)Ljava/nio/file/Path;", "dropLeadingTopDirs", "Ljava/io/File;", "(Ljava/io/File;Ljava/nio/file/Path;)Ljava/io/File;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class NioPathKt {
    public static final java.nio.file.Path combineSafe(java.nio.file.Path path, java.nio.file.Path relativePath) {
        kotlin.jvm.internal.m.e(path, "<this>");
        kotlin.jvm.internal.m.e(relativePath, "relativePath");
        java.nio.file.Path pathNormalizeAndRelativize = normalizeAndRelativize(relativePath);
        if (pathNormalizeAndRelativize.startsWith("..")) {
            androidx.media3.exoplayer.scheduler.a.l();
            throw io.ktor.util.c.k(relativePath.toString(), "Relative path " + relativePath + " beginning with .. is invalid");
        }
        if (pathNormalizeAndRelativize.isAbsolute()) {
            throw new java.lang.IllegalStateException(("Bad relative path " + relativePath).toString());
        }
        if (path.getNameCount() == 0) {
            return pathNormalizeAndRelativize;
        }
        java.nio.file.Path pathResolve = path.resolve(pathNormalizeAndRelativize);
        kotlin.jvm.internal.m.d(pathResolve, "resolve(...)");
        return pathResolve;
    }

    private static final java.nio.file.Path dropLeadingTopDirs(java.nio.file.Path path) {
        java.util.Iterator it = path.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            java.lang.Object next = it.next();
            if (i3 < 0) {
                p078i6.p.H0();
                throw null;
            }
            if (!kotlin.jvm.internal.m.a(androidx.media3.exoplayer.scheduler.a.i(next).toString(), "..")) {
                break;
            }
            i3++;
        }
        if (i3 <= 0) {
            return path;
        }
        java.nio.file.Path pathSubpath = path.subpath(i3, path.getNameCount());
        kotlin.jvm.internal.m.d(pathSubpath, "subpath(...)");
        return pathSubpath;
    }

    public static final java.nio.file.Path normalizeAndRelativize(java.nio.file.Path path) {
        java.nio.file.Path pathRelativize;
        java.nio.file.Path pathNormalize;
        java.nio.file.Path pathDropLeadingTopDirs;
        kotlin.jvm.internal.m.e(path, "<this>");
        java.nio.file.Path root = path.getRoot();
        if (root != null && (pathRelativize = root.relativize(path)) != null && (pathNormalize = pathRelativize.normalize()) != null && (pathDropLeadingTopDirs = dropLeadingTopDirs(pathNormalize)) != null) {
            return pathDropLeadingTopDirs;
        }
        java.nio.file.Path pathNormalize2 = path.normalize();
        kotlin.jvm.internal.m.d(pathNormalize2, "normalize(...)");
        return dropLeadingTopDirs(pathNormalize2);
    }

    public static final java.io.File combineSafe(java.io.File file, java.nio.file.Path relativePath) {
        kotlin.jvm.internal.m.e(file, "<this>");
        kotlin.jvm.internal.m.e(relativePath, "relativePath");
        java.nio.file.Path pathNormalizeAndRelativize = normalizeAndRelativize(relativePath);
        if (!pathNormalizeAndRelativize.startsWith("..")) {
            if (!pathNormalizeAndRelativize.isAbsolute()) {
                return new java.io.File(file, pathNormalizeAndRelativize.toString());
            }
            throw new java.lang.IllegalStateException(("Bad relative path " + relativePath).toString());
        }
        androidx.media3.exoplayer.scheduler.a.l();
        throw io.ktor.util.c.k(relativePath.toString(), "Relative path " + relativePath + " beginning with .. is invalid");
    }
}
