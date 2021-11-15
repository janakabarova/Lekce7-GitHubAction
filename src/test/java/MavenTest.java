import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MavenTest {

    @Test
    public void testSum(){
        MavenMain maven = new MavenMain();

        assertEquals(7, maven.sum(2, 5));
    }


}
