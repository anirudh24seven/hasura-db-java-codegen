package io.hasura.db.util;

import org.junit.Test;

import java.io.IOException;

import io.hasura.auth.AuthException;

public class TestGeneration {

    @Test
    public void run() throws IOException, AuthException {

        Configuration cfg = new Configuration();
        cfg.setDBUrl(System.getenv("url"));
        cfg.setPackageName(System.getenv("package"));
        cfg.setDir("ws");
        cfg.setUserName(System.getenv("username"));
        cfg.setPassword(System.getenv("password"));
        cfg.setDBPrefix(System.getenv("dbprefix"));
        GenerationUtil.generate(cfg);
    }
}
