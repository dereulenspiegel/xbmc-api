package org.xbmc.android.jsonrpc.api;

import org.xbmc.android.jsonrpc.config.HostConfig;
import org.xbmc.android.jsonrpc.io.ConnectionListener;
import org.xbmc.android.jsonrpc.io.JavaConnectionManager;
import org.xbmc.android.jsonrpc.notification.AbstractEvent;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HostConfig config = new HostConfig("openelec", 80, 9090);
		JavaConnectionManager conManager = new JavaConnectionManager();
		conManager.registerConnectionListener(new ConnectionListener() {

			@Override
			public void notificationReceived(AbstractEvent event) {
				System.out.println("Event received: " + event.getClass().getCanonicalName());
			}

			@Override
			public void disconnected() {
				System.out.println("Event: Disconnected");

			}

			@Override
			public void connected() {
				System.out.println("Event: Connected");

			}
		});
		System.out.println("Connecting...");
		conManager.connect(config);
		while (true) {
			// wait
		}

	}
}
