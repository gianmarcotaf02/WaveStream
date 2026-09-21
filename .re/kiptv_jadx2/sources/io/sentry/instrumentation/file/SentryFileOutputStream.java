package io.sentry.instrumentation.file;

import io.sentry.IScopes;
import io.sentry.ISpan;
import io.sentry.ScopesAdapter;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public final class SentryFileOutputStream extends FileOutputStream implements AutoCloseable {
    private final FileOutputStream delegate;
    private final FileIOSpanManager spanManager;

    private static FileDescriptor getFileDescriptor(FileOutputStream fileOutputStream) throws FileNotFoundException {
        try {
            return fileOutputStream.getFD();
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    public static FileOutputStreamInitData init(File file, boolean z6, FileOutputStream fileOutputStream, IScopes iScopes) {
        ISpan iSpanStartSpan = FileIOSpanManager.startSpan(iScopes, "file.write");
        if (fileOutputStream == null) {
            fileOutputStream = new FileOutputStream(file, z6);
        }
        return new FileOutputStreamInitData(file, z6, iSpanStartSpan, fileOutputStream, iScopes.getOptions());
    }

    public Integer lambda$write$0(int i3) throws IOException {
        this.delegate.write(i3);
        return 1;
    }

    public Integer lambda$write$1(byte[] bArr) throws IOException {
        this.delegate.write(bArr);
        return Integer.valueOf(bArr.length);
    }

    public Integer lambda$write$2(byte[] bArr, int i3, int i9) throws IOException {
        this.delegate.write(bArr, i3, i9);
        return Integer.valueOf(i9);
    }

    @Override
    public void close() {
        this.spanManager.finish(this.delegate);
    }

    @Override
    public void write(final int i3) throws IOException {
        this.spanManager.performIO(new FileIOSpanManager.FileIOCallable() {
            @Override
            public final Object call() {
                return this.f23507a.lambda$write$0(i3);
            }
        });
    }

    @Override
    public void write(byte[] bArr) throws IOException {
        this.spanManager.performIO(new c(this, bArr, 2));
    }

    public SentryFileOutputStream(String str) {
        this(str != null ? new File(str) : null, false, (IScopes) ScopesAdapter.getInstance());
    }

    @Override
    public void write(byte[] bArr, int i3, int i9) throws IOException {
        this.spanManager.performIO(new b(this, bArr, i3, i9, 1));
    }

    public SentryFileOutputStream(String str, boolean z6) {
        this(init(str != null ? new File(str) : null, z6, null, ScopesAdapter.getInstance()));
    }

    public static FileOutputStreamInitData init(FileDescriptor fileDescriptor, FileOutputStream fileOutputStream, IScopes iScopes) {
        ISpan iSpanStartSpan = FileIOSpanManager.startSpan(iScopes, "file.write");
        if (fileOutputStream == null) {
            fileOutputStream = new FileOutputStream(fileDescriptor);
        }
        return new FileOutputStreamInitData(null, false, iSpanStartSpan, fileOutputStream, iScopes.getOptions());
    }

    public SentryFileOutputStream(File file) {
        this(file, false, (IScopes) ScopesAdapter.getInstance());
    }

    public static final class Factory {
        public static FileOutputStream create(FileOutputStream fileOutputStream, String str) {
            if (isTracingEnabled(ScopesAdapter.getInstance())) {
                return new SentryFileOutputStream(SentryFileOutputStream.init(str != null ? new File(str) : null, false, fileOutputStream, ScopesAdapter.getInstance()));
            }
            return fileOutputStream;
        }

        private static boolean isTracingEnabled(IScopes iScopes) {
            return iScopes.getOptions().isTracingEnabled();
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, String str, boolean z6) {
            if (isTracingEnabled(ScopesAdapter.getInstance())) {
                return new SentryFileOutputStream(SentryFileOutputStream.init(str != null ? new File(str) : null, z6, fileOutputStream, ScopesAdapter.getInstance()));
            }
            return fileOutputStream;
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, File file) {
            return isTracingEnabled(ScopesAdapter.getInstance()) ? new SentryFileOutputStream(SentryFileOutputStream.init(file, false, fileOutputStream, ScopesAdapter.getInstance())) : fileOutputStream;
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, File file, boolean z6) {
            return isTracingEnabled(ScopesAdapter.getInstance()) ? new SentryFileOutputStream(SentryFileOutputStream.init(file, z6, fileOutputStream, ScopesAdapter.getInstance())) : fileOutputStream;
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, FileDescriptor fileDescriptor) {
            return isTracingEnabled(ScopesAdapter.getInstance()) ? new SentryFileOutputStream(SentryFileOutputStream.init(fileDescriptor, fileOutputStream, ScopesAdapter.getInstance()), fileDescriptor) : fileOutputStream;
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, File file, IScopes iScopes) {
            return isTracingEnabled(iScopes) ? new SentryFileOutputStream(SentryFileOutputStream.init(file, false, fileOutputStream, iScopes)) : fileOutputStream;
        }
    }

    public SentryFileOutputStream(File file, boolean z6) {
        this(init(file, z6, null, ScopesAdapter.getInstance()));
    }

    public SentryFileOutputStream(FileDescriptor fileDescriptor) {
        this(init(fileDescriptor, null, ScopesAdapter.getInstance()), fileDescriptor);
    }

    public SentryFileOutputStream(File file, boolean z6, IScopes iScopes) {
        this(init(file, z6, null, iScopes));
    }

    private SentryFileOutputStream(FileOutputStreamInitData fileOutputStreamInitData, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.spanManager = new FileIOSpanManager(fileOutputStreamInitData.span, fileOutputStreamInitData.file, fileOutputStreamInitData.options);
        this.delegate = fileOutputStreamInitData.delegate;
    }

    private SentryFileOutputStream(FileOutputStreamInitData fileOutputStreamInitData) {
        super(getFileDescriptor(fileOutputStreamInitData.delegate));
        this.spanManager = new FileIOSpanManager(fileOutputStreamInitData.span, fileOutputStreamInitData.file, fileOutputStreamInitData.options);
        this.delegate = fileOutputStreamInitData.delegate;
    }
}
