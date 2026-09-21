package io.ktor.http;

import O7.q;
import androidx.media3.container.NalUnitUtil;
import java.io.File;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/http/ContentType$Companion;", "Ljava/io/File;", "file", "Lio/ktor/http/ContentType;", "defaultForFile", "(Lio/ktor/http/ContentType$Companion;Ljava/io/File;)Lio/ktor/http/ContentType;", "Ljava/nio/file/Path;", "path", "defaultForPath", "(Lio/ktor/http/ContentType$Companion;Ljava/nio/file/Path;)Lio/ktor/http/ContentType;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FileContentTypeJvmKt {
    public static final ContentType defaultForFile(ContentType.Companion companion, File file) {
        m.e(companion, "<this>");
        m.e(file, "file");
        ContentType.Companion companion2 = ContentType.INSTANCE;
        String name = file.getName();
        m.d(name, "getName(...)");
        return FileContentTypeKt.selectDefault(FileContentTypeKt.fromFileExtension(companion2, q.k1('.', name, "")));
    }

    public static final ContentType defaultForPath(ContentType.Companion companion, Path path) {
        String string;
        m.e(companion, "<this>");
        m.e(path, "path");
        ContentType.Companion companion2 = ContentType.INSTANCE;
        Path fileName = path.getFileName();
        String strK1 = "";
        if (fileName != null && (string = fileName.toString()) != null) {
            strK1 = q.k1('.', string, "");
        }
        return FileContentTypeKt.selectDefault(FileContentTypeKt.fromFileExtension(companion2, strK1));
    }
}
