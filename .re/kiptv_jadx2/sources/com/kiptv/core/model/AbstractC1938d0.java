package com.kiptv.core.model;

public abstract class AbstractC1938d0 extends Exception {
    public final String a() {
        if (this instanceof X) {
            return "player.openSubtitlesError.invalidCredentials";
        }
        if (this instanceof W) {
            return "player.openSubtitlesError.forbidden";
        }
        if (this instanceof C1932a0) {
            return "player.openSubtitles.quotaExceeded";
        }
        if (this instanceof Y) {
            return "player.openSubtitlesError.invalidFile";
        }
        if (this instanceof Z) {
            return "player.openSubtitlesError.invalidToken";
        }
        if (this instanceof V) {
            return "player.openSubtitlesError.linkExpired";
        }
        if (this instanceof C1934b0) {
            return "player.openSubtitlesError.rateLimit";
        }
        if (this instanceof C1936c0) {
            return "player.openSubtitlesError.serverError";
        }
        throw new I3.b();
    }
}
