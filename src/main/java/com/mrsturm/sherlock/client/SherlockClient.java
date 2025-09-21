package com.mrsturm.sherlock.client;

import net.fabricmc.api.ClientModInitializer;

public class SherlockClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Sherlock Management loaded (minimal initializer).
        System.out.println("[SherlockManagement] Client initialized.");
    }
}
