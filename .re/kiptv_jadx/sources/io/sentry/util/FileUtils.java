package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class FileUtils {
    public static boolean deleteRecursively(java.io.File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return true;
        }
        for (java.io.File file2 : fileArrListFiles) {
            if (!deleteRecursively(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    public static byte[] readBytesFromFile(java.lang.String str, long j) throws java.io.IOException {
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            throw new java.io.IOException(Y6.f.h("File '", file.getName(), "' doesn't exists"));
        }
        if (!file.isFile()) {
            throw new java.io.IOException(Y6.f.h("Reading path ", str, " failed, because it's not a file."));
        }
        if (!file.canRead()) {
            throw new java.io.IOException(Y6.f.h("Reading the item ", str, " failed, because can't read the file."));
        }
        if (file.length() > j) {
            throw new java.io.IOException(java.lang.String.format("Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", str, java.lang.Long.valueOf(file.length()), java.lang.Long.valueOf(j)));
        }
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(str);
        try {
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(fileInputStream);
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i3 = bufferedInputStream.read(bArr);
                        if (i3 == -1) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            bufferedInputStream.close();
                            fileInputStream.close();
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr, 0, i3);
                        try {
                            bufferedInputStream.close();
                        } catch (java.lang.Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.lang.Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (java.lang.Throwable th4) {
                bufferedInputStream.close();
                throw th4;
            }
        } catch (java.lang.Throwable th5) {
            try {
                fileInputStream.close();
            } catch (java.lang.Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    public static java.lang.String readText(java.io.File file) throws java.io.IOException {
        if (file == null || !file.exists() || !file.isFile() || !file.canRead()) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file));
        try {
            java.lang.String line = bufferedReader.readLine();
            if (line != null) {
                sb.append(line);
            }
            while (true) {
                java.lang.String line2 = bufferedReader.readLine();
                if (line2 == null) {
                    bufferedReader.close();
                    return sb.toString();
                }
                sb.append("\n");
                sb.append(line2);
            }
        } catch (java.lang.Throwable th) {
            try {
                bufferedReader.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
