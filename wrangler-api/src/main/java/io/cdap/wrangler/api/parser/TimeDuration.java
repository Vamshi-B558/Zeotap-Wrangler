package io.cdap.wrangler.api.parser;

public class TimeDuration extends Token {
    private long nanoseconds;

    public TimeDuration(String token) {
        // Parse the token string (e.g., "150ms", "2s")
        // Implement parsing logic here
    }

    public long getNanoseconds() {
        return nanoseconds;
    }
}
