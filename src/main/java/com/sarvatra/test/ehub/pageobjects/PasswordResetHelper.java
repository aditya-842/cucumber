
package com.sarvatra.test.ehub.pageobjects;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.BasicHttpClientConnectionManager;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.ssl.TrustStrategy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.CommonFunctions;

public class PasswordResetHelper {
	
	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions cf;

	Logger log = LogManager.getRootLogger();
	
	public PasswordResetHelper(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		cf = new CommonFunctions(driver);
	}

	public boolean resetPassword(String user) {

		try {
			Thread.sleep(3000);
			Configuration config = new PropertiesConfiguration("config/config.properties");
			String resetUrl = config.getString("reset-url");

			StringEntity userEntity = new StringEntity("{ \"nick\":\"" + user + "\"}");

			TrustStrategy acceptingTrustStrategy = new TrustStrategy() {
				public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
					return true;
				}
			};

			SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();
			SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext,
					NoopHostnameVerifier.INSTANCE);

			Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
					.register("https", sslsf).register("http", new PlainConnectionSocketFactory()).build();

			BasicHttpClientConnectionManager connectionManager = new BasicHttpClientConnectionManager(
					socketFactoryRegistry);
			CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(sslsf)
					.setConnectionManager(connectionManager).build();

			HttpPost httpPost = new HttpPost(resetUrl);
			httpPost.setEntity(userEntity);
			httpPost.setHeader("Accept", "application/json");
			httpPost.setHeader("Content-type", "application/json");

			CloseableHttpResponse res = httpClient.execute(httpPost);
			System.out.println(res.getStatusLine().getStatusCode());

			if (200 == res.getStatusLine().getStatusCode()) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			System.out.println("Unable to reset password");
			e.printStackTrace();
			return false;
		}
	}
}
