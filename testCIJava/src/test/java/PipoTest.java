import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by chrnys on 31/08/2015.
 */
public class PipoTest {

    @Test
    public void pipoTest1() {
        String s1 = "test";
        assertThat(s1).isEqualTo("test2");
    }
}
