package io.cdap.wrangler.api.parser;

public class ByteSize extends Token {
    private long bytes;

    public ByteSize(String token) {
        // Parse the token string (e.g., "10KB", "150MB")
        if (token.endsWith("KB")) {
            bytes = Long.parseLong(token.substring(0, token.length() - 2)) * 1024;
        } else if (token.endsWith("MB")) {
            bytes = Long.parseLong(token.substring(0, token.length() - 2)) * 1024 * 1024;
        } else if (token.endsWith("GB")) {
            bytes = Long.parseLong(token.substring(0, token.length() - 2)) * 1024 * 1024 * 1024;
        } else {
            bytes = Long.parseLong(token); // Assume bytes if no unit is specified
        }
    }

    public long getBytes() {
        return bytes;
    }
}
