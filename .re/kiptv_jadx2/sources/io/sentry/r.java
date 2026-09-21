package io.sentry;

import java.io.File;
import java.util.concurrent.Callable;

public final class r implements Callable {

    public final int f23534a = 0;

    public final long f23535b;

    public final ISerializer f23536c;

    public final Object f23537d;

    public final Object f23538e;

    public r(Attachment attachment, long j, ISerializer iSerializer, ILogger iLogger) {
        this.f23537d = attachment;
        this.f23535b = j;
        this.f23536c = iSerializer;
        this.f23538e = iLogger;
    }

    @Override
    public final Object call() {
        switch (this.f23534a) {
            case 0:
                return SentryEnvelopeItem.lambda$fromAttachment$12((Attachment) this.f23537d, this.f23535b, this.f23536c, (ILogger) this.f23538e);
            default:
                return SentryEnvelopeItem.lambda$fromProfilingTrace$15((File) this.f23537d, this.f23535b, (ProfilingTraceData) this.f23538e, this.f23536c);
        }
    }

    public r(File file, long j, ProfilingTraceData profilingTraceData, ISerializer iSerializer) {
        this.f23537d = file;
        this.f23535b = j;
        this.f23538e = profilingTraceData;
        this.f23536c = iSerializer;
    }
}
