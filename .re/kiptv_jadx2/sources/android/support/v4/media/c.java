package android.support.v4.media;

import android.media.Rating;

public abstract class c {
    public static float a(Rating rating) {
        return rating.getPercentRating();
    }

    public static int b(Rating rating) {
        return rating.getRatingStyle();
    }

    public static float c(Rating rating) {
        return rating.getStarRating();
    }

    public static boolean d(Rating rating) {
        return rating.hasHeart();
    }

    public static boolean e(Rating rating) {
        return rating.isRated();
    }

    public static boolean f(Rating rating) {
        return rating.isThumbUp();
    }

    public static Rating g(boolean z6) {
        return Rating.newHeartRating(z6);
    }

    public static Rating h(float f9) {
        return Rating.newPercentageRating(f9);
    }

    public static Rating i(int i3, float f9) {
        return Rating.newStarRating(i3, f9);
    }

    public static Rating j(boolean z6) {
        return Rating.newThumbRating(z6);
    }

    public static Rating k(int i3) {
        return Rating.newUnratedRating(i3);
    }
}
