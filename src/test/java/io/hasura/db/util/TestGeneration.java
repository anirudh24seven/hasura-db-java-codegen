package io.hasura.db.util;

import org.junit.Test;
import java.util.List;
import java.io.IOException;
import io.hasura.auth.AuthException;

public class TestGeneration {

    @Test
    public void run() throws IOException, AuthException {

        Configuration cfg = new Configuration();
        cfg.setDBUrl("http://104.155.219.208");
        cfg.setPackageName("in.findakadai.db");
        cfg.setDir("ws");
        cfg.setUserName(System.getenv("username"));
        cfg.setPassword(System.getenv("password"));
        GenerationUtil.generate(cfg);
    }
}
