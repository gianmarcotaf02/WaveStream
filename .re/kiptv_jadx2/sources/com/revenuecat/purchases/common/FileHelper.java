package com.revenuecat.purchases.common;

import N7.p;
import O7.a;
import Y6.f;
import android.content.Context;
import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.android.gms.internal.play_billing.M0;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.utils.FileExtensionsKt;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p070h6.A;
import p194x6.j;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001c\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u001e\u0010\rJ5\u0010#\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b%\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/common/FileHelper;", "", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "", "filePath", "Lkotlin/Function1;", "Ljava/io/BufferedReader;", "Lh6/A;", "contentBlock", "openBufferedReader", "(Ljava/lang/String;Lx6/j;)V", "Ljava/io/File;", "getFileInFilesDir", "(Ljava/lang/String;)Ljava/io/File;", "getFilesDir", "()Ljava/io/File;", "", "fileSizeInKB", "(Ljava/lang/String;)D", "contentToAppend", "appendToFile", "(Ljava/lang/String;Ljava/lang/String;)V", "", "deleteFile", "(Ljava/lang/String;)Z", "LN7/m;", "block", "readFilePerLines", "", "numberOfLinesToRemove", "", "onException", "removeFirstLinesFromFile", "(Ljava/lang/String;ILx6/j;)V", "fileIsEmpty", "Landroid/content/Context;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FileHelper {
    private final Context applicationContext;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/BufferedReader;", "bufferedReader", "Lh6/A;", "invoke", "(Ljava/io/BufferedReader;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends o implements j {
        final j $block;

        public AnonymousClass1(j jVar) {
            super(1);
            this.$block = jVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((BufferedReader) obj);
            return A.f22523a;
        }

        public final void invoke(BufferedReader bufferedReader) {
            m.e(bufferedReader, "bufferedReader");
            this.$block.invoke(N7.o.h0(new p(5, bufferedReader)));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LN7/m;", "", "sequence", "Lh6/A;", "invoke", "(LN7/m;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20361 extends o implements j {
        final int $numberOfLinesToRemove;
        final StringBuilder $textToAppend;

        public C20361(int i3, StringBuilder sb) {
            super(1);
            this.$numberOfLinesToRemove = i3;
            this.$textToAppend = sb;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((N7.m) obj);
            return A.f22523a;
        }

        public final void invoke(N7.m sequence) {
            m.e(sequence, "sequence");
            N7.m mVarJ0 = N7.o.j0(sequence, this.$numberOfLinesToRemove);
            StringBuilder sb = this.$textToAppend;
            Iterator it = mVarJ0.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append("\n");
            }
        }
    }

    public FileHelper(Context applicationContext) {
        m.e(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    private final File getFileInFilesDir(String filePath) {
        return new File(getFilesDir(), filePath);
    }

    private final File getFilesDir() {
        File filesDir = this.applicationContext.getFilesDir();
        m.d(filesDir, "applicationContext.filesDir");
        return filesDir;
    }

    private final void openBufferedReader(String filePath, j contentBlock) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(getFileInFilesDir(filePath));
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        contentBlock.invoke(bufferedReader);
                        bufferedReader.close();
                        inputStreamReader.close();
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC1833d1.l(bufferedReader, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC1833d1.l(inputStreamReader, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    AbstractC1833d1.l(fileInputStream, th5);
                    throw th6;
                }
            }
        } catch (FileNotFoundException unused) {
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d(M0.m(logLevel, new StringBuilder("[Purchases] - ")), "FileHelper: file not found when trying to read: " + filePath + ". Treating as empty.");
            }
        }
    }

    public static void removeFirstLinesFromFile$default(FileHelper fileHelper, String str, int i3, j jVar, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            jVar = null;
        }
        fileHelper.removeFirstLinesFromFile(str, i3, jVar);
    }

    public final void appendToFile(String filePath, String contentToAppend) throws IOException {
        m.e(filePath, "filePath");
        m.e(contentToAppend, "contentToAppend");
        File fileInFilesDir = getFileInFilesDir(filePath);
        File parentFile = fileInFilesDir.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(fileInFilesDir, true);
        try {
            byte[] bytes = contentToAppend.getBytes(a.f8024b);
            m.d(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1833d1.l(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public final boolean deleteFile(String filePath) {
        m.e(filePath, "filePath");
        return getFileInFilesDir(filePath).delete();
    }

    public final boolean fileIsEmpty(String filePath) {
        m.e(filePath, "filePath");
        File fileInFilesDir = getFileInFilesDir(filePath);
        return !fileInFilesDir.exists() || fileInFilesDir.length() == 0;
    }

    public final double fileSizeInKB(String filePath) {
        m.e(filePath, "filePath");
        return FileExtensionsKt.getSizeInKB(getFileInFilesDir(filePath));
    }

    public final void readFilePerLines(String filePath, j block) throws IOException {
        m.e(filePath, "filePath");
        m.e(block, "block");
        openBufferedReader(filePath, new AnonymousClass1(block));
    }

    public final void removeFirstLinesFromFile(String filePath, int numberOfLinesToRemove, j onException) {
        m.e(filePath, "filePath");
        try {
            StringBuilder sb = new StringBuilder();
            readFilePerLines(filePath, new C20361(numberOfLinesToRemove, sb));
            deleteFile(filePath);
            String string = sb.toString();
            m.d(string, "textToAppend.toString()");
            appendToFile(filePath, string);
        } catch (FileNotFoundException e6) {
            if (onException != null) {
                onException.invoke(e6);
            }
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", f.h("FileHelper: file not found when trying to remove first lines from file: ", filePath, ". Ignoring."), e6);
        } catch (Throwable th) {
            if (onException != null) {
                onException.invoke(th);
            }
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", f.h("FileHelper: error removing first lines from file: ", filePath, ". Ignoring."), th);
            throw th;
        }
    }
}
