package io.sentry.instrumentation.file;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryFileOutputStream extends java.io.FileOutputStream implements java.lang.AutoCloseable {
    private final java.io.FileOutputStream delegate;
    private final io.sentry.instrumentation.file.FileIOSpanManager spanManager;

    private static java.io.FileDescriptor getFileDescriptor(java.io.FileOutputStream fileOutputStream) throws java.io.FileNotFoundException {
        try {
            return fileOutputStream.getFD();
        } catch (java.io.IOException unused) {
            throw new java.io.FileNotFoundException("No file descriptor");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static io.sentry.instrumentation.file.FileOutputStreamInitData init(java.io.File file, boolean z6, java.io.FileOutputStream fileOutputStream, io.sentry.IScopes iScopes) {
        io.sentry.ISpan iSpanStartSpan = io.sentry.instrumentation.file.FileIOSpanManager.startSpan(iScopes, "file.write");
        if (fileOutputStream == null) {
            fileOutputStream = new java.io.FileOutputStream(file, z6);
        }
        return new io.sentry.instrumentation.file.FileOutputStreamInitData(file, z6, iSpanStartSpan, fileOutputStream, iScopes.getOptions());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Integer lambda$write$0(int i3) throws java.io.IOException {
        this.delegate.write(i3);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Integer lambda$write$1(byte[] bArr) throws java.io.IOException {
        this.delegate.write(bArr);
        return java.lang.Integer.valueOf(bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Integer lambda$write$2(byte[] bArr, int i3, int i9) throws java.io.IOException {
        this.delegate.write(bArr, i3, i9);
        return java.lang.Integer.valueOf(i9);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.spanManager.finish(this.delegate);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(final int i3) throws java.io.IOException {
        this.spanManager.performIO(new io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable() { // from class: io.sentry.instrumentation.file.d
            @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
            public final java.lang.Object call() {
                return this.f23507a.lambda$write$0(i3);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws java.io.IOException {
        this.spanManager.performIO(new io.sentry.instrumentation.file.c(this, bArr, 2));
    }

    public SentryFileOutputStream(java.lang.String str) {
        this(str != null ? new java.io.File(str) : null, false, (io.sentry.IScopes) io.sentry.ScopesAdapter.getInstance());
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i3, int i9) throws java.io.IOException {
        this.spanManager.performIO(new io.sentry.instrumentation.file.b(this, bArr, i3, i9, 1));
    }

    public SentryFileOutputStream(java.lang.String str, boolean z6) {
        this(init(str != null ? new java.io.File(str) : null, z6, null, io.sentry.ScopesAdapter.getInstance()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static io.sentry.instrumentation.file.FileOutputStreamInitData init(java.io.FileDescriptor fileDescriptor, java.io.FileOutputStream fileOutputStream, io.sentry.IScopes iScopes) {
        io.sentry.ISpan iSpanStartSpan = io.sentry.instrumentation.file.FileIOSpanManager.startSpan(iScopes, "file.write");
        if (fileOutputStream == null) {
            fileOutputStream = new java.io.FileOutputStream(fileDescriptor);
        }
        return new io.sentry.instrumentation.file.FileOutputStreamInitData(null, false, iSpanStartSpan, fileOutputStream, iScopes.getOptions());
    }

    public SentryFileOutputStream(java.io.File file) {
        this(file, false, (io.sentry.IScopes) io.sentry.ScopesAdapter.getInstance());
    }

    public static final class Factory {
        public static java.io.FileOutputStream create(java.io.FileOutputStream fileOutputStream, java.lang.String str) {
            if (isTracingEnabled(io.sentry.ScopesAdapter.getInstance())) {
                return new io.sentry.instrumentation.file.SentryFileOutputStream(io.sentry.instrumentation.file.SentryFileOutputStream.init(str != null ? new java.io.File(str) : null, false, fileOutputStream, io.sentry.ScopesAdapter.getInstance()));
            }
            return fileOutputStream;
        }

        private static boolean isTracingEnabled(io.sentry.IScopes iScopes) {
            return iScopes.getOptions().isTracingEnabled();
        }

        public static java.io.FileOutputStream create(java.io.FileOutputStream fileOutputStream, java.lang.String str, boolean z6) {
            if (isTracingEnabled(io.sentry.ScopesAdapter.getInstance())) {
                return new io.sentry.instrumentation.file.SentryFileOutputStream(io.sentry.instrumentation.file.SentryFileOutputStream.init(str != null ? new java.io.File(str) : null, z6, fileOutputStream, io.sentry.ScopesAdapter.getInstance()));
            }
            return fileOutputStream;
        }

        public static java.io.FileOutputStream create(java.io.FileOutputStream fileOutputStream, java.io.File file) {
            return isTracingEnabled(io.sentry.ScopesAdapter.getInstance()) ? new io.sentry.instrumentation.file.SentryFileOutputStream(io.sentry.instrumentation.file.SentryFileOutputStream.init(file, false, fileOutputStream, io.sentry.ScopesAdapter.getInstance())) : fileOutputStream;
        }

        public static java.io.FileOutputStream create(java.io.FileOutputStream fileOutputStream, java.io.File file, boolean z6) {
            return isTracingEnabled(io.sentry.ScopesAdapter.getInstance()) ? new io.sentry.instrumentation.file.SentryFileOutputStream(io.sentry.instrumentation.file.SentryFileOutputStream.init(file, z6, fileOutputStream, io.sentry.ScopesAdapter.getInstance())) : fileOutputStream;
        }

        public static java.io.FileOutputStream create(java.io.FileOutputStream fileOutputStream, java.io.FileDescriptor fileDescriptor) {
            return isTracingEnabled(io.sentry.ScopesAdapter.getInstance()) ? new io.sentry.instrumentation.file.SentryFileOutputStream(io.sentry.instrumentation.file.SentryFileOutputStream.init(fileDescriptor, fileOutputStream, io.sentry.ScopesAdapter.getInstance()), fileDescriptor) : fileOutputStream;
        }

        public static java.io.FileOutputStream create(java.io.FileOutputStream fileOutputStream, java.io.File file, io.sentry.IScopes iScopes) {
            return isTracingEnabled(iScopes) ? new io.sentry.instrumentation.file.SentryFileOutputStream(io.sentry.instrumentation.file.SentryFileOutputStream.init(file, false, fileOutputStream, iScopes)) : fileOutputStream;
        }
    }

    public SentryFileOutputStream(java.io.File file, boolean z6) {
        this(init(file, z6, null, io.sentry.ScopesAdapter.getInstance()));
    }

    public SentryFileOutputStream(java.io.FileDescriptor fileDescriptor) {
        this(init(fileDescriptor, null, io.sentry.ScopesAdapter.getInstance()), fileDescriptor);
    }

    public SentryFileOutputStream(java.io.File file, boolean z6, io.sentry.IScopes iScopes) {
        this(init(file, z6, null, iScopes));
    }

    private SentryFileOutputStream(io.sentry.instrumentation.file.FileOutputStreamInitData fileOutputStreamInitData, java.io.FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.spanManager = new io.sentry.instrumentation.file.FileIOSpanManager(fileOutputStreamInitData.span, fileOutputStreamInitData.file, fileOutputStreamInitData.options);
        this.delegate = fileOutputStreamInitData.delegate;
    }

    private SentryFileOutputStream(io.sentry.instrumentation.file.FileOutputStreamInitData fileOutputStreamInitData) {
        super(getFileDescriptor(fileOutputStreamInitData.delegate));
        this.spanManager = new io.sentry.instrumentation.file.FileIOSpanManager(fileOutputStreamInitData.span, fileOutputStreamInitData.file, fileOutputStreamInitData.options);
        this.delegate = fileOutputStreamInitData.delegate;
    }
}
