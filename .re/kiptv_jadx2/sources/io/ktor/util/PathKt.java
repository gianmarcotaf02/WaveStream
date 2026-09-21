package io.ktor.util;

import O7.q;
import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.AbstractC1903s;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p078i6.o;
import p160s6.k;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\u0006\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u0013\u0010\f\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\u0006¨\u0006\u0013"}, d2 = {"Ljava/io/File;", "", "relativePath", "combineSafe", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "normalizeAndRelativize", "(Ljava/io/File;)Ljava/io/File;", "dir", "(Ljava/io/File;Ljava/io/File;)Ljava/io/File;", "notRooted", "path", "", "dropLeadingTopDirs", "(Ljava/lang/String;)I", "", "", "isPathSeparator", "(C)Z", "isPathSeparatorOrDot", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PathKt {
    public static final File combineSafe(File file, String relativePath) {
        m.e(file, "<this>");
        m.e(relativePath, "relativePath");
        return combineSafe(file, new File(relativePath));
    }

    public static final int dropLeadingTopDirs(String path) {
        m.e(path, "path");
        int length = path.length() - 1;
        int i3 = 0;
        while (i3 <= length) {
            char cCharAt = path.charAt(i3);
            if (!isPathSeparator(cCharAt)) {
                if (cCharAt != '.') {
                    break;
                }
                if (i3 == length) {
                    return i3 + 1;
                }
                char cCharAt2 = path.charAt(i3 + 1);
                int i9 = 2;
                if (!isPathSeparator(cCharAt2)) {
                    if (cCharAt2 == '.') {
                        int i10 = i3 + 2;
                        if (i10 != path.length()) {
                            if (!isPathSeparator(path.charAt(i10))) {
                                break;
                            }
                            i9 = 3;
                        }
                    } else {
                        break;
                    }
                }
                i3 += i9;
            } else {
                i3++;
            }
        }
        return i3;
    }

    private static final boolean isPathSeparator(char c9) {
        return c9 == '\\' || c9 == '/';
    }

    private static final boolean isPathSeparatorOrDot(char c9) {
        return c9 == '.' || isPathSeparator(c9);
    }

    public static final File normalizeAndRelativize(File file) {
        m.e(file, "<this>");
        p160s6.c cVarJ = AbstractC1903s.J(file);
        ?? r9 = cVarJ.f27360b;
        ArrayList arrayList = new ArrayList(r9.size());
        for (File file2 : r9) {
            String name = file2.getName();
            if (!m.a(name, ".")) {
                if (!m.a(name, "..")) {
                    arrayList.add(file2);
                } else if (arrayList.isEmpty() || m.a(((File) o.q1(arrayList)).getName(), "..")) {
                    arrayList.add(file2);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        String separator = File.separator;
        m.d(separator, "separator");
        return dropLeadingTopDirs(notRooted(k.S(cVarJ.f27359a, o.o1(arrayList, separator, null, null, null, 62))));
    }

    private static final File notRooted(File file) {
        String strSubstring;
        m.e(file, "<this>");
        String path = file.getPath();
        m.d(path, "getPath(...)");
        if (AbstractC1903s.z(path) <= 0) {
            return file;
        }
        File file2 = file;
        while (true) {
            File parentFile = file2.getParentFile();
            if (parentFile == null) {
                break;
            }
            file2 = parentFile;
        }
        String path2 = file.getPath();
        m.d(path2, "getPath(...)");
        String strD0 = q.D0(file2.getName().length(), path2);
        int length = strD0.length();
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = strD0.charAt(i3);
            if (cCharAt != '\\' && cCharAt != '/') {
                strSubstring = strD0.substring(i3);
                m.d(strSubstring, "substring(...)");
                return new File(strSubstring);
            }
        }
        strSubstring = "";
        return new File(strSubstring);
    }

    private static final File combineSafe(File file, File file2) {
        File fileNormalizeAndRelativize = normalizeAndRelativize(file2);
        m.e(fileNormalizeAndRelativize, "<this>");
        File file3 = new File("..");
        p160s6.c cVarJ = AbstractC1903s.J(fileNormalizeAndRelativize);
        p160s6.c cVarJ2 = AbstractC1903s.J(file3);
        boolean zEquals = false;
        if (cVarJ.f27359a.equals(cVarJ2.f27359a)) {
            ?? r9 = cVarJ.f27360b;
            int size = r9.size();
            ?? r10 = cVarJ2.f27360b;
            if (size >= r10.size()) {
                zEquals = r9.subList(0, r10.size()).equals(r10);
            }
        }
        if (zEquals) {
            throw new IllegalArgumentException("Bad relative path " + file2);
        }
        if (!fileNormalizeAndRelativize.isAbsolute()) {
            return new File(file, fileNormalizeAndRelativize.getPath());
        }
        throw new IllegalStateException(("Bad relative path " + file2).toString());
    }

    private static final File dropLeadingTopDirs(File file) {
        String path = file.getPath();
        if (path == null) {
            path = "";
        }
        int iDropLeadingTopDirs = dropLeadingTopDirs(path);
        if (iDropLeadingTopDirs == 0) {
            return file;
        }
        if (iDropLeadingTopDirs >= file.getPath().length()) {
            return new File(".");
        }
        String path2 = file.getPath();
        m.d(path2, "getPath(...)");
        String strSubstring = path2.substring(iDropLeadingTopDirs);
        m.d(strSubstring, "substring(...)");
        return new File(strSubstring);
    }
}
