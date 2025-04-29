package org.cloudfoundry.promregator.auth;
import org.cloudfoundry.promregator.auth.impl.AuthenticationEnricherImpl;
import org.apache.http.client.methods.HttpGet;

public interface AuthenticationEnricher {
	void enrichWithAuthentication(HttpGet httpget);
}

