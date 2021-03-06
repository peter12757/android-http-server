/**************************************************
 * Android Web Server
 * Based on JavaLittleWebServer (2008)
 * <p/>
 * Copyright (c) Piotr Polak 2008-2017
 **************************************************/

package ro.polak.http.protocol.exception;

/**
 * Payload too large.
 */
public class PayloadTooLargeProtocolException extends ProtocolException {

    public PayloadTooLargeProtocolException(String message) {
        super(message);
    }
}
