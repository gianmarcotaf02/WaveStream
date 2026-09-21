package M8;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends M8.w {
    public static java.lang.Long T(java.nio.file.attribute.FileTime fileTime) {
        long millis = fileTime.toMillis();
        java.lang.Long lValueOf = java.lang.Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // M8.w
    public final void P(M8.A source, M8.A target) throws java.io.IOException {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(target, "target");
        try {
            java.nio.file.Files.move(source.g(), target.g(), java.nio.file.StandardCopyOption.ATOMIC_MOVE, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        } catch (java.lang.UnsupportedOperationException unused) {
            throw new java.io.IOException("atomic move not supported");
        } catch (java.nio.file.NoSuchFileException e6) {
            throw new java.io.FileNotFoundException(e6.getMessage());
        }
    }

    @Override // M8.w
    public final java.lang.String toString() {
        return "NioSystemFileSystem";
    }

    @Override // M8.w, M8.q
    public final M8.p z(M8.A path) {
        M8.A aK;
        kotlin.jvm.internal.m.e(path, "path");
        java.nio.file.Path pathG = path.g();
        try {
            java.nio.file.attribute.BasicFileAttributes attributes = java.nio.file.Files.readAttributes(pathG, (java.lang.Class<java.nio.file.attribute.BasicFileAttributes>) java.nio.file.attribute.BasicFileAttributes.class, java.nio.file.LinkOption.NOFOLLOW_LINKS);
            java.nio.file.Path symbolicLink = attributes.isSymbolicLink() ? java.nio.file.Files.readSymbolicLink(pathG) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                java.lang.String str = M8.A.f7207i;
                aK = B3.o.k(symbolicLink.toString(), false);
            } else {
                aK = null;
            }
            java.lang.Long lValueOf = java.lang.Long.valueOf(attributes.size());
            java.nio.file.attribute.FileTime fileTimeCreationTime = attributes.creationTime();
            java.lang.Long lT = fileTimeCreationTime != null ? T(fileTimeCreationTime) : null;
            java.nio.file.attribute.FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            java.lang.Long lT2 = fileTimeLastModifiedTime != null ? T(fileTimeLastModifiedTime) : null;
            java.nio.file.attribute.FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new M8.p(zIsRegularFile, zIsDirectory, aK, lValueOf, lT, lT2, fileTimeLastAccessTime != null ? T(fileTimeLastAccessTime) : null);
        } catch (java.nio.file.NoSuchFileException | java.nio.file.FileSystemException unused) {
            return null;
        }
    }
}
