package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001c\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u001e\u0010\rJ5\u0010#\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b%\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/common/FileHelper;", "", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "", "filePath", "Lkotlin/Function1;", "Ljava/io/BufferedReader;", "Lh6/A;", "contentBlock", "openBufferedReader", "(Ljava/lang/String;Lx6/j;)V", "Ljava/io/File;", "getFileInFilesDir", "(Ljava/lang/String;)Ljava/io/File;", "getFilesDir", "()Ljava/io/File;", "", "fileSizeInKB", "(Ljava/lang/String;)D", "contentToAppend", "appendToFile", "(Ljava/lang/String;Ljava/lang/String;)V", "", "deleteFile", "(Ljava/lang/String;)Z", "LN7/m;", "block", "readFilePerLines", "", "numberOfLinesToRemove", "", "onException", "removeFirstLinesFromFile", "(Ljava/lang/String;ILx6/j;)V", "fileIsEmpty", "Landroid/content/Context;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FileHelper {
    private final android.content.Context applicationContext;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.FileHelper$readFilePerLines$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/BufferedReader;", "bufferedReader", "Lh6/A;", "invoke", "(Ljava/io/BufferedReader;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ p194x6.j $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p194x6.j jVar) {
            super(1);
            this.$block = jVar;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((java.io.BufferedReader) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(java.io.BufferedReader bufferedReader) {
            kotlin.jvm.internal.m.e(bufferedReader, "bufferedReader");
            this.$block.invoke(N7.o.h0(new N7.p(5, bufferedReader)));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.FileHelper$removeFirstLinesFromFile$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LN7/m;", "", "sequence", "Lh6/A;", "invoke", "(LN7/m;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20361 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ int $numberOfLinesToRemove;
        final /* synthetic */ java.lang.StringBuilder $textToAppend;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20361(int i3, java.lang.StringBuilder sb) {
            super(1);
            this.$numberOfLinesToRemove = i3;
            this.$textToAppend = sb;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((N7.m) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(N7.m sequence) {
            kotlin.jvm.internal.m.e(sequence, "sequence");
            N7.m mVarJ0 = N7.o.j0(sequence, this.$numberOfLinesToRemove);
            java.lang.StringBuilder sb = this.$textToAppend;
            java.util.Iterator it = mVarJ0.iterator();
            while (it.hasNext()) {
                sb.append((java.lang.String) it.next());
                sb.append("\n");
            }
        }
    }

    public FileHelper(android.content.Context applicationContext) {
        kotlin.jvm.internal.m.e(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    private final java.io.File getFileInFilesDir(java.lang.String filePath) {
        return new java.io.File(getFilesDir(), filePath);
    }

    private final java.io.File getFilesDir() {
        java.io.File filesDir = this.applicationContext.getFilesDir();
        kotlin.jvm.internal.m.d(filesDir, "applicationContext.filesDir");
        return filesDir;
    }

    private final void openBufferedReader(java.lang.String filePath, p194x6.j contentBlock) throws java.io.IOException {
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(getFileInFilesDir(filePath));
            try {
                java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(fileInputStream);
                try {
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(inputStreamReader);
                    try {
                        contentBlock.invoke(bufferedReader);
                        bufferedReader.close();
                        inputStreamReader.close();
                        fileInputStream.close();
                    } catch (java.lang.Throwable th) {
                        try {
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            com.google.android.gms.internal.play_billing.AbstractC1833d1.l(bufferedReader, th);
                            throw th2;
                        }
                    }
                } catch (java.lang.Throwable th3) {
                    try {
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        com.google.android.gms.internal.play_billing.AbstractC1833d1.l(inputStreamReader, th3);
                        throw th4;
                    }
                }
            } catch (java.lang.Throwable th5) {
                try {
                    throw th5;
                } catch (java.lang.Throwable th6) {
                    com.google.android.gms.internal.play_billing.AbstractC1833d1.l(fileInputStream, th5);
                    throw th6;
                }
            }
        } catch (java.io.FileNotFoundException unused) {
            com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
            com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), "FileHelper: file not found when trying to read: " + filePath + ". Treating as empty.");
            }
        }
    }

    public static /* synthetic */ void removeFirstLinesFromFile$default(com.revenuecat.purchases.common.FileHelper fileHelper, java.lang.String str, int i3, p194x6.j jVar, int i9, java.lang.Object obj) {
        if ((i9 & 4) != 0) {
            jVar = null;
        }
        fileHelper.removeFirstLinesFromFile(str, i3, jVar);
    }

    public final void appendToFile(java.lang.String filePath, java.lang.String contentToAppend) throws java.io.IOException {
        kotlin.jvm.internal.m.e(filePath, "filePath");
        kotlin.jvm.internal.m.e(contentToAppend, "contentToAppend");
        java.io.File fileInFilesDir = getFileInFilesDir(filePath);
        java.io.File parentFile = fileInFilesDir.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileInFilesDir, true);
        try {
            byte[] bytes = contentToAppend.getBytes(O7.a.f8024b);
            kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                com.google.android.gms.internal.play_billing.AbstractC1833d1.l(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public final boolean deleteFile(java.lang.String filePath) {
        kotlin.jvm.internal.m.e(filePath, "filePath");
        return getFileInFilesDir(filePath).delete();
    }

    public final boolean fileIsEmpty(java.lang.String filePath) {
        kotlin.jvm.internal.m.e(filePath, "filePath");
        java.io.File fileInFilesDir = getFileInFilesDir(filePath);
        return !fileInFilesDir.exists() || fileInFilesDir.length() == 0;
    }

    public final double fileSizeInKB(java.lang.String filePath) {
        kotlin.jvm.internal.m.e(filePath, "filePath");
        return com.revenuecat.purchases.utils.FileExtensionsKt.getSizeInKB(getFileInFilesDir(filePath));
    }

    public final void readFilePerLines(java.lang.String filePath, p194x6.j block) throws java.io.IOException {
        kotlin.jvm.internal.m.e(filePath, "filePath");
        kotlin.jvm.internal.m.e(block, "block");
        openBufferedReader(filePath, new com.revenuecat.purchases.common.FileHelper.AnonymousClass1(block));
    }

    public final void removeFirstLinesFromFile(java.lang.String filePath, int numberOfLinesToRemove, p194x6.j onException) {
        kotlin.jvm.internal.m.e(filePath, "filePath");
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            readFilePerLines(filePath, new com.revenuecat.purchases.common.FileHelper.C20361(numberOfLinesToRemove, sb));
            deleteFile(filePath);
            java.lang.String string = sb.toString();
            kotlin.jvm.internal.m.d(string, "textToAppend.toString()");
            appendToFile(filePath, string);
        } catch (java.io.FileNotFoundException e6) {
            if (onException != null) {
                onException.invoke(e6);
            }
            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", Y6.f.h("FileHelper: file not found when trying to remove first lines from file: ", filePath, ". Ignoring."), e6);
        } catch (java.lang.Throwable th) {
            if (onException != null) {
                onException.invoke(th);
            }
            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", Y6.f.h("FileHelper: error removing first lines from file: ", filePath, ". Ignoring."), th);
            throw th;
        }
    }
}
