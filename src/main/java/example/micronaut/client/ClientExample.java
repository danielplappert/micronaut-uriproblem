package example.micronaut.client;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;

import javax.inject.Singleton;

@Singleton
public class ClientExample {

    private final RxHttpClient httpClient;

    public ClientExample(@Client("${api.url}") RxHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public void doExecute() {
        HttpRequest<?> httpRequest = HttpRequest.GET("/");
        httpClient.exchange(httpRequest).blockingFirst();
    }

}
