package androidx.media3.extractor.text;

import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import java.util.List;

public class LegacySubtitleUtil {
    private LegacySubtitleUtil() {
    }

    private static int getStartIndex(Subtitle subtitle, long j) {
        if (j == C.TIME_UNSET) {
            return 0;
        }
        int nextEventTimeIndex = subtitle.getNextEventTimeIndex(j);
        if (nextEventTimeIndex == -1) {
            nextEventTimeIndex = subtitle.getEventTimeCount();
        }
        return (nextEventTimeIndex <= 0 || subtitle.getEventTime(nextEventTimeIndex + (-1)) != j) ? nextEventTimeIndex : nextEventTimeIndex - 1;
    }

    private static void outputSubtitleEvent(Subtitle subtitle, int i3, Consumer<CuesWithTiming> consumer) {
        long eventTime = subtitle.getEventTime(i3);
        List<Cue> cues = subtitle.getCues(eventTime);
        if (cues.isEmpty()) {
            return;
        }
        if (i3 == subtitle.getEventTimeCount() - 1) {
            throw new IllegalStateException();
        }
        long eventTime2 = subtitle.getEventTime(i3 + 1) - subtitle.getEventTime(i3);
        if (eventTime2 > 0) {
            consumer.accept(new CuesWithTiming(cues, eventTime, eventTime2));
        }
    }

    public static void toCuesWithTiming(Subtitle subtitle, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        boolean z6;
        int startIndex = getStartIndex(subtitle, outputOptions.startTimeUs);
        if (outputOptions.startTimeUs == C.TIME_UNSET || startIndex >= subtitle.getEventTimeCount()) {
            z6 = false;
        } else {
            List<Cue> cues = subtitle.getCues(outputOptions.startTimeUs);
            long eventTime = subtitle.getEventTime(startIndex);
            if (cues.isEmpty()) {
                z6 = false;
            } else {
                long j = outputOptions.startTimeUs;
                if (j < eventTime) {
                    consumer.accept(new CuesWithTiming(cues, j, eventTime - j));
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
        }
        for (int i3 = startIndex; i3 < subtitle.getEventTimeCount(); i3++) {
            outputSubtitleEvent(subtitle, i3, consumer);
        }
        if (outputOptions.outputAllCues) {
            if (z6) {
                startIndex--;
            }
            for (int i9 = 0; i9 < startIndex; i9++) {
                outputSubtitleEvent(subtitle, i9, consumer);
            }
            if (z6) {
                consumer.accept(new CuesWithTiming(subtitle.getCues(outputOptions.startTimeUs), subtitle.getEventTime(startIndex), outputOptions.startTimeUs - subtitle.getEventTime(startIndex)));
            }
        }
    }
}
