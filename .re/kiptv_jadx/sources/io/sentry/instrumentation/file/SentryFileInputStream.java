package io.sentry.instrumentation.file;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryFileInputStream extends java.io.FileInputStream implements java.lang.AutoCloseable {
    private final java.io.FileInputStream delegate;
    private final io.sentry.instrumentation.file.FileIOSpanManager spanManager;

    private static java.io.FileDescriptor getFileDescriptor(java.io.FileInputStream fileInputStream) throws java.io.FileNotFoundException {
        try {
            return fileInputStream.getFD();
        } catch (java.io.IOException unused) {
            throw new java.io.FileNotFoundException("No file descriptor");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static io.sentry.instrumentation.file.FileInputStreamInitData init(java.io.File file, java.io.FileInputStream fileInputStream, io.sentry.IScopes iScopes) {
        io.sentry.ISpan iSpanStartSpan = io.sentry.instrumentation.file.FileIOSpanManager.startSpan(iScopes, "file.read");
        if (fileInputStream == null) {
            fileInputStream = new java.io.FileInputStream(file);
        }
        return new io.sentry.instrumentation.file.FileInputStreamInitData(file, iSpanStartSpan, fileInputStream, iScopes.getOptions());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Integer lambda$read$0(java.util.concurrent.atomic.AtomicInteger atomicInteger) throws java.io.IOException {
        int i3 = this.delegate.read();
        atomicInteger.set(i3);
        return java.lang.Integer.valueOf(i3 != -1 ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Integer lambda$read$1(byte[] bArr) {
        return java.lang.Integer.valueOf(this.delegate.read(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Integer lambda$read$2(byte[] bArr, int i3, int i9) {
        return java.lang.Integer.valueOf(this.delegate.read(bArr, i3, i9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Long lambda$skip$3(long j) {
        return java.lang.Long.valueOf(this.delegate.skip(j));
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.spanManager.finish(this.delegate);
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        this.spanManager.performIO(new io.sentry.instrumentation.file.c(this, atomicInteger, 1));
        return atomicInteger.get();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public long skip(final long j) {
        return ((java.lang.Long) this.spanManager.performIO(new io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable() { // from class: io.sentry.instrumentation.file.a
            @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
            public final java.lang.Object call() {
                return this.f23497a.lambda$skip$3(j);
            }
        })).longValue();
    }

    public static final class Factory {
        public static java.io.FileInputStream create(java.io.FileInputStream fileInputStream, java.lang.String str) {
            io.sentry.ScopesAdapter scopesAdapter = io.sentry.ScopesAdapter.getInstance();
            if (isTracingEnabled(scopesAdapter)) {
                return new io.sentry.instrumentation.file.SentryFileInputStream(io.sentry.instrumentation.file.SentryFileInputStream.init(str != null ? new java.io.File(str) : null, fileInputStream, scopesAdapter));
            }
            return fileInputStream;
        }

        private static boolean isTracingEnabled(io.sentry.IScopes iScopes) {
            return iScopes.getOptions().isTracingEnabled();
        }

        public static java.io.FileInputStream create(java.io.FileInputStream fileInputStream, java.io.File file) {
            io.sentry.ScopesAdapter scopesAdapter = io.sentry.ScopesAdapter.getInstance();
            return isTracingEnabled(scopesAdapter) ? new io.sentry.instrumentation.file.SentryFileInputStream(io.sentry.instrumentation.file.SentryFileInputStream.init(file, fileInputStream, scopesAdapter)) : fileInputStream;
        }

        public static java.io.FileInputStream create(java.io.FileInputStream fileInputStream, java.io.FileDescriptor fileDescriptor) {
            io.sentry.ScopesAdapter scopesAdapter = io.sentry.ScopesAdapter.getInstance();
            return isTracingEnabled(scopesAdapter) ? new io.sentry.instrumentation.file.SentryFileInputStream(io.sentry.instrumentation.file.SentryFileInputStream.init(fileDescriptor, fileInputStream, scopesAdapter), fileDescriptor) : fileInputStream;
        }

        public static java.io.FileInputStream create(java.io.FileInputStream fileInputStream, java.io.File file, io.sentry.IScopes iScopes) {
            return isTracingEnabled(iScopes) ? new io.sentry.instrumentation.file.SentryFileInputStream(io.sentry.instrumentation.file.SentryFileInputStream.init(file, fileInputStream, iScopes)) : fileInputStream;
        }
    }

    public SentryFileInputStream(java.lang.String str) {
        this(str != null ? new java.io.File(str) : null, io.sentry.ScopesAdapter.getInstance());
    }

    public SentryFileInputStream(java.io.File file) {
        this(file, io.sentry.ScopesAdapter.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static io.sentry.instrumentation.file.FileInputStreamInitData init(java.io.FileDescriptor fileDescriptor, java.io.FileInputStream fileInputStream, io.sentry.IScopes iScopes) {
        io.sentry.ISpan iSpanStartSpan = io.sentry.instrumentation.file.FileIOSpanManager.startSpan(iScopes, "file.read");
        if (fileInputStream == null) {
            fileInputStream = new java.io.FileInputStream(fileDescriptor);
        }
        return new io.sentry.instrumentation.file.FileInputStreamInitData(null, iSpanStartSpan, fileInputStream, iScopes.getOptions());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.FileInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return ((java.lang.Integer) this.spanManager.performIO(new io.sentry.instrumentation.file.c(this, bArr, 0))).intValue();
    }

    public SentryFileInputStream(java.io.FileDescriptor fileDescriptor) {
        this(fileDescriptor, io.sentry.ScopesAdapter.getInstance());
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public int read(byte[] bArr, int i3, int i9) {
        return ((java.lang.Integer) this.spanManager.performIO(new io.sentry.instrumentation.file.b(this, bArr, i3, i9, 0))).intValue();
    }

    public SentryFileInputStream(java.io.File file, io.sentry.IScopes iScopes) {
        this(init(file, (java.io.FileInputStream) null, iScopes));
    }

    public SentryFileInputStream(java.io.FileDescriptor fileDescriptor, io.sentry.IScopes iScopes) {
        this(init(fileDescriptor, (java.io.FileInputStream) null, iScopes), fileDescriptor);
    }

    private SentryFileInputStream(io.sentry.instrumentation.file.FileInputStreamInitData fileInputStreamInitData, java.io.FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.spanManager = new io.sentry.instrumentation.file.FileIOSpanManager(fileInputStreamInitData.span, fileInputStreamInitData.file, fileInputStreamInitData.options);
        this.delegate = fileInputStreamInitData.delegate;
    }

    private SentryFileInputStream(io.sentry.instrumentation.file.FileInputStreamInitData fileInputStreamInitData) {
        super(getFileDescriptor(fileInputStreamInitData.delegate));
        this.spanManager = new io.sentry.instrumentation.file.FileIOSpanManager(fileInputStreamInitData.span, fileInputStreamInitData.file, fileInputStreamInitData.options);
        this.delegate = fileInputStreamInitData.delegate;
    }
}
