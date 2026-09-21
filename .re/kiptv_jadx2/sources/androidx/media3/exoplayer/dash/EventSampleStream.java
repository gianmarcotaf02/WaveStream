package androidx.media3.exoplayer.dash;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.dash.manifest.EventStream;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.extractor.metadata.emsg.EventMessageEncoder;

final class EventSampleStream implements SampleStream {
    private int currentIndex;
    private EventStream eventStream;
    private boolean eventStreamAppendable;
    private long[] eventTimesUs;
    private boolean isFormatSentDownstream;
    private final Format upstreamFormat;
    private final EventMessageEncoder eventMessageEncoder = new EventMessageEncoder();
    private long pendingSeekPositionUs = C.TIME_UNSET;

    public EventSampleStream(EventStream eventStream, Format format, boolean z6) {
        this.upstreamFormat = format;
        this.eventStream = eventStream;
        this.eventTimesUs = eventStream.presentationTimesUs;
        updateEventStream(eventStream, z6);
    }

    public String eventStreamId() {
        return this.eventStream.id();
    }

    @Override
    public boolean isReady() {
        return true;
    }

    @Override
    public void maybeThrowError() {
    }

    @Override
    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i3) {
        int i9 = this.currentIndex;
        boolean z6 = i9 == this.eventTimesUs.length;
        if (z6 && !this.eventStreamAppendable) {
            decoderInputBuffer.setFlags(4);
            return -4;
        }
        if ((i3 & 2) != 0 || !this.isFormatSentDownstream) {
            formatHolder.format = this.upstreamFormat;
            this.isFormatSentDownstream = true;
            return -5;
        }
        if (z6) {
            return -3;
        }
        if ((i3 & 1) == 0) {
            this.currentIndex = i9 + 1;
        }
        if ((i3 & 4) == 0) {
            byte[] bArrEncode = this.eventMessageEncoder.encode(this.eventStream.events[i9]);
            decoderInputBuffer.ensureSpaceForWrite(bArrEncode.length);
            decoderInputBuffer.data.put(bArrEncode);
        }
        decoderInputBuffer.timeUs = this.eventTimesUs[i9];
        decoderInputBuffer.setFlags(1);
        return -4;
    }

    public void seekToUs(long j) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.eventTimesUs, j, true, false);
        this.currentIndex = iBinarySearchCeil;
        if (!this.eventStreamAppendable || iBinarySearchCeil != this.eventTimesUs.length) {
            j = C.TIME_UNSET;
        }
        this.pendingSeekPositionUs = j;
    }

    @Override
    public int skipData(long j) {
        int iMax = Math.max(this.currentIndex, Util.binarySearchCeil(this.eventTimesUs, j, true, false));
        int i3 = iMax - this.currentIndex;
        this.currentIndex = iMax;
        return i3;
    }

    public void updateEventStream(EventStream eventStream, boolean z6) {
        int i3 = this.currentIndex;
        long j = i3 == 0 ? -9223372036854775807L : this.eventTimesUs[i3 - 1];
        this.eventStreamAppendable = z6;
        this.eventStream = eventStream;
        long[] jArr = eventStream.presentationTimesUs;
        this.eventTimesUs = jArr;
        long j9 = this.pendingSeekPositionUs;
        if (j9 != C.TIME_UNSET) {
            seekToUs(j9);
        } else if (j != C.TIME_UNSET) {
            this.currentIndex = Util.binarySearchCeil(jArr, j, false, false);
        }
    }
}
