package io.sentry;

import java.io.InputStream;

public interface IEnvelopeReader {
    SentryEnvelope read(InputStream inputStream);
}
