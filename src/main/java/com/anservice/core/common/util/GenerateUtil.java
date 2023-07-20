package com.anservice.core.common.util;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GenerateUtil {

    public String randomString(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0.");
        }

        String uuid = UUID.randomUUID().toString().replace("-", "");
        return uuid.substring(0, Math.min(length, uuid.length()));
    }
}
