package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/http/ContentType$Companion;", "Ljava/io/File;", "file", "Lio/ktor/http/ContentType;", "defaultForFile", "(Lio/ktor/http/ContentType$Companion;Ljava/io/File;)Lio/ktor/http/ContentType;", "Ljava/nio/file/Path;", "path", "defaultForPath", "(Lio/ktor/http/ContentType$Companion;Ljava/nio/file/Path;)Lio/ktor/http/ContentType;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FileContentTypeJvmKt {
    public static final io.ktor.http.ContentType defaultForFile(io.ktor.http.ContentType.Companion companion, java.io.File file) {
        kotlin.jvm.internal.m.e(companion, "<this>");
        kotlin.jvm.internal.m.e(file, "file");
        io.ktor.http.ContentType.Companion companion2 = io.ktor.http.ContentType.INSTANCE;
        java.lang.String name = file.getName();
        kotlin.jvm.internal.m.d(name, "getName(...)");
        return io.ktor.http.FileContentTypeKt.selectDefault(io.ktor.http.FileContentTypeKt.fromFileExtension(companion2, O7.q.k1('.', name, "")));
    }

    public static final io.ktor.http.ContentType defaultForPath(io.ktor.http.ContentType.Companion companion, java.nio.file.Path path) {
        java.lang.String string;
        kotlin.jvm.internal.m.e(companion, "<this>");
        kotlin.jvm.internal.m.e(path, "path");
        io.ktor.http.ContentType.Companion companion2 = io.ktor.http.ContentType.INSTANCE;
        java.nio.file.Path fileName = path.getFileName();
        java.lang.String strK1 = "";
        if (fileName != null && (string = fileName.toString()) != null) {
            strK1 = O7.q.k1('.', string, "");
        }
        return io.ktor.http.FileContentTypeKt.selectDefault(io.ktor.http.FileContentTypeKt.fromFileExtension(companion2, strK1));
    }
}
