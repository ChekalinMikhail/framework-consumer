package org.example.http.app.handler;

import org.example.http.framework.HttpMethods;
import org.example.http.framework.Request;
import org.example.http.framework.annotation.RequestHeader;
import org.example.http.framework.annotation.RequestMapping;
import org.example.http.framework.exception.RequestHandleException;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class CoursesHandlerPost {
    @RequestMapping(method = HttpMethods.POST, path = "/courses")
    public void getCourses(
            OutputStream response,
            @RequestHeader("Content-Type") String contentType
    ) {
        final var body = "{\"courses\": []}";
        try {
            response.write(
                    (
                            // language=HTTP
                            "HTTP/1.1 201 Created\r\n" +
                                    "Content-Length: " + body.length() + "\r\n" +
                                    "Content-Type: application/json\r\n" +
                                    "Connection: close\r\n" +
                                    "\r\n" +
                                    body
                    ).getBytes(StandardCharsets.UTF_8)
            );
        } catch (IOException e) {
            throw new RequestHandleException(e);
        }
    }
}
