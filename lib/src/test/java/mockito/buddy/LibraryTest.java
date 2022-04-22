package mockito.buddy;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class LibraryTest {

    @Test
    public void mocks() {
        Mockito.mock(Library.class);
    }
}
