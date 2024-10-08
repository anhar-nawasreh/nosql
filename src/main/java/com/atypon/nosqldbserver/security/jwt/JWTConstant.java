package com.atypon.nosqldbserver.security.jwt;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JWTConstant {
    public static final Long ACCESS_TOKEN_EXPIRATION_TIME = 100000L;
    public static final Long REFRESH_TOKEN_EXPIRATION_TIME = 100000L;
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String AUTHORITIES = "authorities";
    public static final String A = "A";
}
