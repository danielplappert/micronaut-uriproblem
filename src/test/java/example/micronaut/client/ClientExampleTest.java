package example.micronaut.client;

import io.micronaut.http.client.exceptions.HttpClientException;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
public class ClientExampleTest {

    @Inject
    private ClientExample clientExample;

    @Test
    public void testDoExecute() {
        Assertions.assertThrows(HttpClientException.class,
                () -> clientExample.doExecute());
    }

}
